/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.protein;


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
 * a conserved part of a given protein sequence and structure that can evolve,
 * function, and exist independently of the rest of the protein chain
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
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param domainTairObjectId the unique identifier in TAIR for the protein domain
   * @param name the domain name in the originating database
   * @param database the database that contains the domain:
prosite
prints
pir
tigrfam
prodom
hamap
gene3d
smart
panther
pfam
superfam
   * @param structuralClassType One of several structural classes of protein:
All alpha proteins
All beta proteins
Alpha and beta proteins (a/b)
Alpha and beta proteins (a+b)
Multi-domain proteins (alpha and beta)
Membrane and cell surface proteins and peptides
Small proteins
Coiled coil proteins
   * @param accession the identifier in the originating database
   * @param interproAccession the Interpro accession identifier (IPRnnnnn)
   * @param interpro the Interpro domain name in full
   * @param startPosition the starting position of the domain in the amino acid sequence
   * @param endPosition the ending position of the domain in the amino acid sequence
   */
  public Domain(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.Long domainTairObjectId, java.lang.String name, java.lang.String database, java.lang.String structuralClassType, java.lang.String accession, java.lang.String interproAccession, java.lang.String interpro, java.lang.Integer startPosition, java.lang.Integer endPosition) {
    super(key, tairObjectId, domainTairObjectId, name, database, structuralClassType, accession, interproAccession, interpro, startPosition, endPosition); 
  }
}