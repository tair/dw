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
 * JournalArticle. This SQL specification contains a SQL statement that queries
 * a single JournalArticle object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryJournalArticle implements IKeyQuerySql<org.tair.db.locusdetail.IJournalArticle> {
  /** SQL query statement for JournalArticle */
  private static final String SQL =
    "SELECT Reference.locusTairObjectId, Reference.referenceTairObjectId, Reference.title, Reference.authors, Reference.publicationYear, Reference.locusCount, Reference.annotated, JournalArticle.journal, JournalArticle.pubmedId FROM JournalArticle JournalArticle JOIN Reference Reference ON JournalArticle.locusTairObjectId = Reference.locusTairObjectId AND JournalArticle.referenceTairObjectId = Reference.referenceTairObjectId WHERE ";

  public org.tair.db.locusdetail.IJournalArticle getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.tair.db.locusdetail.LocusdetailFactory.getJournalArticleData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("Reference");
  }
}