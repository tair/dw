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
 * ModelFeature. This SQL specification contains a SQL statement that queries
 * a single ModelFeature object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryModelFeature implements IKeyQuerySql<org.tair.db.locusdetail.IModelFeature> {
  /** SQL query statement for ModelFeature */
  private static final String SQL =
    "SELECT geneModelName, locusTairObjectId, featureType, featureNumber, startPosition, endPosition, agiStart, agiEnd FROM ModelFeature WHERE ";

  public org.tair.db.locusdetail.IModelFeature getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.tair.db.locusdetail.LocusdetailFactory.getModelFeatureData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("");
  }
}