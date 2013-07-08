/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DelegateTest.vsl

package org.tair.bs.community;


/**
 * <p>
 * A test class for the CountryDelegate class. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class CountryDelegateTest extends org.tair.bs.community.AbstractCountryDelegateTest {

  @Override
  protected java.math.BigInteger getTestKeyCountryId(int objectNumber) {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public void testGetAllObjects() {
    // Too many objects to get, super.testGetAllObjects() if desired
  }
  
  @Override
  protected String getSubsystem() {
    // return explicit subsystem name
    return "org.tair.db.community";
    // use super.getSubsystem() to get default subsystem name if needed
  }
}