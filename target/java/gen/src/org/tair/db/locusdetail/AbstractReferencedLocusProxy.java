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
 * ReferencedLocus. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A locus to which the reference refers; this object lists all the loci to which a
 * reference refers, excluding the parent locus; this is separate from LocusDetail
 * to permit query optimization and lazy loading of the loci
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractReferencedLocusProxy extends AbstractLazyLoadingDtoProxy implements IReferencedLocus {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  // Lazy-loading query setter strategy nested classes for single-object associations
  
  /**
   * Create a ReferencedLocusProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractReferencedLocusProxy(ReferencedLocus dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
  }

  @Override
  public boolean equals(Object obj) {
    AbstractReferencedLocusProxy otherProxy = (AbstractReferencedLocusProxy)obj;
    return ((ReferencedLocus)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((ReferencedLocus)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  // Source: AddNaturalKeyProperties + AddParentKeyAttributes + AddParentKeyAttributes
  public java.lang.Long getLocusTairObjectId() {
    return ((ReferencedLocus)dto).getLocusTairObjectId();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddParentKeyAttributes
  public java.lang.Long getReferenceTairObjectId() {
    return ((ReferencedLocus)dto).getReferenceTairObjectId();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
  public java.lang.String getRefLocusame() {
    return ((ReferencedLocus)dto).getRefLocusame();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Long getRefLocusTairObjectId() {
    return ((ReferencedLocus)dto).getRefLocusTairObjectId();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getPrimarySymbol() {
    return ((ReferencedLocus)dto).getPrimarySymbol();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getPrimarySymbolFullName() {
    return ((ReferencedLocus)dto).getPrimarySymbolFullName();
  }

  // Source: AddToOneAssociationRequiredObjectProperties
  public org.tair.db.locusdetail.IReference getReference() {
    return ((ReferencedLocus)dto).getReference();
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((ReferencedLocus)dto).markChildrenDeleted();
  }
}