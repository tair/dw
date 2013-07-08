/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusGeneModelCdnaAlias. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * Another name for the cDNA for the locus gene model
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
public class LocusGeneModelCdnaAlias extends AbstractLocusGeneModelCdnaAlias {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusGeneModelCdnaAlias as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public LocusGeneModelCdnaAlias() {
    super(); 
  }

  /**
   * <p>
   * Create a LocusGeneModelCdnaAlias. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusGeneModelCdnaAlias
   * @param geneModelName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param sequenceId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param alias the alias for the cDNA sequence
   */
  public LocusGeneModelCdnaAlias(IPrimaryKey key, java.lang.String geneModelName, java.lang.Long locusTairObjectId, java.lang.Long sequenceId, java.lang.String alias) {
    super(key, geneModelName, locusTairObjectId, sequenceId, alias); 
  }
}