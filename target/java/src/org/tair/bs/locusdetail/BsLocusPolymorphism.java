/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusPolymorphism. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A difference in a genomic sequence within a locus
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
public class BsLocusPolymorphism extends org.tair.bs.locusdetail.AbstractBsLocusPolymorphism {
  /**
   * Create a BsLocusPolymorphism object from a LocusPolymorphism object.
   * 
   * @param dto the data-access layer LocusPolymorphism DTO
   * @throws DelegateException when there is a problem creating the LocusPolymorphism
   */
  public BsLocusPolymorphism(org.tair.db.locusdetail.ILocusPolymorphism dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusPolymorphism. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusPolymorphism
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param polymorphismName the name of the polymorphism
   * @param polymorphismTairObjectId the TAIR object id for the polymorphism, used in URL links to the polymorphism
   * @param polymorphismType the kind of difference (insertion, substitution, deletion)
   * @param length the length of the polymorphic region in base pairs (bp)
   * @param start the starting position on the AGI map of the polymorphism
   * @param end the end position of the polymorphic region in the AGI map
   */
  public BsLocusPolymorphism(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.Long polymorphismTairObjectId, java.lang.String polymorphismType, java.lang.Long length, java.lang.Long start, java.lang.Long end) {
    super(key, locusTairObjectId, polymorphismName, polymorphismTairObjectId, polymorphismType, length, start, end); 
  }
}