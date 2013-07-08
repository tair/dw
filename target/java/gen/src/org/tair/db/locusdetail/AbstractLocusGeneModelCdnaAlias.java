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
 * A data-access layer data-transfer object for the LocusGeneModelCdnaAlias. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * Another name for the cDNA for the locus gene model
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
public abstract class AbstractLocusGeneModelCdnaAlias extends AbstractDto implements ILocusGeneModelCdnaAlias {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  // Setter strategy nested classes for single-object associations
  
  /**
   * Nested class that manages the cDna association data
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryCDnaSetter extends com.poesys.db.dto.AbstractObjectSetter<org.tair.db.locusdetail.ILocusGeneModelCdna> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryCDnaSetter object.
     */
    public QueryCDnaSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.LocusGeneModelCdna.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return cDnaKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.locusdetail.ILocusGeneModelCdna> getSql() {
      return new org.tair.db.locusdetail.sql.QueryLocusGeneModelCdna();
    }

    @Override
    protected void set(org.tair.db.locusdetail.ILocusGeneModelCdna dto) {
      // No status change, this is just filling in the object data.
      cDna = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated cDna is not null
      return cDna != null;
    }
  }


  /**
   * Foreign key object used by QueryCDnaSetter nested class to query object
   */
  private IPrimaryKey cDnaKey;
  
  /**
   * Set the foreign key cDnaKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param cDnaKey the foreign key
   */
  void setCDnaKey(IPrimaryKey cDnaKey) {
    this.cDnaKey = cDnaKey;
  }


  /**
   * Create an empty LocusGeneModelCdnaAlias for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractLocusGeneModelCdnaAlias() {
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();

    // Add the setters for the cDna property.
    querySetters.add(new QueryCDnaSetter());
  }

  /**
   * Create a LocusGeneModelCdnaAlias. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the LocusGeneModelCdnaAlias
   * @param geneModelName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param sequenceId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param alias the alias for the cDNA sequence
   */
  public AbstractLocusGeneModelCdnaAlias(IPrimaryKey key, java.lang.String geneModelName, java.lang.Long locusTairObjectId, java.lang.Long sequenceId, java.lang.String alias) {
    this.key = key;

    this.geneModelName = geneModelName;

    if (geneModelName == null) {
      throw new com.poesys.db.InvalidParametersException("geneModelName is required for " + key.getValueList());
    }
    
    this.locusTairObjectId = locusTairObjectId;

    if (locusTairObjectId == null) {
      throw new com.poesys.db.InvalidParametersException("locusTairObjectId is required for " + key.getValueList());
    }
    
    this.sequenceId = sequenceId;

    if (sequenceId == null) {
      throw new com.poesys.db.InvalidParametersException("sequenceId is required for " + key.getValueList());
    }
    
    this.alias = alias;

    if (alias == null) {
      throw new com.poesys.db.InvalidParametersException("alias is required for " + key.getValueList());
    }
    
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertQuerySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    
    // Add the setters for the cDna property.
    querySetters.add(new QueryCDnaSetter());
    
    // Set the internal key data member for the cDna object retrieval.
    cDnaKey = org.tair.db.locusdetail.LocusdetailFactory.getLocusGeneModelCdnaPrimaryKey(geneModelName/* Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddParentKeyAttributes + addAssociationForeignKeys: geneModelName Key: true */, locusTairObjectId/* Source: AddNaturalKeyProperties + AddParentKeyAttributes + AddParentKeyAttributes + addAssociationForeignKeys: locusTairObjectId Key: true */, sequenceId/* Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + addAssociationForeignKeys: sequenceId Key: true */);
    // Add a setter to instantiate the required cDna object before insert.
    insertQuerySetters.add(new QueryCDnaSetter());
  }

  @Override
  public boolean equals(Object arg0) {
    AbstractLocusGeneModelCdnaAlias other = (AbstractLocusGeneModelCdnaAlias)arg0;
    return other.key.equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    AbstractLocusGeneModelCdnaAlias other = (AbstractLocusGeneModelCdnaAlias)o;
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
   * Nested property geneModelName
   *
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddParentKeyAttributes + AddParentKeyAttributes
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String geneModelName;
  

  public java.lang.String getGeneModelName() {
    return geneModelName;
  }

  /**
   * Clear the geneModelName data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearGeneModelName() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property locusTairObjectId
   *
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   *
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddParentKeyAttributes + AddParentKeyAttributes
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
   * Nested property sequenceId
   *
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddParentKeyAttributes
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long sequenceId;
  

  public java.lang.Long getSequenceId() {
    return sequenceId;
  }

  /**
   * Clear the sequenceId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearSequenceId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property alias
   *
   * <p>
   * the alias for the cDNA sequence
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String alias;
  

  public java.lang.String getAlias() {
    return alias;
  }

  /**
   * Clear the alias data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearAlias() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property cDna
   *
   * <p>
   * the cDNA for which this alias is another name
   * </p>
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private org.tair.db.locusdetail.ILocusGeneModelCdna cDna;
  

  public org.tair.db.locusdetail.ILocusGeneModelCdna getCDna() {
    return cDna;
  }

  /**
   * Clear the cDna data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearCDna() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }
}