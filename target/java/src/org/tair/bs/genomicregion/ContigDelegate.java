/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.genomicregion;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Contig objects and their dependents. This class delegates to an abstract
 * class, AbstractContigDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * SO_0000149: A contiguous sequence derived from sequence assembly. Has no gaps,
 * but may contain N's from unavailable bases.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class ContigDelegate extends AbstractContigDelegate {
  /**
   * Create a ContigDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public ContigDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a ContigDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public ContigDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}