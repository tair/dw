/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractSubsystemDelegateFactory.vsl

package org.tair.bs.genomicregion;


/**
 * <p>
 * A set of factory methods for the instantiable business delegates in the 
 * Genomicregion subsystem. This class is abstract and has a single concrete 
 * subclass, GenomicregionDelegateFactory, that you can modify to override
 * the default behavior in the abstract class or implement an as-yet 
 * unimplemented delegate factory. You can, for example, override all the
 * factory methods with a different connection strategy.
 * </p>
 * <p>
 * the subsystem that contains information about genomes and their genomic regions
 * (chromosomes or scaffolds, features, and so on)
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractGenomicregionDelegateFactory {
  /** 
   * The fully qualified name of the Genomicregion subsystem properties file,
   * not including the locale information. This comes from the UML subsystem
   * as the package name concatenated to the subsystem name (the fully qualified
   * subsystem name). The actual file is then in the package with the subsystem 
   * name concatenated to the locale name followed by the .properties extension.
   * For example, the subsystem genomicregion in the org.tair.db 
   * package has the property file org.tair.db.genomicregion_en_US.properties
   * for the default locale english (US).
   */
  private static final String PROPERTY_FILE = "org.tair.db.genomicregion";
    
  /** Resource bundle for subsystem property file */
  private static final java.util.ResourceBundle rb =
    java.util.ResourceBundle.getBundle(PROPERTY_FILE);

  /** Initialize the subsystem name from the property file. */
  private static final String subsystem = rb.getString("subsystem");
  
  /** Initialize the distributed( memcached)  DAO manager for the subsystem. */
  protected static final com.poesys.db.dao.IDaoManager manager = 
    com.poesys.db.dao.DaoManagerFactory.initMemcachedManager(subsystem);
    
  /**
   * Get the ReferenceGenomeDelegate. The file Genomicregion.properties supplies the
   * database subsystem for the delegate to use. The method enables caching and
   * constructs the Delegate with the subsystem from the property file. The
   * database and password are set from the database properties file entries
   * for the subsystem.
   * 
   * @return the delegate
   */
  public static ReferenceGenomeDelegate getReferenceGenomeDelegate() {
    return new ReferenceGenomeDelegate(subsystem);
  }
  
  /**
   * Get the ReferenceGenomeDelegate. The file Genomicregion.properties supplies the
   * database subsystem for the delegate to use. The method enables caching and
   * constructs the Delegate with the subsystem from the property file. The
   * system uses the JNDI name to determine the data source.
   * 
   * @return the delegate
   */
  public static ReferenceGenomeDelegate getJndiReferenceGenomeDelegate() {
    return new ReferenceGenomeDelegate(subsystem, 
                                   com.poesys.db.connection.IConnectionFactory.DBMS.JNDI);
  }
  /**
   * Get the TranscriptDelegate. The file Genomicregion.properties supplies the
   * database subsystem for the delegate to use. The method enables caching and
   * constructs the Delegate with the subsystem from the property file. The
   * database and password are set from the database properties file entries
   * for the subsystem.
   * 
   * @return the delegate
   */
  public static TranscriptDelegate getTranscriptDelegate() {
    return new TranscriptDelegate(subsystem);
  }
  
  /**
   * Get the TranscriptDelegate. The file Genomicregion.properties supplies the
   * database subsystem for the delegate to use. The method enables caching and
   * constructs the Delegate with the subsystem from the property file. The
   * system uses the JNDI name to determine the data source.
   * 
   * @return the delegate
   */
  public static TranscriptDelegate getJndiTranscriptDelegate() {
    return new TranscriptDelegate(subsystem, 
                                   com.poesys.db.connection.IConnectionFactory.DBMS.JNDI);
  }
  /**
   * Get the ChromosomeDelegate. The file Genomicregion.properties supplies the
   * database subsystem for the delegate to use. The method enables caching and
   * constructs the Delegate with the subsystem from the property file. The
   * database and password are set from the database properties file entries
   * for the subsystem.
   * 
   * @return the delegate
   */
  public static ChromosomeDelegate getChromosomeDelegate() {
    return new ChromosomeDelegate(subsystem);
  }
  
  /**
   * Get the ChromosomeDelegate. The file Genomicregion.properties supplies the
   * database subsystem for the delegate to use. The method enables caching and
   * constructs the Delegate with the subsystem from the property file. The
   * system uses the JNDI name to determine the data source.
   * 
   * @return the delegate
   */
  public static ChromosomeDelegate getJndiChromosomeDelegate() {
    return new ChromosomeDelegate(subsystem, 
                                   com.poesys.db.connection.IConnectionFactory.DBMS.JNDI);
  }
  /**
   * Get the ContigDelegate. The file Genomicregion.properties supplies the
   * database subsystem for the delegate to use. The method enables caching and
   * constructs the Delegate with the subsystem from the property file. The
   * database and password are set from the database properties file entries
   * for the subsystem.
   * 
   * @return the delegate
   */
  public static ContigDelegate getContigDelegate() {
    return new ContigDelegate(subsystem);
  }
  
  /**
   * Get the ContigDelegate. The file Genomicregion.properties supplies the
   * database subsystem for the delegate to use. The method enables caching and
   * constructs the Delegate with the subsystem from the property file. The
   * system uses the JNDI name to determine the data source.
   * 
   * @return the delegate
   */
  public static ContigDelegate getJndiContigDelegate() {
    return new ContigDelegate(subsystem, 
                                   com.poesys.db.connection.IConnectionFactory.DBMS.JNDI);
  }
  /**
   * Get the GeneDelegate. The file Genomicregion.properties supplies the
   * database subsystem for the delegate to use. The method enables caching and
   * constructs the Delegate with the subsystem from the property file. The
   * database and password are set from the database properties file entries
   * for the subsystem.
   * 
   * @return the delegate
   */
  public static GeneDelegate getGeneDelegate() {
    return new GeneDelegate(subsystem);
  }
  
  /**
   * Get the GeneDelegate. The file Genomicregion.properties supplies the
   * database subsystem for the delegate to use. The method enables caching and
   * constructs the Delegate with the subsystem from the property file. The
   * system uses the JNDI name to determine the data source.
   * 
   * @return the delegate
   */
  public static GeneDelegate getJndiGeneDelegate() {
    return new GeneDelegate(subsystem, 
                                   com.poesys.db.connection.IConnectionFactory.DBMS.JNDI);
  }
}