/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocuslEst. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * An Expressed Sequence Tag (EST) clone end for a locus; a unique stretch of DNA
 * within a coding region that identifies a full-length gene and serves as a
 * landmark for mapping to a chromosome; an EST is a sequence tagged site (STS)
 * derived from cDNA.
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
public class BsLocuslEst extends org.tair.bs.locusdetail.AbstractBsLocuslEst {
  /**
   * Create a BsLocuslEst object from a LocuslEst object.
   * 
   * @param dto the data-access layer LocuslEst DTO
   * @throws DelegateException when there is a problem creating the LocuslEst
   */
  public BsLocuslEst(org.tair.db.locusdetail.ILocuslEst dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocuslEst. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocuslEst
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param cloneEndTairObjectId the unique TAIR identifier for the EST clone end
   * @param estName the EST clone end name
   * @param icAccession the unique identifier at any of the major international genomics data centers
for the EST clone end sequence
   * @param length the length of the cDNA sequence, unit is bp (base pairs)
   * @param start the starting position on the chromosome in unit bp (base pairs)
   * @param end the ending position on the chromosome in unit bp (base pairs)
   * @param cloneName the name of the clone from which the EST derives
   * @param cloneTairObjectId the unique identifier for the clone from which the EST derives
   */
  public BsLocuslEst(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.Long cloneEndTairObjectId, java.lang.String estName, java.lang.String icAccession, java.lang.Long length, java.lang.Long start, java.lang.Long end, java.lang.String cloneName, java.lang.Long cloneTairObjectId) {
    super(key, locusTairObjectId, cloneEndTairObjectId, estName, icAccession, length, start, end, cloneName, cloneTairObjectId); 
  }
}