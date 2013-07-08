/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Variant. This class
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
public class Variant extends AbstractVariant {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Variant as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Variant() {
    super(); 
  }

  /**
   * <p>
   * Create a Variant. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Variant
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param polymorphismName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param ecotype the name of the variant ecotype or species variant
   */
  public Variant(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.String ecotype) {
    super(key, locusTairObjectId, polymorphismName, ecotype); 
  }
}