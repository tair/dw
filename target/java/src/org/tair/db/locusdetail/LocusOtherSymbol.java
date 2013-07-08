/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusOtherSymbol. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * an alternative symbol for the parent locus; any symbol/full-name combination
 * that is not the primary symbol for the locus
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
public class LocusOtherSymbol extends AbstractLocusOtherSymbol {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusOtherSymbol as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public LocusOtherSymbol() {
    super(); 
  }

  /**
   * <p>
   * Create a LocusOtherSymbol. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusOtherSymbol
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param symbol the symbol for the locus
   * @param fullName the optional full name for the symbolic name for a gene or locus
   */
  public LocusOtherSymbol(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String symbol, java.lang.String fullName) {
    super(key, locusTairObjectId, symbol, fullName); 
  }
}