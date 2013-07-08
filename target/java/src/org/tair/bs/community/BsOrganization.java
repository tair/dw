/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.community;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Organization. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * An organization that is a member of the community
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsOrganization extends org.tair.bs.community.AbstractBsOrganization {
  /**
   * Create a BsOrganization object from a Organization object.
   * 
   * @param dto the data-access layer Organization DTO
   * @throws DelegateException when there is a problem creating the Organization
   */
  public BsOrganization(org.tair.db.community.IOrganization dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsOrganization. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Organization
   * @param communityId primary key attribute
   * @param communityType the kind of community member this is: person or organization
   * @param email the email address of the community member
   * @param memberStatus the current status of the community member: new, active, inactive.
A new member is one who has registered but not been activated.
An active member has been activated.
An inactive member has been inactivated.
   * @param countryId foreign key used by setter to query associated object
   * @param name the name of the organization
   * @param organizationType the kind of organization:
lab
institute
organization
project
university
other
high_school
education_outreach_program
foundation
company
facility
stock_center
center
community_college
collaboration
middle_school
committee
unknown
database
4_year_college
   * @param description a text describing the organization
   * @param commercial whether this is a commercial organization
   */
  public BsOrganization(IPrimaryKey key, java.math.BigInteger communityId, java.lang.String communityType, java.lang.String email, java.lang.String memberStatus, java.math.BigInteger countryId, java.lang.String name, java.lang.String organizationType, java.lang.String description, java.lang.Boolean commercial) {
    super(key, communityId, communityType, email, memberStatus, countryId, name, organizationType, description, commercial); 
  }
}