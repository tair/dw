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
 * ConferenceAbstract objects and their dependents. You should not modify this class;
 * instead, override or add methods in the class ConferenceAbstractDelegate, which
 * specializes this class.
 * </p>
 * <p>
 * An abstract reference from a conference proceedings that refers to the locus
 * </p>
 * @see ConferenceAbstractDelegate
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractConferenceAbstractDelegate
    extends AbstractReadOnlyDataDelegate<BsConferenceAbstract, org.tair.db.locusdetail.IConferenceAbstract, com.poesys.db.pk.CompositePrimaryKey> {
  /**
   * Create an AbstractConferenceAbstractDelegate object by supplying the database
   * subsystem in the database.properties file.
   * 
   * @param subsystem the database subsystem to use in database.properties
   */
  public AbstractConferenceAbstractDelegate(String subsystem) {
    super(subsystem, 2147483647);
  }

  /**
   * Create an AbstractConferenceAbstractDelegate object by supplying the database
   * subsystem in the database.properties file and a specific DBMS, usually
   * IConnectionFactory.DBMS.JNDI.
   * 
   * @param subsystem the database subsystem to use in database.properties
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public AbstractConferenceAbstractDelegate(String subsystem, DBMS dbms) {
    super(subsystem, dbms, 2147483647);
  }

  @Override
  protected String getClassName() {
    return org.tair.db.locusdetail.ConferenceAbstract.class.getName();
  }

  @Override
  protected IKeyQuerySql<org.tair.db.locusdetail.IConferenceAbstract> getQueryByKeySql() {
    return new org.tair.db.locusdetail.sql.QueryConferenceAbstract();
  }

  @Override
  protected IQuerySql<org.tair.db.locusdetail.IConferenceAbstract> getQueryListSql() {
    // Query-All method not required
    return new org.tair.db.locusdetail.sql.QueryAllConferenceAbstract();
  }

  @Override
  protected org.tair.bs.locusdetail.BsConferenceAbstract wrapData(org.tair.db.locusdetail.IConferenceAbstract dto) {
    return new org.tair.bs.locusdetail.BsConferenceAbstract(dto);
  }

  /**
   * <p>
   * Create a new ConferenceAbstract with data fields.
   * </p>
   * <p>
   * The ConferenceAbstract class has no key of its own but inherits from a superclass
   * that has a CompositeKey. When you create an instance of this
   * class, the delegate creates a key of that type in the superclass.
   * </p>
   * 
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param referenceTairObjectId the unique TAIR object identifier for the reference; used to link to the
reference page
   * @param title title of the publication
   * @param authors a formatted list of authors (Smith J., Jones T., et al.)
   * @param publicationYear the year of publication
   * @param locusCount the number of loci other than the parent to which this reference refers
   * @param annotated has this article been curated, resulting in annotations to the locus?
   * @param conference the conference (ICAR, PAG, and so on)
   * @return the new ConferenceAbstract object
   * @throws DelegateException when there is a problem generating the key or
   *             creating the object
   */
  public org.tair.bs.locusdetail.BsConferenceAbstract createConferenceAbstract(java.lang.Long locusTairObjectId, java.lang.Long referenceTairObjectId, java.lang.String title, java.lang.String authors, java.lang.Integer publicationYear, java.lang.Integer locusCount, java.lang.Boolean annotated, java.lang.String conference)
      throws DelegateException {
    // Create the composite key.
    com.poesys.db.pk.IPrimaryKey key = 
      org.tair.db.locusdetail.LocusdetailFactory.getConferenceAbstractPrimaryKey(locusTairObjectId, referenceTairObjectId);
      
    // Create a data-access DTO proxy (supports lazy loading).
    org.tair.db.locusdetail.IConferenceAbstract dto =
      new org.tair.db.locusdetail.ConferenceAbstractProxy(new org.tair.db.locusdetail.ConferenceAbstract(key, locusTairObjectId, referenceTairObjectId, title, authors, publicationYear, locusCount, annotated, conference));

    // Create the business DTO.
    return new org.tair.bs.locusdetail.BsConferenceAbstract(dto);
  }

}
