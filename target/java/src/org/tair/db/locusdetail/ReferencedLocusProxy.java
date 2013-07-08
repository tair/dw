/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.locusdetail;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * ReferencedLocus. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * A locus to which the reference refers; this object lists all the loci to which a
 * reference refers, excluding the parent locus; this is separate from LocusDetail
 * to permit query optimization and lazy loading of the loci
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class ReferencedLocusProxy extends AbstractReferencedLocusProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a ReferencedLocusProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public ReferencedLocusProxy(ReferencedLocus dto) {
    super(dto); 
  }
}