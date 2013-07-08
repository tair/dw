/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.community;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Country objects and their dependents. This class delegates to an abstract
 * class, AbstractCountryDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * 
 * 
 * @author Poesys/DB Cartridge
 */
public class CountryDelegate extends AbstractCountryDelegate {
  /**
   * Create a CountryDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public CountryDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a CountryDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public CountryDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}