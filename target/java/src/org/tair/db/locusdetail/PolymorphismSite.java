/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the PolymorphismSite. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * The site on a specific gene model for a locus on which a polymorphism within the
 * locus appears
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>AssociationKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class PolymorphismSite extends AbstractPolymorphismSite {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a PolymorphismSite as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public PolymorphismSite() {
    super(); 
  }

  /**
   * <p>
   * Create a PolymorphismSite. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the PolymorphismSite
   * @param lociObject wraps an associated ILocusGeneModel object
   * @param polymorphismsObject wraps an associated ILocusPolymorphism object
   * @param geneModelName Attribute that is part of the association key
   * @param lociLocusTairObjectId Attribute that is part of the association key
   * @param polymorphismsLocusTairObjectId Attribute that is part of the association key
   * @param polymorphismName Attribute that is part of the association key
   * @param site the site on the gene model; indicates the gross position of the polymorphism
within each gene model (for example, exon, intron). Add the categories exon--non
synonymous mutation and exon--synonomous mutation. To save space, especially if
there are a lot of associated gene models, it’s OK to abbreviate exon to ‘E’
intron to ‘I’ etc. If text is abbreviated, provide a key so that the user knows
what each abbreviation means.
   */
  public PolymorphismSite(IPrimaryKey key, org.tair.db.locusdetail.ILocusGeneModel lociObject, org.tair.db.locusdetail.ILocusPolymorphism polymorphismsObject, java.lang.String geneModelName, java.lang.Long lociLocusTairObjectId, java.lang.Long polymorphismsLocusTairObjectId, java.lang.String polymorphismName, java.lang.String site) {
    super(key, lociObject, polymorphismsObject, geneModelName, lociLocusTairObjectId, polymorphismsLocusTairObjectId, polymorphismName, site); 
  }
}