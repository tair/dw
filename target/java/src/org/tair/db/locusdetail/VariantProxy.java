/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.locusdetail;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * Variant. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * an ecotype that is a natural species variant of the reference ecotype
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class VariantProxy extends AbstractVariantProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a VariantProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public VariantProxy(Variant dto) {
    super(dto); 
  }
}