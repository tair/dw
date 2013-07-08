/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelegate.vsl

package org.tair.bs.genomicregion;


import com.poesys.bs.delegate.AbstractDataDelegate;
import com.poesys.bs.delegate.DelegateException;
import com.poesys.db.connection.IConnectionFactory.DBMS;
import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.dao.update.IUpdateSql;
import com.poesys.db.dao.delete.IDeleteSql;
import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.dao.query.IQuerySql;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Contig objects and their dependents. You should not modify this class;
 * instead, override or add methods in the class ContigDelegate, which
 * specializes this class.
 * </p>
 * <p>
 * SO_0000149: A contiguous sequence derived from sequence assembly. Has no gaps,
 * but may contain N's from unavailable bases.
 * </p>
 * @see ContigDelegate
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractContigDelegate
    extends AbstractDataDelegate<BsContig, org.tair.db.genomicregion.IContig, com.poesys.db.pk.NaturalPrimaryKey> {
  /**
   * Create an AbstractContigDelegate object by supplying the database
   * subsystem in the database.properties file.
   * 
   * @param subsystem the database subsystem to use in database.properties
   */
  public AbstractContigDelegate(String subsystem) {
    super(subsystem, 2147483647);
  }

  /**
   * Create an AbstractContigDelegate object by supplying the database
   * subsystem in the database.properties file and a specific DBMS, usually
   * IConnectionFactory.DBMS.JNDI.
   * 
   * @param subsystem the database subsystem to use in database.properties
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public AbstractContigDelegate(String subsystem, DBMS dbms) {
    super(subsystem, dbms, 2147483647);
  }

  @Override
  protected String getClassName() {
    return org.tair.db.genomicregion.Contig.class.getName();
  }

  @Override
  protected IInsertSql<org.tair.db.genomicregion.IContig> getInsertSql() {
    return new org.tair.db.genomicregion.sql.InsertContig();
  }

  @Override
  protected IDeleteSql<org.tair.db.genomicregion.IContig> getDeleteSql() {
    return new org.tair.db.genomicregion.sql.DeleteContig();
  }

  @Override
  protected IUpdateSql<org.tair.db.genomicregion.IContig> getUpdateSql() {
    return new org.tair.db.genomicregion.sql.UpdateContig();
  }

  @Override
  protected IKeyQuerySql<org.tair.db.genomicregion.IContig> getQueryByKeySql() {
    return new org.tair.db.genomicregion.sql.QueryContig();
  }

  @Override
  protected IQuerySql<org.tair.db.genomicregion.IContig> getQueryListSql() {
    // Query-All method not required
    return new org.tair.db.genomicregion.sql.QueryAllContig();
  }

  @Override
  protected org.tair.bs.genomicregion.BsContig wrapData(org.tair.db.genomicregion.IContig dto) {
    return new org.tair.bs.genomicregion.BsContig(dto);
  }

  /**
   * <p>
   * Create a new Contig with data fields.
   * </p>
   * <p>
   * The Contig class has no key of its own but inherits from a superclass
   * that has a NaturalKey. When you create an instance of this
   * class, the delegate creates a key of that type in the superclass.
   * </p>
   * 
   * @param tairObjectId the unique identifier in the TAIR database for the region (locus, gene,
chromosome, contig)
   * @param name the name of the genomic region, such as the chromosome name (1, M), the
locus/gene name (AT1G01010), the transcript name (AT1G01010.1), or the contig
name (MI421-MI421); may or may not be unique within a genome
   * @param dateEntered the date on which the region was created in the source database
   * @param parentRegionTairObjectId foreign key used by setter to query associated object
   * @param genome foreign key used by setter to query associated object
   * @param sequence the complete DNA sequence for the contig
   * @return the new Contig object
   * @throws DelegateException when there is a problem generating the key or
   *             creating the object
   */
  public org.tair.bs.genomicregion.BsContig createContig(java.lang.Long tairObjectId, java.lang.String name, java.sql.Timestamp dateEntered, java.lang.Long parentRegionTairObjectId, java.lang.String genome, java.lang.String sequence)
      throws DelegateException {
    com.poesys.db.pk.NaturalPrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.LongColumnValue("tairObjectIdTairObjectId", tairObjectId));
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.genomicregion.Contig");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a data-access DTO for direct access, no proxy required.
    org.tair.db.genomicregion.IContig dto =
      new org.tair.db.genomicregion.Contig(key, tairObjectId, name, dateEntered, parentRegionTairObjectId, genome, sequence);

    // Create the business DTO.
    return new org.tair.bs.genomicregion.BsContig(dto);
  }


  @Override
  public void insert(java.util.List<BsContig> list) throws DelegateException {
    java.sql.Connection c = getConnection();
    
    // Create superclass inserters.
    
    // Region
    final com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.IRegion> regionFactory =
      manager.getFactory("org.tair.db.genomicregion.Region", "org.tair.db.genomicregion", 2147483647);
    // Key type: NaturalKey, Inherited Key type: None
    com.poesys.db.dao.insert.IInsertBatch<org.tair.db.genomicregion.IRegion> regionInserter =
      regionFactory.getInsertBatch(new org.tair.db.genomicregion.sql.InsertRegion());
    java.util.Collection<org.tair.db.genomicregion.IRegion> regionDtos = convertDtoList(list);
    
    // Contig (uses standard class factory from AbstractDataDelegate) None NaturalKey
    com.poesys.db.dao.insert.IInsertBatch<org.tair.db.genomicregion.IContig> contigInserter =
      factory.getInsertBatch(getInsertSql());
    java.util.Collection<org.tair.db.genomicregion.IContig> contigDtos = convertDtoList(list);

    try {
      // Insert the superclass objects from the root down.
      regionInserter.insert(c, regionDtos, regionDtos.size() / 2);
      // Undo the status change (EXISTS goes back to NEW) to allow next class to insert.
      undoStatus(regionDtos);
      // Insert the object of the current class.
      contigInserter.insert(c, contigDtos, contigDtos.size() / 2);
    } catch (com.poesys.db.ConstraintViolationException e) {
      rollBack(c, e.getMessage(), e);
    } catch (java.sql.SQLException e) {
      rollBack(c, e.getMessage(), e);
    } catch (com.poesys.db.BatchException e) {
      // Don't roll back the whole transaction; the DBMS rolls back the
      // individual inserts that failed, but the rest should be committed.
      String message = com.poesys.db.Message.getMessage(e.getMessage(), null);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.dto.DtoStatusException e) {
      rollBack(c, e.getMessage(), e);
    } finally {
      commit(c);
      close(c);
      finalizeStatus(contigDtos, com.poesys.db.dto.IDbDto.Status.EXISTING);
    }
  }

  @Override
  public void process(java.util.List<BsContig> list) throws DelegateException {
    java.sql.Connection c = getConnection();

    // Create the 3 DAOs for inserting, updating, and deleting.
    com.poesys.db.dao.insert.IInsertBatch<org.tair.db.genomicregion.IContig> inserter = 
      factory.getInsertBatch(getInsertSql());
    com.poesys.db.dao.update.IUpdateBatch<org.tair.db.genomicregion.IContig> updater = 
      factory.getUpdateBatch(getUpdateSql());
    com.poesys.db.dao.delete.IDeleteBatch<org.tair.db.genomicregion.IContig> deleter = 
      factory.getDeleteBatch(getDeleteSql());

    java.util.Collection<org.tair.db.genomicregion.IContig> dtos = convertDtoList(list);

    // Create the DAOs for inserting the superclasses.
    // Region
    final com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.IRegion> regionFactory =
      manager.getFactory("org.tair.db.genomicregion.Region", "org.tair.db.genomicregion.Region", 2147483647);
    com.poesys.db.dao.insert.IInsertBatch<org.tair.db.genomicregion.IRegion> regionInserter =
      regionFactory.getInsertBatch(new org.tair.db.genomicregion.sql.InsertRegion());
    java.util.Collection<org.tair.db.genomicregion.IRegion> regionDtos = convertDtoList(list);
    

    // Delete, insert, and update the objects. Each DAO will process only those
    // objects that have the appropriate status for the operation.
    try {
      if (deleter != null) {
        deleter.delete(c, dtos, dtos.size() / 2);
      }

      // Insert the superclass objects from the root down.
      if (regionInserter != null) {
        regionInserter.insert(c, regionDtos, regionDtos.size() / 2);
        // Undo the status change (EXISTS goes back to NEW) to allow next class to insert.
        undoStatus(regionDtos);
      }
      
      // Insert the leaf object.
      if (inserter != null) {
        inserter.insert(c, dtos, dtos.size() / 2);
      }
      
      // Update the object.
      if (updater != null) {
        updater.update(c, dtos, dtos.size() / 2);
      }
    } catch (com.poesys.db.ConstraintViolationException e) {
      rollBack(c, e.getMessage(), e);
    } catch (java.sql.SQLException e) {
      rollBack(c, e.getMessage(), e);
    } catch (com.poesys.db.BatchException e) {
      // Don't roll back the whole transaction; the DBMS rolls back the
      // individual operations that failed, but the rest should be committed.
      String message = com.poesys.db.Message.getMessage(e.getMessage(), null);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.dto.DtoStatusException e) {
      String message = com.poesys.db.Message.getMessage(e.getMessage(), null);
      rollBack(c, message, e);
    } finally {
      commit(c);
      close(c);
      finalizeStatus(dtos, com.poesys.db.dto.IDbDto.Status.EXISTING);
      finalizeStatus(dtos, com.poesys.db.dto.IDbDto.Status.DELETED);
    }
  }
}