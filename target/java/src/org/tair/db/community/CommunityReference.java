/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.community;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the CommunityReference. This class
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
public class CommunityReference extends AbstractCommunityReference {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a CommunityReference as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public CommunityReference() {
    super(); 
  }

  /**
   * <p>
   * Create a CommunityReference. This constructor calls the abstract superclass 
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
  public CommunityReference(IPrimaryKey key, java.math.BigInteger communityId, java.lang.Long tairObjectId, java.lang.String title, java.lang.String source, java.lang.Integer publicationYear) {
    super(key, communityId, tairObjectId, title, source, publicationYear); 
  }
}