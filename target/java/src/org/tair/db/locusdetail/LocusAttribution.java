/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusAttribution. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * The community member to which the locus is attributed
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
public class LocusAttribution extends AbstractLocusAttribution {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusAttribution as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public LocusAttribution() {
    super(); 
  }

  /**
   * <p>
   * Create a LocusAttribution. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusAttribution
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusAttributionNo composite subkey attribute that uniquely identifies child combined with parent key
   * @param attributionType the kind of attribution this is
   * @param linkType "person" or "org" depending on whether the community member is a person or an
organization
   * @param communityId the TAIR community ID for the attribution; used in links
   * @param name the community member's name
   * @param attributionDate the date on which the locus was attributed to the community member
   */
  public LocusAttribution(IPrimaryKey key, java.lang.Long locusTairObjectId, java.math.BigInteger locusAttributionNo, java.lang.String attributionType, java.lang.String linkType, java.lang.Long communityId, java.lang.String name, java.sql.Timestamp attributionDate) {
    super(key, locusTairObjectId, locusAttributionNo, attributionType, linkType, communityId, name, attributionDate); 
  }
}