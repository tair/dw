/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.locusdetail;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * LocusOtherName. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * An alternate name for the parent locus; the rules for inclusion of names in this
 * set vary with the genome; for example, for Arabidopsis thaliana, an other name
 * may be any of the names of the gene models associated with the locus other than
 * the representative gene model or splice variants, or any orf alias that isn't a
 * splice variant name, or the symbol for the gene model, or the full name for the
 * gene model
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class LocusOtherNameProxy extends AbstractLocusOtherNameProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusOtherNameProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public LocusOtherNameProxy(LocusOtherName dto) {
    super(dto); 
  }
}