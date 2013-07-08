/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusBac. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A bacterially activated chromosome on which a locus appears; an artificially
 * created chromosome in which biologists clone medium-sized segments of foreign
 * DNA into bacteria, enabling amplification or the making of many copies of the
 * DNA. Note that if the length or start or end is null (not available), this might
 * not be the correct BAC for the gene model.
 * </p>
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
public class LocusBac extends AbstractLocusBac {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusBac as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public LocusBac() {
    super(); 
  }

  /**
   * <p>
   * Create a LocusBac. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusBac
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param bacTairObjectId the unique TAIR object identifier for the BAC (assembly unit)
   * @param name the BAC name; usually the same as the clone name
   * @param icAccession the unique identifier at any of the major international genomics data centers
for the BAC sequence
   * @param length the length of the BAC sequence, unit is bp (base pairs)
   * @param start the starting position on the chromosome in unit bp (base pairs)
   * @param end the ending position on the chromosome in unit bp (base pairs)
   * @param cloneTairObjectId the TAIR object identifier for the clone of the BAC; used to connect to the TAIR
clone
   */
  public LocusBac(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.Long bacTairObjectId, java.lang.String name, java.lang.String icAccession, java.lang.Long length, java.lang.Long start, java.lang.Long end, java.lang.Long cloneTairObjectId) {
    super(key, locusTairObjectId, bacTairObjectId, name, icAccession, length, start, end, cloneTairObjectId); 
  }
}