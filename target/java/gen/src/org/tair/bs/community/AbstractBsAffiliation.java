/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractBsDto.vsl


package org.tair.bs.community;


import com.poesys.bs.delegate.DelegateException;
import com.poesys.bs.dto.IDto;
import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.dto.AbstractDto;


import org.tair.db.community.IAffiliation;
import org.tair.db.community.AffiliationProxy;
import org.tair.db.community.Affiliation;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the Affiliation. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
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
 * <p>
 * Class is read/write: false
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractBsAffiliation 
    extends AbstractDto<org.tair.db.community.IAffiliation> {

  /**
   * Create a BsAffiliation object from a Affiliation object.
   * 
   * @param dto the data-access layer Affiliation DTO
   * @throws DelegateException when there is a problem creating the Affiliation
   */
  public AbstractBsAffiliation(IAffiliation dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a Affiliation from new data.
   *
   * @param key the primary key of the Affiliation
   * @param affiliatesObject associated Person object
   * @param organizationsObject associated Organization object
   * @param organizationsCommunityId Attribute that is part of the association key
   * @param affiliatesCommunityId Attribute that is part of the association key
   * @param jobTitle the person's job title within this organization, if any
   * @param pi whether the person acts in the role of a principal investigator for the
organization
   */
  public AbstractBsAffiliation(IPrimaryKey key, org.tair.db.community.IPerson affiliatesObject, org.tair.db.community.IOrganization organizationsObject, java.math.BigInteger organizationsCommunityId, java.math.BigInteger affiliatesCommunityId, java.lang.String jobTitle, java.lang.Boolean pi) {
    super(new AffiliationProxy(new Affiliation(key, affiliatesObject, organizationsObject, organizationsCommunityId, affiliatesCommunityId, jobTitle, pi)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IAffiliation> other = (IDto<IAffiliation>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IAffiliation> o) {
    return dto.compareTo(o.toDto());
  }

  public void markChildrenDeleted() throws DtoStatusException {
    dto.markChildrenDeleted();
  }
  
  public IPrimaryKey getPrimaryKey() {
    return dto.getPrimaryKey();
  }

  // Data member properties

  /**
   * <p>
   * the person's job title within this organization, if any
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Affiliation</li>
   * </ul>
   * </p>
   * @return a java.lang.String jobTitle
   */
  public java.lang.String getJobTitle() {
    return dto.getJobTitle();
  }

  /**
   * <p>
   * whether the person acts in the role of a principal investigator for the
   * organization
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Affiliation</li>
   * </ul>
   * </p>
   * @return a java.lang.Boolean pi
   */
  public java.lang.Boolean getPi() {
    return dto.getPi();
  }

  /**
   * <p>
   * Associated object
   * </p>
   * <p>
   * Added by AddAssociationKeyObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Affiliation</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.community.BsOrganization organization
   */
  public org.tair.bs.community.BsOrganization getOrganization() {
    // Return 4
    return new org.tair.bs.community.BsOrganization(dto.getOrganization());
  }

  /**
   * <p>
   * Associated object
   * </p>
   * <p>
   * Added by AddAssociationKeyObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Affiliation</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.community.BsPerson affiliate
   */
  public org.tair.bs.community.BsPerson getAffiliate() {
    // Return 4
    return new org.tair.bs.community.BsPerson(dto.getAffiliate());
  }

  /**
   * <p>
   * Attribute that is part of the association key
   * </p>
   * <p>
   * Added by AddGeneratedKeyProperties + AddInheritedKeyProperties + AddAssociationKeyAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Affiliation</li>
   * </ul>
   * </p>
   * @return a java.math.BigInteger organizationsCommunityId
   */
  public java.math.BigInteger getOrganizationsCommunityId() {
    return dto.getOrganizationsCommunityId();
  }

  /**
   * <p>
   * Attribute that is part of the association key
   * </p>
   * <p>
   * Added by AddGeneratedKeyProperties + AddInheritedKeyProperties + AddAssociationKeyAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Affiliation</li>
   * </ul>
   * </p>
   * @return a java.math.BigInteger affiliatesCommunityId
   */
  public java.math.BigInteger getAffiliatesCommunityId() {
    return dto.getAffiliatesCommunityId();
  }
}