/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Taxon. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * The species identification for a set of loci
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
public class Taxon extends AbstractTaxon {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Taxon as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Taxon() {
    super(); 
  }

  /**
   * <p>
   * Create a Taxon. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Taxon
   * @param taxonId a unique identifier for the species taxon
   * @param genus the scientific genus name (collection of related species)
   * @param species the scientific species name within the genus
   * @param common the common botanical or zoological name for the species
   */
  public Taxon(IPrimaryKey key, java.lang.Long taxonId, java.lang.String genus, java.lang.String species, java.lang.String common) {
    super(key, taxonId, genus, species, common); 
  }
}