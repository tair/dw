/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.genomicregion;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Chromosome objects and their dependents. This class delegates to an abstract
 * class, AbstractChromosomeDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * SO_0000340: Structural unit composed of a nucleic acid molecule which controls
 * its own replication through the interaction of specific proteins at one or more
 * origins of replication.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class ChromosomeDelegate extends AbstractChromosomeDelegate {
  /**
   * Create a ChromosomeDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public ChromosomeDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a ChromosomeDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public ChromosomeDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}