/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.community;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Country. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * 
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 *     <li>SequenceKey</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsCountry extends org.tair.bs.community.AbstractBsCountry {
  /**
   * Create a BsCountry object from a Country object.
   * 
   * @param dto the data-access layer Country DTO
   * @throws DelegateException when there is a problem creating the Country
   */
  public BsCountry(org.tair.db.community.ICountry dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsCountry. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Country
   * @param countryId primary key attribute
   * @param name the formal name of the country
   */
  public BsCountry(IPrimaryKey key, java.math.BigInteger countryId, java.lang.String name) {
    super(key, countryId, name); 
  }
}