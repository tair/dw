/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.genomicregion;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * Region. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * SO_0000001: A sequence_feature with an extent greater than zero. A nucleotide
 * region is composed of bases and a polypeptide region is composed of amino acids.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class RegionProxy extends AbstractRegionProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a RegionProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public RegionProxy(Region dto) {
    super(dto); 
  }
}