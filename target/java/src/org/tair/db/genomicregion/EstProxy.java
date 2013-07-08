/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.genomicregion;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * Est. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * An Expressed Sequence Tag (EST); SO_0000345: A tag produced from a single
 * sequencing read from a cDNA clone or PCR product; typically a few hundred base
 * pairs long. In TAIR, this is a nucleotide sequence associated with a clone end
 * associated with a transcript.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class EstProxy extends AbstractEstProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a EstProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public EstProxy(Est dto) {
    super(dto); 
  }
}