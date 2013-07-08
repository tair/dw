/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.genomicregion;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Transcript. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * SO:0000673: An RNA synthesized on a DNA or RNA template by an RNA polymerase.
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
public class Transcript extends AbstractTranscript {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Transcript as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Transcript() {
    super(); 
  }

  /**
   * <p>
   * Create a Transcript. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Transcript
   * @param tairObjectId the unique identifier in the TAIR database for the region (locus, gene,
chromosome, contig)
   * @param name the name of the genomic region, such as the chromosome name (1, M), the
locus/gene name (AT1G01010), the transcript name (AT1G01010.1), or the contig
name (MI421-MI421); may or may not be unique within a genome
   * @param dateEntered the date on which the region was created in the source database
   * @param parentRegionTairObjectId foreign key used by setter to query associated object
   * @param genome foreign key used by setter to query associated object
   * @param sequence the complete DNA sequence for the transcript
   * @param seqTairObjectId the unique identifier for the cDNA
   * @param genbankAccession the unique identifier at GenBank for the cDNA sequence
   * @param primarySymbol the primary symbolic name for the transcript
   * @param primarySymbolFullName the full name for the primary symbolic name for the transcript (may be null)
   * @param startPosition the start of the transcript on the top level region (chromosome or contig)
   * @param endPosition the end of the transcript on the top-level parent region (chromosome or contig)
   * @param length the length of the transcript genomic region in base pairs (bp)
   * @param orientation the direction of the transcript genomic region in the DNA: forward or reverse;
   * @param basis the basis for assigning the transcript to the map:
BAC_end_sequencing
recombination
gene_annotation
fingerprint
hybridization
unknown
sequence_match
fingerprint_and_hybridization
   * @param derived whether the transcript  is derived ab initio or experimentally known in vivo
   * @param representativeGeneModel Is this transcript the representative alternatively spliced transcript for the
gene?
   * @param transcribesTairObjectId foreign key used by setter to query associated object
   */
  public Transcript(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.String name, java.sql.Timestamp dateEntered, java.lang.Long parentRegionTairObjectId, java.lang.String genome, java.lang.String sequence, java.lang.Long seqTairObjectId, java.lang.String genbankAccession, java.lang.String primarySymbol, java.lang.String primarySymbolFullName, java.lang.Long startPosition, java.lang.Long endPosition, java.lang.Long length, java.lang.String orientation, java.lang.String basis, java.lang.Boolean derived, java.lang.Boolean representativeGeneModel, java.lang.Long transcribesTairObjectId) {
    super(key, tairObjectId, name, dateEntered, parentRegionTairObjectId, genome, sequence, seqTairObjectId, genbankAccession, primarySymbol, primarySymbolFullName, startPosition, endPosition, length, orientation, basis, derived, representativeGeneModel, transcribesTairObjectId); 
  }
}