/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.community;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the CommunityAttribution. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * The attribution of an object in the database to a community member
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
public class BsCommunityAttribution extends org.tair.bs.community.AbstractBsCommunityAttribution {
  /**
   * Create a BsCommunityAttribution object from a CommunityAttribution object.
   * 
   * @param dto the data-access layer CommunityAttribution DTO
   * @throws DelegateException when there is a problem creating the CommunityAttribution
   */
  public BsCommunityAttribution(org.tair.db.community.ICommunityAttribution dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsCommunityAttribution. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the CommunityAttribution
   * @param communityId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param attributionType the nature of the attribution, such as "submitted_by" or "available_from"; first
part of the ordering part of the primary sub-key
   * @param name the name of the attributed object, such as the AGI number or the germplasm name;
if there is no name, this should contain some kind of descriptive text or
identifier that allows identification of the object;
second part of the ordering part of the primary sub-key
   * @param tairObjectId the unique TAIR identifier for the object being attributed to a community
member; used to link to the object page
   * @param attributionDate the date of the attribution
   * @param attributionComment an optional text comment on the attribution
   */
  public BsCommunityAttribution(IPrimaryKey key, java.math.BigInteger communityId, java.lang.String attributionType, java.lang.String name, java.lang.Long tairObjectId, java.sql.Timestamp attributionDate, java.lang.String attributionComment) {
    super(key, communityId, attributionType, name, tairObjectId, attributionDate, attributionComment); 
  }
}