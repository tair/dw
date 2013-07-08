/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusGeneModelBac. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A bacterially activated chromosome on which a locus gene model appears; an
 * artificially created chromosome in which biologists clone medium-sized segments
 * of foreign DNA into bacteria, enabling amplification or the making of many
 * copies of the DNA. Note that if the length or start or end is null (not
 * available), this might not be the correct BAC for the gene model
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
public class LocusGeneModelBac extends AbstractLocusGeneModelBac {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusGeneModelBac as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public LocusGeneModelBac() {
    super(); 
  }

  /**
   * <p>
   * Create a LocusGeneModelBac. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusGeneModelBac
   * @param geneModelName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param sequenceId the unique identifier for the cDNA
   * @param sequenceName the sequence name
   * @param genbankAccession the unique identifier at GenBank for the cDNA sequence
   * @param length the length of the cDNA sequence, unit is bp (base pairs)
   * @param start the starting position on the chromosome in unit bp (base pairs)
   * @param end the ending position on the chromosome in unit bp (base pairs)
   * @param cloneStockNumber the unique identifying stock name for the clone from which the BAC derives
   * @param orderingStatus the stock ordering status according to ABRC:
available
not_available
not_yet_received
no_longer_distributed
not_distributed
available_soon
   */
  public LocusGeneModelBac(IPrimaryKey key, java.lang.String geneModelName, java.lang.Long locusTairObjectId, java.lang.Long sequenceId, java.lang.String sequenceName, java.lang.String genbankAccession, java.lang.Long length, java.lang.Long start, java.lang.Long end, java.lang.String cloneStockNumber, java.lang.String orderingStatus) {
    super(key, geneModelName, locusTairObjectId, sequenceId, sequenceName, genbankAccession, length, start, end, cloneStockNumber, orderingStatus); 
  }
}