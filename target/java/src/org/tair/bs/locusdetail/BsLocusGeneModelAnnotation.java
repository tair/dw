/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusGeneModelAnnotation. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * The link between a gene model of a locus and an annotation; one annotation may
 * annotate several gene models, and one gene model may have several annotations.
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>AssociationKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsLocusGeneModelAnnotation extends org.tair.bs.locusdetail.AbstractBsLocusGeneModelAnnotation {
  /**
   * Create a BsLocusGeneModelAnnotation object from a LocusGeneModelAnnotation object.
   * 
   * @param dto the data-access layer LocusGeneModelAnnotation DTO
   * @throws DelegateException when there is a problem creating the LocusGeneModelAnnotation
   */
  public BsLocusGeneModelAnnotation(org.tair.db.locusdetail.ILocusGeneModelAnnotation dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusGeneModelAnnotation. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusGeneModelAnnotation
   * @param annotationsObject ${key.paramTag}
   * @param geneModelsObject ${key.paramTag}
   * @param category Attribute that is part of the association key
   * @param evidenceCode Attribute that is part of the association key
   * @param evidenceWith Attribute that is part of the association key
   * @param geneModelName Attribute that is part of the association key
   * @param keyword Attribute that is part of the association key
   * @param locusTairObjectId Attribute that is part of the association key
   * @param reference Attribute that is part of the association key
   * @param relationshipType Attribute that is part of the association key
   */
  public BsLocusGeneModelAnnotation(IPrimaryKey key, org.tair.db.locusdetail.IAnnotation annotationsObject, org.tair.db.locusdetail.ILocusGeneModel geneModelsObject, java.lang.String category, java.lang.String evidenceCode, java.lang.String evidenceWith, java.lang.String geneModelName, java.lang.String keyword, java.lang.Long locusTairObjectId, java.lang.String reference, java.lang.String relationshipType) {
    super(key, annotationsObject, geneModelsObject, category, evidenceCode, evidenceWith, geneModelName, keyword, locusTairObjectId, reference, relationshipType); 
  }
}