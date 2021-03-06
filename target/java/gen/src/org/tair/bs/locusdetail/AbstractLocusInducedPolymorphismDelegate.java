/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelegate.vsl

package org.tair.bs.locusdetail;


import com.poesys.bs.delegate.AbstractReadOnlyDataDelegate;
import com.poesys.bs.delegate.DelegateException;
import com.poesys.db.connection.IConnectionFactory.DBMS;
import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.dao.query.IQuerySql;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * LocusInducedPolymorphism objects and their dependents. You should not modify this class;
 * instead, override or add methods in the class LocusInducedPolymorphismDelegate, which
 * specializes this class.
 * </p>
 * <p>
 * A lab-created, non-natural mutation; for example, T-DNA, transposon, and
 * chemically-generated polymorphisms are considered induced. Induced polymorphisms
 * are differences within a single ecotype, whereas natural variation polymorphisms
 * differ between ecotypes.
 * </p>
 * @see LocusInducedPolymorphismDelegate
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractLocusInducedPolymorphismDelegate
    extends AbstractReadOnlyDataDelegate<BsLocusInducedPolymorphism, org.tair.db.locusdetail.ILocusInducedPolymorphism, com.poesys.db.pk.CompositePrimaryKey> {
  /**
   * Create an AbstractLocusInducedPolymorphismDelegate object by supplying the database
   * subsystem in the database.properties file.
   * 
   * @param subsystem the database subsystem to use in database.properties
   */
  public AbstractLocusInducedPolymorphismDelegate(String subsystem) {
    super(subsystem, 2147483647);
  }

  /**
   * Create an AbstractLocusInducedPolymorphismDelegate object by supplying the database
   * subsystem in the database.properties file and a specific DBMS, usually
   * IConnectionFactory.DBMS.JNDI.
   * 
   * @param subsystem the database subsystem to use in database.properties
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public AbstractLocusInducedPolymorphismDelegate(String subsystem, DBMS dbms) {
    super(subsystem, dbms, 2147483647);
  }

  @Override
  protected String getClassName() {
    return org.tair.db.locusdetail.LocusInducedPolymorphism.class.getName();
  }

  @Override
  protected IKeyQuerySql<org.tair.db.locusdetail.ILocusInducedPolymorphism> getQueryByKeySql() {
    return new org.tair.db.locusdetail.sql.QueryLocusInducedPolymorphism();
  }

  @Override
  protected IQuerySql<org.tair.db.locusdetail.ILocusInducedPolymorphism> getQueryListSql() {
    // Query-All method not required
    return new org.tair.db.locusdetail.sql.QueryAllLocusInducedPolymorphism();
  }

  @Override
  protected org.tair.bs.locusdetail.BsLocusInducedPolymorphism wrapData(org.tair.db.locusdetail.ILocusInducedPolymorphism dto) {
    return new org.tair.bs.locusdetail.BsLocusInducedPolymorphism(dto);
  }

  /**
   * <p>
   * Create a new LocusInducedPolymorphism with data fields.
   * </p>
   * <p>
   * The LocusInducedPolymorphism class has no key of its own but inherits from a superclass
   * that has a CompositeKey. When you create an instance of this
   * class, the delegate creates a key of that type in the superclass.
   * </p>
   * 
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param polymorphismName the name of the polymorphism
   * @param polymorphismTairObjectId the TAIR object id for the polymorphism, used in URL links to the polymorphism
   * @param polymorphismType the kind of difference (insertion, substitution, deletion)
   * @param length the length of the polymorphic region in base pairs (bp)
   * @param start the starting position on the AGI map of the polymorphism
   * @param end the end position of the polymorphic region in the AGI map
   * @param inheritance how the inheritance of the polymorphism works (recessive, unknown, ???)
   * @param alleleType the kind of allele this polymorphism represents; null means the polymorphism is
not an allele
   * @param accession foreign key used by setter to query associated object
   * @param name foreign key used by setter to query associated object
   * @param taxonId foreign key used by setter to query associated object
   * @return the new LocusInducedPolymorphism object
   * @throws DelegateException when there is a problem generating the key or
   *             creating the object
   */
  public org.tair.bs.locusdetail.BsLocusInducedPolymorphism createLocusInducedPolymorphism(java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.Long polymorphismTairObjectId, java.lang.String polymorphismType, java.lang.Long length, java.lang.Long start, java.lang.Long end, java.lang.String inheritance, java.lang.String alleleType, java.lang.String accession, java.lang.String name, java.lang.Long taxonId)
      throws DelegateException {
    // Create the composite key.
    com.poesys.db.pk.IPrimaryKey key = 
      org.tair.db.locusdetail.LocusdetailFactory.getLocusInducedPolymorphismPrimaryKey(locusTairObjectId, polymorphismName);
      
    // Create a data-access DTO proxy (supports lazy loading).
    org.tair.db.locusdetail.ILocusInducedPolymorphism dto =
      new org.tair.db.locusdetail.LocusInducedPolymorphismProxy(new org.tair.db.locusdetail.LocusInducedPolymorphism(key, locusTairObjectId, polymorphismName, polymorphismTairObjectId, polymorphismType, length, start, end, inheritance, alleleType, accession, name, taxonId));

    // Create the business DTO.
    return new org.tair.bs.locusdetail.BsLocusInducedPolymorphism(dto);
  }

  /**
   * Create a new LocusGermplasm child of LocusInducedPolymorphism with a composite key.
   * 
   * @param parent the parent of the child object to create
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param polymorphismName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param germplasmName the name of the germplasm that contains the induced polymorphism
   * @param germplasmTairObjectId the TAIR object id for the germplasm, used for linking to the germplasm
   * @param phenotype a textual description of the phenotype that results from the induced mutation in
the ecotype
   * @return a new LocusGermplasm business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.tair.bs.locusdetail.BsLocusGermplasm createLocusGermplasm(org.tair.bs.locusdetail.BsLocusInducedPolymorphism parent, java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.String germplasmName, java.lang.Long germplasmTairObjectId, java.lang.String phenotype) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.StringColumnValue("germplasmName", germplasmName));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.locusdetail.LocusGermplasm");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parent.getPrimaryKey(), 
                                                              subKey,
                                                              "org.tair.db.locusdetail.LocusGermplasm");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access LocusGermplasm DTO for direct access, no proxy required.
    org.tair.db.locusdetail.ILocusGermplasm dto =
      new org.tair.db.locusdetail.LocusGermplasm(key, locusTairObjectId, polymorphismName, germplasmName, germplasmTairObjectId, phenotype);

    // Create the business DTO.
    return new org.tair.bs.locusdetail.BsLocusGermplasm(dto);
  }
}
