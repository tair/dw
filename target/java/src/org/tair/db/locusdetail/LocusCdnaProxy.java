/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.locusdetail;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * LocusCdna. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * An experimental complementary DNA (cDNA) sequence associated with the locus.
 * cDNA is single-stranded DNA made in the laboratory from a messenger RNA
 * template. Biologists use this form of DNA as a probe in the structural mapping
 * of a chromosome.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class LocusCdnaProxy extends AbstractLocusCdnaProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusCdnaProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public LocusCdnaProxy(LocusCdna dto) {
    super(dto); 
  }
}