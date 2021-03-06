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
 * LocusPolymorphism objects using the primary key of an associated 
 * LocusGeneModel object through the association Polymorphism using the 
 * association class PolymorphismSite. This association is a many-to-many 
 * association from LocusPolymorphism to LocusGeneModel.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * LocusPolymorphism objects from the database table LocusPolymorphism by
 * joining to the database table PolymorphismSite and using the 
 * primary key from LocusGeneModel to query the collection.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryPolymorphismByLocusGeneModel 
    implements IParameterizedQuerySql<org.tair.db.locusdetail.ILocusPolymorphism, org.tair.db.locusdetail.ILocusGeneModel> {
  /** SQL query statement for LocusPolymorphism */
  private static final String SQL =
    "SELECT a.locusTairObjectId, a.polymorphismName, a.polymorphismTairObjectId, a.polymorphismType, a.length, a.startPosition, a.endPosition, LocusInducedPolymorphism.inheritance, LocusInducedPolymorphism.alleleType, LocusInducedPolymorphism.accession, LocusInducedPolymorphism.name, LocusInducedPolymorphism.taxonId, LocusNaturalVariation.detail, LocusNaturalVariation.referenceAccession, LocusNaturalVariation.referenceEcotype, LocusNaturalVariation.referenceTaxonId, CASE WHEN LocusInducedPolymorphism.locusTairObjectId IS NOT NULL THEN 'LocusInducedPolymorphism' WHEN LocusInducedPolymorphism.polymorphismName IS NOT NULL THEN 'LocusInducedPolymorphism' WHEN LocusNaturalVariation.locusTairObjectId IS NOT NULL THEN 'LocusNaturalVariation' WHEN LocusNaturalVariation.polymorphismName IS NOT NULL THEN 'LocusNaturalVariation' ELSE NULL END AS discriminant FROM LocusPolymorphism a JOIN PolymorphismSite b ON a.locusTairObjectId = b.locusTairObjectId AND a.polymorphismName = b.polymorphismName LEFT OUTER JOIN LocusInducedPolymorphism LocusInducedPolymorphism ON a.locusTairObjectId = LocusInducedPolymorphism.locusTairObjectId AND a.polymorphismName = LocusInducedPolymorphism.polymorphismName LEFT OUTER JOIN LocusNaturalVariation LocusNaturalVariation ON a.locusTairObjectId = LocusNaturalVariation.locusTairObjectId AND a.polymorphismName = LocusNaturalVariation.polymorphismName WHERE b.lociLocus = ? AND b.lociLocus = ?";

  public void bindParameters(PreparedStatement stmt, org.tair.db.locusdetail.ILocusGeneModel parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.tair.db.locusdetail.ILocusGeneModel parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.tair.db.locusdetail.ILocusPolymorphism getData(ResultSet rs) 
      throws SQLException, ConstraintViolationException {
    // LocusPolymorphism has subclasses, so the query returns an object of the actual
    // type rather than just of type LocusPolymorphism. It uses a discriminant expression
    // that the result set returns to figure out which class to instantiate.
    
    // Get the discriminant from the result set.
    String discriminant = rs.getString("discriminant");
    org.tair.db.locusdetail.ILocusPolymorphism data = null;
    // Check for LocusInducedPolymorphism, set return only if not already set
    if (discriminant != null && discriminant.equals("LocusInducedPolymorphism") && data == null) {
      // Use the locusdetail factory to get the data.
      IPrimaryKey key = 
        org.tair.db.locusdetail.LocusdetailFactory.getLocusInducedPolymorphismPrimaryKey(rs, "");
      data = org.tair.db.locusdetail.LocusdetailFactory.getLocusInducedPolymorphismData(key, rs);
    }
    // Check for LocusNaturalVariation, set return only if not already set
    if (discriminant != null && discriminant.equals("LocusNaturalVariation") && data == null) {
      // Use the locusdetail factory to get the data.
      IPrimaryKey key = 
        org.tair.db.locusdetail.LocusdetailFactory.getLocusNaturalVariationPrimaryKey(rs, "");
      data = org.tair.db.locusdetail.LocusdetailFactory.getLocusNaturalVariationData(key, rs);
    }
    return data;
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.tair.db.locusdetail.LocusdetailFactory.getLocusPolymorphismPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}