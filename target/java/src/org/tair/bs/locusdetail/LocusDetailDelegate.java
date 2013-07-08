/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * LocusDetail objects and their dependents. This class delegates to an abstract
 * class, AbstractLocusDetailDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * The central object of the subsystem, a locus, which is the location on a
 * chromosome of a gene (the concept of a physical DNA structure that maps into a
 * protein or RNA molecule and has distinct function)
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class LocusDetailDelegate extends AbstractLocusDetailDelegate {
  /**
   * Create a LocusDetailDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public LocusDetailDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a LocusDetailDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public LocusDetailDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}