/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.community;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Person. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * a person who is a member of the community
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
public class BsPerson extends org.tair.bs.community.AbstractBsPerson {
  /**
   * Create a BsPerson object from a Person object.
   * 
   * @param dto the data-access layer Person DTO
   * @throws DelegateException when there is a problem creating the Person
   */
  public BsPerson(org.tair.db.community.IPerson dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsPerson. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Person
   * @param communityId primary key attribute
   * @param communityType the kind of community member this is: person or organization
   * @param email the email address of the community member
   * @param memberStatus the current status of the community member: new, active, inactive.
A new member is one who has registered but not been activated.
An active member has been activated.
An inactive member has been inactivated.
   * @param countryId foreign key used by setter to query associated object
   * @param userName the person's login user name
   * @param firstName the first name of the person
   * @param middleName the middle name of the person
   * @param lastName the last name of the person
   * @param suffix an optional suffix for the person's name, such as Jr., III, and so on
   * @param researchInterest a text description of the person's research interests
   */
  public BsPerson(IPrimaryKey key, java.math.BigInteger communityId, java.lang.String communityType, java.lang.String email, java.lang.String memberStatus, java.math.BigInteger countryId, java.lang.String userName, java.lang.String firstName, java.lang.String middleName, java.lang.String lastName, java.lang.String suffix, java.lang.String researchInterest) {
    super(key, communityId, communityType, email, memberStatus, countryId, userName, firstName, middleName, lastName, suffix, researchInterest); 
  }
}