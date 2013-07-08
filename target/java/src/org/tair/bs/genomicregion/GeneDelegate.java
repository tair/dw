/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.genomicregion;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Gene objects and their dependents. This class delegates to an abstract
 * class, AbstractGeneDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * SO_0000704: A region (or regions) that includes all of the sequence elements
 * necessary to encode a functional transcript. A gene may include regulatory
 * regions, transcribed regions and/or other functional sequence regions.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class GeneDelegate extends AbstractGeneDelegate {
  /**
   * Create a GeneDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public GeneDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a GeneDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public GeneDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}