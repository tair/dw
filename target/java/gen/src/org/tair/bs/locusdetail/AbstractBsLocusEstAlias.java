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


import org.tair.db.locusdetail.ILocusEstAlias;
import org.tair.db.locusdetail.LocusEstAliasProxy;
import org.tair.db.locusdetail.LocusEstAlias;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the LocusEstAlias. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * Another name for the EST for a locus
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
public abstract class AbstractBsLocusEstAlias 
    extends AbstractDto<org.tair.db.locusdetail.ILocusEstAlias> {

  /**
   * Create a BsLocusEstAlias object from a LocusEstAlias object.
   * 
   * @param dto the data-access layer LocusEstAlias DTO
   * @throws DelegateException when there is a problem creating the LocusEstAlias
   */
  public AbstractBsLocusEstAlias(ILocusEstAlias dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a LocusEstAlias from new data.
   *
   * @param key the primary key of the LocusEstAlias
   * @param cloneEndTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param alias the alias for the EST sequence
   */
  public AbstractBsLocusEstAlias(IPrimaryKey key, java.lang.Long cloneEndTairObjectId, java.lang.Long locusTairObjectId, java.lang.String alias) {
    super(new LocusEstAliasProxy(new LocusEstAlias(key, cloneEndTairObjectId, locusTairObjectId, alias)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<ILocusEstAlias> other = (IDto<ILocusEstAlias>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<ILocusEstAlias> o) {
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
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddParentKeyAttributes as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusEstAlias</li>
   * </ul>
   * </p>
   * @return a java.lang.Long cloneEndTairObjectId
   */
  public java.lang.Long getCloneEndTairObjectId() {
    return dto.getCloneEndTairObjectId();
  }

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddParentKeyAttributes as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusEstAlias</li>
   * </ul>
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId() {
    return dto.getLocusTairObjectId();
  }

  /**
   * <p>
   * the alias for the EST sequence
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusEstAlias</li>
   * </ul>
   * </p>
   * @return a java.lang.String alias
   */
  public java.lang.String getAlias() {
    return dto.getAlias();
  }

  /**
   * <p>
   * the EST to which the alias refers
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusEstAlias</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsLocuslEst est
   */
  public org.tair.bs.locusdetail.BsLocuslEst getEst() {
    // Return 4
    return new org.tair.bs.locusdetail.BsLocuslEst(dto.getEst());
  }
}