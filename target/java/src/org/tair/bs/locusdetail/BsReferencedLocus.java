/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the ReferencedLocus. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A locus to which the reference refers; this object lists all the loci to which a
 * reference refers, excluding the parent locus; this is separate from LocusDetail
 * to permit query optimization and lazy loading of the loci
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
public class BsReferencedLocus extends org.tair.bs.locusdetail.AbstractBsReferencedLocus {
  /**
   * Create a BsReferencedLocus object from a ReferencedLocus object.
   * 
   * @param dto the data-access layer ReferencedLocus DTO
   * @throws DelegateException when there is a problem creating the ReferencedLocus
   */
  public BsReferencedLocus(org.tair.db.locusdetail.IReferencedLocus dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsReferencedLocus. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ReferencedLocus
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param referenceTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param refLocusame the unique name for the locus
   * @param refLocusTairObjectId the unique TAIR object identifier for the locus
   * @param primarySymbol the primary symbol for the locus
   * @param primarySymbolFullName the optional full name for the primary symbol for the locus
   */
  public BsReferencedLocus(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.Long referenceTairObjectId, java.lang.String refLocusame, java.lang.Long refLocusTairObjectId, java.lang.String primarySymbol, java.lang.String primarySymbolFullName) {
    super(key, locusTairObjectId, referenceTairObjectId, refLocusame, refLocusTairObjectId, primarySymbol, primarySymbolFullName); 
  }
}