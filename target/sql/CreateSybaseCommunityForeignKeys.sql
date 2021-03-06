--
-- Copyright 2012 Carnegie Institution for Science. All rights reserved.
--
-- Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
-- Template: SubsystemSybaseSchemaForeignKeys.vsl

-- Create all the foreign keys for the Community schema
-- Sybase does not support ON DELETE CASCADE, all deletes must be done manually.

-- Foreign keys for CommunityKeyword

ALTER TABLE CommunityKeyword ADD CONSTRAINT member FOREIGN KEY (communityId) REFERENCES Community(communityId);

-- Foreign keys for Community

ALTER TABLE Community ADD CONSTRAINT country FOREIGN KEY (countryId) REFERENCES Country(countryId);

-- Foreign keys for CommunityAttribution

ALTER TABLE CommunityAttribution ADD CONSTRAINT member FOREIGN KEY (communityId) REFERENCES Community(communityId);

-- Foreign keys for Person

ALTER TABLE Person ADD CONSTRAINT PersonPkFk FOREIGN KEY (communityId) REFERENCES Community(communityId);

-- Foreign keys for CommunityAlias

ALTER TABLE CommunityAlias ADD CONSTRAINT member FOREIGN KEY (communityId) REFERENCES Community(communityId);

-- Foreign keys for CommunityReference

ALTER TABLE CommunityReference ADD CONSTRAINT member FOREIGN KEY (communityId) REFERENCES Community(communityId);

-- Foreign keys for Affiliation

ALTER TABLE Affiliation ADD CONSTRAINT affiliates FOREIGN KEY (affiliateCommunityId) REFERENCES Person(communityId);
ALTER TABLE Affiliation ADD CONSTRAINT organizations FOREIGN KEY (organizationCommunityId) REFERENCES Organization(communityId);

-- Foreign keys for Organization

ALTER TABLE Organization ADD CONSTRAINT OrganizationPkFk FOREIGN KEY (communityId) REFERENCES Community(communityId);

