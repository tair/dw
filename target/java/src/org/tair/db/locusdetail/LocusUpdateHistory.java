/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusUpdateHistory. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * The update history records that show the history of the parent locus
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class LocusUpdateHistory extends AbstractLocusUpdateHistory {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusUpdateHistory as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public LocusUpdateHistory() {
    super(); 
  }

  /**
   * <p>
   * Create a LocusUpdateHistory. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusUpdateHistory
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param updateType the type of update involved (obsoleted, added, replaces, split and added,
obsolete and replaced by, updated, replaced, restored, or blank)
   * @param updateDate the date and time of the update
   * @param affectedTairObjectId the TAIR object id for the object affected by the update of the locus
   * @param affectedTairObjectType the kind of TAIR object affected by the update of the locus
   * @param affectedTairObjectName the name of the TAIR object affected by the update of the locus; corresponds to
the name of the object identified by the affected TAIR object id
   */
  public LocusUpdateHistory(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String updateType, java.sql.Timestamp updateDate, java.lang.Long affectedTairObjectId, java.lang.String affectedTairObjectType, java.lang.String affectedTairObjectName) {
    super(key, locusTairObjectId, updateType, updateDate, affectedTairObjectId, affectedTairObjectType, affectedTairObjectName); 
  }
}