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
 * SQL statement specification for inserting a Taxon
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertTaxon implements IInsertSql<org.tair.db.locusdetail.ITaxon> {
  private static final String SQL =
    "INSERT INTO Taxon (taxonId, genus, species, common) VALUES (?,?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.locusdetail.ITaxon object)
      throws SQLException {
    stmt.setString(index, object.getGenus());
    index++;
    stmt.setString(index, object.getSpecies());
    index++;
    stmt.setString(index, object.getCommon());
    index++;
  }
}
