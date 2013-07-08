/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.community;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the CommunityReference. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A reference of the community member
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
public class BsCommunityReference extends org.tair.bs.community.AbstractBsCommunityReference {
  /**
   * Create a BsCommunityReference object from a CommunityReference object.
   * 
   * @param dto the data-access layer CommunityReference DTO
   * @throws DelegateException when there is a problem creating the CommunityReference
   */
  public BsCommunityReference(org.tair.db.community.ICommunityReference dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsCommunityReference. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the CommunityReference
   * @param communityId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param tairObjectId the unique TAIR identifier for the reference; used to link to the reference page
   * @param title the title of the reference
   * @param source the publication source of the reference
   * @param publicationYear the year of publication of the reference
   */
  public BsCommunityReference(IPrimaryKey key, java.math.BigInteger communityId, java.lang.Long tairObjectId, java.lang.String title, java.lang.String source, java.lang.Integer publicationYear) {
    super(key, communityId, tairObjectId, title, source, publicationYear); 
  }
}