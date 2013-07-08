/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.community;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Community. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A member of the community
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 *     <li>SequenceKey</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsCommunity extends org.tair.bs.community.AbstractBsCommunity {
  /**
   * Create a BsCommunity object from a Community object.
   * 
   * @param dto the data-access layer Community DTO
   * @throws DelegateException when there is a problem creating the Community
   */
  public BsCommunity(org.tair.db.community.ICommunity dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsCommunity. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Community
   * @param communityId primary key attribute
   * @param communityType the kind of community member this is: person or organization
   * @param email the email address of the community member
   * @param memberStatus the current status of the community member: new, active, inactive.
A new member is one who has registered but not been activated.
An active member has been activated.
An inactive member has been inactivated.
   * @param countryId foreign key used by setter to query associated object
   */
  public BsCommunity(IPrimaryKey key, java.math.BigInteger communityId, java.lang.String communityType, java.lang.String email, java.lang.String memberStatus, java.math.BigInteger countryId) {
    super(key, communityId, communityType, email, memberStatus, countryId); 
  }
}