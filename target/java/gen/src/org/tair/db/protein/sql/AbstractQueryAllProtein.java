/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAll.vsl

package org.tair.db.protein.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IQuerySql;
import com.poesys.db.pk.IPrimaryKey;

import org.tair.db.protein.ProteinFactory;


/**
 * <p>
 * A query Command pattern object that implements a SQL query for all the 
 * Protein objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllProtein implements IQuerySql<org.tair.db.protein.IProtein> {
  /** SQL query statement for Protein */
  private static final String SQL =
    "SELECT tairObjectId, name, sequence, genbankGi, genPept, molecularWeight, isoelectricPoint, length, dateLastModified FROM Protein";

  public org.tair.db.protein.IProtein getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      ProteinFactory.getProteinPrimaryKey(rs, "");
      
    return ProteinFactory.getProteinData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return ProteinFactory.getProteinPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}