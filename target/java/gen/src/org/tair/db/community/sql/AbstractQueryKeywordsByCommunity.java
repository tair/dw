/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAssociatedOneToManyObjects.vsl

package org.tair.db.community.sql;


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
 * CommunityKeyword objects using the primary key of an associated 
 * Community object through the association Keywords. This
 * is a many-to-one association from CommunityKeyword to Community.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * CommunityKeyword objects from the database using the foreign key type
 * Community.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryKeywordsByCommunity 
    implements IParameterizedQuerySql<org.tair.db.community.ICommunityKeyword, org.tair.db.community.ICommunity> {
  /** SQL query statement for CommunityKeyword */
  private static final String SQL =
    "SELECT CommunityKeyword.communityId, CommunityKeyword.keyword, CommunityKeyword.keywordType FROM CommunityKeyword WHERE CommunityKeyword.communityId = ?";

  public void bindParameters(PreparedStatement stmt, org.tair.db.community.ICommunity parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.tair.db.community.ICommunity parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.tair.db.community.ICommunityKeyword getData(ResultSet rs) throws SQLException,
      ConstraintViolationException {
    return org.tair.db.community.CommunityFactory.getCommunityKeywordData(getPrimaryKey(rs), rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.tair.db.community.CommunityFactory.getCommunityKeywordPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}