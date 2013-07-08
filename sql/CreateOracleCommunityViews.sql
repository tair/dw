CREATE OR REPLACE VIEW DW_Community (
  communityId,
  communityType,
  email,
  memberStatus,
  countryId
) AS
SELECT c.community_id,
       c.community_type,
       CASE 
         WHEN c.email_failures < 5 AND p.send_mail = 'T' THEN c.email
         ELSE NULL
       END AS email,
       c.status,
       (SELECT country_id
          FROM Address
         WHERE community_id = c.community_id) AS countryId
  FROM Community c LEFT JOIN
       Person p ON c.community_id = p.community_id
 WHERE c.is_obsolete = 'F';

GRANT SELECT ON DW_Community to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Community to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Community to tairdbo;
GRANT SELECT ON DW_Community to tairwebsql;

CREATE PUBLIC SYNONYM DW_Community for DW_Community;

CREATE OR REPLACE VIEW DW_CommunityReference (
  communityId,  
  tairObjectId,  
  title,  
  source,  
  publicationYear  
) AS
SELECT rc.community_id, 
       p.tair_object_id,
       p.title,
       ps.name,
       p.publication_year
  FROM Reference_Community rc JOIN
       Publication p ON rc.reference_id = p.reference_id JOIN
       PubSource ps ON p.pub_source_id = ps.pub_source_id;

GRANT SELECT ON DW_CommunityReference to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_CommunityReference to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_CommunityReference to tairdbo;
GRANT SELECT ON DW_CommunityReference to tairwebsql;

CREATE PUBLIC SYNONYM DW_CommunityReference for DW_CommunityReference;

CREATE OR REPLACE VIEW DW_CommunityAlias (
  communityId,
  alias
) AS 
SELECT ca.community_id, 
       ca.alias
  FROM CommunityAlias ca JOIN
       Community c ON ca.community_id = c.community_id
 WHERE c.is_obsolete = 'F';
  
GRANT SELECT ON DW_CommunityAlias to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_CommunityAlias to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_CommunityAlias to tairdbo;
GRANT SELECT ON DW_CommunityAlias to tairwebsql;

CREATE PUBLIC SYNONYM DW_CommunityAlias for DW_CommunityAlias;

CREATE OR REPLACE VIEW DW_CommunityAttribution (
  communityId,
  attributionType,
  name,
  tairObjectId,
  attributionDate,
  attributionComment
) AS
SELECT a.community_id,
       t.attribution_type,
       sv.name,
       a.tair_object_id,
       a.attribution_date,
       a.attribution_comment
  FROM Attribution a JOIN
       SpeciesVariant sv ON a.tair_object_id = sv.tair_object_id JOIN
       AttributionType t ON a.attribution_type_id = t.attribution_type_id JOIN
       Community c ON a.community_id = c.community_id
 WHERE c.is_obsolete = 'F' AND
       sv.is_obsolete = 'F'
UNION
SELECT a.community_id,
       t.attribution_type,
       n.name,
       a.tair_object_id,
       a.attribution_date,
       a.attribution_comment
  FROM Attribution a JOIN
       NucleotideSequence n ON a.tair_object_id = n.tair_object_id JOIN
       AttributionType t ON a.attribution_type_id = t.attribution_type_id JOIN
       Community c ON a.community_id = c.community_id
 WHERE c.is_obsolete = 'F' AND
       n.is_obsolete = 'F'
UNION
SELECT a.community_id,
       t.attribution_type,
       aa.name,
       a.tair_object_id,
       a.attribution_date,
       a.attribution_comment
  FROM Attribution a JOIN
       AASequence aa ON a.tair_object_id = aa.tair_object_id JOIN
       AttributionType t ON a.attribution_type_id = t.attribution_type_id JOIN
       Community c ON a.community_id = c.community_id
 WHERE c.is_obsolete = 'F' AND
       aa.is_obsolete = 'F'
UNION
SELECT a.community_id,
       t.attribution_type,
       g.name,
       a.tair_object_id,
       a.attribution_date,
       a.attribution_comment
  FROM Attribution a JOIN
       Germplasm g ON a.tair_object_id = g.tair_object_id JOIN
       AttributionType t ON a.attribution_type_id = t.attribution_type_id JOIN
       Community c ON a.community_id = c.community_id
 WHERE c.is_obsolete = 'F' AND
       g.is_obsolete = 'F'
UNION
SELECT a.community_id,
       t.attribution_type,
       g.name,
       a.tair_object_id,
       a.attribution_date,
       a.attribution_comment
  FROM Attribution a JOIN
       Gene g ON a.tair_object_id = g.tair_object_id JOIN
       AttributionType t ON a.attribution_type_id = t.attribution_type_id JOIN
       Community c ON a.community_id = c.community_id
 WHERE c.is_obsolete = 'F' AND
       g.is_obsolete = 'F'
UNION
SELECT a.community_id,
       t.attribution_type,
       l.name,
       a.tair_object_id,
       a.attribution_date,
       a.attribution_comment
  FROM Attribution a JOIN
       Locus l ON a.tair_object_id = l.tair_object_id JOIN
       AttributionType t ON a.attribution_type_id = t.attribution_type_id JOIN
       Community c ON a.community_id = c.community_id
 WHERE c.is_obsolete = 'F' AND
       l.is_obsolete = 'F'
UNION
SELECT a.community_id,
       t.attribution_type,
       p.name,
       a.tair_object_id,
       a.attribution_date,
       a.attribution_comment
  FROM Attribution a JOIN
       Polymorphism p ON a.tair_object_id = p.tair_object_id JOIN
       AttributionType t ON a.attribution_type_id = t.attribution_type_id JOIN
       Community c ON a.community_id = c.community_id
 WHERE c.is_obsolete = 'F' AND
       p.is_obsolete = 'F'
UNION
SELECT a.community_id,
       t.attribution_type,
       m.name,
       a.tair_object_id,
       a.attribution_date,
       a.attribution_comment
  FROM Attribution a JOIN
       Map m ON a.tair_object_id = m.tair_object_id JOIN
       AttributionType t ON a.attribution_type_id = t.attribution_type_id JOIN
       Community c ON a.community_id = c.community_id
 WHERE map_type = 'nuc_sequence' AND
       c.is_obsolete = 'F' AND
       m.is_obsolete = 'F'
UNION
SELECT a.community_id,
       t.attribution_type,
       c.name,
       a.tair_object_id,
       a.attribution_date,
       a.attribution_comment
  FROM Attribution a JOIN
       Contig c ON a.tair_object_id = c.tair_object_id JOIN
       AttributionType t ON a.attribution_type_id = t.attribution_type_id JOIN
       Community cm ON a.community_id = cm.community_id
 WHERE cm.is_obsolete = 'F' AND
       c.is_obsolete = 'F'
UNION
SELECT a.community_id,
       t.attribution_type,
       cl.name,
       a.tair_object_id,
       a.attribution_date,
       a.attribution_comment
  FROM Attribution a JOIN
       Clone cl ON a.tair_object_id = cl.tair_object_id JOIN
       AttributionType t ON a.attribution_type_id = t.attribution_type_id JOIN
       Community c ON a.community_id = c.community_id
 WHERE c.is_obsolete = 'F' AND
       cl.is_obsolete = 'F';

GRANT SELECT ON DW_CommunityAttribution to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_CommunityAttribution to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_CommunityAttribution to tairdbo;
GRANT SELECT ON DW_CommunityAttribution to tairwebsql;

CREATE PUBLIC SYNONYM DW_CommunityAttribution for DW_CommunityAttribution;

CREATE OR REPLACE VIEW DW_CommunityKeyword (
  communityId,
  keyword,
  keywordType
) AS
SELECT community_id,
       keyword,
       communitykeyword_type
  FROM CommunityKeyword;

GRANT SELECT ON DW_CommunityKeyword to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_CommunityKeyword to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_CommunityKeyword to tairdbo;
GRANT SELECT ON DW_CommunityKeyword to tairwebsql;

CREATE PUBLIC SYNONYM DW_CommunityKeyword for DW_CommunityKeyword;

CREATE OR REPLACE VIEW DW_Country (
  countryId,
  name
) AS
SELECT country_id,
       name
  FROM Country;

GRANT SELECT ON DW_Country to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Country to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Country to tairdbo;
GRANT SELECT ON DW_Country to tairwebsql;

CREATE PUBLIC SYNONYM DW_Country for DW_Country;

CREATE OR REPLACE VIEW DW_Person (
  communityId,
  userName,
  firstName,
  middleName,
  lastName,
  suffix,
  researchInterest
) AS
SELECT p.community_id,
       c.user_name,
       p.first_name,
       p.middle_name,
       p.last_name,
       p.suffix,
       p.research_interest
  FROM Person p JOIN
       Community c ON p.community_id = c.community_id;
       
GRANT SELECT ON DW_Person to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Person to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Person to tairdbo;
GRANT SELECT ON DW_Person to tairwebsql;

CREATE PUBLIC SYNONYM DW_Person for DW_Person;

CREATE OR REPLACE VIEW DW_Organization (
  communityId,
  name,
  organizationType,
  description,
  commercial
) AS
SELECT community_id,
       name,
       organization_type,
       description,
       commercial
  FROM Organization;

GRANT SELECT ON DW_Organization to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Organization to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Organization to tairdbo;
GRANT SELECT ON DW_Organization to tairwebsql;

CREATE PUBLIC SYNONYM DW_Organization for DW_Organization;

CREATE OR REPLACE VIEW DW_Affiliation (
  affiliateCommunityId,
  organziationCommunityId,
  jobTitle,
  pi
) AS
SELECT a.community_id AS affiliateCommunityId,
       o.community_id AS organizationCommunityId,
       a.job_title,
       a.is_pi
  FROM Affiliation a JOIN
       Organization o on a.organization_id = o.organization_id;

GRANT SELECT ON DW_Affiliation to readonly;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Affiliation to webwriter;
GRANT SELECT, INSERT, UPDATE, DELETE ON DW_Affiliation to tairdbo;
GRANT SELECT ON DW_Affiliation to tairwebsql;

CREATE PUBLIC SYNONYM DW_Affiliation for DW_Affiliation;
