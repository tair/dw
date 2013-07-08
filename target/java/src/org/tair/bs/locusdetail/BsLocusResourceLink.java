/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LocusResourceLink. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * a URL link to an external resource that contains some kind of information
 * related to the locus
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
public class BsLocusResourceLink extends org.tair.bs.locusdetail.AbstractBsLocusResourceLink {
  /**
   * Create a BsLocusResourceLink object from a LocusResourceLink object.
   * 
   * @param dto the data-access layer LocusResourceLink DTO
   * @throws DelegateException when there is a problem creating the LocusResourceLink
   */
  public BsLocusResourceLink(org.tair.db.locusdetail.ILocusResourceLink dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLocusResourceLink. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusResourceLink
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param name the text name for the link, which usually includes the web site name and any
specific information in the context of the locus; the URL itself may be this
name if there is no other name
   * @param linkType the kind of link this is; used to place the link into a particular section of
the locus detail
   * @param icon an optional name for an icon to display for the link; icon gif must exist in
static images folder
   * @param baseUrl the base URL (http://... up to the ? arguments) for the external link
   * @param urlVariable the optional URL variable that identifies the locus to the target web site
   * @param explanation a short explanation (should fit on one line if possible) of the purpose of the
link
   */
  public BsLocusResourceLink(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String name, java.lang.String linkType, java.lang.String icon, java.lang.String baseUrl, java.lang.String urlVariable, java.lang.String explanation) {
    super(key, locusTairObjectId, name, linkType, icon, baseUrl, urlVariable, explanation); 
  }
}