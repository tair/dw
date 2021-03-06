/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;

import com.poesys.db.dto.AbstractDto;
import com.poesys.db.dto.DtoStatusException;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusAttribution. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * The community member to which the locus is attributed
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: false
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractLocusAttribution extends AbstractDto implements ILocusAttribution {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  // Setter strategy nested classes for single-object associations
  
  /**
   * Nested class that manages the locus association data
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryLocusSetter extends com.poesys.db.dto.AbstractObjectSetter<org.tair.db.locusdetail.ILocusDetail> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryLocusSetter object.
     */
    public QueryLocusSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.LocusDetail.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return locusKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.locusdetail.ILocusDetail> getSql() {
      return new org.tair.db.locusdetail.sql.QueryLocusDetail();
    }

    @Override
    protected void set(org.tair.db.locusdetail.ILocusDetail dto) {
      // No status change, this is just filling in the object data.
      locus = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated locus is not null
      return locus != null;
    }
  }


  /**
   * Foreign key object used by QueryLocusSetter nested class to query object
   */
  private IPrimaryKey locusKey;
  
  /**
   * Set the foreign key locusKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param locusKey the foreign key
   */
  void setLocusKey(IPrimaryKey locusKey) {
    this.locusKey = locusKey;
  }


  /**
   * Create an empty LocusAttribution for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractLocusAttribution() {
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();

    // Add the setters for the locus property.
    querySetters.add(new QueryLocusSetter());
  }

  /**
   * Create a LocusAttribution. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the LocusAttribution
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusAttributionNo composite subkey attribute that uniquely identifies child combined with parent key
   * @param attributionType the kind of attribution this is
   * @param linkType "person" or "org" depending on whether the community member is a person or an
organization
   * @param communityId the TAIR community ID for the attribution; used in links
   * @param name the community member's name
   * @param attributionDate the date on which the locus was attributed to the community member
   */
  public AbstractLocusAttribution(IPrimaryKey key, java.lang.Long locusTairObjectId, java.math.BigInteger locusAttributionNo, java.lang.String attributionType, java.lang.String linkType, java.lang.Long communityId, java.lang.String name, java.sql.Timestamp attributionDate) {
    this.key = key;

    this.locusTairObjectId = locusTairObjectId;

    if (locusTairObjectId == null) {
      throw new com.poesys.db.InvalidParametersException("locusTairObjectId is required for " + key.getValueList());
    }
    
    this.locusAttributionNo = locusAttributionNo;

    if (locusAttributionNo == null) {
      throw new com.poesys.db.InvalidParametersException("locusAttributionNo is required for " + key.getValueList());
    }
    
    this.attributionType = attributionType;

    if (attributionType == null) {
      throw new com.poesys.db.InvalidParametersException("attributionType is required for " + key.getValueList());
    }
    
    this.linkType = linkType;

    if (linkType == null) {
      throw new com.poesys.db.InvalidParametersException("linkType is required for " + key.getValueList());
    }
    
    this.communityId = communityId;

    if (communityId == null) {
      throw new com.poesys.db.InvalidParametersException("communityId is required for " + key.getValueList());
    }
    
    this.name = name;

    if (name == null) {
      throw new com.poesys.db.InvalidParametersException("name is required for " + key.getValueList());
    }
    
    this.attributionDate = attributionDate;

    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertQuerySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    
    // Add the setters for the locus property.
    querySetters.add(new QueryLocusSetter());
    
    // Set the internal key data member for the locus object retrieval.
    locusKey = org.tair.db.locusdetail.LocusdetailFactory.getLocusDetailPrimaryKey(locusTairObjectId/* Source: AddNaturalKeyProperties + addAssociationForeignKeys: locusTairObjectId Key: true */);
    // Add a setter to instantiate the required locus object before insert.
    insertQuerySetters.add(new QueryLocusSetter());
  }

  @Override
  public boolean equals(Object arg0) {
    AbstractLocusAttribution other = (AbstractLocusAttribution)arg0;
    return other.key.equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    AbstractLocusAttribution other = (AbstractLocusAttribution)o;
    // Sort on the key. Same semantics as equals and hashCode().
    return other.key.compareTo(key);
  }
  
  @Override
  public String getSubsystem() {
    return "org.tair.db.locusdetail";
  }

  @Override
  public void markChildrenDeleted() throws DtoStatusException {
  }

  @Override
  public IPrimaryKey getPrimaryKey() {
    return key;
  }
  
  @Override
  public java.sql.Connection getConnection() throws java.sql.SQLException {
    java.sql.Connection connection = null;
    
	/* 
	 * The resource bundle for the DTO's subsystem contains the suffix that
	 * distinguishes multiple versions of the subsystem in the database.properties
	 * file, such as "prod" or "test". Most database.properties files have only
	 * one implementation and use external facilities to switch between the
	 * databases (JNDI, for example, or producing different database.properties
	 * files in different setups). Use the subsystem resource bundle to get the
	 * suffix, then use the full subsystem name to get a connection factory for
	 * the DTO's subsystem, then use that factory to get a JDBC connection.
	 */
	java.util.ResourceBundle rb = 
	  java.util.ResourceBundle.getBundle("org.tair.db.locusdetail");
    String subsystem =
      "org.tair.db.locusdetail"
          + (rb.getString("suffix") == null
             || rb.getString("suffix").length() == 0 ? ""
              : "." + rb.getString("suffix"));
	  
	try {
	  connection = 
	    com.poesys.db.connection.ConnectionFactoryFactory.getInstance(subsystem).getConnection();
	} catch (com.poesys.db.InvalidParametersException e) {
	  throw new java.sql.SQLException(e.getMessage());
	} catch (java.io.IOException e) {
	  throw new java.sql.SQLException(e.getMessage());
	}
	
	return connection;
  }

  /**
   * Nested property locusTairObjectId
   *
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   *
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long locusTairObjectId;
  

  public java.lang.Long getLocusTairObjectId() {
    return locusTairObjectId;
  }

  /**
   * Clear the locusTairObjectId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearLocusTairObjectId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property locusAttributionNo
   *
   * <p>
   * Composite subkey attribute that uniquely identifies child combined with parent key
   * </p>
   *
   * Added by AddOrderedSubKeyProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.math.BigInteger locusAttributionNo;
  

  public java.math.BigInteger getLocusAttributionNo() {
    return locusAttributionNo;
  }

  /**
   * Clear the locusAttributionNo data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearLocusAttributionNo() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property attributionType
   *
   * <p>
   * the kind of attribution this is
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String attributionType;
  

  public java.lang.String getAttributionType() {
    return attributionType;
  }

  /**
   * Clear the attributionType data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearAttributionType() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property linkType
   *
   * <p>
   * "person" or "org" depending on whether the community member is a person or an
   * organization
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String linkType;
  

  public java.lang.String getLinkType() {
    return linkType;
  }

  /**
   * Clear the linkType data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearLinkType() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property communityId
   *
   * <p>
   * the TAIR community ID for the attribution; used in links
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long communityId;
  

  public java.lang.Long getCommunityId() {
    return communityId;
  }

  /**
   * Clear the communityId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearCommunityId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property name
   *
   * <p>
   * the community member's name
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String name;
  

  public java.lang.String getName() {
    return name;
  }

  /**
   * Clear the name data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearName() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property attributionDate
   *
   * <p>
   * the date on which the locus was attributed to the community member
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.sql.Timestamp attributionDate;
  

  public java.sql.Timestamp getAttributionDate() {
    return attributionDate;
  }

  /**
   * Clear the attributionDate data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearAttributionDate() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property locus
   *
   * <p>
   * the locus attributed to a community member
   * </p>
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private org.tair.db.locusdetail.ILocusDetail locus;
  

  public org.tair.db.locusdetail.ILocusDetail getLocus() {
    return locus;
  }

  /**
   * Clear the locus data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearLocus() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }
}