/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.genomicregion;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Chromosome. This class
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
public class BsChromosome extends org.tair.bs.genomicregion.AbstractBsChromosome {
  /**
   * Create a BsChromosome object from a Chromosome object.
   * 
   * @param dto the data-access layer Chromosome DTO
   * @throws DelegateException when there is a problem creating the Chromosome
   */
  public BsChromosome(org.tair.db.genomicregion.IChromosome dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsChromosome. This constructor calls the abstract superclass 
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
  public BsChromosome(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.String name, java.sql.Timestamp dateEntered, java.lang.Long parentRegionTairObjectId, java.lang.String genome, java.lang.String sequence) {
    super(key, tairObjectId, name, dateEntered, parentRegionTairObjectId, genome, sequence); 
  }
}