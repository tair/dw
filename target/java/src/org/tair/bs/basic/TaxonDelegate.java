/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.basic;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Taxon objects and their dependents. This class delegates to an abstract
 * class, AbstractTaxonDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * The species identification for a set of loci
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class TaxonDelegate extends AbstractTaxonDelegate {
  /**
   * Create a TaxonDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public TaxonDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a TaxonDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public TaxonDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}