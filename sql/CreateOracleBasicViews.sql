CREATE OR REPLACE VIEW DW_Taxon (
  taxonId,
  genus,
  species,
  common
) AS
SELECT taxon_id,
       genus,
       species,
       common_name
  FROM Taxon;
  
GRANT SELECT ON DW_Taxon to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Taxon to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Taxon to tairdbo;
GRANT SELECT ON DW_Taxon to tairwebsql;

CREATE PUBLIC SYNONYM DW_Taxon for DW_Taxon;

CREATE OR REPLACE VIEW DW_SpeciesVariant (
  taxonId,
  name,
  accession,
  reference
) AS
SELECT taxon_id,
       COALESCE(original_name, CAST(species_variant_id AS VARCHAR2(255))) AS name, 
       COALESCE(accession_number, '0') AS accession,
       CASE 
         WHEN taxon_id = 1 and original_name = 'Columbia' AND COALESCE(accession_number, '0') = '0' THEN 'T'
         ELSE 'F'
       END AS reference
  FROM SpeciesVariant
 WHERE is_obsolete = 'F';

GRANT SELECT ON DW_Taxon to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Taxon to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Taxon to tairdbo;
GRANT SELECT ON DW_Taxon to tairwebsql;

CREATE PUBLIC SYNONYM DW_Taxon for DW_Taxon;
