/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.locusdetail;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * LocuslEst. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * An Expressed Sequence Tag (EST) clone end for a locus; a unique stretch of DNA
 * within a coding region that identifies a full-length gene and serves as a
 * landmark for mapping to a chromosome; an EST is a sequence tagged site (STS)
 * derived from cDNA.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class LocuslEstProxy extends AbstractLocuslEstProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocuslEstProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public LocuslEstProxy(LocuslEst dto) {
    super(dto); 
  }
}