/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractBsDto.vsl


package org.tair.bs.genomicregion;


import com.poesys.bs.delegate.DelegateException;
import com.poesys.bs.dto.IDto;
import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.dto.AbstractDto;


import org.tair.db.genomicregion.IRegion;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the Region. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * SO_0000001: A sequence_feature with an extent greater than zero. A nucleotide
 * region is composed of bases and a polypeptide region is composed of amino acids.
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>NaturalKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractBsRegion 
    extends AbstractDto<org.tair.db.genomicregion.IRegion> {

  /**
   * Create a BsRegion object from a Region object.
   * 
   * @param dto the data-access layer Region DTO
   * @throws DelegateException when there is a problem creating the Region
   */
  public AbstractBsRegion(IRegion dto) throws DelegateException {
    super(dto);
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IRegion> other = (IDto<IRegion>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IRegion> o) {
    return dto.compareTo(o.toDto());
  }

  public void markChildrenDeleted() throws DtoStatusException {
    dto.markChildrenDeleted();
  }
  
  public IPrimaryKey getPrimaryKey() {
    return dto.getPrimaryKey();
  }

  // Data member properties

  /**
   * <p>
   * the unique identifier in the TAIR database for the region (locus, gene,
   * chromosome, contig)
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Region</li>
   * </ul>
   * </p>
   * @return a java.lang.Long tairObjectId
   */
  public java.lang.Long getTairObjectId() {
    return dto.getTairObjectId();
  }

  /**
   * <p>
   * the name of the genomic region, such as the chromosome name (1, M), the
   * locus/gene name (AT1G01010), the transcript name (AT1G01010.1), or the contig
   * name (MI421-MI421); may or may not be unique within a genome
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Region</li>
   * </ul>
   * </p>
   * @return a java.lang.String name
   */
  public java.lang.String getName() {
    return dto.getName();
  }

  /**
   * <p>
   * Set the name.
   * </p>
   * <p>
   * the name of the genomic region, such as the chromosome name (1, M), the
   * locus/gene name (AT1G01010), the transcript name (AT1G01010.1), or the contig
   * name (MI421-MI421); may or may not be unique within a genome
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Region</li>
   * </ul>
   * </p>
   * @param name the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter name is null
   */
  public void setName(java.lang.String name) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setName(name);
  }

  /**
   * <p>
   * the date on which the region was created in the source database
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Region</li>
   * </ul>
   * </p>
   * @return a java.sql.Timestamp dateEntered
   */
  public java.sql.Timestamp getDateEntered() {
    return dto.getDateEntered();
  }

  /**
   * <p>
   * Set the dateEntered.
   * </p>
   * <p>
   * the date on which the region was created in the source database
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Region</li>
   * </ul>
   * </p>
   * @param dateEntered the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter dateEntered is null
   */
  public void setDateEntered(java.sql.Timestamp dateEntered) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setDateEntered(dateEntered);
  }

  /**
   * 
   * <p>
   * Added by AddToOneAssociationOptionalObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Region</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.genomicregion.BsRegion parent
   */
  public org.tair.bs.genomicregion.BsRegion getParent() {
    org.tair.bs.genomicregion.BsRegion bsObject = null;
    org.tair.db.genomicregion.IRegion object = dto.getParent();
	if (object != null) {
	  bsObject = new org.tair.bs.genomicregion.BsRegion(object);
	}
	return bsObject;
  }

  /**
   * <p>
   * Set the parent.
   * </p>
   * 
   * <p>
   * Added by AddToOneAssociationOptionalObjectProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Region</li>
   * </ul>
   * </p>
   * @param parent the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setParent(org.tair.bs.genomicregion.BsRegion parent) 
      throws com.poesys.db.dto.DtoStatusException {
    dto.setParent(parent.toDto());
  }

  /**
   * 
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Region</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.genomicregion.BsReferenceGenome referenceGenome
   */
  public org.tair.bs.genomicregion.BsReferenceGenome getReferenceGenome() {
    // Return 4
    return new org.tair.bs.genomicregion.BsReferenceGenome(dto.getReferenceGenome());
  }

  /**
   * <p>
   * Set the referenceGenome.
   * </p>
   * 
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Region</li>
   * </ul>
   * </p>
   * @param referenceGenome the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter referenceGenome is null
   */
  public void setReferenceGenome(org.tair.bs.genomicregion.BsReferenceGenome referenceGenome) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setReferenceGenome(referenceGenome.toDto());
  }

  /**
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddToOneAssociationAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Region</li>
   * </ul>
   * </p>
   * @return a java.lang.Long parentRegionTairObjectId
   */
  public java.lang.Long getParentRegionTairObjectId() {
    return dto.getParentRegionTairObjectId();
  }

  /**
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddToOneAssociationAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Region</li>
   * </ul>
   * </p>
   * @return a java.lang.String genome
   */
  public java.lang.String getGenome() {
    return dto.getGenome();
  }
}