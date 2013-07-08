/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusGeneModelCdnaAlias. This class
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
public class BsLocusGeneModelCdnaAlias extends org.tair.bs.locusdetail.AbstractBsLocusGeneModelCdnaAlias {
  /**
   * Create a BsLocusGeneModelCdnaAlias object from a LocusGeneModelCdnaAlias object.
   * 
   * @param dto the data-access layer LocusGeneModelCdnaAlias DTO
   * @throws DelegateException when there is a problem creating the LocusGeneModelCdnaAlias
   */
  public BsLocusGeneModelCdnaAlias(org.tair.db.locusdetail.ILocusGeneModelCdnaAlias dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusGeneModelCdnaAlias. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusGeneModelCdnaAlias
   * @param geneModelName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param sequenceId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param alias the alias for the cDNA sequence
   */
  public BsLocusGeneModelCdnaAlias(IPrimaryKey key, java.lang.String geneModelName, java.lang.Long locusTairObjectId, java.lang.Long sequenceId, java.lang.String alias) {
    super(key, geneModelName, locusTairObjectId, sequenceId, alias); 
  }
}