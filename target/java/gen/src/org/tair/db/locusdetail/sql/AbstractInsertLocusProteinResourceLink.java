/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractInsert.vsl

package org.tair.db.locusdetail.sql;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for inserting a LocusProteinResourceLink
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertLocusProteinResourceLink implements IInsertSql<org.tair.db.locusdetail.ILocusProteinResourceLink> {
  private static final String SQL =
    "INSERT INTO LocusProteinResourceLink (locusTairObjectId, name, icon, baseUrl, urlVariable, explanation) VALUES (?,?,?,?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.locusdetail.ILocusProteinResourceLink object)
      throws SQLException {
    stmt.setString(index, object.getIcon());
    index++;
    stmt.setString(index, object.getBaseUrl());
    index++;
    stmt.setString(index, object.getUrlVariable());
    index++;
    stmt.setString(index, object.getExplanation());
    index++;
  }
}
