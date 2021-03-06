/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractBsDto.vsl


package org.tair.bs.community;


import com.poesys.bs.delegate.DelegateException;
import com.poesys.bs.dto.IDto;
import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.dto.AbstractDto;


import org.tair.db.community.IOrganization;
import org.tair.db.community.OrganizationProxy;
import org.tair.db.community.Organization;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the Organization. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * An organization that is a member of the community
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: false
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractBsOrganization 
    extends AbstractDto<org.tair.db.community.IOrganization> {

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsCommunityAlias objects from a Collection aliases of data-access-layer 
   * org.tair.db.community.ICommunityAlias objects
   */
  private class BsAliasesCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.community.ICommunityAlias, org.tair.bs.community.BsCommunityAlias> {
    @Override
    public org.tair.bs.community.BsCommunityAlias get(org.tair.db.community.ICommunityAlias dto) {
      return new org.tair.bs.community.BsCommunityAlias(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of CommunityAlias objects from an input Collection aliases of 
   * business-layer BsCommunityAlias objects
   */
  private class AliasesCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.community.BsCommunityAlias, org.tair.db.community.ICommunityAlias> {
    @Override
    public org.tair.db.community.ICommunityAlias get(org.tair.bs.community.BsCommunityAlias dto) {
      return dto.toDto();
    }
  }

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsCommunityKeyword objects from a Collection keywords of data-access-layer 
   * org.tair.db.community.ICommunityKeyword objects
   */
  private class BsKeywordsCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.community.ICommunityKeyword, org.tair.bs.community.BsCommunityKeyword> {
    @Override
    public org.tair.bs.community.BsCommunityKeyword get(org.tair.db.community.ICommunityKeyword dto) {
      return new org.tair.bs.community.BsCommunityKeyword(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of CommunityKeyword objects from an input Collection keywords of 
   * business-layer BsCommunityKeyword objects
   */
  private class KeywordsCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.community.BsCommunityKeyword, org.tair.db.community.ICommunityKeyword> {
    @Override
    public org.tair.db.community.ICommunityKeyword get(org.tair.bs.community.BsCommunityKeyword dto) {
      return dto.toDto();
    }
  }

  /**
   * A List builder helper class for building a business-layer List 
   * of BsCommunityReference objects from a List publications of data-access-layer 
   * org.tair.db.community.ICommunityReference objects
   */
  private class BsPublicationsListBuilder 
      extends com.poesys.bs.dto.ListBuilder<org.tair.db.community.ICommunityReference, org.tair.bs.community.BsCommunityReference> {
    @Override
    public org.tair.bs.community.BsCommunityReference get(org.tair.db.community.ICommunityReference dto) {
      return new org.tair.bs.community.BsCommunityReference(dto);
    }
  }

  /**
   * A List builder helper class for building a data-access-layer List 
   * of CommunityReference objects from an input List publications of 
   * business-layer BsCommunityReference objects
   */
  private class PublicationsListBuilder 
      extends com.poesys.bs.dto.ListBuilder<org.tair.bs.community.BsCommunityReference, org.tair.db.community.ICommunityReference> {
    @Override
    public org.tair.db.community.ICommunityReference get(org.tair.bs.community.BsCommunityReference dto) {
      return dto.toDto();
    }
  }

  /**
   * A List builder helper class for building a business-layer List 
   * of BsCommunityAttribution objects from a List attributions of data-access-layer 
   * org.tair.db.community.ICommunityAttribution objects
   */
  private class BsAttributionsListBuilder 
      extends com.poesys.bs.dto.ListBuilder<org.tair.db.community.ICommunityAttribution, org.tair.bs.community.BsCommunityAttribution> {
    @Override
    public org.tair.bs.community.BsCommunityAttribution get(org.tair.db.community.ICommunityAttribution dto) {
      return new org.tair.bs.community.BsCommunityAttribution(dto);
    }
  }

  /**
   * A List builder helper class for building a data-access-layer List 
   * of CommunityAttribution objects from an input List attributions of 
   * business-layer BsCommunityAttribution objects
   */
  private class AttributionsListBuilder 
      extends com.poesys.bs.dto.ListBuilder<org.tair.bs.community.BsCommunityAttribution, org.tair.db.community.ICommunityAttribution> {
    @Override
    public org.tair.db.community.ICommunityAttribution get(org.tair.bs.community.BsCommunityAttribution dto) {
      return dto.toDto();
    }
  }

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsPerson objects from a Collection affiliate of data-access-layer 
   * org.tair.db.community.IPerson objects
   */
  private class BsAffiliateCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.community.IPerson, org.tair.bs.community.BsPerson> {
    @Override
    public org.tair.bs.community.BsPerson get(org.tair.db.community.IPerson dto) {
      return new org.tair.bs.community.BsPerson(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of Person objects from an input Collection affiliate of 
   * business-layer BsPerson objects
   */
  private class AffiliateCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.community.BsPerson, org.tair.db.community.IPerson> {
    @Override
    public org.tair.db.community.IPerson get(org.tair.bs.community.BsPerson dto) {
      return dto.toDto();
    }
  }

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsAffiliation objects from a Collection affiliation of data-access-layer 
   * org.tair.db.community.IAffiliation objects
   */
  private class BsAffiliationCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.community.IAffiliation, org.tair.bs.community.BsAffiliation> {
    @Override
    public org.tair.bs.community.BsAffiliation get(org.tair.db.community.IAffiliation dto) {
      return new org.tair.bs.community.BsAffiliation(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of Affiliation objects from an input Collection affiliation of 
   * business-layer BsAffiliation objects
   */
  private class AffiliationCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.community.BsAffiliation, org.tair.db.community.IAffiliation> {
    @Override
    public org.tair.db.community.IAffiliation get(org.tair.bs.community.BsAffiliation dto) {
      return dto.toDto();
    }
  }

  /**
   * Create a BsOrganization object from a Organization object.
   * 
   * @param dto the data-access layer Organization DTO
   * @throws DelegateException when there is a problem creating the Organization
   */
  public AbstractBsOrganization(IOrganization dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a Organization from new data.
   *
   * @param key the primary key of the Organization
   * @param communityId primary key attribute
   * @param communityType the kind of community member this is: person or organization
   * @param email the email address of the community member
   * @param memberStatus the current status of the community member: new, active, inactive.
A new member is one who has registered but not been activated.
An active member has been activated.
An inactive member has been inactivated.
   * @param countryId foreign key used by setter to query associated object
   * @param name the name of the organization
   * @param organizationType the kind of organization:
lab
institute
organization
project
university
other
high_school
education_outreach_program
foundation
company
facility
stock_center
center
community_college
collaboration
middle_school
committee
unknown
database
4_year_college
   * @param description a text describing the organization
   * @param commercial whether this is a commercial organization
   */
  public AbstractBsOrganization(IPrimaryKey key, java.math.BigInteger communityId, java.lang.String communityType, java.lang.String email, java.lang.String memberStatus, java.math.BigInteger countryId, java.lang.String name, java.lang.String organizationType, java.lang.String description, java.lang.Boolean commercial) {
    super(new OrganizationProxy(new Organization(key, communityId, communityType, email, memberStatus, countryId, name, organizationType, description, commercial)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IOrganization> other = (IDto<IOrganization>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IOrganization> o) {
    return dto.compareTo(o.toDto());
  }

  public void markChildrenDeleted() throws DtoStatusException {
    dto.markChildrenDeleted();
  }
  
  public IPrimaryKey getPrimaryKey() {
    return dto.getPrimaryKey();
  }

  // Inherited properties

  /**
   * <p>
   * Primary key attribute
   * </p>
   * <p>
   * Added by AddGeneratedKeyProperties + AddInheritedKeyProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a java.math.BigInteger communityId
   */

  public java.math.BigInteger getCommunityId() {
    return dto.getCommunityId();
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not true
// Read/Write property: false

  /**
   * <p>
   * the person's country
   * </p>
   * <p>
   * Added by addAssociationObjects + AddInheritedAssociationObjectProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a org.tair.db.community.ICountry country
   */
  public org.tair.bs.community.BsCountry getCountry() {
    // Return 2
    return new org.tair.bs.community.BsCountry(dto.getCountry());
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the set of alternative names for the community member
   * </p>
   * <p>
   * Added by AddInheritedToManyAssociationProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a Collection of ICommunityAlias aliases
   */
  public java.util.Collection<org.tair.bs.community.BsCommunityAlias> getAliases() {
    BsAliasesCollectionBuilder builder = new BsAliasesCollectionBuilder();
    return builder.getCollection(dto.getAliases());
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the set of keywords associated with the community member
   * </p>
   * <p>
   * Added by AddInheritedToManyAssociationProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a Collection of ICommunityKeyword keywords
   */
  public java.util.Collection<org.tair.bs.community.BsCommunityKeyword> getKeywords() {
    BsKeywordsCollectionBuilder builder = new BsKeywordsCollectionBuilder();
    return builder.getCollection(dto.getKeywords());
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * an ordered list of references authored by the community member
   * </p>
   * <p>
   * Added by AddInheritedToManyAssociationProperties through inheritance
   * </p>
   * <p>
   * This property loads lazily on demand rather than when you first query the 
   * IOrganization object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a List of ICommunityReference publications
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.List<org.tair.bs.community.BsCommunityReference> getPublications() throws java.sql.SQLException {
    BsPublicationsListBuilder builder = new BsPublicationsListBuilder();
    return builder.getList(dto.getPublications());
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the ordered list of objects attributed to this community member, ordered by
   * order of addition to the database
   * </p>
   * <p>
   * Added by AddInheritedToManyAssociationProperties through inheritance
   * </p>
   * <p>
   * This property loads lazily on demand rather than when you first query the 
   * IOrganization object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a List of ICommunityAttribution attributions
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.List<org.tair.bs.community.BsCommunityAttribution> getAttributions() throws java.sql.SQLException {
    BsAttributionsListBuilder builder = new BsAttributionsListBuilder();
    return builder.getList(dto.getAttributions());
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the kind of community member this is: person or organization
   * </p>
   * <p>
   * Added by TransformToProperty + AddInheritedAttributeProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a java.lang.String communityType
   */

  public java.lang.String getCommunityType() {
    return dto.getCommunityType();
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the email address of the community member
   * </p>
   * <p>
   * Added by TransformToProperty + AddInheritedAttributeProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a java.lang.String email
   */

  public java.lang.String getEmail() {
    return dto.getEmail();
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the current status of the community member: new, active, inactive.
   * </p>
   * <p>
   * A new member is one who has registered but not been activated.
   * </p>
   * <p>
   * An active member has been activated.
   * </p>
   * <p>
   * An inactive member has been inactivated.
   * </p>
   * <p>
   * Added by TransformToProperty + AddInheritedAttributeProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a java.lang.String memberStatus
   */

  public java.lang.String getMemberStatus() {
    return dto.getMemberStatus();
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   * <p>
   * Added by AddGeneratedKeyProperties + AddInheritedAssociationAttributeProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a java.math.BigInteger countryId
   */

  public java.math.BigInteger getCountryId() {
    return dto.getCountryId();
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not true
// Read/Write property: false

  // Data member properties

  /**
   * <p>
   * the name of the organization
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Organization</li>
   * </ul>
   * </p>
   * @return a java.lang.String name
   */
  public java.lang.String getName() {
    return dto.getName();
  }

  /**
   * <p>
   * the kind of organization:
   * </p>
   * <p>
   * lab
   * </p>
   * <p>
   * institute
   * </p>
   * <p>
   * organization
   * </p>
   * <p>
   * project
   * </p>
   * <p>
   * university
   * </p>
   * <p>
   * other
   * </p>
   * <p>
   * high_school
   * </p>
   * <p>
   * education_outreach_program
   * </p>
   * <p>
   * foundation
   * </p>
   * <p>
   * company
   * </p>
   * <p>
   * facility
   * </p>
   * <p>
   * stock_center
   * </p>
   * <p>
   * center
   * </p>
   * <p>
   * community_college
   * </p>
   * <p>
   * collaboration
   * </p>
   * <p>
   * middle_school
   * </p>
   * <p>
   * committee
   * </p>
   * <p>
   * unknown
   * </p>
   * <p>
   * database
   * </p>
   * <p>
   * 4_year_college
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Organization</li>
   * </ul>
   * </p>
   * @return a java.lang.String organizationType
   */
  public java.lang.String getOrganizationType() {
    return dto.getOrganizationType();
  }

  /**
   * <p>
   * a text describing the organization
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Organization</li>
   * </ul>
   * </p>
   * @return a java.lang.String description
   */
  public java.lang.String getDescription() {
    return dto.getDescription();
  }

  /**
   * <p>
   * whether this is a commercial organization
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Organization</li>
   * </ul>
   * </p>
   * @return a java.lang.Boolean commercial
   */
  public java.lang.Boolean getCommercial() {
    return dto.getCommercial();
  }

  /**
   * <p>
   * the set of people affiliated with the organization
   * </p>
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties as data member
   * </p>
   * <p>
   * This property loads lazily on demand the first time you call this method,
   * not when you instantiate the BsOrganization object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Organization</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.community.BsPerson affiliate
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.tair.bs.community.BsPerson> getAffiliate() throws java.sql.SQLException {
    BsAffiliateCollectionBuilder builder = new BsAffiliateCollectionBuilder();
    return builder.getCollection(dto.getAffiliate());
  }

  /**
   * <p>
   * Collection of association class objects (not the associated objects)
   * </p>
   * <p>
   * Added by AddAssociationClassCollectionProperties as data member
   * </p>
   * <p>
   * This property loads lazily on demand the first time you call this method,
   * not when you instantiate the BsOrganization object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Organization</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.community.BsAffiliation affiliation
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.tair.bs.community.BsAffiliation> getAffiliation() throws java.sql.SQLException {
    BsAffiliationCollectionBuilder builder = new BsAffiliationCollectionBuilder();
    return builder.getCollection(dto.getAffiliation());
  }
}