/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractInsert.vsl

package org.tair.db.protein.sql;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for inserting a Domain
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertDomain implements IInsertSql<org.tair.db.protein.IDomain> {
  private static final String SQL =
    "INSERT INTO Domain (domainTairObjectId, tairObjectId, name, database, structuralClassType, accession, interproAccession, interpro, startPosition, endPosition) VALUES (?,?,?,?,?,?,?,?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.protein.IDomain object)
      throws SQLException {
    stmt.setString(index, object.getName());
    index++;
    stmt.setString(index, object.getDatabase());
    index++;
    stmt.setString(index, object.getStructuralClassType());
    index++;
    stmt.setString(index, object.getAccession());
    index++;
    stmt.setString(index, object.getInterproAccession());
    index++;
    stmt.setString(index, object.getInterpro());
    index++;
    stmt.setInt(index, object.getStartPosition());
    index++;
    stmt.setInt(index, object.getEndPosition());
    index++;
  }
}
