/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusNaturalVariationEcotype. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * An ecotype that contains the natural variation polymorphism; this is in place of
 * a many-to-many link to SpeciesVariant, which extends beyond the subsystem
 * boundary and thus violates visibility rules
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
public class BsLocusNaturalVariationEcotype extends org.tair.bs.locusdetail.AbstractBsLocusNaturalVariationEcotype {
  /**
   * Create a BsLocusNaturalVariationEcotype object from a LocusNaturalVariationEcotype object.
   * 
   * @param dto the data-access layer LocusNaturalVariationEcotype DTO
   * @throws DelegateException when there is a problem creating the LocusNaturalVariationEcotype
   */
  public BsLocusNaturalVariationEcotype(org.tair.db.locusdetail.ILocusNaturalVariationEcotype dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusNaturalVariationEcotype. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusNaturalVariationEcotype
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param polymorphismName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param accession the accession identifier for this particular variant (second part of the primary
key); nulls in the original database translate into zero.
   * @param name the name of the variant ecotype or species variant; first part of the primary
key
   * @param taxonId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   */
  public BsLocusNaturalVariationEcotype(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.String accession, java.lang.String name, java.lang.Long taxonId) {
    super(key, locusTairObjectId, polymorphismName, accession, name, taxonId); 
  }
}