/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAssociatedOneToManyObjects.vsl

package org.tair.db.locusdetail.sql;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.ConstraintViolationException;
import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IParameterizedQuerySql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A query Command pattern object that implements a SQL query of a collection of 
 * ProteinResourceLink objects using the primary key of an associated 
 * ProteinModel object through the association ResourceLinks. This
 * is a many-to-one association from ProteinResourceLink to ProteinModel.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * ProteinResourceLink objects from the database using the foreign key type
 * ProteinModel.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryResourceLinksByProteinModel 
    implements IParameterizedQuerySql<org.tair.db.locusdetail.IProteinResourceLink, org.tair.db.locusdetail.IProteinModel> {
  /** SQL query statement for ProteinResourceLink */
  private static final String SQL =
    "SELECT ProteinResourceLink.geneModelName, ProteinResourceLink.locusTairObjectId, ProteinResourceLink.sequenceTairObjectId, ProteinResourceLink.name, ProteinResourceLink.icon, ProteinResourceLink.baseUrl, ProteinResourceLink.urlVariable, ProteinResourceLink.explanation FROM ProteinResourceLink WHERE ProteinResourceLink.geneModelName = ? AND ProteinResourceLink.locusTairObjectId = ? AND ProteinResourceLink.sequenceTairObjectId = ?";

  public void bindParameters(PreparedStatement stmt, org.tair.db.locusdetail.IProteinModel parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.tair.db.locusdetail.IProteinModel parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.tair.db.locusdetail.IProteinResourceLink getData(ResultSet rs) throws SQLException,
      ConstraintViolationException {
    return org.tair.db.locusdetail.LocusdetailFactory.getProteinResourceLinkData(getPrimaryKey(rs), rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.tair.db.locusdetail.LocusdetailFactory.getProteinResourceLinkPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}