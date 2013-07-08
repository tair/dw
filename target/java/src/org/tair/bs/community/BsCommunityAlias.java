/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.community;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the CommunityAlias. This class
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
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsCommunityAlias extends org.tair.bs.community.AbstractBsCommunityAlias {
  /**
   * Create a BsCommunityAlias object from a CommunityAlias object.
   * 
   * @param dto the data-access layer CommunityAlias DTO
   * @throws DelegateException when there is a problem creating the CommunityAlias
   */
  public BsCommunityAlias(org.tair.db.community.ICommunityAlias dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsCommunityAlias. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the CommunityAlias
   * @param communityId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param alias an alternate name for the community member
   */
  public BsCommunityAlias(IPrimaryKey key, java.math.BigInteger communityId, java.lang.String alias) {
    super(key, communityId, alias); 
  }
}