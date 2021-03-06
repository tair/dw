/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDtoProxy.vsl

package org.tair.db.genomicregion;


import com.poesys.db.dto.AbstractLazyLoadingDtoProxy;


/**
 * <p>
 * A data-access layer data-transfer object (DTO) lazy-loading proxy for the 
 * Est. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * An Expressed Sequence Tag (EST); SO_0000345: A tag produced from a single
 * sequencing read from a cDNA clone or PCR product; typically a few hundred base
 * pairs long. In TAIR, this is a nucleotide sequence associated with a clone end
 * associated with a transcript.
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractEstProxy extends AbstractLazyLoadingDtoProxy implements IEst {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  // Lazy-loading query setter strategy nested classes for single-object associations
  
  /**
   * Create a EstProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractEstProxy(Est dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
  }

  @Override
  public boolean equals(Object obj) {
    AbstractEstProxy otherProxy = (AbstractEstProxy)obj;
    return ((Est)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((Est)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  // Source: AddNaturalKeyProperties + AddInheritedKeyProperties + AddParentKeyAttributes
  public java.lang.Long getTairObjectId() {
    return ((Est)dto).getTairObjectId();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
  public java.lang.Long getSeqTairObjectId() {
    return ((Est)dto).getSeqTairObjectId();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getName() {
    return ((Est)dto).getName();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getSequence() {
    return ((Est)dto).getSequence();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getGenbankAccession() {
    return ((Est)dto).getGenbankAccession();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Long getLength() {
    return ((Est)dto).getLength();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Long getStartPosition() {
    return ((Est)dto).getStartPosition();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Long getEndPosition() {
    return ((Est)dto).getEndPosition();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getCloneName() {
    return ((Est)dto).getCloneName();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Long getCloneId() {
    return ((Est)dto).getCloneId();
  }

  // Source: AddLocalAttributeProperties
  public java.sql.Timestamp getDateEntered() {
    return ((Est)dto).getDateEntered();
  }

  // Source: AddToOneAssociationRequiredObjectProperties
  public org.tair.db.genomicregion.ITranscript getTranscript() {
    return ((Est)dto).getTranscript();
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((Est)dto).markChildrenDeleted();
  }
}