/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: IDbDto.vsl

package org.tair.db.locusdetail;

import com.poesys.db.dto.IDbDto;

import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer-object interface for the LocusGeneModelEstAlias. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * Another name for the EST for a locus gene model
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: false
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public interface ILocusGeneModelEstAlias extends IDbDto {

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
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddParentKeyAttributes + AddParentKeyAttributes
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: geneModelName
   * </p>
   * @return a java.lang.String geneModelName
   */
  public java.lang.String getGeneModelName();

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddParentKeyAttributes + AddParentKeyAttributes
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: locusTairObjectId
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId();

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddParentKeyAttributes
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: sequenceId
   * </p>
   * @return a java.lang.Long sequenceId
   */
  public java.lang.Long getSequenceId();

  /**
   * <p>
   * the alias for the cDNA sequence
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: alias
   * </p>
   * @return a java.lang.String alias
   */
  public java.lang.String getAlias();

  /**
   * <p>
   * the EST to which the alias refers
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: LocusGeneModelEst
   * Owning package: org.tair.db.locusdetail
   * Property prefix: est
   * </p>
   * @return a org.tair.db.locusdetail.ILocusGeneModelEst est
   */
  public org.tair.db.locusdetail.ILocusGeneModelEst getEst();
}