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
 * A data-access layer data-transfer object for the ReferenceGenome. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * SO_0001505: A collection of sequences (often chromosomes) taken as the standard
 * for a given organism and genome assembly
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
public abstract class AbstractReferenceGenome extends AbstractDto implements IReferenceGenome {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  // Setter strategy nested classes for single-object associations
  
  /**
   * Nested class that manages the taxon association data
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryTaxonSetter extends com.poesys.db.dto.AbstractObjectSetter<org.tair.db.basic.ITaxon> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryTaxonSetter object.
     */
    public QueryTaxonSetter() {
      super("org.tair.db.basic", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.basic.Taxon.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return taxonKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.basic.ITaxon> getSql() {
      return new org.tair.db.basic.sql.QueryTaxon();
    }

    @Override
    protected void set(org.tair.db.basic.ITaxon dto) {
      // No status change, this is just filling in the object data.
      taxon = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated taxon is not null
      return taxon != null;
    }
  }


  /**
   * Foreign key object used by QueryTaxonSetter nested class to query object
   */
  private IPrimaryKey taxonKey;
  
  /**
   * Set the foreign key taxonKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param taxonKey the foreign key
   */
  void setTaxonKey(IPrimaryKey taxonKey) {
    this.taxonKey = taxonKey;
  }

  /**
   * Nested class that manages the referenceVariant association data
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryReferenceVariantSetter extends com.poesys.db.dto.AbstractObjectSetter<org.tair.db.basic.ISpeciesVariant> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryReferenceVariantSetter object.
     */
    public QueryReferenceVariantSetter() {
      super("org.tair.db.basic", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.basic.SpeciesVariant.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return referenceVariantKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.basic.ISpeciesVariant> getSql() {
      return new org.tair.db.basic.sql.QuerySpeciesVariant();
    }

    @Override
    protected void set(org.tair.db.basic.ISpeciesVariant dto) {
      // No status change, this is just filling in the object data.
      referenceVariant = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated referenceVariant is not null
      return referenceVariant != null;
    }
  }

  /**
   * Insert setter for inserting nested referenceVariant.
   */
  private class InsertReferenceVariantSetter 
      extends com.poesys.db.dto.AbstractInsertSetter<org.tair.db.basic.ISpeciesVariant> {
    // referenceVariant source: AddToOneAssociationRequiredObjectProperties
    private static final long serialVersionUID = 1L;

    /**
     * Create an InsertReferenceVariantSetter object.
     */
    public InsertReferenceVariantSetter() {
      super("org.tair.db.basic", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.basic.SpeciesVariant.class.getName();
    }

    @Override
    protected org.tair.db.basic.ISpeciesVariant getDto() {
      return referenceVariant;
    }

    @Override
    protected com.poesys.db.dao.insert.IInsertSql<org.tair.db.basic.ISpeciesVariant> getSql() {
      return new org.tair.db.basic.sql.InsertSpeciesVariant();
    }
    
    @Override
    protected boolean createKey() {
      // Key type: CompositeKey
      return true;
    }
  }

  /**
   * Setter for processing added referenceVariant, updated referenceVariant, and 
   * deleted referenceVariant. 
   */
   
  private class UpdateReferenceVariantSetter 
      extends com.poesys.db.dto.AbstractProcessNestedObject<org.tair.db.basic.ISpeciesVariant> {
    private static final long serialVersionUID = 1L;

    /**
     * Create an UpdateReferenceVariantSetter object.
     */
    public UpdateReferenceVariantSetter() {
      super("org.tair.db.basic", 2147483647);
    }

    @Override
    protected void doChanged(java.sql.Connection connection, org.tair.db.basic.ISpeciesVariant dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
        // referenceVariant source: AddToOneAssociationRequiredObjectProperties
        // Immutable: false
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.basic.ISpeciesVariant> factory = 
        manager.getFactory(org.tair.db.basic.SpeciesVariant.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.update.IUpdate<org.tair.db.basic.ISpeciesVariant> dao = 
        factory.getUpdate(new org.tair.db.basic.sql.UpdateSpeciesVariant());
      dao.update(connection, dto);
    }
    
    @Override
    protected void doDeleted(java.sql.Connection connection, org.tair.db.basic.ISpeciesVariant dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.basic.ISpeciesVariant> factory = 
        manager.getFactory(org.tair.db.basic.SpeciesVariant.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.delete.IDelete<org.tair.db.basic.ISpeciesVariant> dao = 
        factory.getDelete(new org.tair.db.basic.sql.DeleteSpeciesVariant());
      dao.delete(connection, dto);
    }

    @Override
    protected void doNew(java.sql.Connection connection, org.tair.db.basic.ISpeciesVariant dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.basic.ISpeciesVariant> factory = 
        manager.getFactory(org.tair.db.basic.SpeciesVariant.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.insert.IInsert<org.tair.db.basic.ISpeciesVariant> dao =
        factory.getInsert(new org.tair.db.basic.sql.InsertSpeciesVariant(), createKey());
      dao.insert(connection, dto);
    }

    @Override
    protected org.tair.db.basic.ISpeciesVariant getDto() {
      return referenceVariant;
    }
    
    @Override
    protected String getClassName() {
      return org.tair.db.basic.SpeciesVariant.class.getName();
    }

    @Override
    protected boolean createKey() {
      // Key type: CompositeKey
      return true;
    }
  }

  /**
   * Foreign key object used by QueryReferenceVariantSetter nested class to query object
   */
  private IPrimaryKey referenceVariantKey;
  
  /**
   * Set the foreign key referenceVariantKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param referenceVariantKey the foreign key
   */
  void setReferenceVariantKey(IPrimaryKey referenceVariantKey) {
    this.referenceVariantKey = referenceVariantKey;
  }

  // Setter strategy nested classes for multiple-object associations

  /**
   * Query setter for querying nested regions
   *
   * Source: TransformToProperty + AddToManyAssociationCollectionProperties
   *
   * @see org.tair.db.genomicregion.sql.QueryRegionsByReferenceGenome
   */
  private class QueryRegionsSetter 
      extends com.poesys.db.dto.AbstractListSetter<org.tair.db.genomicregion.IRegion, IReferenceGenome, java.util.Collection<org.tair.db.genomicregion.IRegion>> {
    private static final long serialVersionUID = 1L;
    private static final int FETCH_SIZE = 10;

    /**
     * Create a QueryRegionsSetter object.
     */
    public QueryRegionsSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.Region.class.getName();
    }

    @Override
    protected int getFetchSize() {
      return FETCH_SIZE;
    }

    @Override
    protected IReferenceGenome getParametersDto() {
      return AbstractReferenceGenome.this;
    }

    @Override
    protected com.poesys.db.dao.query.IParameterizedQuerySql<org.tair.db.genomicregion.IRegion, IReferenceGenome> getSql() {
      return new org.tair.db.genomicregion.sql.QueryRegionsByReferenceGenome();
    }

    @Override
    protected void set(java.util.Collection<org.tair.db.genomicregion.IRegion> list) {
      // No status change; this is just filling in the object data.
      regions = list;
      // Add the primary keys to the serialized key list if there are any.
      if (regions != null) {
        for (com.poesys.db.dto.IDbDto object : regions) {
          regionsKeys.add(object.getPrimaryKey());
        }
      }
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated regions list is not null
      return regions != null;
    }
  }

  /**
   * Read-Object setter for de-serializing nested regions collection
   *
   * Source: TransformToProperty + AddToManyAssociationCollectionProperties
   *
   * @see org.tair.db.genomicregion.sql.QueryRegion
   */
  private class ReadRegionsSetter 
      extends com.poesys.db.dto.AbstractCollectionReadSetter<org.tair.db.genomicregion.IRegion> {
    private static final long serialVersionUID = 1L;

    /**
     * Create a ReadRegionsSetter object to read the regions collection.
     */
    public ReadRegionsSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.Region.class.getName();
    }

    @Override
    protected java.util.Collection<org.tair.db.genomicregion.IRegion> getObjectCollection() {
      return regions;
    }

    @Override
    protected java.util.List<IPrimaryKey> getPrimaryKeys() {
      return regionsKeys;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.genomicregion.IRegion> getSql() {
      return new org.tair.db.genomicregion.sql.QueryRegion();
    }

    @Override
    protected void set(java.util.Collection<org.tair.db.genomicregion.IRegion> collection) {
      regions = collection;
    }
  }

  /**
   * Insert setter for inserting nested regions.
   *
   * @see org.tair.db.genomicregion.sql.InsertRegion
   */
  private class InsertRegionsSetter 
      extends com.poesys.db.dto.AbstractBatchInsertSetter<org.tair.db.genomicregion.IRegion, java.util.Collection<org.tair.db.genomicregion.IRegion>> {
    private static final long serialVersionUID = 1L;
    private static final int BATCH_SIZE = 100;
    
    // regions source: TransformToProperty + AddToManyAssociationCollectionProperties

    /**
     * Create an InsertRegionsSetter object.
     */
    public InsertRegionsSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected int getBatchSize() {
      return BATCH_SIZE;
    }

    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.Region.class.getName();
    }

    @Override
    protected java.util.Collection<org.tair.db.genomicregion.IRegion> getDtos() {
      return regions;
    }

    @Override
    protected com.poesys.db.dao.insert.IInsertSql<org.tair.db.genomicregion.IRegion> getSql() {
      return new org.tair.db.genomicregion.sql.InsertRegion();
    }
  }

  /**
   * Setter for processing added regions, updated regions, and 
   * deleted regions. 
   */
   
  private class UpdateRegionsSetter 
      extends com.poesys.db.dto.AbstractProcessNestedObjects<org.tair.db.genomicregion.IRegion, java.util.Collection<org.tair.db.genomicregion.IRegion>> {
    private static final long serialVersionUID = 1L;
    private static final int BATCH_SIZE = 100;

    /**
     * Create an UpdateRegionsSetter object.
     */
    public UpdateRegionsSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected void doChanged(java.sql.Connection connection, java.util.Collection<org.tair.db.genomicregion.IRegion> dtos)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
        // regions source: TransformToProperty + AddToManyAssociationCollectionProperties
        // Immutable: false
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.IRegion> factory = 
        manager.getFactory(org.tair.db.genomicregion.Region.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.update.IUpdateBatch<org.tair.db.genomicregion.IRegion> dao =
        factory.getUpdateBatch(new org.tair.db.genomicregion.sql.UpdateRegion());
      dao.update(connection, dtos, BATCH_SIZE);
    }
    
    @Override
    protected void doDeleted(java.sql.Connection connection, java.util.Collection<org.tair.db.genomicregion.IRegion> dtos)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.IRegion> factory = 
        manager.getFactory(org.tair.db.genomicregion.Region.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.delete.IDeleteBatch<org.tair.db.genomicregion.IRegion> dao = 
        factory.getDeleteBatch(new org.tair.db.genomicregion.sql.DeleteRegion());
      dao.delete(connection, dtos, BATCH_SIZE);
    }

    @Override
    protected void doNew(java.sql.Connection connection, java.util.Collection<org.tair.db.genomicregion.IRegion> dtos)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.IRegion> factory = 
        manager.getFactory(org.tair.db.genomicregion.Region.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.insert.IInsertBatch<org.tair.db.genomicregion.IRegion> dao =
        factory.getInsertBatch(new org.tair.db.genomicregion.sql.InsertRegion());
      dao.insert(connection, dtos, BATCH_SIZE);
    }

    @Override
    protected java.util.Collection<org.tair.db.genomicregion.IRegion> getDtos() {
      return regions;
    }
    
    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.Region.class.getName();
    }
  }

  public void addRegionsRegion(org.tair.db.genomicregion.IRegion object) {
    if (regions == null) {
      // Association not yet created, create it.
      regions = new java.util.concurrent.CopyOnWriteArrayList<org.tair.db.genomicregion.IRegion>();
    }
    regions.add(object);
    // Add the primary key to the primary key array.
    regionsKeys.add(object.getPrimaryKey());
  }
   
  /**
   * Create an empty ReferenceGenome for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractReferenceGenome() {
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();

    // Add the setters for the taxon property.
    querySetters.add(new QueryTaxonSetter());

    // Add the setters for the referenceVariant property.
    querySetters.add(new QueryReferenceVariantSetter());
    preSetters.add(new InsertReferenceVariantSetter());
    postSetters.add(new UpdateReferenceVariantSetter());
    
    // Add the many-to-many collection setters for the regions property.
    querySetters.add(new QueryRegionsSetter());
    readObjectSetters.add(new ReadRegionsSetter());
    insertSetters.add(new InsertRegionsSetter());
    postSetters.add(new UpdateRegionsSetter());
  }

  /**
   * Create a ReferenceGenome. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the ReferenceGenome
   * @param genome the unique name for the reference genome, such as AGI or LYRATA
   * @param dateEntered the date on which the map was entered into the source database
   * @param taxonTaxonId foreign key used by setter to query associated object
   * @param accession foreign key used by setter to query associated object
   * @param name foreign key used by setter to query associated object
   * @param referenceVariantTaxonId foreign key used by setter to query associated object
   */
  public AbstractReferenceGenome(IPrimaryKey key, java.lang.String genome, java.sql.Timestamp dateEntered, java.lang.Long taxonTaxonId, java.lang.String accession, java.lang.String name, java.lang.Long referenceVariantTaxonId) {
    this.key = key;

    this.genome = genome;

    if (genome == null) {
      throw new com.poesys.db.InvalidParametersException("genome is required for " + key.getValueList());
    }
    
    this.dateEntered = dateEntered;

    if (dateEntered == null) {
      throw new com.poesys.db.InvalidParametersException("dateEntered is required for " + key.getValueList());
    }
    
    this.taxonTaxonId = taxonTaxonId;

    if (taxonTaxonId == null) {
      throw new com.poesys.db.InvalidParametersException("taxonTaxonId is required for " + key.getValueList());
    }
    
    this.accession = accession;

    if (accession == null) {
      throw new com.poesys.db.InvalidParametersException("accession is required for " + key.getValueList());
    }
    
    this.name = name;

    if (name == null) {
      throw new com.poesys.db.InvalidParametersException("name is required for " + key.getValueList());
    }
    
    this.referenceVariantTaxonId = referenceVariantTaxonId;

    if (referenceVariantTaxonId == null) {
      throw new com.poesys.db.InvalidParametersException("referenceVariantTaxonId is required for " + key.getValueList());
    }
    
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertQuerySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    
    // Add the setters for the taxon property.
    querySetters.add(new QueryTaxonSetter());
    
    // Set the internal key data member for the taxon object retrieval.
    taxonKey = org.tair.db.basic.BasicFactory.getTaxonPrimaryKey(taxonTaxonId/* Source: AddNaturalKeyProperties + addAssociationForeignKeys: taxonId Key: false */);
    // Add a setter to instantiate the required taxon object before insert.
    insertQuerySetters.add(new QueryTaxonSetter());
    
    // Add the setters for the referenceVariant property.
    querySetters.add(new QueryReferenceVariantSetter());
    insertSetters.add(new InsertReferenceVariantSetter());
    preSetters.add(new InsertReferenceVariantSetter());
    postSetters.add(new UpdateReferenceVariantSetter());
    
    // Set the internal key data member for the referenceVariant object retrieval.
    referenceVariantKey = org.tair.db.basic.BasicFactory.getSpeciesVariantPrimaryKey(accession/* Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + addAssociationForeignKeys: accession Key: false */, name/* Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + addAssociationForeignKeys: name Key: false */, referenceVariantTaxonId/* Source: AddNaturalKeyProperties + AddParentKeyAttributes + addAssociationForeignKeys: taxonId Key: false */);
    // Add a setter to instantiate the required referenceVariant object before insert.
    insertQuerySetters.add(new QueryReferenceVariantSetter());
    
    // Add the many-to-many collection setters for the regions property.
    querySetters.add(new QueryRegionsSetter());
    readObjectSetters.add(new ReadRegionsSetter());
    insertSetters.add(new InsertRegionsSetter());
    postSetters.add(new UpdateRegionsSetter());
  }

  @Override
  public boolean equals(Object arg0) {
    AbstractReferenceGenome other = (AbstractReferenceGenome)arg0;
    return other.key.equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    AbstractReferenceGenome other = (AbstractReferenceGenome)o;
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
   * Nested property genome
   *
   * <p>
   * the unique name for the reference genome, such as AGI or LYRATA
   * </p>
   *
   * Added by AddNaturalKeyProperties
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

  /**
   * Nested property dateEntered
   *
   * <p>
   * the date on which the map was entered into the source database
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
   * the date on which the map was entered into the source database
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
   * Nested property taxon
   *
   * <p>
   * the taxon or species of the genome
   * </p>
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private org.tair.db.basic.ITaxon taxon;
  

  public org.tair.db.basic.ITaxon getTaxon() {
    return taxon;
  }

  /**
   * Clear the taxon data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearTaxon() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the taxon.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the taxon or species of the genome
   * </p>
   *
   * @param taxon the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input taxon is null
   */
  public void setTaxon(org.tair.db.basic.ITaxon taxon)
      throws com.poesys.db.InvalidParametersException {
    if (taxon == null) {
      throw new com.poesys.db.InvalidParametersException("taxon is required");
    }
    
    this.taxon = taxon;
    // Set the IPrimaryKey cache lookup key.
    this.taxonKey = taxon.getPrimaryKey();
    setChanged();
  }

  /**
   * Nested property referenceVariant
   *
   * <p>
   * the species variant that contributed the genetic material for the genome
   * sequence
   * </p>
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private org.tair.db.basic.ISpeciesVariant referenceVariant;
  

  public org.tair.db.basic.ISpeciesVariant getReferenceVariant() {
    return referenceVariant;
  }

  /**
   * Clear the referenceVariant data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearReferenceVariant() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the referenceVariant.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the species variant that contributed the genetic material for the genome
   * sequence
   * </p>
   *
   * @param referenceVariant the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input referenceVariant is null
   */
  public void setReferenceVariant(org.tair.db.basic.ISpeciesVariant referenceVariant)
      throws com.poesys.db.InvalidParametersException {
    if (referenceVariant == null) {
      throw new com.poesys.db.InvalidParametersException("referenceVariant is required");
    }
    
    this.referenceVariant = referenceVariant;
    // Set the IPrimaryKey cache lookup key.
    this.referenceVariantKey = referenceVariant.getPrimaryKey();
    setChanged();
  }

  /**
   * Nested property taxonTaxonId
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
  private java.lang.Long taxonTaxonId;
  

  public java.lang.Long getTaxonTaxonId() {
    return taxonTaxonId;
  }

  /**
   * Clear the taxonTaxonId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearTaxonTaxonId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property accession
   *
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddToOneAssociationAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
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
   * Nested property name
   *
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddToOneAssociationAttributeProperties
   * Class is read/write: true
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
   * Nested property referenceVariantTaxonId
   *
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   *
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddToOneAssociationAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long referenceVariantTaxonId;
  

  public java.lang.Long getReferenceVariantTaxonId() {
    return referenceVariantTaxonId;
  }

  /**
   * Clear the referenceVariantTaxonId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearReferenceVariantTaxonId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property regions
   *
   * 
   *
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  // Doesn't serialize; package access allows proxy to set on readObject()
  transient java.util.Collection<org.tair.db.genomicregion.IRegion> regions;
  // Ordered list of keys of the objects in the $property.uniquename list
  java.util.List<com.poesys.db.pk.IPrimaryKey> regionsKeys = 
    new java.util.ArrayList<com.poesys.db.pk.IPrimaryKey>();
  

  public java.util.Collection<org.tair.db.genomicregion.IRegion> getRegions() {
    return regions;
  }

  /**
   * Clear the regions data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearRegions() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the regions.
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
   * @param regions the value with which to set the property
   */
  public  void setRegions(java.util.Collection<org.tair.db.genomicregion.IRegion> regions) {
    this.regions = regions;
    // Add the primary keys of the new collection to the serialized key list.
    regionsKeys.clear();
    if (regions != null) {
      for (com.poesys.db.dto.IDbDto object : regions) {
        regionsKeys.add(object.getPrimaryKey());
      }
    }
    setChanged();
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }
}