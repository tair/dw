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
 * A data-access layer data-transfer-object interface for the LocusGeneModelEst. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * An Expressed Sequence Tag (EST) for a locus gene model; a unique stretch of DNA
 * within a coding region that identifies a full-length gene and serves as a
 * landmark for mapping to a chromosome; an EST is a sequence tagged site (STS)
 * derived from cDNA.
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
public interface ILocusGeneModelEst extends IDbDto {

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
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddParentKeyAttributes
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
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddParentKeyAttributes
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: locusTairObjectId
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId();

  /**
   * <p>
   * the unique identifier for the cDNA
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: sequenceId
   * </p>
   * @return a java.lang.Long sequenceId
   */
  public java.lang.Long getSequenceId();

  /**
   * <p>
   * the sequence name
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: sequenceName
   * </p>
   * @return a java.lang.String sequenceName
   */
  public java.lang.String getSequenceName();

  /**
   * <p>
   * the unique identifier at GenBank for the cDNA sequence
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: genbankAccession
   * </p>
   * @return a java.lang.String genbankAccession
   */
  public java.lang.String getGenbankAccession();

  /**
   * <p>
   * the length of the cDNA sequence, unit is bp (base pairs)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: length
   * </p>
   * @return a java.lang.Long length
   */
  public java.lang.Long getLength();

  /**
   * <p>
   * the starting position on the chromosome in unit bp (base pairs)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: start
   * </p>
   * @return a java.lang.Long start
   */
  public java.lang.Long getStart();

  /**
   * <p>
   * the ending position on the chromosome in unit bp (base pairs)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: end
   * </p>
   * @return a java.lang.Long end
   */
  public java.lang.Long getEnd();

  /**
   * <p>
   * the name of the clone from which the EST derives
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: cloneName
   * </p>
   * @return a java.lang.String cloneName
   */
  public java.lang.String getCloneName();

  /**
   * <p>
   * the unique identifying stock name for the sequence
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: cloneStockNumber
   * </p>
   * @return a java.lang.String cloneStockNumber
   */
  public java.lang.String getCloneStockNumber();

  /**
   * <p>
   * the unique identifier for the clone from which the EST derives
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: cloneId
   * </p>
   * @return a java.lang.Long cloneId
   */
  public java.lang.Long getCloneId();

  /**
   * <p>
   * the stock ordering status according to ABRC:
   * </p>
   * <p>
   * available
   * </p>
   * <p>
   * not_available
   * </p>
   * <p>
   * not_yet_received
   * </p>
   * <p>
   * no_longer_distributed
   * </p>
   * <p>
   * not_distributed
   * </p>
   * <p>
   * available_soon
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: orderingStatus
   * </p>
   * @return a java.lang.String orderingStatus
   */
  public java.lang.String getOrderingStatus();

  /**
   * <p>
   * the gene model to which the EST belongs
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: LocusGeneModel
   * Owning package: org.tair.db.locusdetail
   * Property prefix: geneModel
   * </p>
   * @return a org.tair.db.locusdetail.ILocusGeneModel geneModel
   */
  public org.tair.db.locusdetail.ILocusGeneModel getGeneModel();

  /**
   * <p>
   * the set of alternative names for the EST sequence
   * </p>
   * <p>
   * Added by AddToManyChildCollectionProperties
   * Owning DTO: LocusGeneModelEstAlias
   * Owning package: org.tair.db.locusdetail
   * Property prefix: aliases
   * </p>
   * @return a java.util.Collection<org.tair.db.locusdetail.ILocusGeneModelEstAlias> aliases
   */
  public java.util.Collection<org.tair.db.locusdetail.ILocusGeneModelEstAlias> getAliases();
}