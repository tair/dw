/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQuery.vsl

package org.tair.db.genomicregion.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A query Command pattern object that implements a SQL key query for the 
 * Contig. This SQL specification contains a SQL statement that queries
 * a single Contig object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryContig implements IKeyQuerySql<org.tair.db.genomicregion.IContig> {
  /** SQL query statement for Contig */
  private static final String SQL =
    "SELECT Region.tairObjectIdTairObjectId, Region.name, Region.dateEntered, Contig.parentRegionTairObjectId, Contig.genome, Contig.sequence FROM Contig Contig JOIN Region Region ON Contig.tairObjectIdTairObjectId = Region.tairObjectIdTairObjectId WHERE ";

  public org.tair.db.genomicregion.IContig getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.tair.db.genomicregion.GenomicregionFactory.getContigData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("Region");
  }
}