/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DelegateTest.vsl

package org.tair.bs.locusdetail;


/**
 * <p>
 * A test class for the JournalArticleDelegate class. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class JournalArticleDelegateTest extends org.tair.bs.locusdetail.AbstractJournalArticleDelegateTest {

  @Override
  protected java.lang.Long getTestKeyLocusTairObjectId(int objectNumber) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  protected java.lang.Long getTestKeyReferenceTairObjectId(int objectNumber) {
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
    return "org.tair.db.locusdetail";
    // use super.getSubsystem() to get default subsystem name if needed
  }
}