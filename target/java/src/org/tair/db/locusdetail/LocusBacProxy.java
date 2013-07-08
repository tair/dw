/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.locusdetail;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * LocusBac. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * A bacterially activated chromosome on which a locus appears; an artificially
 * created chromosome in which biologists clone medium-sized segments of foreign
 * DNA into bacteria, enabling amplification or the making of many copies of the
 * DNA. Note that if the length or start or end is null (not available), this might
 * not be the correct BAC for the gene model.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class LocusBacProxy extends AbstractLocusBacProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusBacProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public LocusBacProxy(LocusBac dto) {
    super(dto); 
  }
}