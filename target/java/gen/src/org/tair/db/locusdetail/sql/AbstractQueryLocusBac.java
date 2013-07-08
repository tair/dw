/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQuery.vsl

package org.tair.db.locusdetail.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A query Command pattern object that implements a SQL key query for the 
 * LocusBac. This SQL specification contains a SQL statement that queries
 * a single LocusBac object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryLocusBac implements IKeyQuerySql<org.tair.db.locusdetail.ILocusBac> {
  /** SQL query statement for LocusBac */
  private static final String SQL =
    "SELECT locusTairObjectId, bacTairObjectId, name, icAccession, length, startPosition, endPosition, cloneTairObjectId FROM LocusBac WHERE ";

  public org.tair.db.locusdetail.ILocusBac getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.tair.db.locusdetail.LocusdetailFactory.getLocusBacData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("");
  }
}