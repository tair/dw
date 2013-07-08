/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusUpdateHistory. This class
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
public class BsLocusUpdateHistory extends org.tair.bs.locusdetail.AbstractBsLocusUpdateHistory {
  /**
   * Create a BsLocusUpdateHistory object from a LocusUpdateHistory object.
   * 
   * @param dto the data-access layer LocusUpdateHistory DTO
   * @throws DelegateException when there is a problem creating the LocusUpdateHistory
   */
  public BsLocusUpdateHistory(org.tair.db.locusdetail.ILocusUpdateHistory dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusUpdateHistory. This constructor calls the abstract superclass 
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
  public BsLocusUpdateHistory(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String updateType, java.sql.Timestamp updateDate, java.lang.Long affectedTairObjectId, java.lang.String affectedTairObjectType, java.lang.String affectedTairObjectName) {
    super(key, locusTairObjectId, updateType, updateDate, affectedTairObjectId, affectedTairObjectType, affectedTairObjectName); 
  }
}