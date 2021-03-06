/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractBsDto.vsl


package org.tair.bs.locusdetail;


import com.poesys.bs.delegate.DelegateException;
import com.poesys.bs.dto.IDto;
import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.dto.AbstractDto;


import org.tair.db.locusdetail.ILocusGermplasm;
import org.tair.db.locusdetail.LocusGermplasmProxy;
import org.tair.db.locusdetail.LocusGermplasm;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the LocusGermplasm. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
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
public abstract class AbstractBsLocusGermplasm 
    extends AbstractDto<org.tair.db.locusdetail.ILocusGermplasm> {

  /**
   * Create a BsLocusGermplasm object from a LocusGermplasm object.
   * 
   * @param dto the data-access layer LocusGermplasm DTO
   * @throws DelegateException when there is a problem creating the LocusGermplasm
   */
  public AbstractBsLocusGermplasm(ILocusGermplasm dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a LocusGermplasm from new data.
   *
   * @param key the primary key of the LocusGermplasm
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param polymorphismName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param germplasmName the name of the germplasm that contains the induced polymorphism
   * @param germplasmTairObjectId the TAIR object id for the germplasm, used for linking to the germplasm
   * @param phenotype a textual description of the phenotype that results from the induced mutation in
the ecotype
   */
  public AbstractBsLocusGermplasm(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.String germplasmName, java.lang.Long germplasmTairObjectId, java.lang.String phenotype) {
    super(new LocusGermplasmProxy(new LocusGermplasm(key, locusTairObjectId, polymorphismName, germplasmName, germplasmTairObjectId, phenotype)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<ILocusGermplasm> other = (IDto<ILocusGermplasm>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<ILocusGermplasm> o) {
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
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddInheritedKeyProperties + AddParentKeyAttributes as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGermplasm</li>
   * </ul>
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId() {
    return dto.getLocusTairObjectId();
  }

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddInheritedKeyProperties + AddParentKeyAttributes as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGermplasm</li>
   * </ul>
   * </p>
   * @return a java.lang.String polymorphismName
   */
  public java.lang.String getPolymorphismName() {
    return dto.getPolymorphismName();
  }

  /**
   * <p>
   * the name of the germplasm that contains the induced polymorphism
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGermplasm</li>
   * </ul>
   * </p>
   * @return a java.lang.String germplasmName
   */
  public java.lang.String getGermplasmName() {
    return dto.getGermplasmName();
  }

  /**
   * <p>
   * the TAIR object id for the germplasm, used for linking to the germplasm
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object LocusGermplasm</li>
   * </ul>
   * </p>
   * @return a java.lang.Long germplasmTairObjectId
   */
  public java.lang.Long getGermplasmTairObjectId() {
    return dto.getGermplasmTairObjectId();
  }

  /**
   * <p>
   * Set the germplasmTairObjectId.
   * </p>
   * <p>
   * the TAIR object id for the germplasm, used for linking to the germplasm
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object LocusGermplasm</li>
   * </ul>
   * </p>
   * @param germplasmTairObjectId the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter germplasmTairObjectId is null
   */
  public void setGermplasmTairObjectId(java.lang.Long germplasmTairObjectId) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setGermplasmTairObjectId(germplasmTairObjectId);
  }

  /**
   * <p>
   * a textual description of the phenotype that results from the induced mutation in
   * the ecotype
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object LocusGermplasm</li>
   * </ul>
   * </p>
   * @return a java.lang.String phenotype
   */
  public java.lang.String getPhenotype() {
    return dto.getPhenotype();
  }

  /**
   * <p>
   * Set the phenotype.
   * </p>
   * <p>
   * a textual description of the phenotype that results from the induced mutation in
   * the ecotype
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object LocusGermplasm</li>
   * </ul>
   * </p>
   * @param phenotype the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setPhenotype(java.lang.String phenotype) 
      throws com.poesys.db.dto.DtoStatusException {
    dto.setPhenotype(phenotype);
  }

  /**
   * 
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object LocusGermplasm</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsLocusInducedPolymorphism polymorphism
   */
  public org.tair.bs.locusdetail.BsLocusInducedPolymorphism getPolymorphism() {
    // Return 4
    return new org.tair.bs.locusdetail.BsLocusInducedPolymorphism(dto.getPolymorphism());
  }

  /**
   * <p>
   * Set the polymorphism.
   * </p>
   * 
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object LocusGermplasm</li>
   * </ul>
   * </p>
   * @param polymorphism the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter polymorphism is null
   */
  public void setPolymorphism(org.tair.bs.locusdetail.BsLocusInducedPolymorphism polymorphism) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setPolymorphism(polymorphism.toDto());
  }
}