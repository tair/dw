/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAssociatedManyToManyObjects.vsl


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
 * LocusGeneModel objects using the primary key of an associated 
 * Annotation object through the association Model using the 
 * association class LocusGeneModelAnnotation. This association is a many-to-many 
 * association from LocusGeneModel to Annotation.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * LocusGeneModel objects from the database table LocusGeneModel by
 * joining to the database table LocusGeneModelAnnotation and using the 
 * primary key from Annotation to query the collection.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryModelByAnnotation 
    implements IParameterizedQuerySql<org.tair.db.locusdetail.ILocusGeneModel, org.tair.db.locusdetail.IAnnotation> {
  /** SQL query statement for LocusGeneModel */
  private static final String SQL =
    "SELECT a.locusTairObjectId, a.geneModelName, a.geneModelType, a.representative, a.spliceVariant, a.computationalDescription, a.curatedSummary, a.confidence FROM LocusGeneModel a JOIN LocusGeneModelAnnotation b ON a.geneModelName = b.geneModelName AND a.locusTairObjectId = b.locusTairObjectId WHERE b.category = ? AND b.evidenceCode = ? AND b.evidenceWith = ? AND b.keyword = ? AND b.reference = ? AND b.relationshipType = ?";

  public void bindParameters(PreparedStatement stmt, org.tair.db.locusdetail.IAnnotation parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.tair.db.locusdetail.IAnnotation parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.tair.db.locusdetail.ILocusGeneModel getData(ResultSet rs) 
      throws SQLException, ConstraintViolationException {
    IPrimaryKey key = 
      org.tair.db.locusdetail.LocusdetailFactory.getLocusGeneModelPrimaryKey(rs, "");
    return org.tair.db.locusdetail.LocusdetailFactory.getLocusGeneModelData(key, rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.tair.db.locusdetail.LocusdetailFactory.getLocusGeneModelPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}