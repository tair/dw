/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the ProteinResourceLink. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * a URL link to a third-party resource that contains some kind of information
 * related to the protein model
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
public class ProteinResourceLink extends AbstractProteinResourceLink {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a ProteinResourceLink as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public ProteinResourceLink() {
    super(); 
  }

  /**
   * <p>
   * Create a ProteinResourceLink. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ProteinResourceLink
   * @param geneModelName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param sequenceTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param name the text name for the link, which usually includes the web site name and any
specific information in the context of the locus; the URL itself may be this
name if there is no other name
   * @param icon an optional name for an icon to display for the link; icon gif must exist in
static images folder
   * @param baseUrl the base URL (http://... up to the ? arguments) for the external link
   * @param urlVariable the optional URL variable that identifies the locus to the target web site
   * @param explanation a short explanation (should fit on one line if possible) of the purpose of the
link
   */
  public ProteinResourceLink(IPrimaryKey key, java.lang.String geneModelName, java.lang.Long locusTairObjectId, java.lang.Long sequenceTairObjectId, java.lang.String name, java.lang.String icon, java.lang.String baseUrl, java.lang.String urlVariable, java.lang.String explanation) {
    super(key, geneModelName, locusTairObjectId, sequenceTairObjectId, name, icon, baseUrl, urlVariable, explanation); 
  }
}