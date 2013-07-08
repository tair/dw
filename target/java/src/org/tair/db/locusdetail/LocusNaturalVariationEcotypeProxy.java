/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.locusdetail;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * LocusNaturalVariationEcotype. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * An ecotype that contains the natural variation polymorphism; this is in place of
 * a many-to-many link to SpeciesVariant, which extends beyond the subsystem
 * boundary and thus violates visibility rules
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class LocusNaturalVariationEcotypeProxy extends AbstractLocusNaturalVariationEcotypeProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusNaturalVariationEcotypeProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public LocusNaturalVariationEcotypeProxy(LocusNaturalVariationEcotype dto) {
    super(dto); 
  }
}