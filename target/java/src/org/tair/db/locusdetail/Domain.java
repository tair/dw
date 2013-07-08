/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Domain. This class
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
public class Domain extends AbstractDomain {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Domain as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Domain() {
    super(); 
  }

  /**
   * <p>
   * Create a Domain. This constructor calls the abstract superclass 
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
  public Domain(IPrimaryKey key, java.lang.String accession, java.lang.String accessionUrl, java.lang.String domain, java.lang.String domainUrl, java.lang.String database, java.lang.String databaseUrl, java.lang.String structuralClassType, java.lang.String classUrl) {
    super(key, accession, accessionUrl, domain, domainUrl, database, databaseUrl, structuralClassType, classUrl); 
  }
}