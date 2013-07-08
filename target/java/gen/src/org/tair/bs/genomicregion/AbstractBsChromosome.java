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


import org.tair.db.genomicregion.IChromosome;
import org.tair.db.genomicregion.ChromosomeProxy;
import org.tair.db.genomicregion.Chromosome;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the Chromosome. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * SO_0000340: Structural unit composed of a nucleic acid molecule which controls
 * its own replication through the interaction of specific proteins at one or more
 * origins of replication.
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractBsChromosome 
    extends AbstractDto<org.tair.db.genomicregion.IChromosome> {

  /**
   * Create a BsChromosome object from a Chromosome object.
   * 
   * @param dto the data-access layer Chromosome DTO
   * @throws DelegateException when there is a problem creating the Chromosome
   */
  public AbstractBsChromosome(IChromosome dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a Chromosome from new data.
   *
   * @param key the primary key of the Chromosome
   * @param tairObjectId the unique identifier in the TAIR database for the region (locus, gene,
chromosome, contig)
   * @param name the name of the genomic region, such as the chromosome name (1, M), the
locus/gene name (AT1G01010), the transcript name (AT1G01010.1), or the contig
name (MI421-MI421); may or may not be unique within a genome
   * @param dateEntered the date on which the region was created in the source database
   * @param parentRegionTairObjectId foreign key used by setter to query associated object
   * @param genome foreign key used by setter to query associated object
   * @param sequence the complete DNA sequence for the chromosome
   */
  public AbstractBsChromosome(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.String name, java.sql.Timestamp dateEntered, java.lang.Long parentRegionTairObjectId, java.lang.String genome, java.lang.String sequence) {
    super(new ChromosomeProxy(new Chromosome(key, tairObjectId, name, dateEntered, parentRegionTairObjectId, genome, sequence)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IChromosome> other = (IDto<IChromosome>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IChromosome> o) {
    return dto.compareTo(o.toDto());
  }

  public void markChildrenDeleted() throws DtoStatusException {
    dto.markChildrenDeleted();
  }
  
  public IPrimaryKey getPrimaryKey() {
    return dto.getPrimaryKey();
  }

  // Inherited properties

  /**
   * <p>
   * the unique identifier in the TAIR database for the region (locus, gene,
   * chromosome, contig)
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddInheritedKeyProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a java.lang.Long tairObjectId
   */

  public java.lang.Long getTairObjectId() {
    return dto.getTairObjectId();
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * 
   * <p>
   * Added by addAssociationObjects + AddInheritedAssociationObjectProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a org.tair.db.genomicregion.IRegion parent
   */
  public org.tair.bs.genomicregion.BsRegion getParent() {
    org.tair.bs.genomicregion.BsRegion bsObject = null;
    org.tair.db.genomicregion.IRegion object = dto.getParent();
	if (object != null) {
	  bsObject = new org.tair.bs.genomicregion.BsRegion(object);
	}
	return bsObject;
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the parent.
   * </p>
   * 
   * <p>
   * Added by addAssociationObjects + AddInheritedAssociationObjectProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @param parent the value to set into the object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setParent(org.tair.bs.genomicregion.BsRegion parent) 
      throws com.poesys.db.dto.DtoStatusException{
    dto.setParent(parent.toDto());
  }

  /**
   * 
   * <p>
   * Added by addAssociationObjects + AddInheritedAssociationObjectProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a org.tair.db.genomicregion.IReferenceGenome referenceGenome
   */
  public org.tair.bs.genomicregion.BsReferenceGenome getReferenceGenome() {
    // Return 2
    return new org.tair.bs.genomicregion.BsReferenceGenome(dto.getReferenceGenome());
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the referenceGenome.
   * </p>
   * 
   * <p>
   * Added by addAssociationObjects + AddInheritedAssociationObjectProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @param referenceGenome the value to set into the object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter referenceGenome is null
   */
  public void setReferenceGenome(org.tair.bs.genomicregion.BsReferenceGenome referenceGenome) 
      throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException {
    dto.setReferenceGenome(referenceGenome.toDto());
  }

  /**
   * <p>
   * the name of the genomic region, such as the chromosome name (1, M), the
   * locus/gene name (AT1G01010), the transcript name (AT1G01010.1), or the contig
   * name (MI421-MI421); may or may not be unique within a genome
   * </p>
   * <p>
   * Added by TransformToProperty + AddInheritedAttributeProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a java.lang.String name
   */

  public java.lang.String getName() {
    return dto.getName();
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

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
   * Added by TransformToProperty + AddInheritedAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @param name the value to set into the object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter name is null
   */
  public void setName(java.lang.String name) 
      throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException {
    dto.setName(name);
  }

  /**
   * <p>
   * the date on which the region was created in the source database
   * </p>
   * <p>
   * Added by TransformToProperty + AddInheritedAttributeProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a java.sql.Timestamp dateEntered
   */

  public java.sql.Timestamp getDateEntered() {
    return dto.getDateEntered();
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the dateEntered.
   * </p>
   * <p>
   * the date on which the region was created in the source database
   * </p>
   * <p>
   * Added by TransformToProperty + AddInheritedAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @param dateEntered the value to set into the object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter dateEntered is null
   */
  public void setDateEntered(java.sql.Timestamp dateEntered) 
      throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException {
    dto.setDateEntered(dateEntered);
  }

  /**
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddInheritedAssociationAttributeProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a java.lang.Long parentRegionTairObjectId
   */

  public java.lang.Long getParentRegionTairObjectId() {
    return dto.getParentRegionTairObjectId();
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddInheritedAssociationAttributeProperties through inheritance
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is inherited from a superclass</li>
   * </ul>
   * </p>
   * @return a java.lang.String genome
   */

  public java.lang.String getGenome() {
    return dto.getGenome();
  }
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  // Data member properties

  /**
   * <p>
   * the complete DNA sequence for the chromosome
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Chromosome</li>
   * </ul>
   * </p>
   * @return a java.lang.String sequence
   */
  public java.lang.String getSequence() {
    return dto.getSequence();
  }

  /**
   * <p>
   * Set the sequence.
   * </p>
   * <p>
   * the complete DNA sequence for the chromosome
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Chromosome</li>
   * </ul>
   * </p>
   * @param sequence the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setSequence(java.lang.String sequence) 
      throws com.poesys.db.dto.DtoStatusException {
    dto.setSequence(sequence);
  }
}