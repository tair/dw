/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.basic;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the SpeciesVariant. This class
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
public class BsSpeciesVariant extends org.tair.bs.basic.AbstractBsSpeciesVariant {
  /**
   * Create a BsSpeciesVariant object from a SpeciesVariant object.
   * 
   * @param dto the data-access layer SpeciesVariant DTO
   * @throws DelegateException when there is a problem creating the SpeciesVariant
   */
  public BsSpeciesVariant(org.tair.db.basic.ISpeciesVariant dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsSpeciesVariant. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the SpeciesVariant
   * @param taxonId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param name the name of the variant ecotype or species variant; first part of the primary
key
   * @param accession the accession identifier for this particular variant (second part of the primary
key); nulls in the original database translate into zero.
   * @param reference whether this is the reference species variant/ecotype for the taxon
   */
  public BsSpeciesVariant(IPrimaryKey key, java.lang.Long taxonId, java.lang.String name, java.lang.String accession, java.lang.Boolean reference) {
    super(key, taxonId, name, accession, reference); 
  }
}