/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.genomicregion;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Region. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * SO_0000001: A sequence_feature with an extent greater than zero. A nucleotide
 * region is composed of bases and a polypeptide region is composed of amino acids.
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>NaturalKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class Region extends AbstractRegion {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Region as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   * <p>
   * This class is abstract, so there must be a concrete subclass defined in 
   * the UML diagram that calls this constructor.
   * </p>
   *
   */
  public Region() {
    super(); 
  }

  /**
   * <p>
   * Create a Region. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   * <p>
   * This class is abstract, so there must be a concrete subclass defined in 
   * the UML diagram that calls this constructor.
   * </p>
   *
   * @param key the primary key of the Region
   * @param tairObjectId the unique identifier in the TAIR database for the region (locus, gene,
chromosome, contig)
   * @param name the name of the genomic region, such as the chromosome name (1, M), the
locus/gene name (AT1G01010), the transcript name (AT1G01010.1), or the contig
name (MI421-MI421); may or may not be unique within a genome
   * @param dateEntered the date on which the region was created in the source database
   * @param parentRegionTairObjectId foreign key used by setter to query associated object
   * @param genome foreign key used by setter to query associated object
   */
  public Region(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.String name, java.sql.Timestamp dateEntered, java.lang.Long parentRegionTairObjectId, java.lang.String genome) {
    super(key, tairObjectId, name, dateEntered, parentRegionTairObjectId, genome); 
  }
}