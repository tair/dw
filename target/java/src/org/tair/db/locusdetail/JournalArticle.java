/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the JournalArticle. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A journal article reference available in PubMed that refers to the locus
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class JournalArticle extends AbstractJournalArticle {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a JournalArticle as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public JournalArticle() {
    super(); 
  }

  /**
   * <p>
   * Create a JournalArticle. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the JournalArticle
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param referenceTairObjectId the unique TAIR object identifier for the reference; used to link to the
reference page
   * @param title title of the publication
   * @param authors a formatted list of authors (Smith J., Jones T., et al.)
   * @param publicationYear the year of publication
   * @param locusCount the number of loci other than the parent to which this reference refers
   * @param annotated has this article been curated, resulting in annotations to the locus?
   * @param journal the name of the journal that published the article
   * @param pubmedId the unique identifier in the PubMed database for the journal article; used to
link to the PubMed record
   */
  public JournalArticle(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.Long referenceTairObjectId, java.lang.String title, java.lang.String authors, java.lang.Integer publicationYear, java.lang.Integer locusCount, java.lang.Boolean annotated, java.lang.String journal, java.lang.String pubmedId) {
    super(key, locusTairObjectId, referenceTairObjectId, title, authors, publicationYear, locusCount, annotated, journal, pubmedId); 
  }
}