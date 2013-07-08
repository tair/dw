/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.community;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the CommunityAttribution. This class
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
public class CommunityAttribution extends AbstractCommunityAttribution {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a CommunityAttribution as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public CommunityAttribution() {
    super(); 
  }

  /**
   * <p>
   * Create a CommunityAttribution. This constructor calls the abstract superclass 
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
  public CommunityAttribution(IPrimaryKey key, java.math.BigInteger communityId, java.lang.String attributionType, java.lang.String name, java.lang.Long tairObjectId, java.sql.Timestamp attributionDate, java.lang.String attributionComment) {
    super(key, communityId, attributionType, name, tairObjectId, attributionDate, attributionComment); 
  }
}