--
-- Copyright 2012 Carnegie Institution for Science. All rights reserved.
--
-- Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
-- Template: SubsystemAnsiSchemaTables.vsl

-- SQL schema for community subsystem

CREATE TABLE CommunityKeyword (
  communityId NUMERIC NOT NULL,  
  keyword VARCHAR(200) NOT NULL,  
  keywordType VARCHAR(30) NOT NULL,  
  CONSTRAINT CommunityKeywordPK PRIMARY KEY (communityId, keyword)
);

CREATE TABLE Community (
  communityId NUMERIC NOT NULL, -- generated by sequence  
  communityType VARCHAR(12) NOT NULL,  
  email VARCHAR(100),  
  memberStatus VARCHAR(20) NOT NULL,  
  countryId NUMERIC NOT NULL,  
  CONSTRAINT CommunityPK PRIMARY KEY (communityId)
);

CREATE TABLE CommunityAttribution (
  communityId NUMERIC NOT NULL,  
  attributionType VARCHAR(100) NOT NULL,  
  name VARCHAR(100) NOT NULL,  
  tairObjectId INTEGER(12) NOT NULL,  
  attributionDate TIMESTAMP NOT NULL,  
  attributionComment VARCHAR(500),  
  CONSTRAINT CommunityAttributionPK PRIMARY KEY (attributionType, communityId, name, tairObjectId)
);

CREATE TABLE Person (
  communityId NUMERIC NOT NULL,  
  userName VARCHAR(30) NOT NULL,  
  firstName VARCHAR(30),  
  middleName VARCHAR(30),  
  lastName VARCHAR(30) NOT NULL,  
  suffix VARCHAR(10),  
  researchInterest VARCHAR(500),  
  CONSTRAINT PersonPK PRIMARY KEY (communityId)
);

CREATE TABLE CommunityAlias (
  communityId NUMERIC NOT NULL,  
  alias VARCHAR(100) NOT NULL,  
  CONSTRAINT CommunityAliasPK PRIMARY KEY (alias, communityId)
);

CREATE TABLE Country (
  countryId NUMERIC NOT NULL, -- generated by sequence  
  name VARCHAR(30) NOT NULL,  
  CONSTRAINT CountryPK PRIMARY KEY (countryId)
);

CREATE TABLE CommunityReference (
  communityId NUMERIC NOT NULL,  
  tairObjectId INTEGER(12) NOT NULL,  
  title VARCHAR(2000) NOT NULL,  
  source VARCHAR(300) NOT NULL,  
  publicationYear INTEGER(4) NOT NULL,  
  CONSTRAINT CommunityReferencePK PRIMARY KEY (communityId, tairObjectId)
);

CREATE TABLE Affiliation (
  organizationCommunityId NUMERIC NOT NULL,  
  affiliateCommunityId NUMERIC NOT NULL,  
  jobTitle VARCHAR(60),  
  pi BOOLEAN,  
  CONSTRAINT AffiliationPK PRIMARY KEY (organizationCommunityId, affiliateCommunityId)
);

CREATE TABLE Organization (
  communityId NUMERIC NOT NULL,  
  name VARCHAR(100) NOT NULL,  
  organizationType VARCHAR(30) NOT NULL,  
  description VARCHAR(500),  
  commercial BOOLEAN,  
  CONSTRAINT OrganizationPK PRIMARY KEY (communityId)
);
