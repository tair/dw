/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusGeneModelCdna. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A complementary DNA (cDNA) sequence associated with the locus gene model. cDNA
 * is single-stranded DNA made in the laboratory from a messenger RNA template.
 * Biologists use this form of DNA as a probe in the structural mapping of a
 * chromosome.
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
public class BsLocusGeneModelCdna extends org.tair.bs.locusdetail.AbstractBsLocusGeneModelCdna {
  /**
   * Create a BsLocusGeneModelCdna object from a LocusGeneModelCdna object.
   * 
   * @param dto the data-access layer LocusGeneModelCdna DTO
   * @throws DelegateException when there is a problem creating the LocusGeneModelCdna
   */
  public BsLocusGeneModelCdna(org.tair.db.locusdetail.ILocusGeneModelCdna dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusGeneModelCdna. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusGeneModelCdna
   * @param geneModelName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param sequenceId the unique identifier for the cDNA
   * @param sequenceName the sequence name
   * @param icAccession the unique identifier at any of the major international genomics data centers
for the cDNA sequence
   * @param vectorType the kind of vector associated with the cDNA:
BAC
BiBAC
P1
TAC
YAC
cosmid
lambda
plasmid
unknown
   * @param fullLengthCds whether this cDNA is a "full-length" cDNA that contains the entire coding region
of the gene
   * @param length the length of the cDNA sequence, unit is bp (base pairs)
   * @param start the starting position on the chromosome in unit bp (base pairs)
   * @param end the ending position on the chromosome in unit bp (base pairs)
   */
  public BsLocusGeneModelCdna(IPrimaryKey key, java.lang.String geneModelName, java.lang.Long locusTairObjectId, java.lang.Long sequenceId, java.lang.String sequenceName, java.lang.String icAccession, java.lang.String vectorType, java.lang.Boolean fullLengthCds, java.lang.Long length, java.lang.Long start, java.lang.Long end) {
    super(key, geneModelName, locusTairObjectId, sequenceId, sequenceName, icAccession, vectorType, fullLengthCds, length, start, end); 
  }
}