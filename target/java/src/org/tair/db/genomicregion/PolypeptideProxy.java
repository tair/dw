/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.genomicregion;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * Polypeptide. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * SO_0000104: A sequence of amino acids linked by peptide bonds which may lack
 * appreciable tertiary structure and may not be liable to irreversible
 * denaturation. Synonym: protein.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class PolypeptideProxy extends AbstractPolypeptideProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a PolypeptideProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public PolypeptideProxy(Polypeptide dto) {
    super(dto); 
  }
}