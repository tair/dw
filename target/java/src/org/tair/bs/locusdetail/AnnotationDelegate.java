/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Annotation objects and their dependents. This class delegates to an abstract
 * class, AbstractAnnotationDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * A unique combination of category, relationship type, keyword, evidence code,
 * evidence description, evidence-with, and reference that constitutes a functional
 * annotation of a genomic object such as a locus or gene model
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class AnnotationDelegate extends AbstractAnnotationDelegate {
  /**
   * Create a AnnotationDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public AnnotationDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a AnnotationDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public AnnotationDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}