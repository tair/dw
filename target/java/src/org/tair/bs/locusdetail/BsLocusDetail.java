/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusDetail. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * The central object of the subsystem, a locus, which is the location on a
 * chromosome of a gene (the concept of a physical DNA structure that maps into a
 * protein or RNA molecule and has distinct function)
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>NaturalKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsLocusDetail extends org.tair.bs.locusdetail.AbstractBsLocusDetail {
  /**
   * Create a BsLocusDetail object from a LocusDetail object.
   * 
   * @param dto the data-access layer LocusDetail DTO
   * @throws DelegateException when there is a problem creating the LocusDetail
   */
  public BsLocusDetail(org.tair.db.locusdetail.ILocusDetail dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusDetail. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusDetail
   * @param locusTairObjectId unique identifier for the locus as a TAIR object
   * @param locusName the locus name (usually an AGI name in the form ATcGnnnnn, where the c is the
chromosome (1-5, C, M)
   * @param primarySymbol the primary symbolic name for the locus
   * @param primarySymbolFullName the full name for the primary symbolic name for the locus (may be null)
   * @param chromosome the chromosome on which the locus is positioned (1-5, M, C)
   * @param spanStartPosition the starting base pair number of the locus on the chromosome; used in displaying
the gene structure graphic
   * @param spanEndPosition the end base pair number of the locus on the chromosome; used in displaying the
gene structure graphic
   * @param curatedSummary an optional, general summary of the locus written by a curator; not a gene model
summary
   * @param geneModelCount the number of gene models associated to this locus
   * @param polymorphismCount the number of polymorphisms associated with this locus
   * @param articleCount the number of journal articles associated with this locus
   * @param abstractCount the number of conference proceedings abstracts that refer to this locus
   * @param geneFamilyName the optional name of the gene family that contains this locus
   * @param geneFamilyTairObjectId the optional TAIR object id of the gene family that contains this locus; used to
link to the gene family page
   * @param taxonId foreign key used by setter to query associated object
   */
  public BsLocusDetail(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String locusName, java.lang.String primarySymbol, java.lang.String primarySymbolFullName, java.lang.String chromosome, java.lang.Long spanStartPosition, java.lang.Long spanEndPosition, java.lang.String curatedSummary, java.lang.Long geneModelCount, java.lang.Long polymorphismCount, java.lang.Long articleCount, java.lang.Long abstractCount, java.lang.String geneFamilyName, java.lang.Long geneFamilyTairObjectId, java.lang.Long taxonId) {
    super(key, locusTairObjectId, locusName, primarySymbol, primarySymbolFullName, chromosome, spanStartPosition, spanEndPosition, curatedSummary, geneModelCount, polymorphismCount, articleCount, abstractCount, geneFamilyName, geneFamilyTairObjectId, taxonId); 
  }
}