/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.locusdetail;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * LocusInducedPolymorphism. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * A lab-created, non-natural mutation; for example, T-DNA, transposon, and
 * chemically-generated polymorphisms are considered induced. Induced polymorphisms
 * are differences within a single ecotype, whereas natural variation polymorphisms
 * differ between ecotypes.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class LocusInducedPolymorphismProxy extends AbstractLocusInducedPolymorphismProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusInducedPolymorphismProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public LocusInducedPolymorphismProxy(LocusInducedPolymorphism dto) {
    super(dto); 
  }
}