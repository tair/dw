/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusOtherName. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * An alternate name for the parent locus; the rules for inclusion of names in this
 * set vary with the genome; for example, for Arabidopsis thaliana, an other name
 * may be any of the names of the gene models associated with the locus other than
 * the representative gene model or splice variants, or any orf alias that isn't a
 * splice variant name, or the symbol for the gene model, or the full name for the
 * gene model
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
public class LocusOtherName extends AbstractLocusOtherName {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusOtherName as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public LocusOtherName() {
    super(); 
  }

  /**
   * <p>
   * Create a LocusOtherName. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusOtherName
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param name the alternative name for the parent locus
   */
  public LocusOtherName(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String name) {
    super(key, locusTairObjectId, name); 
  }
}