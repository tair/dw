/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DelegateTest.vsl

package org.tair.bs.protein;


/**
 * <p>
 * A test class for the ProteinDelegate class. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class ProteinDelegateTest extends org.tair.bs.protein.AbstractProteinDelegateTest {

  @Override
  protected java.util.List<BsProteinTranscript> createProteinProteinTranscript(org.tair.db.protein.IProtein parent, int count)
      throws com.poesys.bs.delegate.DelegateException, 
             com.poesys.db.InvalidParametersException, 
             com.poesys.db.dto.DtoStatusException {
    java.util.List<BsProteinTranscript> objects = 
      new java.util.concurrent.CopyOnWriteArrayList<BsProteinTranscript>();
    
    // TODO implement child creation (see javadoc for abstract parent).

    return objects;
  }

  @Override
  protected java.util.List<BsDomain> createProteinDomain(org.tair.db.protein.IProtein parent, int count)
      throws com.poesys.bs.delegate.DelegateException, 
             com.poesys.db.InvalidParametersException, 
             com.poesys.db.dto.DtoStatusException {
    java.util.List<BsDomain> objects = 
      new java.util.concurrent.CopyOnWriteArrayList<BsDomain>();
    
    // TODO implement child creation (see javadoc for abstract parent).

    return objects;
  }

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
    return "org.tair.db.protein";
    // use super.getSubsystem() to get default subsystem name if needed
  }
}