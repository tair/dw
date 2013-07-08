/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DelegateTest.vsl

package org.tair.bs.genomicregion;


/**
 * <p>
 * A test class for the GeneDelegate class. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class GeneDelegateTest extends org.tair.bs.genomicregion.AbstractGeneDelegateTest {

  @Override
  public void testTruncateTable() {
    // Truncate usually is hard; super.testTruncateTable() if desired
  }

  @Override
  public void testGetAllObjects() {
    // Too many objects to get, super.testGetAllObjects() if desired
  }
  
  @Override
  protected String getSubsystem() {
    // return explicit subsystem name
    return "org.tair.db.genomicregion";
    // use super.getSubsystem() to get default subsystem name if needed
  }
}