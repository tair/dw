/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusPolymorphism. This class
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
public class LocusPolymorphism extends AbstractLocusPolymorphism {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusPolymorphism as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public LocusPolymorphism() {
    super(); 
  }

  /**
   * <p>
   * Create a LocusPolymorphism. This constructor calls the abstract superclass 
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
  public LocusPolymorphism(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.Long polymorphismTairObjectId, java.lang.String polymorphismType, java.lang.Long length, java.lang.Long start, java.lang.Long end) {
    super(key, locusTairObjectId, polymorphismName, polymorphismTairObjectId, polymorphismType, length, start, end); 
  }
}