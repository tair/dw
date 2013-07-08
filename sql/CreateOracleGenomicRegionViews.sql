-- Creates the view representations of the TAIR Data Warehouse Genomic Region subsystem

CREATE OR REPLACE VIEW DW_ReferenceGenome AS
SELECT DISTINCT name AS genome
  FROM Map
 WHERE map_type = 'nuc_sequence';

GRANT SELECT ON DW_ReferenceGenome to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ReferenceGenome to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ReferenceGenome to tairdbo;

-- Has five missing gene models and some duplicate-sequence situations as of 10/26/2012
CREATE OR REPLACE VIEW DW_Transcript AS
SELECT m.name AS genome,
       g.tair_object_id AS tairObjectId,
       g.name,
       g.primary_symbol_id,
       g.date_entered AS dateEntered,
       s.symbol AS primarySymbol,
       s.full_name AS primarySymbolFullName,
       ga.start_position AS startPosition,
       ga.end_position AS endPosition,
       ga.length,
       CASE ga.orientation
         WHEN 'F' THEN 'forward'
         WHEN 'R' THEN 'reverse'
         ELSE 'invalid'
       END AS orientation,
       ga.assignment_basis AS basis,
       ga.is_derived AS derived,
       CASE WHEN l.locus_id IS NOT NULL THEN 1
       ELSE 0
       END AS representativeGeneModel,
       l.tair_object_id AS transcribes
  FROM Gene g JOIN
       MapElement_Locus mel ON g.map_element_id = mel.map_element_id JOIN
       Locus l ON mel.locus_id = l.locus_id JOIN
       GlobalAssignment ga ON g.map_element_id = ga.map_element_id JOIN
       Map m ON ga.map_id = m.map_id LEFT JOIN
       Symbol s ON g.primary_symbol_id = s.symbol_id LEFT JOIN
       (SELECT ns1.nucleotide_seq_id, ns1.name, ncsme.map_element_id AS link_map_element_id, ns1.sequence, 
               ns1.tair_object_id, ns1.map_element_id, ic_accession, sequence_class, nucleotidesequence_type
          FROM NucleotideSequence ns1 JOIN
               NucleotideSequence_MapElement ncsme ON ncsme.nucleotide_seq_id = ns1.nucleotide_seq_id
         WHERE sequence_class = 'genomic' AND 
               nucleotidesequence_type = 'genomic' AND
               is_obsolete = 'F') ns ON g.map_element_id = ns.link_map_element_id
 WHERE l.is_obsolete = 'F' AND
       g.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       map_type = 'nuc_sequence';

GRANT SELECT ON DW_Transcript to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Transcript to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Transcript to tairdbo;

CREATE OR REPLACE VIEW DW_Gene AS
SELECT m.name AS genome,
       l.tair_object_id AS tairObjectId,
       l.name,
       l.date_entered AS dateEntered,
       g.description
  FROM Locus l JOIN
       Gene g ON l.rep_genemodel_id = g.map_element_id JOIN
       GlobalAssignment ga ON g.map_element_id = ga.map_element_id JOIN
       Map m ON ga.map_id = m.map_id
 WHERE l.is_obsolete = 'F' AND
       g.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       map_type = 'nuc_sequence';

CREATE OR REPLACE VIEW DW_Chromosome AS
SELECT m.tair_object_id AS tairObjectId,
       m.chromosome AS name,
       m.date_entered AS dateEntered,
       ns.sequence
  FROM Map m LEFT JOIN
       NucleotideSequence_MapElement nsme ON m.map_element_id = nsme.map_element_id JOIN
       NucleotideSequence ns ON nsme.nucleotide_seq_id = ns.nucleotide_seq_id
 WHERE m.map_type = 'nuc_sequence' AND
       m.name = 'AGI';

GRANT SELECT ON DW_Chromosome to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Chromosome to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Chromosome to tairdbo;

CREATE OR REPLACE VIEW DW_Contig AS
SELECT m.tair_object_id AS tairObjectId,
       m.chromosome AS name,
       m.date_entered AS dateEntered,
       ns.sequence
  FROM Map m LEFT JOIN
       NucleotideSequence_MapElement nsme ON m.map_element_id = nsme.map_element_id LEFT JOIN
       NucleotideSequence ns ON nsme.nucleotide_seq_id = ns.nucleotide_seq_id
 WHERE m.map_type = 'nuc_sequence' AND
       m.name = 'LYRATA';

-- This view is a union of the four previous views with shared columns extracted.
CREATE OR REPLACE VIEW DW_Region AS
SELECT tairObjectId, name, dateEntered, 'Transcript' AS discriminant
  FROM DW_Transcript
UNION
SELECT tairObjectId, name, dateEntered, 'Gene' AS discriminant
  FROM DW_Gene
UNION
SELECT tairObjectId, name, dateEntered, 'Chromosome' AS discriminant
  FROM DW_Chromosome
UNION
SELECT tairObjectId, name, dateEntered, 'Contig' AS discriminant
  FROM DW_Contig
;

GRANT SELECT ON DW_Region to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Region to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Region to tairdbo;

CREATE OR REPLACE VIEW DW_ExperimentalCdna AS
SELECT m.name AS genome,
       g.tair_object_id AS tairObjectId,
       ns.tair_object_id AS seqTairObjectId,
       g.name,
       ns.sequence,
       ns.ic_accession AS genbankAccession,
       v.vector_type AS vectorType,
       ns.CDS_IS_FULL_LENGTH AS fullLengthCds,
       ga.length,
       ga.start_position AS startPosition,
       ga.end_position AS endPosition,
       g.date_entered AS dateEntered
  FROM Gene g JOIN
       GlobalAssignment ga ON g.map_element_id = ga.map_element_id JOIN
       Map m ON ga.map_id = m.map_id JOIN
       NucleotideSequence_MapElement ncsme ON g.map_element_id = ncsme.map_element_id JOIN
       NucleotideSequence ns ON ncsme.nucleotide_seq_id = ns.nucleotide_seq_id LEFT JOIN
       Vector_NucleotideSequence vns ON ns.nucleotide_seq_id = vns.nucleotide_seq_id LEFT JOIN
       Vector v ON vns.vector_id = v.vector_id
 WHERE g.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       ns.is_obsolete = 'F' AND
       map_type = 'nuc_sequence' AND
       ns.sequence_class = 'cDNA' AND 
       ns.nucleotidesequence_type = 'genomic';

GRANT SELECT ON DW_ExperimentalCdna to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ExperimentalCdna to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_ExperimentalCdna to tairdbo;

CREATE OR REPLACE VIEW DW_Est AS
SELECT m.name AS genome,
       g.tair_object_id AS tairObjectId,
       ns.tair_object_id AS seqTairObjectId,
       g.name,
       ns.sequence,
       ns.ic_accession AS genbankAccession,
       ga.length,
       ga.start_position AS startPosition,
       ga.end_position AS endPosition,
       g.date_entered AS dateEntered,
       c.name AS cloneName,
       c.clone_id AS cloneId
  FROM Gene g JOIN
       GlobalAssignment ga ON g.map_element_id = ga.map_element_id JOIN
       Map m ON ga.map_id = m.map_id JOIN
       Gene_MapElement gme ON g.gene_id = gme.gene_id JOIN
       CloneEnd ce ON gme.map_element_id = ce.map_element_id JOIN
       Clone c ON ce.clone_id = c.clone_id JOIN
       NucleotideSequence_MapElement ncsme ON ce.map_element_id = ncsme.map_element_id JOIN
       NucleotideSequence ns ON ncsme.nucleotide_seq_id = ns.nucleotide_seq_id
 WHERE g.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       ns.is_obsolete = 'F' AND
       ce.is_obsolete = 'F' AND
       c.is_obsolete = 'F' AND
       m.map_type = 'nuc_sequence' AND
       ce.cloneEnd_Type = 'EST';

GRANT SELECT ON DW_Est to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Est to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Est to tairdbo;

CREATE OR REPLACE VIEW DW_Polypeptide AS
SELECT m.name AS genome,
       g.tair_object_id AS tairObjectId,
       aa.aa_sequence_id AS aaSequenceId,
       aa.genbank_definition AS genBankDefinition,
       aa.is_experimental AS experimental,
       aa.description,
       aa.genbank_gi AS genBankGi,
       aa.pir_accession AS PirAccession,
       aa.calc_pi AS Pi,
       aa.calc_mw AS molecularWeight,
       aa.ec_number AS ecNumber,
       aa.trembl_id AS tremblId,
       aa.swissprot_id AS swissProtId,
       aa.uniprot_id AS uniProtId,
       aa.date_entered AS dateEntered
  FROM Gene g JOIN
       GlobalAssignment ga ON g.map_element_id = ga.map_element_id JOIN
       Map m ON ga.map_id = m.map_id JOIN
       Gene_AASequence gaa ON g.gene_id = gaa.gene_id JOIN
       AASequence aa ON gaa.aa_sequence_id = aa.aa_sequence_id
 WHERE g.is_obsolete = 'F' AND
       ga.is_obsolete = 'F' AND
       aa.is_obsolete = 'F' AND
       m.map_type = 'nuc_sequence';

GRANT SELECT ON DW_Polypeptide to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Polypeptide to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Polypeptide to tairdbo;
