/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.protein;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the ProteinTranscript. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * 
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class ProteinTranscript extends AbstractProteinTranscript {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a ProteinTranscript as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public ProteinTranscript() {
    super(); 
  }

  /**
   * <p>
   * Create a ProteinTranscript. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ProteinTranscript
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param geneTairObjectId the unique identifier in TAIR for the transcript
   * @param name 
   */
  public ProteinTranscript(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.Long geneTairObjectId, java.lang.String name) {
    super(key, tairObjectId, geneTairObjectId, name); 
  }
}