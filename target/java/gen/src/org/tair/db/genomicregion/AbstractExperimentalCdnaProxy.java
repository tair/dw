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
 * ExperimentalCdna. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * SO_0000756: DNA synthesized by reverse transcriptase using RNA as a template,
 * produced by in vivo experimentation; based on clone
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractExperimentalCdnaProxy extends AbstractLazyLoadingDtoProxy implements IExperimentalCdna {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  // Lazy-loading query setter strategy nested classes for single-object associations
  
  /**
   * Create a ExperimentalCdnaProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractExperimentalCdnaProxy(ExperimentalCdna dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
  }

  @Override
  public boolean equals(Object obj) {
    AbstractExperimentalCdnaProxy otherProxy = (AbstractExperimentalCdnaProxy)obj;
    return ((ExperimentalCdna)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((ExperimentalCdna)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  // Source: AddNaturalKeyProperties + AddInheritedKeyProperties + AddParentKeyAttributes
  public java.lang.Long getTairObjectId() {
    return ((ExperimentalCdna)dto).getTairObjectId();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
  public java.lang.Long getSeqTairObjectId() {
    return ((ExperimentalCdna)dto).getSeqTairObjectId();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getName() {
    return ((ExperimentalCdna)dto).getName();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getSequence() {
    return ((ExperimentalCdna)dto).getSequence();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getGenbankAccession() {
    return ((ExperimentalCdna)dto).getGenbankAccession();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getVectorType() {
    return ((ExperimentalCdna)dto).getVectorType();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Boolean getFullLengthCds() {
    return ((ExperimentalCdna)dto).getFullLengthCds();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Long getLength() {
    return ((ExperimentalCdna)dto).getLength();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Long getStartPosition() {
    return ((ExperimentalCdna)dto).getStartPosition();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Long getEndPosition() {
    return ((ExperimentalCdna)dto).getEndPosition();
  }

  // Source: AddLocalAttributeProperties
  public java.sql.Timestamp getDateEntered() {
    return ((ExperimentalCdna)dto).getDateEntered();
  }

  // Source: AddToOneAssociationRequiredObjectProperties
  public org.tair.db.genomicregion.ITranscript getTranscript() {
    return ((ExperimentalCdna)dto).getTranscript();
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((ExperimentalCdna)dto).markChildrenDeleted();
  }
}