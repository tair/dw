--
-- Copyright 2012 Carnegie Institution for Science. All rights reserved.
--
-- Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
-- Template: SubsystemSybaseSchemaForeignKeys.vsl

-- Create all the foreign keys for the Protein schema
-- Sybase does not support ON DELETE CASCADE, all deletes must be done manually.

-- Foreign keys for ProteinTranscript

ALTER TABLE ProteinTranscript ADD CONSTRAINT protein FOREIGN KEY (tairObjectId) REFERENCES Protein(tairObjectId);

-- Foreign keys for Domain

ALTER TABLE Domain ADD CONSTRAINT protein FOREIGN KEY (tairObjectId) REFERENCES Protein(tairObjectId);

-- Foreign keys for ProteinResourceLink

ALTER TABLE ProteinResourceLink ADD CONSTRAINT protein FOREIGN KEY (tairObjectId) REFERENCES Protein(tairObjectId);

