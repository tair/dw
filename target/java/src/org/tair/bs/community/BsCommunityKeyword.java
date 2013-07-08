/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.community;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the CommunityKeyword. This class
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
public class BsCommunityKeyword extends org.tair.bs.community.AbstractBsCommunityKeyword {
  /**
   * Create a BsCommunityKeyword object from a CommunityKeyword object.
   * 
   * @param dto the data-access layer CommunityKeyword DTO
   * @throws DelegateException when there is a problem creating the CommunityKeyword
   */
  public BsCommunityKeyword(org.tair.db.community.ICommunityKeyword dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsCommunityKeyword. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the CommunityKeyword
   * @param communityId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param keyword the search keyword that applies to the community member
   * @param keywordType the kind of keyword for the community member
organism
community_interest
   */
  public BsCommunityKeyword(IPrimaryKey key, java.math.BigInteger communityId, java.lang.String keyword, java.lang.String keywordType) {
    super(key, communityId, keyword, keywordType); 
  }
}