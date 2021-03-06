/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDto.vsl

package org.tair.db.protein;


import com.poesys.db.pk.IPrimaryKey;

import com.poesys.db.dto.AbstractDto;
import com.poesys.db.dto.DtoStatusException;


/**
 * <p>
 * A data-access layer data-transfer object for the Domain. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * a conserved part of a given protein sequence and structure that can evolve,
 * function, and exist independently of the rest of the protein chain
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractDomain extends AbstractDto implements IDomain {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  // Setter strategy nested classes for single-object associations
  
  /**
   * Nested class that manages the protein association data
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryProteinSetter extends com.poesys.db.dto.AbstractObjectSetter<org.tair.db.protein.IProtein> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryProteinSetter object.
     */
    public QueryProteinSetter() {
      super("org.tair.db.protein", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.protein.Protein.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return proteinKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.protein.IProtein> getSql() {
      return new org.tair.db.protein.sql.QueryProtein();
    }

    @Override
    protected void set(org.tair.db.protein.IProtein dto) {
      // No status change, this is just filling in the object data.
      protein = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated protein is not null
      return protein != null;
    }
  }

  /**
   * Insert setter for inserting nested protein.
   */
  private class InsertProteinSetter 
      extends com.poesys.db.dto.AbstractInsertSetter<org.tair.db.protein.IProtein> {
    // protein source: AddToOneAssociationRequiredObjectProperties
    private static final long serialVersionUID = 1L;

    /**
     * Create an InsertProteinSetter object.
     */
    public InsertProteinSetter() {
      super("org.tair.db.protein", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.protein.Protein.class.getName();
    }

    @Override
    protected org.tair.db.protein.IProtein getDto() {
      return protein;
    }

    @Override
    protected com.poesys.db.dao.insert.IInsertSql<org.tair.db.protein.IProtein> getSql() {
      return new org.tair.db.protein.sql.InsertProtein();
    }
    
    @Override
    protected boolean createKey() {
      // Key type: NaturalKey
      return true;
    }
  }

  /**
   * Setter for processing added protein, updated protein, and 
   * deleted protein. 
   */
   
  private class UpdateProteinSetter 
      extends com.poesys.db.dto.AbstractProcessNestedObject<org.tair.db.protein.IProtein> {
    private static final long serialVersionUID = 1L;

    /**
     * Create an UpdateProteinSetter object.
     */
    public UpdateProteinSetter() {
      super("org.tair.db.protein", 2147483647);
    }

    @Override
    protected void doChanged(java.sql.Connection connection, org.tair.db.protein.IProtein dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
        // protein source: AddToOneAssociationRequiredObjectProperties
        // Immutable: false
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.protein.IProtein> factory = 
        manager.getFactory(org.tair.db.protein.Protein.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.update.IUpdate<org.tair.db.protein.IProtein> dao = 
        factory.getUpdate(new org.tair.db.protein.sql.UpdateProtein());
      dao.update(connection, dto);
    }
    
    @Override
    protected void doDeleted(java.sql.Connection connection, org.tair.db.protein.IProtein dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.protein.IProtein> factory = 
        manager.getFactory(org.tair.db.protein.Protein.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.delete.IDelete<org.tair.db.protein.IProtein> dao = 
        factory.getDelete(new org.tair.db.protein.sql.DeleteProtein());
      dao.delete(connection, dto);
    }

    @Override
    protected void doNew(java.sql.Connection connection, org.tair.db.protein.IProtein dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.protein.IProtein> factory = 
        manager.getFactory(org.tair.db.protein.Protein.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.insert.IInsert<org.tair.db.protein.IProtein> dao =
        factory.getInsert(new org.tair.db.protein.sql.InsertProtein(), createKey());
      dao.insert(connection, dto);
    }

    @Override
    protected org.tair.db.protein.IProtein getDto() {
      return protein;
    }
    
    @Override
    protected String getClassName() {
      return org.tair.db.protein.Protein.class.getName();
    }

    @Override
    protected boolean createKey() {
      // Key type: NaturalKey
      return true;
    }
  }

  /**
   * Foreign key object used by QueryProteinSetter nested class to query object
   */
  private IPrimaryKey proteinKey;
  
  /**
   * Set the foreign key proteinKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param proteinKey the foreign key
   */
  void setProteinKey(IPrimaryKey proteinKey) {
    this.proteinKey = proteinKey;
  }


  /**
   * Create an empty Domain for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractDomain() {
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();

    // Add the setters for the protein property.
    querySetters.add(new QueryProteinSetter());
    preSetters.add(new InsertProteinSetter());
    postSetters.add(new UpdateProteinSetter());
  }

  /**
   * Create a Domain. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the Domain
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param domainTairObjectId the unique identifier in TAIR for the protein domain
   * @param name the domain name in the originating database
   * @param database the database that contains the domain:
prosite
prints
pir
tigrfam
prodom
hamap
gene3d
smart
panther
pfam
superfam
   * @param structuralClassType One of several structural classes of protein:
All alpha proteins
All beta proteins
Alpha and beta proteins (a/b)
Alpha and beta proteins (a+b)
Multi-domain proteins (alpha and beta)
Membrane and cell surface proteins and peptides
Small proteins
Coiled coil proteins
   * @param accession the identifier in the originating database
   * @param interproAccession the Interpro accession identifier (IPRnnnnn)
   * @param interpro the Interpro domain name in full
   * @param startPosition the starting position of the domain in the amino acid sequence
   * @param endPosition the ending position of the domain in the amino acid sequence
   */
  public AbstractDomain(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.Long domainTairObjectId, java.lang.String name, java.lang.String database, java.lang.String structuralClassType, java.lang.String accession, java.lang.String interproAccession, java.lang.String interpro, java.lang.Integer startPosition, java.lang.Integer endPosition) {
    this.key = key;

    this.tairObjectId = tairObjectId;

    if (tairObjectId == null) {
      throw new com.poesys.db.InvalidParametersException("tairObjectId is required for " + key.getValueList());
    }
    
    this.domainTairObjectId = domainTairObjectId;

    this.name = name;

    this.database = database;

    this.structuralClassType = structuralClassType;

    this.accession = accession;

    this.interproAccession = interproAccession;

    if (interproAccession == null) {
      throw new com.poesys.db.InvalidParametersException("interproAccession is required for " + key.getValueList());
    }
    
    this.interpro = interpro;

    if (interpro == null) {
      throw new com.poesys.db.InvalidParametersException("interpro is required for " + key.getValueList());
    }
    
    this.startPosition = startPosition;

    this.endPosition = endPosition;

    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertQuerySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    
    // Add the setters for the protein property.
    querySetters.add(new QueryProteinSetter());
    insertSetters.add(new InsertProteinSetter());
    preSetters.add(new InsertProteinSetter());
    postSetters.add(new UpdateProteinSetter());
    
    // Set the internal key data member for the protein object retrieval.
    proteinKey = org.tair.db.protein.ProteinFactory.getProteinPrimaryKey(tairObjectId/* Source: AddNaturalKeyProperties + addAssociationForeignKeys: tairObjectId Key: true */);
    // Add a setter to instantiate the required protein object before insert.
    insertQuerySetters.add(new QueryProteinSetter());
  }

  @Override
  public boolean equals(Object arg0) {
    AbstractDomain other = (AbstractDomain)arg0;
    return other.key.equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    AbstractDomain other = (AbstractDomain)o;
    // Sort on the key. Same semantics as equals and hashCode().
    return other.key.compareTo(key);
  }
  
  @Override
  public String getSubsystem() {
    return "org.tair.db.protein";
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
	  java.util.ResourceBundle.getBundle("org.tair.db.protein");
    String subsystem =
      "org.tair.db.protein"
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
   * Nested property tairObjectId
   *
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   *
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long tairObjectId;
  

  public java.lang.Long getTairObjectId() {
    return tairObjectId;
  }

  /**
   * Clear the tairObjectId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearTairObjectId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property domainTairObjectId
   *
   * <p>
   * the unique identifier in TAIR for the protein domain
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long domainTairObjectId;
  

  public java.lang.Long getDomainTairObjectId() {
    return domainTairObjectId;
  }

  /**
   * Clear the domainTairObjectId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearDomainTairObjectId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property name
   *
   * <p>
   * the domain name in the originating database
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
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
   * <p>
   * Set the name.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the domain name in the originating database
   * </p>
   *
   * @param name the value with which to set the property
   */
  public  void setName(java.lang.String name) {
    this.name = name;
    setChanged();
  }

  /**
   * Nested property database
   *
   * <p>
   * the database that contains the domain:
   * </p>
   * <p>
   * prosite
   * </p>
   * <p>
   * prints
   * </p>
   * <p>
   * pir
   * </p>
   * <p>
   * tigrfam
   * </p>
   * <p>
   * prodom
   * </p>
   * <p>
   * hamap
   * </p>
   * <p>
   * gene3d
   * </p>
   * <p>
   * smart
   * </p>
   * <p>
   * panther
   * </p>
   * <p>
   * pfam
   * </p>
   * <p>
   * superfam
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String database;
  

  public java.lang.String getDatabase() {
    return database;
  }

  /**
   * Clear the database data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearDatabase() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the database.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the database that contains the domain:
   * </p>
   * <p>
   * prosite
   * </p>
   * <p>
   * prints
   * </p>
   * <p>
   * pir
   * </p>
   * <p>
   * tigrfam
   * </p>
   * <p>
   * prodom
   * </p>
   * <p>
   * hamap
   * </p>
   * <p>
   * gene3d
   * </p>
   * <p>
   * smart
   * </p>
   * <p>
   * panther
   * </p>
   * <p>
   * pfam
   * </p>
   * <p>
   * superfam
   * </p>
   *
   * @param database the value with which to set the property
   */
  public  void setDatabase(java.lang.String database) {
    this.database = database;
    setChanged();
  }

  /**
   * Nested property structuralClassType
   *
   * <p>
   * One of several structural classes of protein:
   * </p>
   * <p>
   * All alpha proteins
   * </p>
   * <p>
   * All beta proteins
   * </p>
   * <p>
   * Alpha and beta proteins (a/b)
   * </p>
   * <p>
   * Alpha and beta proteins (a+b)
   * </p>
   * <p>
   * Multi-domain proteins (alpha and beta)
   * </p>
   * <p>
   * Membrane and cell surface proteins and peptides
   * </p>
   * <p>
   * Small proteins
   * </p>
   * <p>
   * Coiled coil proteins
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String structuralClassType;
  

  public java.lang.String getStructuralClassType() {
    return structuralClassType;
  }

  /**
   * Clear the structuralClassType data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearStructuralClassType() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the structuralClassType.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * One of several structural classes of protein:
   * </p>
   * <p>
   * All alpha proteins
   * </p>
   * <p>
   * All beta proteins
   * </p>
   * <p>
   * Alpha and beta proteins (a/b)
   * </p>
   * <p>
   * Alpha and beta proteins (a+b)
   * </p>
   * <p>
   * Multi-domain proteins (alpha and beta)
   * </p>
   * <p>
   * Membrane and cell surface proteins and peptides
   * </p>
   * <p>
   * Small proteins
   * </p>
   * <p>
   * Coiled coil proteins
   * </p>
   *
   * @param structuralClassType the value with which to set the property
   */
  public  void setStructuralClassType(java.lang.String structuralClassType) {
    this.structuralClassType = structuralClassType;
    setChanged();
  }

  /**
   * Nested property accession
   *
   * <p>
   * the identifier in the originating database
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String accession;
  

  public java.lang.String getAccession() {
    return accession;
  }

  /**
   * Clear the accession data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearAccession() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the accession.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the identifier in the originating database
   * </p>
   *
   * @param accession the value with which to set the property
   */
  public  void setAccession(java.lang.String accession) {
    this.accession = accession;
    setChanged();
  }

  /**
   * Nested property interproAccession
   *
   * <p>
   * the Interpro accession identifier (IPRnnnnn)
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String interproAccession;
  

  public java.lang.String getInterproAccession() {
    return interproAccession;
  }

  /**
   * Clear the interproAccession data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearInterproAccession() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the interproAccession.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the Interpro accession identifier (IPRnnnnn)
   * </p>
   *
   * @param interproAccession the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input interproAccession is null
   */
  public void setInterproAccession(java.lang.String interproAccession)
      throws com.poesys.db.InvalidParametersException {
    if (interproAccession == null) {
      throw new com.poesys.db.InvalidParametersException("interproAccession is required");
    }
    
    this.interproAccession = interproAccession;
    setChanged();
  }

  /**
   * Nested property interpro
   *
   * <p>
   * the Interpro domain name in full
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String interpro;
  

  public java.lang.String getInterpro() {
    return interpro;
  }

  /**
   * Clear the interpro data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearInterpro() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the interpro.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the Interpro domain name in full
   * </p>
   *
   * @param interpro the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input interpro is null
   */
  public void setInterpro(java.lang.String interpro)
      throws com.poesys.db.InvalidParametersException {
    if (interpro == null) {
      throw new com.poesys.db.InvalidParametersException("interpro is required");
    }
    
    this.interpro = interpro;
    setChanged();
  }

  /**
   * Nested property startPosition
   *
   * <p>
   * the starting position of the domain in the amino acid sequence
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.Integer startPosition;
  

  public java.lang.Integer getStartPosition() {
    return startPosition;
  }

  /**
   * Clear the startPosition data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearStartPosition() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the startPosition.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the starting position of the domain in the amino acid sequence
   * </p>
   *
   * @param startPosition the value with which to set the property
   */
  public  void setStartPosition(java.lang.Integer startPosition) {
    this.startPosition = startPosition;
    setChanged();
  }

  /**
   * Nested property endPosition
   *
   * <p>
   * the ending position of the domain in the amino acid sequence
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.Integer endPosition;
  

  public java.lang.Integer getEndPosition() {
    return endPosition;
  }

  /**
   * Clear the endPosition data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearEndPosition() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the endPosition.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the ending position of the domain in the amino acid sequence
   * </p>
   *
   * @param endPosition the value with which to set the property
   */
  public  void setEndPosition(java.lang.Integer endPosition) {
    this.endPosition = endPosition;
    setChanged();
  }

  /**
   * Nested property protein
   *
   * 
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private org.tair.db.protein.IProtein protein;
  

  public org.tair.db.protein.IProtein getProtein() {
    return protein;
  }

  /**
   * Clear the protein data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearProtein() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the protein.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * 
   *
   * @param protein the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input protein is null
   */
  public void setProtein(org.tair.db.protein.IProtein protein)
      throws com.poesys.db.InvalidParametersException {
    if (protein == null) {
      throw new com.poesys.db.InvalidParametersException("protein is required");
    }
    
    this.protein = protein;
    // Set the IPrimaryKey cache lookup key.
    this.proteinKey = protein.getPrimaryKey();
    setChanged();
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }
}