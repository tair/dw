/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDtoProxy.vsl

package org.tair.db.locusdetail;


import com.poesys.db.dto.AbstractLazyLoadingDtoProxy;


/**
 * <p>
 * A data-access layer data-transfer object (DTO) lazy-loading proxy for the 
 * LocusPhysicalMapCoordinates. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * The map coordinates for the parent locus on a chromosome
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractLocusPhysicalMapCoordinatesProxy extends AbstractLazyLoadingDtoProxy implements ILocusPhysicalMapCoordinates {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  // Lazy-loading query setter strategy nested classes for single-object associations
  
  /**
   * Create a LocusPhysicalMapCoordinatesProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractLocusPhysicalMapCoordinatesProxy(LocusPhysicalMapCoordinates dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
  }

  @Override
  public boolean equals(Object obj) {
    AbstractLocusPhysicalMapCoordinatesProxy otherProxy = (AbstractLocusPhysicalMapCoordinatesProxy)obj;
    return ((LocusPhysicalMapCoordinates)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((LocusPhysicalMapCoordinates)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  // Source: AddNaturalKeyProperties + AddParentKeyAttributes
  public java.lang.Long getLocusTairObjectId() {
    return ((LocusPhysicalMapCoordinates)dto).getLocusTairObjectId();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
  public java.lang.Long getMapId() {
    return ((LocusPhysicalMapCoordinates)dto).getMapId();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getMapName() {
    return ((LocusPhysicalMapCoordinates)dto).getMapName();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getMapType() {
    return ((LocusPhysicalMapCoordinates)dto).getMapType();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getChromosome() {
    return ((LocusPhysicalMapCoordinates)dto).getChromosome();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Double getStartPosition() {
    return ((LocusPhysicalMapCoordinates)dto).getStartPosition();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Double getEndPosition() {
    return ((LocusPhysicalMapCoordinates)dto).getEndPosition();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getUnits() {
    return ((LocusPhysicalMapCoordinates)dto).getUnits();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getOrientation() {
    return ((LocusPhysicalMapCoordinates)dto).getOrientation();
  }

  // Source: AddToOneAssociationRequiredObjectProperties
  public org.tair.db.locusdetail.ILocusDetail getLocus() {
    return ((LocusPhysicalMapCoordinates)dto).getLocus();
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((LocusPhysicalMapCoordinates)dto).markChildrenDeleted();
  }
}