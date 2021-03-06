/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAll.vsl

package org.tair.db.locusdetail.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IQuerySql;
import com.poesys.db.pk.IPrimaryKey;

import org.tair.db.locusdetail.LocusdetailFactory;


/**
 * <p>
 * A query Command pattern object that implements a SQL query for all the 
 * JournalArticle objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllJournalArticle implements IQuerySql<org.tair.db.locusdetail.IJournalArticle> {
  /** SQL query statement for JournalArticle */
  private static final String SQL =
    "SELECT Reference.locusTairObjectId, Reference.referenceTairObjectId, Reference.title, Reference.authors, Reference.publicationYear, Reference.locusCount, Reference.annotated, JournalArticle.journal, JournalArticle.pubmedId FROM JournalArticle JournalArticle JOIN Reference Reference ON JournalArticle.locusTairObjectId = Reference.locusTairObjectId AND JournalArticle.referenceTairObjectId = Reference.referenceTairObjectId";

  public org.tair.db.locusdetail.IJournalArticle getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      LocusdetailFactory.getJournalArticlePrimaryKey(rs, "");
      
    return LocusdetailFactory.getJournalArticleData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return LocusdetailFactory.getJournalArticlePrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}