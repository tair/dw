/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusGermplasm. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A germplasm that contains the induced polymorphism yielding an optional
 * phenotype
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
public class LocusGermplasm extends AbstractLocusGermplasm {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusGermplasm as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public LocusGermplasm() {
    super(); 
  }

  /**
   * <p>
   * Create a LocusGermplasm. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusGermplasm
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param polymorphismName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param germplasmName the name of the germplasm that contains the induced polymorphism
   * @param germplasmTairObjectId the TAIR object id for the germplasm, used for linking to the germplasm
   * @param phenotype a textual description of the phenotype that results from the induced mutation in
the ecotype
   */
  public LocusGermplasm(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.String germplasmName, java.lang.Long germplasmTairObjectId, java.lang.String phenotype) {
    super(key, locusTairObjectId, polymorphismName, germplasmName, germplasmTairObjectId, phenotype); 
  }
}