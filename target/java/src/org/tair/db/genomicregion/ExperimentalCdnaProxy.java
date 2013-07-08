/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.genomicregion;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * ExperimentalCdna. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * SO_0000756: DNA synthesized by reverse transcriptase using RNA as a template,
 * produced by in vivo experimentation; based on clone
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class ExperimentalCdnaProxy extends AbstractExperimentalCdnaProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a ExperimentalCdnaProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public ExperimentalCdnaProxy(ExperimentalCdna dto) {
    super(dto); 
  }
}