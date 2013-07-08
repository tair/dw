/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.genomicregion;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the ExperimentalCdna. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * SO_0000756: DNA synthesized by reverse transcriptase using RNA as a template,
 * produced by in vivo experimentation; based on clone
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
public class ExperimentalCdna extends AbstractExperimentalCdna {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a ExperimentalCdna as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public ExperimentalCdna() {
    super(); 
  }

  /**
   * <p>
   * Create a ExperimentalCdna. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ExperimentalCdna
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param seqTairObjectId the unique TAIR identifier for the cDNA sequence
   * @param name the sequence name
   * @param sequence the DNA sequence for the cDNA
   * @param genbankAccession the unique identifier at GenBank for the cDNA sequence
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
   * @param startPosition the starting position on the chromosome in unit bp (base pairs)
   * @param endPosition the ending position on the chromosome in unit bp (base pairs)
   * @param dateEntered the date on which the protein record was created in the source database
   */
  public ExperimentalCdna(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.Long seqTairObjectId, java.lang.String name, java.lang.String sequence, java.lang.String genbankAccession, java.lang.String vectorType, java.lang.Boolean fullLengthCds, java.lang.Long length, java.lang.Long startPosition, java.lang.Long endPosition, java.sql.Timestamp dateEntered) {
    super(key, tairObjectId, seqTairObjectId, name, sequence, genbankAccession, vectorType, fullLengthCds, length, startPosition, endPosition, dateEntered); 
  }
}