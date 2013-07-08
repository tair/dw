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


import org.tair.db.locusdetail.ILocuslEst;
import org.tair.db.locusdetail.LocuslEstProxy;
import org.tair.db.locusdetail.LocuslEst;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the LocuslEst. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * An Expressed Sequence Tag (EST) clone end for a locus; a unique stretch of DNA
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
public abstract class AbstractBsLocuslEst 
    extends AbstractDto<org.tair.db.locusdetail.ILocuslEst> {

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsLocusEstAlias objects from a Collection aliases of data-access-layer 
   * org.tair.db.locusdetail.ILocusEstAlias objects
   */
  private class BsAliasesCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.locusdetail.ILocusEstAlias, org.tair.bs.locusdetail.BsLocusEstAlias> {
    @Override
    public org.tair.bs.locusdetail.BsLocusEstAlias get(org.tair.db.locusdetail.ILocusEstAlias dto) {
      return new org.tair.bs.locusdetail.BsLocusEstAlias(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of LocusEstAlias objects from an input Collection aliases of 
   * business-layer BsLocusEstAlias objects
   */
  private class AliasesCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.locusdetail.BsLocusEstAlias, org.tair.db.locusdetail.ILocusEstAlias> {
    @Override
    public org.tair.db.locusdetail.ILocusEstAlias get(org.tair.bs.locusdetail.BsLocusEstAlias dto) {
      return dto.toDto();
    }
  }

  /**
   * Create a BsLocuslEst object from a LocuslEst object.
   * 
   * @param dto the data-access layer LocuslEst DTO
   * @throws DelegateException when there is a problem creating the LocuslEst
   */
  public AbstractBsLocuslEst(ILocuslEst dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a LocuslEst from new data.
   *
   * @param key the primary key of the LocuslEst
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param cloneEndTairObjectId the unique TAIR identifier for the EST clone end
   * @param estName the EST clone end name
   * @param icAccession the unique identifier at any of the major international genomics data centers
for the EST clone end sequence
   * @param length the length of the cDNA sequence, unit is bp (base pairs)
   * @param start the starting position on the chromosome in unit bp (base pairs)
   * @param end the ending position on the chromosome in unit bp (base pairs)
   * @param cloneName the name of the clone from which the EST derives
   * @param cloneTairObjectId the unique identifier for the clone from which the EST derives
   */
  public AbstractBsLocuslEst(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.Long cloneEndTairObjectId, java.lang.String estName, java.lang.String icAccession, java.lang.Long length, java.lang.Long start, java.lang.Long end, java.lang.String cloneName, java.lang.Long cloneTairObjectId) {
    super(new LocuslEstProxy(new LocuslEst(key, locusTairObjectId, cloneEndTairObjectId, estName, icAccession, length, start, end, cloneName, cloneTairObjectId)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<ILocuslEst> other = (IDto<ILocuslEst>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<ILocuslEst> o) {
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
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocuslEst</li>
   * </ul>
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId() {
    return dto.getLocusTairObjectId();
  }

  /**
   * <p>
   * the unique TAIR identifier for the EST clone end
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocuslEst</li>
   * </ul>
   * </p>
   * @return a java.lang.Long cloneEndTairObjectId
   */
  public java.lang.Long getCloneEndTairObjectId() {
    return dto.getCloneEndTairObjectId();
  }

  /**
   * <p>
   * the EST clone end name
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocuslEst</li>
   * </ul>
   * </p>
   * @return a java.lang.String estName
   */
  public java.lang.String getEstName() {
    return dto.getEstName();
  }

  /**
   * <p>
   * the unique identifier at any of the major international genomics data centers
   * for the EST clone end sequence
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocuslEst</li>
   * </ul>
   * </p>
   * @return a java.lang.String icAccession
   */
  public java.lang.String getIcAccession() {
    return dto.getIcAccession();
  }

  /**
   * <p>
   * the length of the cDNA sequence, unit is bp (base pairs)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocuslEst</li>
   * </ul>
   * </p>
   * @return a java.lang.Long length
   */
  public java.lang.Long getLength() {
    return dto.getLength();
  }

  /**
   * <p>
   * the starting position on the chromosome in unit bp (base pairs)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocuslEst</li>
   * </ul>
   * </p>
   * @return a java.lang.Long start
   */
  public java.lang.Long getStart() {
    return dto.getStart();
  }

  /**
   * <p>
   * the ending position on the chromosome in unit bp (base pairs)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocuslEst</li>
   * </ul>
   * </p>
   * @return a java.lang.Long end
   */
  public java.lang.Long getEnd() {
    return dto.getEnd();
  }

  /**
   * <p>
   * the name of the clone from which the EST derives
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocuslEst</li>
   * </ul>
   * </p>
   * @return a java.lang.String cloneName
   */
  public java.lang.String getCloneName() {
    return dto.getCloneName();
  }

  /**
   * <p>
   * the unique identifier for the clone from which the EST derives
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocuslEst</li>
   * </ul>
   * </p>
   * @return a java.lang.Long cloneTairObjectId
   */
  public java.lang.Long getCloneTairObjectId() {
    return dto.getCloneTairObjectId();
  }

  /**
   * 
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocuslEst</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsLocusDetail locus
   */
  public org.tair.bs.locusdetail.BsLocusDetail getLocus() {
    // Return 4
    return new org.tair.bs.locusdetail.BsLocusDetail(dto.getLocus());
  }

  /**
   * <p>
   * the set of alternative names for the EST sequence
   * </p>
   * <p>
   * Added by AddToManyChildCollectionProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocuslEst</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsLocusEstAlias aliases
   */
  public java.util.Collection<org.tair.bs.locusdetail.BsLocusEstAlias> getAliases() {
    BsAliasesCollectionBuilder builder = new BsAliasesCollectionBuilder();
    return builder.getCollection(dto.getAliases());
  }
}