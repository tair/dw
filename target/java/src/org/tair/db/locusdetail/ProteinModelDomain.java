/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the ProteinModelDomain. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A protein domain linked to a specific protein amino acid sequence; multiple
 * instances of a given domain may link to the same amino acid sequence as long as
 * they have different start positions.
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
public class ProteinModelDomain extends AbstractProteinModelDomain {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a ProteinModelDomain as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public ProteinModelDomain() {
    super(); 
  }

  /**
   * <p>
   * Create a ProteinModelDomain. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ProteinModelDomain
   * @param domainsObject wraps an associated IDomain object
   * @param modelsObject wraps an associated IProteinModel object
   * @param accession Attribute that is part of the association key
   * @param geneModelName Attribute that is part of the association key
   * @param locusTairObjectId Attribute that is part of the association key
   * @param sequenceTairObjectId Attribute that is part of the association key
   * @param start the starting position of the domain instance within the protein model; also part
of the primary key, so a protein may have multiple instances of a given domain
as long as the instances have a different start position
   * @param end the ending position of the domain instance within the protein model
   */
  public ProteinModelDomain(IPrimaryKey key, org.tair.db.locusdetail.IDomain domainsObject, org.tair.db.locusdetail.IProteinModel modelsObject, java.lang.String accession, java.lang.String geneModelName, java.lang.Long locusTairObjectId, java.lang.Long sequenceTairObjectId, java.lang.Integer start, java.lang.Integer end) {
    super(key, domainsObject, modelsObject, accession, geneModelName, locusTairObjectId, sequenceTairObjectId, start, end); 
  }
}