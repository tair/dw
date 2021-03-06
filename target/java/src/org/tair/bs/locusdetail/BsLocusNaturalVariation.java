/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusNaturalVariation. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * a naturally-occurring polymorphism between two ecotypes; induced polymorphisms
 * are differences within a single ecotype, whereas natural variation polymorphisms
 * differ between ecotypes
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsLocusNaturalVariation extends org.tair.bs.locusdetail.AbstractBsLocusNaturalVariation {
  /**
   * Create a BsLocusNaturalVariation object from a LocusNaturalVariation object.
   * 
   * @param dto the data-access layer LocusNaturalVariation DTO
   * @throws DelegateException when there is a problem creating the LocusNaturalVariation
   */
  public BsLocusNaturalVariation(org.tair.db.locusdetail.ILocusNaturalVariation dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusNaturalVariation. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusNaturalVariation
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param polymorphismName the name of the polymorphism
   * @param polymorphismTairObjectId the TAIR object id for the polymorphism, used in URL links to the polymorphism
   * @param polymorphismType the kind of difference (insertion, substitution, deletion)
   * @param length the length of the polymorphic region in base pairs (bp)
   * @param start the starting position on the AGI map of the polymorphism
   * @param end the end position of the polymorphic region in the AGI map
   * @param detail a text representation of the structural details of the polymorphic difference
between the ecotypes (for example, a SNP with G->A)
   * @param accession foreign key used by setter to query associated object
   * @param name foreign key used by setter to query associated object
   * @param taxonId foreign key used by setter to query associated object
   */
  public BsLocusNaturalVariation(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.Long polymorphismTairObjectId, java.lang.String polymorphismType, java.lang.Long length, java.lang.Long start, java.lang.Long end, java.lang.String detail, java.lang.String accession, java.lang.String name, java.lang.Long taxonId) {
    super(key, locusTairObjectId, polymorphismName, polymorphismTairObjectId, polymorphismType, length, start, end, detail, accession, name, taxonId); 
  }
}