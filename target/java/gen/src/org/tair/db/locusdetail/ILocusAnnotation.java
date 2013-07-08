/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: IDbDto.vsl

package org.tair.db.locusdetail;

import com.poesys.db.dto.IDbDto;

import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer-object interface for the LocusAnnotation. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
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
 * <p>
 * Class is read/write: false
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public interface ILocusAnnotation extends IDbDto {

  boolean equals(Object arg0);

  int hashCode();

  /**
   * <p>
   * Mark any children of this DTO as deleted.
   * </p>
   *
   * @throws DtoStatusException when the child cannot be set to DELETED status
   */
  void markChildrenDeleted() throws DtoStatusException;

  IPrimaryKey getPrimaryKey();
  

  /**
   * <p>
   * Associated object
   * </p>
   * <p>
   * Added by AddAssociationKeyObjectProperties
   * Owning DTO: Annotation
   * Owning package: org.tair.db.locusdetail
   * Property prefix: annotations
   * </p>
   * @return a org.tair.db.locusdetail.IAnnotation annotation
   */
  public org.tair.db.locusdetail.IAnnotation getAnnotation();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not true
// Read/Write property: false

  /**
   * <p>
   * Associated object
   * </p>
   * <p>
   * Added by AddAssociationKeyObjectProperties
   * Owning DTO: LocusDetail
   * Owning package: org.tair.db.locusdetail
   * Property prefix: loci
   * </p>
   * @return a org.tair.db.locusdetail.ILocusDetail locus
   */
  public org.tair.db.locusdetail.ILocusDetail getLocus();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not true
// Read/Write property: false

  /**
   * <p>
   * Attribute that is part of the association key
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
   * Owning DTO: Annotation
   * Owning package: org.tair.db.locusdetail
   * Property prefix: annotations
   * </p>
   * @return a java.lang.String category
   */
  public java.lang.String getCategory();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Attribute that is part of the association key
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
   * Owning DTO: Annotation
   * Owning package: org.tair.db.locusdetail
   * Property prefix: annotations
   * </p>
   * @return a java.lang.String evidenceCode
   */
  public java.lang.String getEvidenceCode();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Attribute that is part of the association key
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
   * Owning DTO: Annotation
   * Owning package: org.tair.db.locusdetail
   * Property prefix: annotations
   * </p>
   * @return a java.lang.String evidenceWith
   */
  public java.lang.String getEvidenceWith();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Attribute that is part of the association key
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
   * Owning DTO: Annotation
   * Owning package: org.tair.db.locusdetail
   * Property prefix: annotations
   * </p>
   * @return a java.lang.String keyword
   */
  public java.lang.String getKeyword();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Attribute that is part of the association key
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
   * Owning DTO: LocusDetail
   * Owning package: org.tair.db.locusdetail
   * Property prefix: loci
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Attribute that is part of the association key
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
   * Owning DTO: Annotation
   * Owning package: org.tair.db.locusdetail
   * Property prefix: annotations
   * </p>
   * @return a java.lang.String reference
   */
  public java.lang.String getReference();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Attribute that is part of the association key
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
   * Owning DTO: Annotation
   * Owning package: org.tair.db.locusdetail
   * Property prefix: annotations
   * </p>
   * @return a java.lang.String relationshipType
   */
  public java.lang.String getRelationshipType();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false
}