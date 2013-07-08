/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.genomicregion;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Gene. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * SO_0000704: A region (or regions) that includes all of the sequence elements
 * necessary to encode a functional transcript. A gene may include regulatory
 * regions, transcribed regions and/or other functional sequence regions.
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
public class BsGene extends org.tair.bs.genomicregion.AbstractBsGene {
  /**
   * Create a BsGene object from a Gene object.
   * 
   * @param dto the data-access layer Gene DTO
   * @throws DelegateException when there is a problem creating the Gene
   */
  public BsGene(org.tair.db.genomicregion.IGene dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsGene. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Gene
   * @param tairObjectId the unique identifier in the TAIR database for the region (locus, gene,
chromosome, contig)
   * @param name the name of the genomic region, such as the chromosome name (1, M), the
locus/gene name (AT1G01010), the transcript name (AT1G01010.1), or the contig
name (MI421-MI421); may or may not be unique within a genome
   * @param dateEntered the date on which the region was created in the source database
   * @param parentRegionTairObjectId foreign key used by setter to query associated object
   * @param genome foreign key used by setter to query associated object
   * @param curatedSummary an optional, general summary of the locus written by a curator; not a gene model
summary
   */
  public BsGene(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.String name, java.sql.Timestamp dateEntered, java.lang.Long parentRegionTairObjectId, java.lang.String genome, java.lang.String curatedSummary) {
    super(key, tairObjectId, name, dateEntered, parentRegionTairObjectId, genome, curatedSummary); 
  }
}