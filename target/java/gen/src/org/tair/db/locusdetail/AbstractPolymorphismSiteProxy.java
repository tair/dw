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
 * PolymorphismSite. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * The site on a specific gene model for a locus on which a polymorphism within the
 * locus appears
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractPolymorphismSiteProxy extends AbstractLazyLoadingDtoProxy implements IPolymorphismSite {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  // Lazy-loading query setter strategy nested classes for single-object associations
  
  /**
   * Create a PolymorphismSiteProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractPolymorphismSiteProxy(PolymorphismSite dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
  }

  @Override
  public boolean equals(Object obj) {
    AbstractPolymorphismSiteProxy otherProxy = (AbstractPolymorphismSiteProxy)obj;
    return ((PolymorphismSite)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((PolymorphismSite)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  // Source: AddLocalAttributeProperties
  public java.lang.String getSite() {
    return ((PolymorphismSite)dto).getSite();
  }

  public void setSite(java.lang.String site)
      throws com.poesys.db.InvalidParametersException {
    ((PolymorphismSite)dto).setSite(site);
  }

  // Source: AddAssociationKeyObjectProperties
  public org.tair.db.locusdetail.ILocusGeneModel getLociLocus() {
    return ((PolymorphismSite)dto).getLociLocus();
  }

  // Source: AddAssociationKeyObjectProperties
  public org.tair.db.locusdetail.ILocusPolymorphism getPolymorphism() {
    return ((PolymorphismSite)dto).getPolymorphism();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddAssociationKeyAttributeProperties
  public java.lang.String getGeneModelName() {
    return ((PolymorphismSite)dto).getGeneModelName();
  }

  // Source: AddNaturalKeyProperties + AddParentKeyAttributes + AddAssociationKeyAttributeProperties
  public java.lang.Long getLociLocusTairObjectId() {
    return ((PolymorphismSite)dto).getLociLocusTairObjectId();
  }

  // Source: AddNaturalKeyProperties + AddParentKeyAttributes + AddAssociationKeyAttributeProperties
  public java.lang.Long getPolymorphismsLocusTairObjectId() {
    return ((PolymorphismSite)dto).getPolymorphismsLocusTairObjectId();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddAssociationKeyAttributeProperties
  public java.lang.String getPolymorphismName() {
    return ((PolymorphismSite)dto).getPolymorphismName();
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((PolymorphismSite)dto).markChildrenDeleted();
  }
}