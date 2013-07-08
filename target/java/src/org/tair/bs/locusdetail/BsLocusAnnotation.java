/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusAnnotation. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * The link between a locus and an annotation; one annotation can annotate multiple
 * loci, and one locus may have multiple annotations
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
public class BsLocusAnnotation extends org.tair.bs.locusdetail.AbstractBsLocusAnnotation {
  /**
   * Create a BsLocusAnnotation object from a LocusAnnotation object.
   * 
   * @param dto the data-access layer LocusAnnotation DTO
   * @throws DelegateException when there is a problem creating the LocusAnnotation
   */
  public BsLocusAnnotation(org.tair.db.locusdetail.ILocusAnnotation dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusAnnotation. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusAnnotation
   * @param annotationsObject ${key.paramTag}
   * @param lociObject ${key.paramTag}
   * @param category Attribute that is part of the association key
   * @param evidenceCode Attribute that is part of the association key
   * @param evidenceWith Attribute that is part of the association key
   * @param keyword Attribute that is part of the association key
   * @param locusTairObjectId Attribute that is part of the association key
   * @param reference Attribute that is part of the association key
   * @param relationshipType Attribute that is part of the association key
   */
  public BsLocusAnnotation(IPrimaryKey key, org.tair.db.locusdetail.IAnnotation annotationsObject, org.tair.db.locusdetail.ILocusDetail lociObject, java.lang.String category, java.lang.String evidenceCode, java.lang.String evidenceWith, java.lang.String keyword, java.lang.Long locusTairObjectId, java.lang.String reference, java.lang.String relationshipType) {
    super(key, annotationsObject, lociObject, category, evidenceCode, evidenceWith, keyword, locusTairObjectId, reference, relationshipType); 
  }
}