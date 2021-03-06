/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractInsert.vsl

package org.tair.db.locusdetail.sql;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for inserting a LocusBac
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertLocusBac implements IInsertSql<org.tair.db.locusdetail.ILocusBac> {
  private static final String SQL =
    "INSERT INTO LocusBac (bacTairObjectId, locusTairObjectId, name, icAccession, length, startPosition, endPosition, cloneTairObjectId) VALUES (?,?,?,?,?,?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.locusdetail.ILocusBac object)
      throws SQLException {
    stmt.setString(index, object.getName());
    index++;
    stmt.setString(index, object.getIcAccession());
    index++;
    stmt.setLong(index, object.getLength());
    index++;
    stmt.setLong(index, object.getStart());
    index++;
    stmt.setLong(index, object.getEnd());
    index++;
    stmt.setLong(index, object.getCloneTairObjectId());
    index++;
  }
}
