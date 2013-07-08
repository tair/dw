/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusComment. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A comment on the locus entered by a community member
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
public class BsLocusComment extends org.tair.bs.locusdetail.AbstractBsLocusComment {
  /**
   * Create a BsLocusComment object from a LocusComment object.
   * 
   * @param dto the data-access layer LocusComment DTO
   * @throws DelegateException when there is a problem creating the LocusComment
   */
  public BsLocusComment(org.tair.db.locusdetail.ILocusComment dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusComment. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusComment
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusCommentNo composite subkey attribute that uniquely identifies child combined with parent key
   * @param name the name of the TAIR community member
   * @param communityId the TAIR community id for the person making the comment (used in links)
   * @param commentText the text of the comment entered by the community member truncated to 100
characters
   * @param dateEntered the date on which the community member entered the comment
   */
  public BsLocusComment(IPrimaryKey key, java.lang.Long locusTairObjectId, java.math.BigInteger locusCommentNo, java.lang.String name, java.lang.Long communityId, java.lang.String commentText, java.sql.Timestamp dateEntered) {
    super(key, locusTairObjectId, locusCommentNo, name, communityId, commentText, dateEntered); 
  }
}