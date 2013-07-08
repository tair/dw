/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.genomicregion;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * Gene. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * SO_0000704: A region (or regions) that includes all of the sequence elements
 * necessary to encode a functional transcript. A gene may include regulatory
 * regions, transcribed regions and/or other functional sequence regions.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class GeneProxy extends AbstractGeneProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a GeneProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public GeneProxy(Gene dto) {
    super(dto); 
  }
}