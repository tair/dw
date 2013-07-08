/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Reference. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A published reference that refers to this locus
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
public class BsReference extends org.tair.bs.locusdetail.AbstractBsReference {
  /**
   * Create a BsReference object from a Reference object.
   * 
   * @param dto the data-access layer Reference DTO
   * @throws DelegateException when there is a problem creating the Reference
   */
  public BsReference(org.tair.db.locusdetail.IReference dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsReference. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Reference
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param referenceTairObjectId the unique TAIR object identifier for the reference; used to link to the
reference page
   * @param title title of the publication
   * @param authors a formatted list of authors (Smith J., Jones T., et al.)
   * @param publicationYear the year of publication
   * @param locusCount the number of loci other than the parent to which this reference refers
   * @param annotated has this article been curated, resulting in annotations to the locus?
   */
  public BsReference(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.Long referenceTairObjectId, java.lang.String title, java.lang.String authors, java.lang.Integer publicationYear, java.lang.Integer locusCount, java.lang.Boolean annotated) {
    super(key, locusTairObjectId, referenceTairObjectId, title, authors, publicationYear, locusCount, annotated); 
  }
}