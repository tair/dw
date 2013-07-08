/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.protein;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Protein. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * An amino acid possibly related to a transcript
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>NaturalKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsProtein extends org.tair.bs.protein.AbstractBsProtein {
  /**
   * Create a BsProtein object from a Protein object.
   * 
   * @param dto the data-access layer Protein DTO
   * @throws DelegateException when there is a problem creating the Protein
   */
  public BsProtein(org.tair.db.protein.IProtein dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsProtein. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Protein
   * @param tairObjectId 
   * @param name 
   * @param sequence 
   * @param genbankGi 
   * @param genPept 
   * @param molecularWeight 
   * @param isoelectricPoint 
   * @param length 
   * @param dateLastModified 
   */
  public BsProtein(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.String name, java.lang.String sequence, java.lang.String genbankGi, java.lang.String genPept, java.lang.Double molecularWeight, java.lang.Double isoelectricPoint, java.lang.Integer length, java.sql.Timestamp dateLastModified) {
    super(key, tairObjectId, name, sequence, genbankGi, genPept, molecularWeight, isoelectricPoint, length, dateLastModified); 
  }
}