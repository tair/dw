/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.genomicregion;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Est. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * An Expressed Sequence Tag (EST); SO_0000345: A tag produced from a single
 * sequencing read from a cDNA clone or PCR product; typically a few hundred base
 * pairs long. In TAIR, this is a nucleotide sequence associated with a clone end
 * associated with a transcript.
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
public class BsEst extends org.tair.bs.genomicregion.AbstractBsEst {
  /**
   * Create a BsEst object from a Est object.
   * 
   * @param dto the data-access layer Est DTO
   * @throws DelegateException when there is a problem creating the Est
   */
  public BsEst(org.tair.db.genomicregion.IEst dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsEst. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Est
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param seqTairObjectId the unique TAIR identifier for the EST sequence
   * @param name the sequence name
   * @param sequence the DNA associated with the EST
   * @param genbankAccession the unique identifier at GenBank for the cDNA sequence
   * @param length the length of the cDNA sequence, unit is bp (base pairs)
   * @param startPosition the starting position on the chromosome in unit bp (base pairs)
   * @param endPosition the ending position on the chromosome in unit bp (base pairs)
   * @param cloneName the name of the clone from which the EST derives
   * @param cloneId the unique TAIR identifier for the clone from which the EST derives
   * @param dateEntered the date on which the protein record was created in the source database
   */
  public BsEst(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.Long seqTairObjectId, java.lang.String name, java.lang.String sequence, java.lang.String genbankAccession, java.lang.Long length, java.lang.Long startPosition, java.lang.Long endPosition, java.lang.String cloneName, java.lang.Long cloneId, java.sql.Timestamp dateEntered) {
    super(key, tairObjectId, seqTairObjectId, name, sequence, genbankAccession, length, startPosition, endPosition, cloneName, cloneId, dateEntered); 
  }
}