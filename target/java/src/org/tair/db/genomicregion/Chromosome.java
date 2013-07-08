/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.genomicregion;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Chromosome. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * SO_0000340: Structural unit composed of a nucleic acid molecule which controls
 * its own replication through the interaction of specific proteins at one or more
 * origins of replication.
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
public class Chromosome extends AbstractChromosome {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Chromosome as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Chromosome() {
    super(); 
  }

  /**
   * <p>
   * Create a Chromosome. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Chromosome
   * @param tairObjectId the unique identifier in the TAIR database for the region (locus, gene,
chromosome, contig)
   * @param name the name of the genomic region, such as the chromosome name (1, M), the
locus/gene name (AT1G01010), the transcript name (AT1G01010.1), or the contig
name (MI421-MI421); may or may not be unique within a genome
   * @param dateEntered the date on which the region was created in the source database
   * @param parentRegionTairObjectId foreign key used by setter to query associated object
   * @param genome foreign key used by setter to query associated object
   * @param sequence the complete DNA sequence for the chromosome
   */
  public Chromosome(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.String name, java.sql.Timestamp dateEntered, java.lang.Long parentRegionTairObjectId, java.lang.String genome, java.lang.String sequence) {
    super(key, tairObjectId, name, dateEntered, parentRegionTairObjectId, genome, sequence); 
  }
}