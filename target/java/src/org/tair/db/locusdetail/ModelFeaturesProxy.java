/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.locusdetail;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * ModelFeatures. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * The coordinates for gene features (exons and introns) of a gene model of a
 * locus, including UTR and CDS information; each coordinates object is identified
 * by the locus, the gene model, the feature type (intron/exon), and the feature
 * number (the order of the feature within the region); the n features of each type
 * are ordered by the feature numbers from the 5' end (1) to the 3' end (n),
 * starting with exon 1.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class ModelFeaturesProxy extends AbstractModelFeaturesProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a ModelFeaturesProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public ModelFeaturesProxy(ModelFeatures dto) {
    super(dto); 
  }
}