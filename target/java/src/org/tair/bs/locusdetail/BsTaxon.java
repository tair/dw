/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Taxon. This class
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
public class BsTaxon extends org.tair.bs.locusdetail.AbstractBsTaxon {
  /**
   * Create a BsTaxon object from a Taxon object.
   * 
   * @param dto the data-access layer Taxon DTO
   * @throws DelegateException when there is a problem creating the Taxon
   */
  public BsTaxon(org.tair.db.locusdetail.ITaxon dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsTaxon. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Taxon
   * @param taxonId a unique identifier for the species taxon
   * @param genus the scientific genus name (collection of related species)
   * @param species the scientific species name within the genus
   * @param common the common botanical or zoological name for the species
   */
  public BsTaxon(IPrimaryKey key, java.lang.Long taxonId, java.lang.String genus, java.lang.String species, java.lang.String common) {
    super(key, taxonId, genus, species, common); 
  }
}