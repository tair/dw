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
 * A data-access layer data-transfer object for the ProteinResourceLink. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * a URL link to an external resource that contains some kind of information
 * related to the protein
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
public abstract class AbstractProteinResourceLink extends AbstractDto implements IProteinResourceLink {
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
   * Create an empty ProteinResourceLink for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractProteinResourceLink() {
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
   * Create a ProteinResourceLink. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the ProteinResourceLink
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param name the text name for the link, which usually includes the web site name and any
specific information in the context of the locus; the URL itself may be this
name if there is no other name
   * @param linkType the kind of link this is; used to place the link into a particular section of
the locus detail
   * @param icon an optional name for an icon to display for the link; icon gif must exist in
static images folder
   * @param locus the locus that owns the third-party resource link
   * @param baseUrl the base URL (http://... up to the ? arguments) for the external link
   * @param urlVariable the optional URL variable that identifies the locus to the target web site
   * @param explanation a short explanation (should fit on one line if possible) of the purpose of the
link
   */
  public AbstractProteinResourceLink(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.String name, java.lang.String linkType, java.lang.String icon, org.tair.db.locusdetail.ILocusDetail locus, java.lang.String baseUrl, java.lang.String urlVariable, java.lang.String explanation) {
    this.key = key;

    this.tairObjectId = tairObjectId;

    if (tairObjectId == null) {
      throw new com.poesys.db.InvalidParametersException("tairObjectId is required for " + key.getValueList());
    }
    
    this.name = name;

    if (name == null) {
      throw new com.poesys.db.InvalidParametersException("name is required for " + key.getValueList());
    }
    
    this.linkType = linkType;

    this.icon = icon;

    this.locus = locus;

    if (locus == null) {
      throw new com.poesys.db.InvalidParametersException("locus is required for " + key.getValueList());
    }
    
    this.baseUrl = baseUrl;

    if (baseUrl == null) {
      throw new com.poesys.db.InvalidParametersException("baseUrl is required for " + key.getValueList());
    }
    
    this.urlVariable = urlVariable;

    this.explanation = explanation;

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
    AbstractProteinResourceLink other = (AbstractProteinResourceLink)arg0;
    return other.key.equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    AbstractProteinResourceLink other = (AbstractProteinResourceLink)o;
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
   * Class is read/write: false
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
   * the text name for the link, which usually includes the web site name and any
   * specific information in the context of the locus; the URL itself may be this
   * name if there is no other name
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
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
   * Nested property linkType
   *
   * <p>
   * the kind of link this is; used to place the link into a particular section of
   * the locus detail
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
   * Nested property icon
   *
   * <p>
   * an optional name for an icon to display for the link; icon gif must exist in
   * static images folder
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String icon;
  

  public java.lang.String getIcon() {
    return icon;
  }

  /**
   * Clear the icon data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearIcon() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property locus
   *
   * <p>
   * the locus that owns the third-party resource link
   * </p>
   *
   * Added by AddLocalAttributeProperties
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

  /**
   * Nested property baseUrl
   *
   * <p>
   * the base URL (http://... up to the ? arguments) for the external link
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String baseUrl;
  

  public java.lang.String getBaseUrl() {
    return baseUrl;
  }

  /**
   * Clear the baseUrl data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearBaseUrl() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property urlVariable
   *
   * <p>
   * the optional URL variable that identifies the locus to the target web site
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String urlVariable;
  

  public java.lang.String getUrlVariable() {
    return urlVariable;
  }

  /**
   * Clear the urlVariable data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearUrlVariable() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property explanation
   *
   * <p>
   * a short explanation (should fit on one line if possible) of the purpose of the
   * link
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String explanation;
  

  public java.lang.String getExplanation() {
    return explanation;
  }

  /**
   * Clear the explanation data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearExplanation() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property protein
   *
   * <p>
   * the protein to which the resource link applies
   * </p>
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
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

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }
}