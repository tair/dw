/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the PolymorphismSite. This class
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
public class BsPolymorphismSite extends org.tair.bs.locusdetail.AbstractBsPolymorphismSite {
  /**
   * Create a BsPolymorphismSite object from a PolymorphismSite object.
   * 
   * @param dto the data-access layer PolymorphismSite DTO
   * @throws DelegateException when there is a problem creating the PolymorphismSite
   */
  public BsPolymorphismSite(org.tair.db.locusdetail.IPolymorphismSite dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsPolymorphismSite. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the PolymorphismSite
   * @param lociObject ${key.paramTag}
   * @param polymorphismsObject ${key.paramTag}
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
  public BsPolymorphismSite(IPrimaryKey key, org.tair.db.locusdetail.ILocusGeneModel lociObject, org.tair.db.locusdetail.ILocusPolymorphism polymorphismsObject, java.lang.String geneModelName, java.lang.Long lociLocusTairObjectId, java.lang.Long polymorphismsLocusTairObjectId, java.lang.String polymorphismName, java.lang.String site) {
    super(key, lociObject, polymorphismsObject, geneModelName, lociLocusTairObjectId, polymorphismsLocusTairObjectId, polymorphismName, site); 
  }
}