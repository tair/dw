/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.community;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the CommunityKeyword. This class
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
public class CommunityKeyword extends AbstractCommunityKeyword {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a CommunityKeyword as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public CommunityKeyword() {
    super(); 
  }

  /**
   * <p>
   * Create a CommunityKeyword. This constructor calls the abstract superclass 
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
  public CommunityKeyword(IPrimaryKey key, java.math.BigInteger communityId, java.lang.String keyword, java.lang.String keywordType) {
    super(key, communityId, keyword, keywordType); 
  }
}