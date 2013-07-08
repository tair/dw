/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * LocusInducedPolymorphism objects and their dependents. This class delegates to an abstract
 * class, AbstractLocusInducedPolymorphismDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * A lab-created, non-natural mutation; for example, T-DNA, transposon, and
 * chemically-generated polymorphisms are considered induced. Induced polymorphisms
 * are differences within a single ecotype, whereas natural variation polymorphisms
 * differ between ecotypes.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class LocusInducedPolymorphismDelegate extends AbstractLocusInducedPolymorphismDelegate {
  /**
   * Create a LocusInducedPolymorphismDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public LocusInducedPolymorphismDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a LocusInducedPolymorphismDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public LocusInducedPolymorphismDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}