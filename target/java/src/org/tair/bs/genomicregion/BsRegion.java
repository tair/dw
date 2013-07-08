/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.genomicregion;


import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Region. This class
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
 * This class is the business proxy for the abstract class Region. When
 * you instantiate this class, you are proxying a concrete subclass of the
 * abstract class Region that conforms to the IRegion interface.
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
public class BsRegion extends org.tair.bs.genomicregion.AbstractBsRegion {
  /**
   * Create a BsRegion object from a Region object.
   * 
   * @param dto the data-access layer Region DTO
   * @throws DelegateException when there is a problem creating the Region
   */
  public BsRegion(org.tair.db.genomicregion.IRegion dto) throws DelegateException {
    super(dto);
  }

}