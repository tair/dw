/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDto.vsl

package org.tair.db.genomicregion;


import com.poesys.db.pk.IPrimaryKey;

import com.poesys.db.dto.AbstractDto;
import com.poesys.db.dto.DtoStatusException;


/**
 * <p>
 * A data-access layer data-transfer object for the Region. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * SO_0000001: A sequence_feature with an extent greater than zero. A nucleotide
 * region is composed of bases and a polypeptide region is composed of amino acids.
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>NaturalKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractRegion extends AbstractDto implements IRegion {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  // Setter strategy nested classes for single-object associations
  
  /**
   * Nested class that manages the parent association data
   *
   * Source: AddToOneAssociationOptionalObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryParentSetter extends com.poesys.db.dto.AbstractObjectSetter<org.tair.db.genomicregion.IRegion> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryParentSetter object.
     */
    public QueryParentSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.Region.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return parentKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.genomicregion.IRegion> getSql() {
      return new org.tair.db.genomicregion.sql.QueryRegion();
    }

    @Override
    protected void set(org.tair.db.genomicregion.IRegion dto) {
      // No status change, this is just filling in the object data.
      parent = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated parent is not null
      return parent != null;
    }
  }

  /**
   * Insert setter for inserting nested parent.
   */
  private class InsertParentSetter 
      extends com.poesys.db.dto.AbstractInsertSetter<org.tair.db.genomicregion.IRegion> {
    // parent source: AddToOneAssociationOptionalObjectProperties
    private static final long serialVersionUID = 1L;

    /**
     * Create an InsertParentSetter object.
     */
    public InsertParentSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.Region.class.getName();
    }

    @Override
    protected org.tair.db.genomicregion.IRegion getDto() {
      return parent;
    }

    @Override
    protected com.poesys.db.dao.insert.IInsertSql<org.tair.db.genomicregion.IRegion> getSql() {
      return new org.tair.db.genomicregion.sql.InsertRegion();
    }
    
    @Override
    protected boolean createKey() {
      // Key type: NaturalKey
      return true;
    }
  }

  /**
   * Setter for processing added parent, updated parent, and 
   * deleted parent. 
   */
   
  private class UpdateParentSetter 
      extends com.poesys.db.dto.AbstractProcessNestedObject<org.tair.db.genomicregion.IRegion> {
    private static final long serialVersionUID = 1L;

    /**
     * Create an UpdateParentSetter object.
     */
    public UpdateParentSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected void doChanged(java.sql.Connection connection, org.tair.db.genomicregion.IRegion dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
        // parent source: AddToOneAssociationOptionalObjectProperties
        // Immutable: false
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.IRegion> factory = 
        manager.getFactory(org.tair.db.genomicregion.Region.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.update.IUpdate<org.tair.db.genomicregion.IRegion> dao = 
        factory.getUpdate(new org.tair.db.genomicregion.sql.UpdateRegion());
      dao.update(connection, dto);
    }
    
    @Override
    protected void doDeleted(java.sql.Connection connection, org.tair.db.genomicregion.IRegion dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.IRegion> factory = 
        manager.getFactory(org.tair.db.genomicregion.Region.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.delete.IDelete<org.tair.db.genomicregion.IRegion> dao = 
        factory.getDelete(new org.tair.db.genomicregion.sql.DeleteRegion());
      dao.delete(connection, dto);
    }

    @Override
    protected void doNew(java.sql.Connection connection, org.tair.db.genomicregion.IRegion dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.IRegion> factory = 
        manager.getFactory(org.tair.db.genomicregion.Region.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.insert.IInsert<org.tair.db.genomicregion.IRegion> dao =
        factory.getInsert(new org.tair.db.genomicregion.sql.InsertRegion(), createKey());
      dao.insert(connection, dto);
    }

    @Override
    protected org.tair.db.genomicregion.IRegion getDto() {
      return parent;
    }
    
    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.Region.class.getName();
    }

    @Override
    protected boolean createKey() {
      // Key type: NaturalKey
      return true;
    }
  }

  /**
   * Foreign key object used by QueryParentSetter nested class to query object
   */
  private IPrimaryKey parentKey;
  
  /**
   * Set the foreign key parentKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param parentKey the foreign key
   */
  void setParentKey(IPrimaryKey parentKey) {
    this.parentKey = parentKey;
  }

  /**
   * Nested class that manages the referenceGenome association data
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryReferenceGenomeSetter extends com.poesys.db.dto.AbstractObjectSetter<org.tair.db.genomicregion.IReferenceGenome> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryReferenceGenomeSetter object.
     */
    public QueryReferenceGenomeSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.ReferenceGenome.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return referenceGenomeKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.genomicregion.IReferenceGenome> getSql() {
      return new org.tair.db.genomicregion.sql.QueryReferenceGenome();
    }

    @Override
    protected void set(org.tair.db.genomicregion.IReferenceGenome dto) {
      // No status change, this is just filling in the object data.
      referenceGenome = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated referenceGenome is not null
      return referenceGenome != null;
    }
  }

  /**
   * Insert setter for inserting nested referenceGenome.
   */
  private class InsertReferenceGenomeSetter 
      extends com.poesys.db.dto.AbstractInsertSetter<org.tair.db.genomicregion.IReferenceGenome> {
    // referenceGenome source: AddToOneAssociationRequiredObjectProperties
    private static final long serialVersionUID = 1L;

    /**
     * Create an InsertReferenceGenomeSetter object.
     */
    public InsertReferenceGenomeSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.ReferenceGenome.class.getName();
    }

    @Override
    protected org.tair.db.genomicregion.IReferenceGenome getDto() {
      return referenceGenome;
    }

    @Override
    protected com.poesys.db.dao.insert.IInsertSql<org.tair.db.genomicregion.IReferenceGenome> getSql() {
      return new org.tair.db.genomicregion.sql.InsertReferenceGenome();
    }
    
    @Override
    protected boolean createKey() {
      // Key type: NaturalKey
      return true;
    }
  }

  /**
   * Setter for processing added referenceGenome, updated referenceGenome, and 
   * deleted referenceGenome. 
   */
   
  private class UpdateReferenceGenomeSetter 
      extends com.poesys.db.dto.AbstractProcessNestedObject<org.tair.db.genomicregion.IReferenceGenome> {
    private static final long serialVersionUID = 1L;

    /**
     * Create an UpdateReferenceGenomeSetter object.
     */
    public UpdateReferenceGenomeSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected void doChanged(java.sql.Connection connection, org.tair.db.genomicregion.IReferenceGenome dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
        // referenceGenome source: AddToOneAssociationRequiredObjectProperties
        // Immutable: false
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.IReferenceGenome> factory = 
        manager.getFactory(org.tair.db.genomicregion.ReferenceGenome.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.update.IUpdate<org.tair.db.genomicregion.IReferenceGenome> dao = 
        factory.getUpdate(new org.tair.db.genomicregion.sql.UpdateReferenceGenome());
      dao.update(connection, dto);
    }
    
    @Override
    protected void doDeleted(java.sql.Connection connection, org.tair.db.genomicregion.IReferenceGenome dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.IReferenceGenome> factory = 
        manager.getFactory(org.tair.db.genomicregion.ReferenceGenome.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.delete.IDelete<org.tair.db.genomicregion.IReferenceGenome> dao = 
        factory.getDelete(new org.tair.db.genomicregion.sql.DeleteReferenceGenome());
      dao.delete(connection, dto);
    }

    @Override
    protected void doNew(java.sql.Connection connection, org.tair.db.genomicregion.IReferenceGenome dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.IReferenceGenome> factory = 
        manager.getFactory(org.tair.db.genomicregion.ReferenceGenome.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.insert.IInsert<org.tair.db.genomicregion.IReferenceGenome> dao =
        factory.getInsert(new org.tair.db.genomicregion.sql.InsertReferenceGenome(), createKey());
      dao.insert(connection, dto);
    }

    @Override
    protected org.tair.db.genomicregion.IReferenceGenome getDto() {
      return referenceGenome;
    }
    
    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.ReferenceGenome.class.getName();
    }

    @Override
    protected boolean createKey() {
      // Key type: NaturalKey
      return true;
    }
  }

  /**
   * Foreign key object used by QueryReferenceGenomeSetter nested class to query object
   */
  private IPrimaryKey referenceGenomeKey;
  
  /**
   * Set the foreign key referenceGenomeKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param referenceGenomeKey the foreign key
   */
  void setReferenceGenomeKey(IPrimaryKey referenceGenomeKey) {
    this.referenceGenomeKey = referenceGenomeKey;
  }


  /**
   * Create an empty Region for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractRegion() {
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();

    // Add the setters for the parent property.
    querySetters.add(new QueryParentSetter());
    preSetters.add(new InsertParentSetter());
    postSetters.add(new UpdateParentSetter());

    // Add the setters for the referenceGenome property.
    querySetters.add(new QueryReferenceGenomeSetter());
    preSetters.add(new InsertReferenceGenomeSetter());
    postSetters.add(new UpdateReferenceGenomeSetter());
  }

  /**
   * Create a Region. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the Region
   * @param tairObjectId the unique identifier in the TAIR database for the region (locus, gene,
chromosome, contig)
   * @param name the name of the genomic region, such as the chromosome name (1, M), the
locus/gene name (AT1G01010), the transcript name (AT1G01010.1), or the contig
name (MI421-MI421); may or may not be unique within a genome
   * @param dateEntered the date on which the region was created in the source database
   * @param parentRegionTairObjectId foreign key used by setter to query associated object
   * @param genome foreign key used by setter to query associated object
   */
  public AbstractRegion(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.String name, java.sql.Timestamp dateEntered, java.lang.Long parentRegionTairObjectId, java.lang.String genome) {
    this.key = key;

    this.tairObjectId = tairObjectId;

    if (tairObjectId == null) {
      throw new com.poesys.db.InvalidParametersException("tairObjectId is required for " + key.getValueList());
    }
    
    this.name = name;

    if (name == null) {
      throw new com.poesys.db.InvalidParametersException("name is required for " + key.getValueList());
    }
    
    this.dateEntered = dateEntered;

    if (dateEntered == null) {
      throw new com.poesys.db.InvalidParametersException("dateEntered is required for " + key.getValueList());
    }
    
    this.parentRegionTairObjectId = parentRegionTairObjectId;

    this.genome = genome;

    if (genome == null) {
      throw new com.poesys.db.InvalidParametersException("genome is required for " + key.getValueList());
    }
    
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertQuerySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    
    // Add the setters for the parent property.
    querySetters.add(new QueryParentSetter());
    insertSetters.add(new InsertParentSetter());
    preSetters.add(new InsertParentSetter());
    postSetters.add(new UpdateParentSetter());
    
    // Set the internal key data member for the parent object retrieval.
    parentKey = org.tair.db.genomicregion.GenomicregionFactory.getRegionPrimaryKey(parentRegionTairObjectId/* Source: AddNaturalKeyProperties + addAssociationForeignKeys: tairObjectId Key: false */);
    
    // Add the setters for the referenceGenome property.
    querySetters.add(new QueryReferenceGenomeSetter());
    insertSetters.add(new InsertReferenceGenomeSetter());
    preSetters.add(new InsertReferenceGenomeSetter());
    postSetters.add(new UpdateReferenceGenomeSetter());
    
    // Set the internal key data member for the referenceGenome object retrieval.
    referenceGenomeKey = org.tair.db.genomicregion.GenomicregionFactory.getReferenceGenomePrimaryKey(genome/* Source: AddNaturalKeyProperties + addAssociationForeignKeys: genome Key: false */);
    // Add a setter to instantiate the required referenceGenome object before insert.
    insertQuerySetters.add(new QueryReferenceGenomeSetter());
  }

  @Override
  public boolean equals(Object arg0) {
    AbstractRegion other = (AbstractRegion)arg0;
    return other.key.equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    AbstractRegion other = (AbstractRegion)o;
    // Sort on the key. Same semantics as equals and hashCode().
    return other.key.compareTo(key);
  }
  
  @Override
  public String getSubsystem() {
    return "org.tair.db.genomicregion";
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
	  java.util.ResourceBundle.getBundle("org.tair.db.genomicregion");
    String subsystem =
      "org.tair.db.genomicregion"
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
   * the unique identifier in the TAIR database for the region (locus, gene,
   * chromosome, contig)
   * </p>
   *
   * Added by AddNaturalKeyProperties
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
   * Nested property name
   *
   * <p>
   * the name of the genomic region, such as the chromosome name (1, M), the
   * locus/gene name (AT1G01010), the transcript name (AT1G01010.1), or the contig
   * name (MI421-MI421); may or may not be unique within a genome
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
   * the name of the genomic region, such as the chromosome name (1, M), the
   * locus/gene name (AT1G01010), the transcript name (AT1G01010.1), or the contig
   * name (MI421-MI421); may or may not be unique within a genome
   * </p>
   *
   * @param name the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input name is null
   */
  public void setName(java.lang.String name)
      throws com.poesys.db.InvalidParametersException {
    if (name == null) {
      throw new com.poesys.db.InvalidParametersException("name is required");
    }
    
    this.name = name;
    setChanged();
  }

  /**
   * Nested property dateEntered
   *
   * <p>
   * the date on which the region was created in the source database
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.sql.Timestamp dateEntered;
  

  public java.sql.Timestamp getDateEntered() {
    return dateEntered;
  }

  /**
   * Clear the dateEntered data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearDateEntered() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the dateEntered.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the date on which the region was created in the source database
   * </p>
   *
   * @param dateEntered the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input dateEntered is null
   */
  public void setDateEntered(java.sql.Timestamp dateEntered)
      throws com.poesys.db.InvalidParametersException {
    if (dateEntered == null) {
      throw new com.poesys.db.InvalidParametersException("dateEntered is required");
    }
    
    this.dateEntered = dateEntered;
    setChanged();
  }

  /**
   * Nested property parent
   *
   * 
   *
   * Added by AddToOneAssociationOptionalObjectProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private org.tair.db.genomicregion.IRegion parent;
  

  public org.tair.db.genomicregion.IRegion getParent() {
    return parent;
  }

  /**
   * Clear the parent data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearParent() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the parent.
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
   * @param parent the value with which to set the property
   */
  public  void setParent(org.tair.db.genomicregion.IRegion parent) {
    this.parent = parent;
    // Set the IPrimaryKey cache lookup key.
    this.parentKey = parent.getPrimaryKey();
    setChanged();
  }

  /**
   * Nested property referenceGenome
   *
   * 
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private org.tair.db.genomicregion.IReferenceGenome referenceGenome;
  

  public org.tair.db.genomicregion.IReferenceGenome getReferenceGenome() {
    return referenceGenome;
  }

  /**
   * Clear the referenceGenome data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearReferenceGenome() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the referenceGenome.
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
   * @param referenceGenome the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input referenceGenome is null
   */
  public void setReferenceGenome(org.tair.db.genomicregion.IReferenceGenome referenceGenome)
      throws com.poesys.db.InvalidParametersException {
    if (referenceGenome == null) {
      throw new com.poesys.db.InvalidParametersException("referenceGenome is required");
    }
    
    this.referenceGenome = referenceGenome;
    // Set the IPrimaryKey cache lookup key.
    this.referenceGenomeKey = referenceGenome.getPrimaryKey();
    setChanged();
  }

  /**
   * Nested property parentRegionTairObjectId
   *
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   *
   * Added by AddNaturalKeyProperties + AddToOneAssociationAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long parentRegionTairObjectId;
  

  public java.lang.Long getParentRegionTairObjectId() {
    return parentRegionTairObjectId;
  }

  /**
   * Clear the parentRegionTairObjectId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearParentRegionTairObjectId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property genome
   *
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   *
   * Added by AddNaturalKeyProperties + AddToOneAssociationAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String genome;
  

  public java.lang.String getGenome() {
    return genome;
  }

  /**
   * Clear the genome data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearGenome() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }
}