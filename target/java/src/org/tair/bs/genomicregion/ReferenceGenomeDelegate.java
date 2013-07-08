/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.genomicregion;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * ReferenceGenome objects and their dependents. This class delegates to an abstract
 * class, AbstractReferenceGenomeDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * SO_0001505: A collection of sequences (often chromosomes) taken as the standard
 * for a given organism and genome assembly
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class ReferenceGenomeDelegate extends AbstractReferenceGenomeDelegate {
  /**
   * Create a ReferenceGenomeDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public ReferenceGenomeDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a ReferenceGenomeDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public ReferenceGenomeDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}