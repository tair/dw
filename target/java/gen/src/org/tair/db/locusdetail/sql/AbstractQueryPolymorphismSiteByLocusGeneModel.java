/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAssociatedLinks.vsl

package org.tair.db.locusdetail.sql;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.ConstraintViolationException;
import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IParameterizedQuerySql;
import com.poesys.db.pk.IPrimaryKey;

import org.tair.db.locusdetail.LocusdetailFactory;


/**
 * <p>
 * A query Command pattern object that implements a SQL query of a collection of 
 * PolymorphismSite objects using the primary key of the associated
 * class LocusGeneModel. These objects are the linking objects from the SQL 
 * table PolymorphismSite rather than the objects associated through
 * the link (LocusPolymorphism), which have a separate representation.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryPolymorphismSiteByLocusGeneModel 
    implements IParameterizedQuerySql<org.tair.db.locusdetail.IPolymorphismSite, org.tair.db.locusdetail.ILocusGeneModel> {
  /** SQL query statement for PolymorphismSite */
  private static final String SQL =
    "SELECT lociLocus, lociLocus, locusTairObjectId, polymorphismName, site FROM PolymorphismSite WHERE lociLocus = ? AND lociLocus = ?";

  public void bindParameters(PreparedStatement stmt, org.tair.db.locusdetail.ILocusGeneModel parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.tair.db.locusdetail.ILocusGeneModel parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.tair.db.locusdetail.IPolymorphismSite getData(ResultSet rs) throws SQLException,
      ConstraintViolationException {
    return LocusdetailFactory.getPolymorphismSiteData(getPrimaryKey(rs), rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return LocusdetailFactory.getPolymorphismSitePrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}