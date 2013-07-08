/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.locusdetail;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * LocusGeneModelAnnotation. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * The link between a gene model of a locus and an annotation; one annotation may
 * annotate several gene models, and one gene model may have several annotations.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class LocusGeneModelAnnotationProxy extends AbstractLocusGeneModelAnnotationProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusGeneModelAnnotationProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public LocusGeneModelAnnotationProxy(LocusGeneModelAnnotation dto) {
    super(dto); 
  }
}