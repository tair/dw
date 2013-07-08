/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusGeneModel. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * The set of gene models of the parent locus excluding the representative gene
 * model
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
public class LocusGeneModel extends AbstractLocusGeneModel {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusGeneModel as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public LocusGeneModel() {
    super(); 
  }

  /**
   * <p>
   * Create a LocusGeneModel. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusGeneModel
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param geneModelName gene model name; usually in the format ATcGnnnnn.n, where the first part is the
locus name and the part following the dot is the model number; unique within the
locus
   * @param geneModelType the type of the gene model, such as "protein coding"
   * @param representative whether this gene model is the representative gene model for the parent locus,
meaning it acts as the default gene model in situations where no gene model is
specified
   * @param spliceVariant whether this gene model represents a splice variant
   * @param computationalDescription a computationally generated description of the gene model, or "none" if there is
no such description
   * @param curatedSummary an optional curator-written summary for the gene model; null if the summary is
the same as the curated summary for the parent locus
   * @param confidence an optional confidence score string that rates the gene models according to some
confidence algorithm
   */
  public LocusGeneModel(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String geneModelName, java.lang.String geneModelType, java.lang.Boolean representative, java.lang.Boolean spliceVariant, java.lang.String computationalDescription, java.lang.String curatedSummary, java.lang.String confidence) {
    super(key, locusTairObjectId, geneModelName, geneModelType, representative, spliceVariant, computationalDescription, curatedSummary, confidence); 
  }
}