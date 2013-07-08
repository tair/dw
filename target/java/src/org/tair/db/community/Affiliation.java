/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.community;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Affiliation. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * a link between a person and an organization
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
public class Affiliation extends AbstractAffiliation {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Affiliation as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Affiliation() {
    super(); 
  }

  /**
   * <p>
   * Create a Affiliation. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Affiliation
   * @param affiliatesObject wraps an associated IPerson object
   * @param organizationsObject wraps an associated IOrganization object
   * @param organizationsCommunityId Attribute that is part of the association key
   * @param affiliatesCommunityId Attribute that is part of the association key
   * @param jobTitle the person's job title within this organization, if any
   * @param pi whether the person acts in the role of a principal investigator for the
organization
   */
  public Affiliation(IPrimaryKey key, org.tair.db.community.IPerson affiliatesObject, org.tair.db.community.IOrganization organizationsObject, java.math.BigInteger organizationsCommunityId, java.math.BigInteger affiliatesCommunityId, java.lang.String jobTitle, java.lang.Boolean pi) {
    super(key, affiliatesObject, organizationsObject, organizationsCommunityId, affiliatesCommunityId, jobTitle, pi); 
  }
}