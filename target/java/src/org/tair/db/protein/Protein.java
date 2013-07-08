/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.protein;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Protein. This class
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
public class Protein extends AbstractProtein {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Protein as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Protein() {
    super(); 
  }

  /**
   * <p>
   * Create a Protein. This constructor calls the abstract superclass 
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
  public Protein(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.String name, java.lang.String sequence, java.lang.String genbankGi, java.lang.String genPept, java.lang.Double molecularWeight, java.lang.Double isoelectricPoint, java.lang.Integer length, java.sql.Timestamp dateLastModified) {
    super(key, tairObjectId, name, sequence, genbankGi, genPept, molecularWeight, isoelectricPoint, length, dateLastModified); 
  }
}