/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * JournalArticle objects and their dependents. This class delegates to an abstract
 * class, AbstractJournalArticleDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * A journal article reference available in PubMed that refers to the locus
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class JournalArticleDelegate extends AbstractJournalArticleDelegate {
  /**
   * Create a JournalArticleDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public JournalArticleDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a JournalArticleDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public JournalArticleDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}