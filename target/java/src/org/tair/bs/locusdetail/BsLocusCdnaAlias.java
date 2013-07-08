/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusCdnaAlias. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * Another name for the cDNA for a locus
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
public class BsLocusCdnaAlias extends org.tair.bs.locusdetail.AbstractBsLocusCdnaAlias {
  /**
   * Create a BsLocusCdnaAlias object from a LocusCdnaAlias object.
   * 
   * @param dto the data-access layer LocusCdnaAlias DTO
   * @throws DelegateException when there is a problem creating the LocusCdnaAlias
   */
  public BsLocusCdnaAlias(org.tair.db.locusdetail.ILocusCdnaAlias dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusCdnaAlias. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusCdnaAlias
   * @param cloneTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param alias the alias for the cDNA sequence
   */
  public BsLocusCdnaAlias(IPrimaryKey key, java.lang.Long cloneTairObjectId, java.lang.Long locusTairObjectId, java.lang.String alias) {
    super(key, cloneTairObjectId, locusTairObjectId, alias); 
  }
}