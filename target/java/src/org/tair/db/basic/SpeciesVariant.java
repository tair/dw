/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.basic;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the SpeciesVariant. This class
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
public class SpeciesVariant extends AbstractSpeciesVariant {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a SpeciesVariant as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public SpeciesVariant() {
    super(); 
  }

  /**
   * <p>
   * Create a SpeciesVariant. This constructor calls the abstract superclass 
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
  public SpeciesVariant(IPrimaryKey key, java.lang.Long taxonId, java.lang.String name, java.lang.String accession, java.lang.Boolean reference) {
    super(key, taxonId, name, accession, reference); 
  }
}