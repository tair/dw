/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusAnnotation. This class
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
public class LocusAnnotation extends AbstractLocusAnnotation {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusAnnotation as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public LocusAnnotation() {
    super(); 
  }

  /**
   * <p>
   * Create a LocusAnnotation. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusAnnotation
   * @param annotationsObject wraps an associated IAnnotation object
   * @param lociObject wraps an associated ILocusDetail object
   * @param category Attribute that is part of the association key
   * @param evidenceCode Attribute that is part of the association key
   * @param evidenceWith Attribute that is part of the association key
   * @param keyword Attribute that is part of the association key
   * @param locusTairObjectId Attribute that is part of the association key
   * @param reference Attribute that is part of the association key
   * @param relationshipType Attribute that is part of the association key
   */
  public LocusAnnotation(IPrimaryKey key, org.tair.db.locusdetail.IAnnotation annotationsObject, org.tair.db.locusdetail.ILocusDetail lociObject, java.lang.String category, java.lang.String evidenceCode, java.lang.String evidenceWith, java.lang.String keyword, java.lang.Long locusTairObjectId, java.lang.String reference, java.lang.String relationshipType) {
    super(key, annotationsObject, lociObject, category, evidenceCode, evidenceWith, keyword, locusTairObjectId, reference, relationshipType); 
  }
}