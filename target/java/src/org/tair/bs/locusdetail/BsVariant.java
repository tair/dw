/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Variant. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * an ecotype that is a natural species variant of the reference ecotype
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
public class BsVariant extends org.tair.bs.locusdetail.AbstractBsVariant {
  /**
   * Create a BsVariant object from a Variant object.
   * 
   * @param dto the data-access layer Variant DTO
   * @throws DelegateException when there is a problem creating the Variant
   */
  public BsVariant(org.tair.db.locusdetail.IVariant dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsVariant. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Variant
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param polymorphismName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param ecotype the name of the variant ecotype or species variant
   */
  public BsVariant(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.String ecotype) {
    super(key, locusTairObjectId, polymorphismName, ecotype); 
  }
}