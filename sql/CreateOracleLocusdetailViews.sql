CREATE OR REPLACE VIEW DW_LocusDetail (
  locusTairObjectId,
  locusName,
  primarySymbol,
  primarySymbolFullName,
  chromosome,
  spanStartPosition,  
  spanEndPosition,  
  curatedSummary,
  geneModelCount,
  polymorphismCount,
  articleCount,
  abstractCount,
  geneFamilyName,
  geneFamilyTairObjectId,
  taxonId
) AS
SELECT l.tair_object_id,
       l.name,
       s.symbol,
       s.full_name,
       l.chromosome,
       (SELECT MIN(CAST(start_position AS NUMERIC(12)))
          FROM GlobalAssignment ga JOIN 
               MapElement_Locus mel ON ga.map_element_id = mel.map_element_id JOIN
               Gene g ON mel.map_element_id = g.map_element_id
         WHERE mel.locus_id = l.locus_id AND
               ga.is_obsolete = 'F' AND
               g.is_obsolete = 'F') AS spanStartPosition,
       (SELECT MAX(CAST(end_position AS NUMERIC(12)))
          FROM GlobalAssignment ga JOIN 
               MapElement_Locus mel ON ga.map_element_id = mel.map_element_id JOIN
               Gene g ON mel.map_element_id = g.map_element_id
         WHERE mel.locus_id = l.locus_id AND
               ga.is_obsolete = 'F' AND
               g.is_obsolete = 'F') AS spanEndPosition,
       g.description,
       (SELECT COUNT(*)
          FROM MapElement_Locus mel JOIN
               Gene g ON mel.map_element_id = g.map_element_id
         WHERE locus_id = l.locus_id AND
               g.is_obsolete = 'F') AS gene_model_count,
       (SELECT COUNT(*) 
          FROM Locus l3 JOIN
               MapElement_Locus m ON l3.locus_id = m.locus_id JOIN 
               Polymorphism p ON m.map_element_id = p.map_element_id JOIN
               GlobalAssignment ga ON p.map_element_id = ga.map_element_id JOIN
               Map m ON ga.map_id = m.map_id
         WHERE p.is_obsolete = 'F' AND 
               m.is_obsolete = 'F' AND 
               m.map_type = 'nuc_sequence' AND
               l3.locus_id = l.locus_id
       ) AS polymorphism_count,
       (SELECT COUNT(*)
          FROM Locus l4 JOIN
               TairObj_Ref tor ON l4.tair_object_id = tor.tair_object_id JOIN
               Publication p ON tor.reference_id = p.reference_id JOIN
               PubSource ps ON p.pub_source_id = ps.pub_source_id
         WHERE l4.locus_id = l.locus_id AND
               p.publication_type = 'research_article'
       ) AS article_count,
       (SELECT COUNT(*)
          FROM Locus l4 JOIN
               TairObj_Ref tor ON l4.tair_object_id = tor.tair_object_id JOIN
               Publication p ON tor.reference_id = p.reference_id JOIN
               PubSource ps ON p.pub_source_id = ps.pub_source_id
         WHERE l4.locus_id = l.locus_id AND
               p.publication_type = 'abstract'
       ) AS abstract_count,
       null AS gene_family_name,
       null AS gene_family_id,
       l.taxon_id
  FROM Locus l JOIN
       Gene g ON l.rep_genemodel_id = g.map_element_id JOIN
       GeneModelType gmt ON g.gene_model_type_id = gmt.gene_model_type_id JOIN
       Symbol s ON g.primary_symbol_id = s.symbol_id
;

GRANT SELECT ON DW_LocusDetail to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusDetail to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusDetail to tairdbo;
GRANT SELECT ON DW_LocusDetail to tairwebsql;

-- The affected object name is always a locus name for locus detail.
CREATE OR REPLACE VIEW DW_LocusUpdateHistory (
  locusTairObjectId,  
  updateType,
  updateDate,
  affectedTairObjectId,  
  affectedTairObjectType,  
  affectedTairObjectName
) AS
SELECT l.tair_object_id,
       CASE h.updatehistory_type
         WHEN 'obsoletion' THEN 'obsoleted'
         WHEN 'addition' THEN 'added'
         WHEN 'substitution' THEN 'replaces'
         WHEN 'split_insert' THEN 'split and added'
         WHEN 'merge_obsoletion' THEN 'obsolete and replaced by'
         WHEN 'update' THEN 'updated'
         WHEN 'replacement' THEN 'replaced'
         WHEN 'restoration' THEN 'restored'
         ELSE ''
       END AS updateType,
       h.updatehistory_date,
       h.affected_tair_object_id,
       t.map_element_type,
       al.name
  FROM Locus l JOIN
       UpdateHistory h ON l.tair_object_id = h.tair_object_id LEFT OUTER JOIN
       MapElement me ON h.affected_tair_object_id = me.tair_object_id LEFT OUTER JOIN
       MapElementType t ON me.map_element_type_id = t.map_element_type_id LEFT OUTER JOIN
       Locus al ON h.affected_tair_object_id = al.tair_object_id
 GROUP BY l.tair_object_id,
          CASE h.updatehistory_type
           WHEN 'obsoletion' THEN 'obsoleted'
           WHEN 'addition' THEN 'added'
           WHEN 'substitution' THEN 'replaces'
           WHEN 'split_insert' THEN 'split and added'
           WHEN 'merge_obsoletion' THEN 'obsolete and replaced by'
           WHEN 'update' THEN 'updated'
           WHEN 'replacement' THEN 'replaced'
           WHEN 'restoration' THEN 'restored'
           ELSE ''
         END,
       h.affected_tair_object_id,
       t.map_element_type,
       al.name,
       h.updatehistory_date
;

GRANT SELECT ON DW_LocusUpdateHistory to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusUpdateHistory to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusUpdateHistory to tairdbo;
GRANT SELECT ON DW_LocusUpdateHistory to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusPhysicalMapCoordinates (
  locusTairObjectId,
  mapId,
  mapName,
  mapType,
  chromosome,
  startPosition,
  endPosition,
  units,
  orientation
)
AS
SELECT l.tair_object_id,
       ga.map_id,
       m.name,
       m.map_type,
       m.chromosome,
       ga.start_position,
       ga.end_position,
       ga.units,
       ga.orientation
  FROM Locus l JOIN
       Gene g ON l.rep_genemodel_id = g.map_element_id JOIN
       GlobalAssignment ga ON g.map_element_id = ga.map_element_id JOIN
       Map m ON ga.map_id = m.map_id
 WHERE l.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       m.map_type = 'nuc_sequence';

GRANT SELECT ON DW_LocusPhysicalMapCoordinates to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusPhysicalMapCoordinates to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusPhysicalMapCoordinates to tairdbo;
GRANT SELECT ON DW_LocusPhysicalMapCoordinates to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusEst (
  cloneEndTairObjectId,
  locusTairObjectId,
  cloneEndName,
  icAccession,
  length,
  startPosition,
  endPosition,
  cloneName,
  cloneTairObjectId)
AS
SELECT ce.tair_object_id,
       l.tair_object_id,
       ce.name,
       ns.ic_accession,
       ga.length,
       ga.start_position,
       ga.end_position,
       c.name,
       c.tair_object_id
  FROM CloneEnd ce JOIN
       MapElement_Locus mel ON ce.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       GlobalAssignment ga ON mel.map_element_id = ga.map_element_id JOIN
       NucleotideSequence_MapElement nsme ON ce.map_element_id = nsme.map_element_id JOIN
       NucleotideSequence ns ON nsme.nucleotide_seq_id = ns.nucleotide_seq_id JOIN
       Clone c ON ce.clone_id = c.clone_id
 WHERE ce.is_obsolete = 'F' AND
       l.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       ns.is_obsolete = 'F' AND
       ce.cloneEnd_Type = 'EST';

GRANT SELECT ON LocusEst to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON LocusEst to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON LocusEst to tairdbo;
GRANT SELECT ON LocusEst to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusEstAlias (
  cloneEndTairObjectId,
  locusTairObjectId,
  alias)
AS
SELECT ce.tair_object_id,
       l.tair_object_id,
       a.alias
  FROM CloneEnd ce JOIN
       MapElement_Locus mel ON ce.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       Alias a ON ce.tair_object_id = a.tair_object_id
 WHERE ce.is_obsolete = 'F' AND
       l.is_obsolete = 'F';

GRANT SELECT ON DW_LocusEstAlias to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusEstAlias to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusEstAlias to tairdbo;
GRANT SELECT ON DW_LocusEstAlias to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusCdna (
  cloneTairObjectId,  
  locusTairObjectId,  
  cloneName,  
  icAccession,  
  vectorType,  
  fullLengthCds,  
  length,  
  startPosition,  
  endPosition)
AS
SELECT c.tair_object_id,
       l.tair_object_id,
       c.name,
       s.ic_accession,
       (SELECT vector_type FROM Vector v JOIN Vector_NucleotideSequence vns ON v.vector_id = vns.vector_id WHERE vns.nucleotide_seq_id = s.nucleotide_seq_id) as vectorType,
       s.cds_is_full_length,
       ga.length,
       ga.start_position,
       ga.end_position
  FROM NucleotideSequence s JOIN
       NucleotideSequence_MapElement nsme ON s.nucleotide_seq_id = nsme.nucleotide_seq_id JOIN
       Clone c ON nsme.map_element_id = c.map_element_id JOIN
       MapElement_Locus mel ON c.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       GlobalAssignment ga ON c.map_element_id = ga.map_element_id JOIN
       Map m ON ga.map_id = m.map_id JOIN
       Gene g ON l.rep_genemodel_id = g.map_element_id JOIN
       GlobalAssignment gal ON g.map_element_id = gal.map_element_id JOIN
       Map ml ON gal.map_id = ml.map_id AND m.chromosome = ml.chromosome
 WHERE s.is_obsolete = 'F' AND
       c.is_obsolete = 'F' AND
       l.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       gal.is_obsolete = 'F' AND
       s.sequence_class = 'cDNA' AND
       m.map_type = 'nuc_sequence' AND
       ml.map_type = 'nuc_sequence';

GRANT SELECT ON DW_LocusCdna to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusCdna to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusCdna to tairdbo;
GRANT SELECT ON DW_LocusCdna to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusCdnaAlias (
  cloneTairObjectId,
  locusTairObjectId,
  alias)
AS
SELECT c.tair_object_id,
       l.tair_object_id,
       a.alias
  FROM Clone c JOIN
       MapElement_Locus mel ON c.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       Alias a ON c.tair_object_id = a.tair_object_id
 WHERE c.is_obsolete = 'F' AND
       l.is_obsolete = 'F';

GRANT SELECT ON DW_LocusCdnaAlias to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusCdnaAlias to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusCdnaAlias to tairdbo;
GRANT SELECT ON DW_LocusCdnaAlias to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusBac (
  locusTairObjectId,  
  bacTairObjectId,  
  sequenceName,  
  icAccession,  
  length,  
  startPosition,  
  endPosition,
  cloneTairObjectId)
  AS 
SELECT l.tair_object_id,
       au.tair_object_id,
       au.name,
       au.ic_accession,
       ga.length,
       ga.start_position,
       ga.end_position,
       c.tair_object_id
  FROM Locus l JOIN
       MapElement_Locus lme ON l.locus_id = lme.locus_id JOIN
       Clone c ON lme.map_element_id = c.map_element_id JOIN
       AssemblyUnit au ON c.assembly_unit_id = au.assembly_unit_id JOIN
       GlobalAssignment ga ON au.map_element_id = ga.map_element_id
 WHERE l.is_obsolete = 'F' AND
       c.is_obsolete = 'F' AND
       c.vector_type = 'BAC' AND
       au.is_obsolete = 'F';
    
GRANT SELECT ON DW_LocusBac to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusBac to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusBac to tairdbo;
GRANT SELECT ON DW_LocusBac to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusGeneModel (
  locusTairObjectId,  
  geneModelName,
  geneModelType,
  representative,
  spliceVariant,
  computationalDescription,
  curatedSummary,
  confidence)
AS
SELECT l.tair_object_id, 
       g.name,
       gmt.gene_model_type,
       CASE
         WHEN l.rep_genemodel_id = g.map_element_id THEN 'T'
         ELSE 'F'
       END as representative,
       CASE 
         WHEN g.name LIKE 'AT_G_____.%' THEN 'T'
         ELSE 'F'
       END AS spliceVariant,
       g.short_description,
       g.description as curatedSummary,
       null as confidence
  FROM Locus l JOIN
       MapElement_Locus mel ON l.locus_id = mel.locus_id JOIN
       Gene g ON mel.map_element_id = g.map_element_id JOIN
       GeneModelType gmt on g.GENE_MODEL_TYPE_ID = gmt.GENE_MODEL_TYPE_ID
 WHERE g.is_obsolete = 'F'
;

GRANT SELECT ON DW_LocusGeneModel to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusGeneModel to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusGeneModel to tairdbo;
GRANT SELECT ON DW_LocusGeneModel to tairwebsql;

CREATE OR REPLACE VIEW DW_ModelFeature (
  geneModelName,
  locusTairObjectId,
  featureType,
  featureNumber,
  start_position,
  end_position,
  agiStart,
  agiEnd
)
AS
-- Get the cds and exons in this first block.
SELECT g.name,
       l.tair_object_id,
       CASE
         WHEN f.assignmentFeature_type = 'ORF'
           THEN 'cds'
         ELSE f.assignmentFeature_type
       END AS assignmentFeature_type,
       f.assignment_feature_id, -- this isn't the actual order number, not in current database
       f.start_position,
       f.end_position,
       ga.start_position + f.start_position AS agiStart,
       ga.start_position + f.end_position AS agiEnd
  FROM Locus l JOIN
       MapElement_Locus mel ON l.locus_id = mel.locus_id JOIN
       Gene g ON mel.map_element_id = g.map_element_id JOIN
       GlobalAssignment ga ON g.map_element_id = ga.map_element_id JOIN
       AssignmentFeature f ON ga.global_assignment_id = f.global_assignment_id
 WHERE g.is_obsolete = 'F' AND
       l.is_obsolete = 'F' AND
       ga.is_obsolete = 'F'
UNION
-- Get the 5' exon/intron in this block.
SELECT g.name,
       l.tair_object_id,
       '5'' utr' AS assignmentFeature_type,
       f.assignment_feature_id, -- this is the exon id
       f.start_position,
       orf.start_position - 1 AS end_position, -- include intron if any
       ga.start_position + f.start_position AS agiStart,
       ga.start_position + orf.start_position - 1 AS agiEnd -- include intron if any
  FROM Locus l JOIN
       MapElement_Locus mel ON l.locus_id = mel.locus_id JOIN
       Gene g ON mel.map_element_id = g.map_element_id JOIN
       GlobalAssignment ga ON g.map_element_id = ga.map_element_id JOIN
       AssignmentFeature f ON ga.global_assignment_id = f.global_assignment_id JOIN
       AssignmentFeature orf ON ga.global_assignment_id = orf.global_assignment_id
 WHERE g.is_obsolete = 'F' AND
       l.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       orf.assignmentFeature_type = 'ORF' AND
       f.assignmentFeature_type = 'exon' AND 
       f.start_position <= orf.start_position
UNION
-- Get the 3' exon/intron in this block.
SELECT g.name,
       l.tair_object_id,
       '3'' utr' AS assignmentFeature_type,
       f.assignment_feature_id, -- this is the exon id
       orf.end_position + 1 AS start_position, -- include intron if any
       f.end_position,
       ga.start_position + orf.end_position + 1 AS agiStart, -- include intron if any
       ga.start_position + f.end_position AS agiEnd
  FROM Locus l JOIN
       MapElement_Locus mel ON l.locus_id = mel.locus_id JOIN
       Gene g ON mel.map_element_id = g.map_element_id JOIN
       GlobalAssignment ga ON g.map_element_id = ga.map_element_id JOIN
       AssignmentFeature f ON ga.global_assignment_id = f.global_assignment_id JOIN
       AssignmentFeature orf ON ga.global_assignment_id = orf.global_assignment_id
 WHERE g.is_obsolete = 'F' AND
       l.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       orf.assignmentFeature_type = 'ORF' AND
       f.assignmentFeature_type = 'exon' AND 
       f.end_position >= orf.end_position
UNION
--Get the introns in this block (gaps between exons)
-- These are the exons except for the last one
SELECT g.name,
       l.tair_object_id,
       'intron' AS assignmentFeature_type,
       f.assignment_feature_id, -- this is the exon id of the preceding exon
       f.end_position + 1 AS start_position, -- position after end of exon
       (SELECT min(exon.start_position - 1) -- position before start of next exon
          FROM GlobalAssignment ga1 JOIN
               AssignmentFeature exon ON ga1.global_assignment_id = exon.global_assignment_id
         WHERE ga1.global_assignment_id = ga.global_assignment_id AND
               exon.assignmentFeature_type = 'exon' AND
               exon.start_position > f.end_position) AS end_position,
       ga.start_position + f.end_position + 1 AS agiStart, -- position after end of exon
       (SELECT min(ga.start_position + exon2.start_position - 1) -- position before start of next exon
          FROM GlobalAssignment ga2 JOIN
               AssignmentFeature exon2 ON ga2.global_assignment_id = exon2.global_assignment_id
         WHERE ga2.global_assignment_id = ga.global_assignment_id AND
               exon2.assignmentFeature_type = 'exon' AND
               exon2.start_position > f.end_position) AS agiEnd
  FROM Locus l JOIN
       MapElement_Locus mel ON l.locus_id = mel.locus_id JOIN
       Gene g ON mel.map_element_id = g.map_element_id JOIN
       GlobalAssignment ga ON g.map_element_id = ga.map_element_id JOIN
       AssignmentFeature f ON ga.global_assignment_id = f.global_assignment_id JOIN
       AssignmentFeature orf ON ga.global_assignment_id = orf.global_assignment_id
 WHERE g.is_obsolete = 'F' AND
       l.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       orf.assignmentFeature_type = 'ORF' AND
       f.assignmentFeature_type = 'exon' AND 
       f.end_position < orf.end_position;

GRANT SELECT ON DW_ModelFeature to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ModelFeature to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ModelFeature to tairdbo;
GRANT SELECT ON DW_ModelFeature to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusGeneModelCdna (
  geneModelName,  
  locusTairObjectId,  
  sequenceId,  
  sequenceName,  
  icAccession,  
  vectorType,  
  fullLengthCds,  
  length,  
  startPosition,  
  endPosition)
AS
SELECT c.tair_object_id,
       l.tair_object_id,
       MIN(c.name),
       MIN(s.ic_accession) AS ic_accession,
       MIN((SELECT vector_type FROM Vector v JOIN Vector_NucleotideSequence vns ON v.vector_id = vns.vector_id WHERE vns.nucleotide_seq_id = s.nucleotide_seq_id)) as vectorType,
       MIN(s.cds_is_full_length) as cds_is_full_length,
       MIN(ga.length) as length,
       MIN(ga.start_position) as start_position,
       MIN(ga.end_position) as end_position
  FROM NucleotideSequence s JOIN
       NucleotideSequence_MapElement nsme ON s.nucleotide_seq_id = nsme.nucleotide_seq_id JOIN
       Clone c ON nsme.map_element_id = c.map_element_id JOIN
       MapElement_Locus mel ON c.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       GlobalAssignment ga ON c.map_element_id = ga.map_element_id JOIN
       Map m ON ga.map_id = m.map_id JOIN
       Gene g ON l.rep_genemodel_id = g.map_element_id JOIN
       GlobalAssignment gal ON g.map_element_id = gal.map_element_id JOIN
       Map ml ON gal.map_id = ml.map_id AND m.chromosome = ml.chromosome
 WHERE s.is_obsolete = 'F' AND
       c.is_obsolete = 'F' AND
       l.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       gal.is_obsolete = 'F' AND
       s.sequence_class = 'cDNA' AND
       m.map_type = 'nuc_sequence' AND
       ml.map_type = 'nuc_sequence' AND
       CASE
         WHEN ga.start_position <= gal.start_position AND ga.end_position >= gal.end_position THEN 1
         WHEN ga.start_position >= gal.start_position AND ga.end_position <= gal.end_position THEN 1
         WHEN ga.start_position <= gal.start_position AND ga.end_position >= gal.start_position THEN 1
         WHEN ga.start_position <= gal.end_position AND ga.end_position >= gal.end_position THEN 1
         ELSE 0
       END = 1
 GROUP BY c.tair_object_id, l.tair_object_id;
 
GRANT SELECT ON DW_LocusGeneModelCdna to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusGeneModelCdna to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusGeneModelCdna to tairdbo;
GRANT SELECT ON DW_LocusGeneModelCdna to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusGeneModelCdnaAlias (
  geneModelName,  
  locusTairObjectId,  
  sequenceId,  
  alias)
AS
SELECT g.name,
       l.tair_object_id,
       s.nucleotide_seq_id,
       a.alias
  FROM NucleotideSequence s JOIN
       NucleotideSequence_MapElement nsme ON s.nucleotide_seq_id = nsme.nucleotide_seq_id JOIN
       Gene g ON nsme.map_element_id = g.map_element_id JOIN
       MapElement_Locus mel ON g.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       Alias a ON s.tair_object_id = a.tair_object_id
 WHERE s.is_obsolete = 'F' AND
       g.is_obsolete = 'F' AND
       l.is_obsolete = 'F';

GRANT SELECT ON DW_LocusGeneModelCdnaAlias to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusGeneModelCdnaAlias to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusGeneModelCdnaAlias to tairdbo;
GRANT SELECT ON DW_LocusGeneModelCdnaAlias to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusOtherName (
  tairObjectId,
  name)
AS
SELECT l.tair_object_id, g.name
  FROM Gene g JOIN
       MapElement_Locus mel ON g.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id AND 
             l.rep_genemodel_id <> g.map_element_id
 WHERE CASE 
         WHEN g.name LIKE 'AT_G_____.%' THEN 'T'
         ELSE 'F'
       END = 'F' AND
         g.is_obsolete = 'F' AND
         g.name IS NOT NULL
UNION 
SELECT l.tair_object_id, ga.alias
  FROM Gene g JOIN
       MapElement_Locus mel ON g.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       GeneAlias ga ON g.gene_id = ga.gene_id
 WHERE CASE 
         WHEN ga.alias LIKE 'AT_G_____.%' THEN 'T'
         ELSE 'F'
       END = 'F' AND
       ga.alias_type = 'orf' AND
       g.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       ga.alias IS NOT NULL
UNION
SELECT l.tair_object_id, UPPER(s.symbol)
  FROM Gene g JOIN
       MapElement_Locus mel ON g.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       Gene_Symbol_Reference gsr ON g.gene_id = gsr.gene_id JOIN
       Symbol s ON gsr.symbol_id = s.symbol_id
 WHERE CASE 
         WHEN s.symbol LIKE 'AT_G_____.%' THEN 'T'
         ELSE 'F'
       END = 'F' AND
       g.is_obsolete = 'F' AND
       gsr.is_obsolete = 'F' AND
       s.is_obsolete = 'F' AND
       s.symbol IS NOT NULL
UNION
SELECT l.tair_object_id, UPPER(s.full_name)
  FROM Gene g JOIN
       MapElement_Locus mel ON g.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       Gene_Symbol_Reference gsr ON g.gene_id = gsr.gene_id JOIN
       Symbol s ON gsr.symbol_id = s.symbol_id
 WHERE CASE 
         WHEN s.full_name LIKE 'AT_G_____.%' THEN 'T'
         ELSE 'F'
       END = 'F' AND
       g.is_obsolete = 'F' AND
       gsr.is_obsolete = 'F' AND
       s.is_obsolete = 'F' AND
       s.full_name IS NOT NULL
;

GRANT SELECT ON DW_LocusOtherName to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusOtherName to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusOtherName to tairdbo;
GRANT SELECT ON DW_LocusOtherName to tairwebsql;

CREATE OR REPLACE DW_LocusOtherSymbol (
  locusTairObjectId,
  symbol,
  fullName
)
AS
SELECT l.tair_object_id AS locusTairObjectId,
       s.symbol,
       s.full_name
  FROM Locus l JOIN
       Gene g ON l.rep_genemodel_id = g.map_element_id JOIN
       Gene_Symbol_Reference gsr ON g.gene_id = gsr.gene_id JOIN
       Symbol s ON gsr.symbol_id = s.symbol_id
 WHERE l.is_obsolete = 'F' AND
       g.is_obsolete = 'F' AND
       s.is_obsolete = 'F'
;

GRANT SELECT ON DW_LocusOtherSymbol to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusOtherSymbol to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusOtherSymbol to tairdbo;
GRANT SELECT ON DW_LocusOtherSymbol to tairwebsql;

CREATE OR REPLACE VIEW DW_Annotation (
  category,
  relationshipType,
  keyword,
  evidenceCode,
  evidenceWith,
  reference,
  keywordId,
  ontologyId,
  evidenceDescription,
  evidenceId,
  referenceId,
  annotatedBy
)
AS
SELECT kt.keywordtype_type,
       rt.relationshiptype_type,
       k.keyword,
       e.evidence_code,
       toke.evidence_with,
       p.title,
       toke.keyword_id,
       k.extdb_id,
       e.description,
       toke.evidence_description_id,
       p.reference_id,
       CASE c.community_type
         WHEN 'person' THEN (SELECT first_name || ' ' || last_name FROM Person WHERE community_id = c.community_id)
         WHEN 'organization' THEN (SELECT name FROM Organization WHERE community_id = c.community_id)
         ELSE 'unknown'
       END AS annotatedBy
  FROM TairObjKeyEvidence toke JOIN
       Keyword k ON toke.keyword_id = k.keyword_id JOIN
       KeywordType kt ON k.keyword_type_id = kt.keyword_type_id JOIN
       RelationshipType rt ON toke.relationship_type_id = rt.relationship_type_id JOIN
       EvidenceDescription e ON toke.evidence_description_id = e.evidence_description_id JOIN
       Publication p ON toke.reference_id = p.reference_id LEFT JOIN
       Community c ON toke.annotated_by_id = c.community_id
 WHERE c.is_obsolete = 'F'
;

GRANT SELECT ON DW_Annotation to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Annotation to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Annotation to tairdbo;
GRANT SELECT ON DW_Annotation to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusGeneModelAnnotation (
  category,
  evidenceCode,
  evidenceWith,
  keyword,
  locusTairObjectId,
  reference,
  relationshipType
)
AS
SELECT DISTINCT
       kt.keywordtype_type,
       e.evidence_code,
       toke.evidence_with,
       k.keyword,
       l.tair_object_id,
       p.title,
       rt.relationshiptype_type
  FROM Locus l JOIN
       TairObjKeyEvidence toke ON l.tair_object_id = toke.tair_object_id JOIN
       Keyword k ON toke.keyword_id = k.keyword_id JOIN
       KeywordType kt ON k.keyword_type_id = kt.keyword_type_id JOIN
       RelationshipType rt ON toke.relationship_type_id = rt.relationship_type_id JOIN
       EvidenceDescription e ON toke.evidence_description_id = e.evidence_description_id JOIN
       Publication p ON toke.reference_id = p.reference_id
 WHERE l.is_obsolete = 'F'
;

GRANT SELECT ON DW_LocusAnnotation to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusAnnotation to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusAnnotation to tairdbo;
GRANT SELECT ON DW_LocusAnnotation to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusGeneModelAnnotation (
  category,
  evidenceCode,
  evidenceWith,
  geneModelName,
  keyword,
  locusTairObjectId,
  reference,
  relationshipType
)
AS
SELECT DISTINCT
       kt.keywordtype_type,
       e.evidence_code,
       toke.evidence_with,
       g.name,
       k.keyword,
       l.tair_object_id,
       p.title,
       rt.relationshiptype_type
  FROM Locus l JOIN
       MapElement_Locus mel ON l.locus_id = mel.locus_id JOIN
       Gene g ON mel.map_element_id = g.map_element_id JOIN
       TairObjKeyEvidence toke ON g.tair_object_id = toke.tair_object_id JOIN
       Keyword k ON toke.keyword_id = k.keyword_id JOIN
       KeywordType kt ON k.keyword_type_id = kt.keyword_type_id JOIN
       RelationshipType rt ON toke.relationship_type_id = rt.relationship_type_id JOIN
       EvidenceDescription e ON toke.evidence_description_id = e.evidence_description_id JOIN
       Publication p ON toke.reference_id = p.reference_id
 WHERE g.is_obsolete = 'F' AND
       l.is_obsolete = 'F'
;

GRANT SELECT ON DW_LocusGeneModelAnnotation to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusGeneModelAnnotation to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusGeneModelAnnotation to tairdbo;
GRANT SELECT ON DW_LocusGeneModelAnnotation to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusProteinModel (
  locusTairObjectId,  
  length,  
  molecularWeight,  
  isoelectricPoint,  
  sequenceTairObjectId  
) AS
SELECT l.tair_object_id AS locusTairObjectId,
       a.length,
       a.calc_MW AS molecularWeight,
       a.calc_pI AS isoelectricPoint,
       a.tair_object_id AS sequenceTairObjectId
  FROM Locus l JOIN 
       Gene g ON l.rep_genemodel_id = g.map_element_id JOIN 
       Gene_AASequence gs ON g.gene_id = gs.gene_id JOIN 
       AASequence a ON gs.aa_sequence_id = a.aa_sequence_id
 WHERE a.is_obsolete = 'F' AND
       l.is_obsolete = 'F' AND
       g.is_obsolete = 'F';

GRANT SELECT ON DW_LocusProteinModel to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusProteinModel to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusProteinModel to tairdbo;
GRANT SELECT ON DW_LocusProteinModel to tairwebsql;

CREATE OR REPLACE VIEW DW_Domain (
  accession,
  accessionUrl,
  domain,
  domainUrl,
  database,
  databaseUrl,
  structuralClassType,
  classUrl
)
AS
SELECT d.accession,
       null AS accessionUrl,
       name,
       null AS domainUrl,
       proteindomain_type AS database,
       null AS databaseUrl,
       sct.description,
       null AS classUrl
  FROM ProteinDomain d JOIN
       StructuralClassType sct ON d.structural_class_type_id = sct.structural_class_type_id
 WHERE is_obsolete = 'F';

GRANT SELECT ON DW_Domain to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Domain to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Domain to tairdbo;
GRANT SELECT ON DW_Domain to tairwebsql;

CREATE OR REPLACE VIEW DW_ProteinModel (
  geneModelName,
  locusTairObjectId,
  sequenceTairObjectId,
  length,
  molecularWeight,
  isoelectricPoint  
)
AS
SELECT g.name,
       l.tair_object_id,
       a.tair_object_id,
       a.length,
       a.calc_mw,
       a.calc_pi
  FROM Gene g JOIN
       MapElement_Locus mel ON g.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       Gene_AASequence gs ON g.gene_id = gs.gene_id JOIN
       AASequence a ON gs.aa_sequence_id = a.aa_sequence_id
 WHERE a.is_obsolete = 'F' AND
       l.is_obsolete = 'F' AND
       g.is_obsolete = 'F';

GRANT SELECT ON DW_ProteinModel to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ProteinModel to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ProteinModel to tairdbo;
GRANT SELECT ON DW_ProteinModel to tairwebsql;

CREATE OR REPLACE VIEW DW_ProteinModelDomain (
  accession,
  geneModelName,
  locusTairObjectId,
  sequenceTairObjectId,
  startPosition,
  endPosition
) AS
SELECT d.accession,
       g.name,
       l.tair_object_id,
       a.tair_object_id,
       dm.start_position,
       dm.end_position
  FROM Gene g JOIN
       MapElement_Locus mel ON g.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       Gene_AASequence gs ON g.gene_id = gs.gene_id JOIN
       AASequence a ON gs.aa_sequence_id = a.aa_sequence_id JOIN
       DomainMatch dm ON gs.aa_sequence_id = dm.aa_sequence_id JOIN
       ProteinDomain d ON dm.protein_domain_id = d.protein_domain_id
 WHERE a.is_obsolete = 'F' AND
       d.is_obsolete = 'F' AND
       g.is_obsolete = 'F' AND
       l.is_obsolete = 'F';

GRANT SELECT ON DW_ProteinModelDomain to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ProteinModelDomain to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ProteinModelDomain to tairdbo;
GRANT SELECT ON DW_ProteinModelDomain to tairwebsql;

-- This view doesn't retrieve anything at the moment, should get Interpro URL
CREATE OR REPLACE VIEW DW_ProteinResourceLink (
  geneModelName,
  locusTairObjectId,
  sequenceTairObjectId,
  name,
  icon,
  baseUrl,
  urlVariable,
  explanation
)
AS
SELECT g.name,
       l.tair_object_id,
       a.tair_object_id,
       u.web_site_name,
       null AS icon,
       u.url,
       a.uniprot_id
  FROM Gene g JOIN
       MapElement_Locus mel ON g.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       Gene_AASequence gs ON g.gene_id = gs.gene_id JOIN
       AASequence a ON gs.aa_sequence_id = a.aa_sequence_id JOIN
       TairObject_Url tu ON a.tair_object_id = tu.tair_object_id JOIN
       Url u ON tu.url_id = u.url_id
 WHERE g.is_obsolete = 'F' AND
       l.is_obsolete = 'F' AND
       a.is_obsolete = 'F';

GRANT SELECT ON DW_ProteinResourceLink to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ProteinResourceLink to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ProteinResourceLink to tairdbo;
GRANT SELECT ON DW_ProteinResourceLink to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusPolymorphism (
  locusTairObjectId, 
  polymorphismTairObjectId, 
  polymorphismName, 
  polymorphismType, 
  length, 
  startPosition, 
  endPosition
) AS
SELECT DISTINCT 
       l.tair_object_id, 
       p.tair_object_id,
       p.original_name, 
       NVL(p.polymorphism_type, 'unknown') AS polymorphismType,
       ga.length,
       ga.start_position,
       ga.end_position
  FROM Locus l JOIN
       MapElement_Locus m ON l.locus_id = m.locus_id JOIN 
       Polymorphism p ON m.map_element_id = p.map_element_id JOIN
       GlobalAssignment ga ON p.map_element_id = ga.map_element_id JOIN
       Map m ON ga.map_id = m.map_id
 WHERE p.is_obsolete = 'F' AND 
       m.is_obsolete = 'F' AND 
       m.map_type = 'nuc_sequence';

GRANT SELECT ON DW_LocusPolymorphism to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusPolymorphism to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusPolymorphism to tairdbo;
GRANT SELECT ON DW_LocusPolymorphism to tairwebsql;

-- We'll need a separate table that relates polys to gene models in TAIR,
-- with a calculation of the gene model site. This can then be revised to
-- use that instead of the second map-element join to gene model.
CREATE OR REPLACE DW_PolymorphismSite (
  geneModelName,
  polymorphismsLocusTairObjectId,
  lociLocusTairObjectId,
  polymorphismName,
  site
)
AS
SELECT g.name,
       l.tair_object_id, -- recursive link to same locus for locus gene model key
       l.tair_object_id,
       p.name,
       p.mutation_site as site -- unknown for now
  FROM Locus l JOIN
       MapElement_Locus m ON l.locus_id = m.locus_id JOIN 
       Polymorphism p ON m.map_element_id = p.map_element_id JOIN
       GlobalAssignment ga ON p.map_element_id = ga.map_element_id JOIN
       MapElement_Locus m2 ON l.locus_id = m2.locus_id JOIN
       Gene g ON m2.map_element_id = g.map_element_id JOIN
       Map m ON ga.map_id = m.map_id
 WHERE p.is_obsolete = 'F' AND 
       m.is_obsolete = 'F' AND 
       m.map_type = 'nuc_sequence' AND
       g.is_obsolete = 'F';
       
GRANT SELECT ON DW_PolymorphismSite to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ProteinResourceLink to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ProteinResourceLink to tairdbo;
GRANT SELECT ON DW_ProteinResourceLink to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusInducedPolymorphism (
  locusTairObjectId,
  polymorphismName,
  inheritance,
  alleleType,
  accession,
  ecotype,
  taxonId
) 
AS 
SELECT DISTINCT
       l.tair_object_id as locusTairObjectId,
       p.original_name as polymorphismName,
       p.inheritance,
       p.polymorphism_type AS allele_type,
       COALESCE(sv.accession_number, '0') AS accession,
       COALESCE(sv.original_name, CAST(sv.species_variant_id AS VARCHAR2(255))) as ecotype,
       sv.taxon_id
  FROM Locus l JOIN
       MapElement_Locus m ON l.locus_id = m.locus_id JOIN 
       Polymorphism p ON m.map_element_id = p.map_element_id JOIN
       GlobalAssignment ga ON p.map_element_id = ga.map_element_id JOIN
       Map m ON ga.map_id = m.map_id JOIN
       Polymorphism_SpeciesVariant psv ON p.polymorphism_id = psv.polymorphism_id JOIN
       SpeciesVariant sv ON psv.species_variant_id = sv.species_variant_id
 WHERE l.is_obsolete = 'F' AND
       p.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       m.is_obsolete = 'F' AND 
       m.map_type = 'nuc_sequence' AND
       sv.is_obsolete = 'F' AND
       (SELECT COUNT(*) FROM Polymorphism_SpeciesVariant WHERE polymorphism_id = p.polymorphism_id) = 1
;

GRANT SELECT ON DW_LocusInducedPolymorphism to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusInducedPolymorphism to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusInducedPolymorphism to tairdbo;
GRANT SELECT ON DW_LocusInducedPolymorphism to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusGermplasm (
  locusTairObjectId,  
  polymorphismName,  
  germplasmName,  
  germplasmTairObjectId,  
  phenotype  
)
AS 
SELECT l.tair_object_id AS locusTairObjectId,
       p.original_name AS polymorphismName,
       gr.original_name AS germplasmName,
       gr.tair_object_id AS germplasmTairObjectId,
       ph.phenotype
  FROM Locus l JOIN
       MapElement_Locus m ON l.locus_id = m.locus_id JOIN 
       Polymorphism p ON m.map_element_id = p.map_element_id JOIN
       GlobalAssignment ga ON p.map_element_id = ga.map_element_id JOIN
       Map m ON ga.map_id = m.map_id JOIN
       Germplasm_MapElement gme ON gme.map_element_id = p.map_element_id JOIN
       Germplasm gr ON gme.germplasm_id = gr.germplasm_id LEFT JOIN
       Germplasm_Phenotype gp ON gr.germplasm_id = gp.germplasm_id LEFT JOIN
       Phenotype ph ON gp.phenotype_id = ph.phenotype_id
 WHERE l.is_obsolete = 'F' AND
       p.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       m.is_obsolete = 'F' AND 
       m.map_type = 'nuc_sequence' AND
       gr.is_obsolete = 'F' AND
       l.tair_object_id IN (SELECT DISTINCT locusTairObjectId FROM DW_LocusInducedPolymorphism)
;

GRANT SELECT ON DW_LocusGermplasm to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusGermplasm to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusGermplasm to tairdbo;
GRANT SELECT ON DW_LocusGermplasm to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusNaturalVariation (
  locusTairObjectId,
  polymorphismName,
  detail,
  referenceAccession,
  referenceEcotype,
  referenceTaxonId
)
AS
SELECT l.tair_object_id AS locusTairObjectId,
       p.name AS polymorphismName,
       null AS detail, -- not in current database
       COALESCE(sv.accession_number, '0') AS referenceAccession,
       COALESCE(sv.original_name, CAST(sv.species_variant_id AS VARCHAR2(255))) as referenceEcotype,
       sv.taxon_id AS referenceTaxonId
  FROM Locus l JOIN
       MapElement_Locus m ON l.locus_id = m.locus_id JOIN 
       Polymorphism p ON m.map_element_id = p.map_element_id JOIN
       Polymorphism_SpeciesVariant psv ON p.polymorphism_id = psv.polymorphism_id JOIN
       SpeciesVariant sv ON psv.species_variant_id = sv.species_variant_id
 WHERE l.is_obsolete = 'F' AND
       p.is_obsolete = 'F' AND
       sv.is_obsolete = 'F' AND
       (SELECT COUNT(*) FROM Polymorphism_SpeciesVariant WHERE polymorphism_id = p.polymorphism_id) = 2 AND
       CASE 
         WHEN sv.taxon_id = 1 and sv.original_name = 'Columbia' AND COALESCE(sv.accession_number, '0') = '0' THEN 'T'
         ELSE 'F'
       END = 'T'
;

GRANT SELECT ON DW_LocusNaturalVariation to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusNaturalVariation to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusNaturalVariation to tairdbo;
GRANT SELECT ON DW_LocusNaturalVariation to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusNaturalVariationEcotype (
  accession,
  ecotype,
  locusTairObjectId,
  polymorphismName,
  taxonId
)
AS
SELECT COALESCE(sv.accession_number, '0') AS accession,
       COALESCE(sv.original_name, CAST(sv.species_variant_id AS VARCHAR2(255))) as ecotype,
       l.tair_object_id AS locusTairObjectId,
       p.name AS polymorphismName,
       sv.taxon_id AS referenceTaxonId
  FROM Locus l JOIN
       MapElement_Locus m ON l.locus_id = m.locus_id JOIN 
       Polymorphism p ON m.map_element_id = p.map_element_id JOIN
       Polymorphism_SpeciesVariant psv ON p.polymorphism_id = psv.polymorphism_id JOIN
       SpeciesVariant sv ON psv.species_variant_id = sv.species_variant_id
 WHERE l.is_obsolete = 'F' AND
       p.is_obsolete = 'F' AND
       sv.is_obsolete = 'F' AND
       (SELECT COUNT(*) FROM Polymorphism_SpeciesVariant WHERE polymorphism_id = p.polymorphism_id) = 2 AND
;

GRANT SELECT ON DW_LocusNaturalVariationEcotype to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusNaturalVariationEcotype to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusNaturalVariationEcotype to tairdbo;
GRANT SELECT ON DW_LocusNaturalVariationEcotype to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusResourceLink (
  locusTairObjectId,
  name,
  linkType,
  icon,
  baseUrl,
  urlVariable,
  explanation
)
AS
SELECT l.tair_object_id, 
       ex.web_site_name,
       null AS linkType, -- section in which link appears, needs to be added to DB
       null AS icon, -- need to add icon names to links
       ex.base_url, 
       toe.url_variable,
       null AS explanation -- need to add to DB
  FROM Locus l JOIN 
       TairObject_ExternalLink toe ON l.tair_object_id = toe.tair_object_id JOIN 
       ExternalLink ex ON ex.external_link_id = toe.external_link_id
;

GRANT SELECT ON DW_LocusResourceLink to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusResourceLink to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusResourceLink to tairdbo;
GRANT SELECT ON DW_LocusResourceLink to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusComment (
  locusTairObjectId,
  locusCommentNo,
  name,
  communityId,
  commentText,
  dateEntered
)
AS
SELECT l.tair_object_id,
       n.notepad_id,
       LTRIM(CASE WHEN p.first_name IS NOT null THEN p.first_name END ||
       CASE WHEN p.middle_name IS NOT null THEN ' ' || p.middle_name END ||
       CASE WHEN p.last_name IS NOT null THEN ' ' || p.last_name END) AS name,
       p.community_id,
       SUBSTR(CAST(n.notepad_comment AS VARCHAR2(100)), 1, 100) || 
       CASE WHEN LENGTH(CAST(n.notepad_comment AS VARCHAR2(150))) > 100 THEN '...' ELSE '' END AS comment_text,
       n.date_entered
  FROM Locus l JOIN
       Notepad n ON l.tair_object_id = n.tair_object_id JOIN
       Person p ON n.person_id = p.person_id
 WHERE n.status = 'active'
;

GRANT SELECT ON DW_LocusComment to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusComment to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusComment to tairdbo;
GRANT SELECT ON DW_LocusComment to tairwebsql;

CREATE OR REPLACE VIEW DW_LocusAttribution (
  locusTairObjectId,
  locusAttributionNo,
  attributionType,
  linkType,
  communityId,
  name,
  attributionDate
) AS
SELECT l.tair_object_id,
       a.attribution_id,
       aty.attribution_type,
       'person' AS link_type,
       p.community_id,
       p.first_name || ' ' || p.last_name AS name,
       a.attribution_date
  FROM Locus l JOIN
       Attribution a ON l.tair_object_id = a.tair_object_id JOIN
       AttributionType aty ON a.attribution_type_id = aty.attribution_type_id JOIN
       Person p ON a.community_id = p.community_id JOIN
       Community c ON p.community_id = c.community_id
 WHERE l.is_obsolete = 'F' AND
       c.is_obsolete = 'F'
UNION
SELECT l.tair_object_id,
       a.attribution_id,
       aty.attribution_type,
       'org' AS link_type,
       o.community_id,
       o.name,
       a.attribution_date
  FROM Locus l JOIN
       Attribution a ON l.tair_object_id = a.tair_object_id JOIN
       AttributionType aty ON a.attribution_type_id = aty.attribution_type_id JOIN
       Organization o ON a.community_id = o.community_id JOIN
       Community c ON o.community_id = c.community_id
 WHERE l.is_obsolete = 'F' AND
       c.is_obsolete = 'F'
;

GRANT SELECT ON DW_LocusAttribution to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusAttribution to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_LocusAttribution to tairdbo;
GRANT SELECT ON DW_LocusAttribution to tairwebsql;

CREATE OR REPLACE VIEW DW_Reference (
  locusTairObjectId,
  referenceTairObjectId,
  title,
  authors,
  publicationYear,
  locusCount,
  annotated
)
AS
SELECT l.tair_object_id AS locusTairObjectId,
       p.tair_object_id AS referenceTairObjectId,
       p.title,
       p.authors,
       p.publication_year,
       (SELECT COUNT(*) FROM Locus l1 JOIN TairObj_Ref tr1 ON l1.tair_object_id = tr1.tair_object_id WHERE tr1.tair_object_id = p.tair_object_id) AS locusCount,
       CASE WHEN (SELECT COUNT(*) FROM TairObjKeyEvidence WHERE reference_id = p.reference_id) > 0 THEN 'T' ELSE 'F' END AS annotated
  FROM Locus l JOIN
       TairObj_Ref tr ON l.tair_object_id = tr.tair_object_id JOIN
       Publication p ON tr.reference_id = p.reference_id
 WHERE p.publication_type IN ('research_article', 'abstract') AND
       l.is_obsolete = 'F'
;

GRANT SELECT ON DW_Reference to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Reference to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Reference to tairdbo;
GRANT SELECT ON DW_Reference to tairwebsql;

CREATE OR REPLACE VIEW DW_JournalArticle (
  locusTairObjectId,
  referenceTairObjectId,
  journal,
  pubmedId
)
AS
SELECT l.tair_object_id AS locusTairObjectId,
       p.tair_object_id AS referenceTairObjectId,
       s.name,
       p.pubmed_id
  FROM Locus l JOIN
       TairObj_Ref tr ON l.tair_object_id = tr.tair_object_id JOIN
       Publication p ON tr.reference_id = p.reference_id JOIN
       PubSource s ON p.pub_source_id = s.pub_source_id
 WHERE p.publication_type IN ('research_article') AND
       l.is_obsolete = 'F'
;

GRANT SELECT ON DW_JournalArticle to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_JournalArticle to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_JournalArticle to tairdbo;
GRANT SELECT ON DW_JournalArticle to tairwebsql;

CREATE OR REPLACE VIEW DW_ConferenceAbstract (
  locusTairObjectId,  
  referenceTairObjectId,  
  conference  
)
AS
SELECT l.tair_object_id AS locusTairObjectId,
       p.tair_object_id AS referenceTairObjectId,
       s.name
  FROM Locus l JOIN
       TairObj_Ref tr ON l.tair_object_id = tr.tair_object_id JOIN
       Publication p ON tr.reference_id = p.reference_id JOIN
       PubSource s ON p.pub_source_id = s.pub_source_id
 WHERE p.publication_type IN ('abstract') AND
       l.is_obsolete = 'F'
;

GRANT SELECT ON DW_ConferenceAbstract to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ConferenceAbstract to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ConferenceAbstract to tairdbo;
GRANT SELECT ON DW_ConferenceAbstract to tairwebsql;

CREATE OR REPLACE VIEW DW_ReferencedLocus (
  locusTairObjectId,
  referenceTairObjectId,
  refLocusame,
  refLocusTairObjectId,
  primarySymbol,
  primarySymbolFullName
)
AS
SELECT l.tair_object_id AS locusTairObjectId,
       p.tair_object_id AS referenceTairObjectId,
       l2.name,
       l2.tair_object_id AS refLocusTairObjectId,
       sy.symbol,
       sy.full_name
  FROM Locus l JOIN
       TairObj_Ref tr ON l.tair_object_id = tr.tair_object_id JOIN
       Publication p ON tr.reference_id = p.reference_id JOIN
       TairObj_Ref tr2 ON p.reference_id = tr.reference_id JOIN
       Locus l2 ON tr2.tair_object_id = l2.tair_object_id JOIN
       Gene g ON l2.rep_genemodel_id = g.map_element_id JOIN
       Symbol sy ON g.primary_symbol_id = sy.symbol_id
 WHERE p.publication_type IN ('research_article', 'abstract') AND
       l.tair_object_id <> l2.tair_object_id AND
       l.is_obsolete = 'F' AND
       g.is_obsolete = 'F' AND
       sy.is_obsolete = 'F'
;

GRANT SELECT ON DW_ReferencedLocus to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ReferencedLocus to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ReferencedLocus to tairdbo;
GRANT SELECT ON DW_ReferencedLocus to tairwebsql;
