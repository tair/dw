/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.protein;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Protein objects and their dependents. This class delegates to an abstract
 * class, AbstractProteinDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * An amino acid possibly related to a transcript
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class ProteinDelegate extends AbstractProteinDelegate {
  /**
   * Create a ProteinDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public ProteinDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a ProteinDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public ProteinDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}