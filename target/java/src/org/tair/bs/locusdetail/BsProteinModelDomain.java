/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the ProteinModelDomain. This class
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
public class BsProteinModelDomain extends org.tair.bs.locusdetail.AbstractBsProteinModelDomain {
  /**
   * Create a BsProteinModelDomain object from a ProteinModelDomain object.
   * 
   * @param dto the data-access layer ProteinModelDomain DTO
   * @throws DelegateException when there is a problem creating the ProteinModelDomain
   */
  public BsProteinModelDomain(org.tair.db.locusdetail.IProteinModelDomain dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsProteinModelDomain. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ProteinModelDomain
   * @param domainsObject ${key.paramTag}
   * @param modelsObject ${key.paramTag}
   * @param accession Attribute that is part of the association key
   * @param geneModelName Attribute that is part of the association key
   * @param locusTairObjectId Attribute that is part of the association key
   * @param sequenceTairObjectId Attribute that is part of the association key
   * @param start the starting position of the domain instance within the protein model; also part
of the primary key, so a protein may have multiple instances of a given domain
as long as the instances have a different start position
   * @param end the ending position of the domain instance within the protein model
   */
  public BsProteinModelDomain(IPrimaryKey key, org.tair.db.locusdetail.IDomain domainsObject, org.tair.db.locusdetail.IProteinModel modelsObject, java.lang.String accession, java.lang.String geneModelName, java.lang.Long locusTairObjectId, java.lang.Long sequenceTairObjectId, java.lang.Integer start, java.lang.Integer end) {
    super(key, domainsObject, modelsObject, accession, geneModelName, locusTairObjectId, sequenceTairObjectId, start, end); 
  }
}