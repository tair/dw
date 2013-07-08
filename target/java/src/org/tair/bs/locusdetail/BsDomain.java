/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Domain. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A named protein domain
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
public class BsDomain extends org.tair.bs.locusdetail.AbstractBsDomain {
  /**
   * Create a BsDomain object from a Domain object.
   * 
   * @param dto the data-access layer Domain DTO
   * @throws DelegateException when there is a problem creating the Domain
   */
  public BsDomain(org.tair.db.locusdetail.IDomain dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsDomain. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Domain
   * @param accession a unique identifier for the protein domain, usually InterPro
   * @param accessionUrl a URL that links to a site containing information about the id
   * @param domain the name of the protein domain
   * @param domainUrl a URL that links to a page displaying information about the named domain
   * @param database the database that contains the domain
   * @param databaseUrl the URL that links to the external database that contains the domain
   * @param structuralClassType the structural class of the domain
   * @param classUrl a URL link to a page displaying information about the structural class type of
the protein domain
   */
  public BsDomain(IPrimaryKey key, java.lang.String accession, java.lang.String accessionUrl, java.lang.String domain, java.lang.String domainUrl, java.lang.String database, java.lang.String databaseUrl, java.lang.String structuralClassType, java.lang.String classUrl) {
    super(key, accession, accessionUrl, domain, domainUrl, database, databaseUrl, structuralClassType, classUrl); 
  }
}