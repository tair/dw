--
-- Copyright 2012 Carnegie Institution for Science. All rights reserved.
--
-- Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
-- Template: SubsystemAnsiSchemaTables.vsl

-- SQL schema for basic subsystem

CREATE TABLE Taxon (
  taxonId INTEGER NOT NULL,  
  genus VARCHAR(100) NOT NULL,  
  species VARCHAR(100) NOT NULL,  
  common VARCHAR(200),  
  CONSTRAINT TaxonPK PRIMARY KEY (taxonId)
);

CREATE TABLE SpeciesVariant (
  taxonId INTEGER NOT NULL,  
  name VARCHAR(200) NOT NULL,  
  accession VARCHAR(200) NOT NULL,  
  reference BOOLEAN NOT NULL,  
  CONSTRAINT SpeciesVariantPK PRIMARY KEY (accession, name, taxonId)
);

