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
 * A data-access layer data-transfer-object interface for the LocusGermplasm. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * A germplasm that contains the induced polymorphism yielding an optional
 * phenotype
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public interface ILocusGermplasm extends IDbDto {

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
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddInheritedKeyProperties + AddParentKeyAttributes
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: locusTairObjectId
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddInheritedKeyProperties + AddParentKeyAttributes
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: polymorphismName
   * </p>
   * @return a java.lang.String polymorphismName
   */
  public java.lang.String getPolymorphismName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the name of the germplasm that contains the induced polymorphism
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: germplasmName
   * </p>
   * @return a java.lang.String germplasmName
   */
  public java.lang.String getGermplasmName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the TAIR object id for the germplasm, used for linking to the germplasm
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: germplasmTairObjectId
   * </p>
   * @return a java.lang.Long germplasmTairObjectId
   */
  public java.lang.Long getGermplasmTairObjectId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the germplasmTairObjectId.
   * </p>
   *
   * @param germplasmTairObjectId the value to set into the germplasmTairObjectId
   * @throws com.poesys.db.InvalidParametersException when the germplasmTairObjectId 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setGermplasmTairObjectId(java.lang.Long germplasmTairObjectId) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * a textual description of the phenotype that results from the induced mutation in
   * the ecotype
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: phenotype
   * </p>
   * @return a java.lang.String phenotype
   */
  public java.lang.String getPhenotype();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the phenotype.
   * </p>
   *
   * @param phenotype the value to set into the phenotype
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setPhenotype(java.lang.String phenotype) throws com.poesys.db.dto.DtoStatusException;


  /**
   * 
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: LocusInducedPolymorphism
   * Owning package: org.tair.db.locusdetail
   * Property prefix: polymorphism
   * </p>
   * @return a org.tair.db.locusdetail.ILocusInducedPolymorphism polymorphism
   */
  public org.tair.db.locusdetail.ILocusInducedPolymorphism getPolymorphism();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the polymorphism.
   * </p>
   *
   * @param polymorphism the value to set into the polymorphism
   * @throws com.poesys.db.InvalidParametersException when the polymorphism 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setPolymorphism(org.tair.db.locusdetail.ILocusInducedPolymorphism polymorphism) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;

}