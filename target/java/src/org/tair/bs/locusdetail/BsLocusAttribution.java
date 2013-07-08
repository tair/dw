/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusAttribution. This class
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
public class BsLocusAttribution extends org.tair.bs.locusdetail.AbstractBsLocusAttribution {
  /**
   * Create a BsLocusAttribution object from a LocusAttribution object.
   * 
   * @param dto the data-access layer LocusAttribution DTO
   * @throws DelegateException when there is a problem creating the LocusAttribution
   */
  public BsLocusAttribution(org.tair.db.locusdetail.ILocusAttribution dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusAttribution. This constructor calls the abstract superclass 
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
  public BsLocusAttribution(IPrimaryKey key, java.lang.Long locusTairObjectId, java.math.BigInteger locusAttributionNo, java.lang.String attributionType, java.lang.String linkType, java.lang.Long communityId, java.lang.String name, java.sql.Timestamp attributionDate) {
    super(key, locusTairObjectId, locusAttributionNo, attributionType, linkType, communityId, name, attributionDate); 
  }
}