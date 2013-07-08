/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.protein;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the ProteinTranscript. This class
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
public class BsProteinTranscript extends org.tair.bs.protein.AbstractBsProteinTranscript {
  /**
   * Create a BsProteinTranscript object from a ProteinTranscript object.
   * 
   * @param dto the data-access layer ProteinTranscript DTO
   * @throws DelegateException when there is a problem creating the ProteinTranscript
   */
  public BsProteinTranscript(org.tair.db.protein.IProteinTranscript dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsProteinTranscript. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ProteinTranscript
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param geneTairObjectId the unique identifier in TAIR for the transcript
   * @param name 
   */
  public BsProteinTranscript(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.Long geneTairObjectId, java.lang.String name) {
    super(key, tairObjectId, geneTairObjectId, name); 
  }
}