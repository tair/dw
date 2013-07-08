/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAll.vsl

package org.tair.db.locusdetail.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IQuerySql;
import com.poesys.db.pk.IPrimaryKey;

import org.tair.db.locusdetail.LocusdetailFactory;


/**
 * <p>
 * A query Command pattern object that implements a SQL query for all the 
 * Domain objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllDomain implements IQuerySql<org.tair.db.locusdetail.IDomain> {
  /** SQL query statement for Domain */
  private static final String SQL =
    "SELECT accession, accessionUrl, domain, domainUrl, database, databaseUrl, structuralClassType, classUrl FROM Domain";

  public org.tair.db.locusdetail.IDomain getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      LocusdetailFactory.getDomainPrimaryKey(rs, "");
      
    return LocusdetailFactory.getDomainData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return LocusdetailFactory.getDomainPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}