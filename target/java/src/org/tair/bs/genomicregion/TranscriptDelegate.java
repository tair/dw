/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.genomicregion;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Transcript objects and their dependents. This class delegates to an abstract
 * class, AbstractTranscriptDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * SO:0000673: An RNA synthesized on a DNA or RNA template by an RNA polymerase.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class TranscriptDelegate extends AbstractTranscriptDelegate {
  /**
   * Create a TranscriptDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public TranscriptDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a TranscriptDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public TranscriptDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}