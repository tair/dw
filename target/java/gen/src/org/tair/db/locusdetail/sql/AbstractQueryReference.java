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
 * Reference. This SQL specification contains a SQL statement that queries
 * a single Reference object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryReference implements IKeyQuerySql<org.tair.db.locusdetail.IReference> {
  /** SQL query statement for Reference */
  private static final String SQL =
    "SELECT Reference.locusTairObjectId, Reference.referenceTairObjectId, Reference.title, Reference.authors, Reference.publicationYear, Reference.locusCount, Reference.annotated, ConferenceAbstract.conference, JournalArticle.journal, JournalArticle.pubmedId, CASE WHEN ConferenceAbstract.locusTairObjectId IS NOT NULL THEN 'ConferenceAbstract' WHEN ConferenceAbstract.referenceTairObjectId IS NOT NULL THEN 'ConferenceAbstract' WHEN JournalArticle.locusTairObjectId IS NOT NULL THEN 'JournalArticle' WHEN JournalArticle.referenceTairObjectId IS NOT NULL THEN 'JournalArticle' ELSE NULL END AS discriminant FROM Reference LEFT OUTER JOIN ConferenceAbstract ConferenceAbstract ON Reference.locusTairObjectId = ConferenceAbstract.locusTairObjectId AND Reference.referenceTairObjectId = ConferenceAbstract.referenceTairObjectId LEFT OUTER JOIN JournalArticle JournalArticle ON Reference.locusTairObjectId = JournalArticle.locusTairObjectId AND Reference.referenceTairObjectId = JournalArticle.referenceTairObjectId WHERE ";

  public org.tair.db.locusdetail.IReference getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    // Reference has concrete subclasses, so the query returns an object of the actual
    // type rather than just of type Reference. It uses a discriminant expression
    // that the result set returns to figure out which class to instantiate.
    
    // Get the discriminant from the result set.
    String discriminant = rs.getString("discriminant");
    
    // Check whether the discriminant is null and throw exception.
    if (discriminant == null) {
      throw new com.poesys.bs.delegate.DelegateException("Missing subclass for queried object of superclass org.tair.db.locusdetail.Reference");
    }
    
    org.tair.db.locusdetail.IReference data = null;
    // Check for ConferenceAbstract, set return only if not already set
    if (discriminant.equals("ConferenceAbstract") && data == null) {
      // Use the locusdetail factory to get the data.
      data = org.tair.db.locusdetail.LocusdetailFactory.getConferenceAbstractData(key, rs);
    }
    // Check for JournalArticle, set return only if not already set
    if (discriminant.equals("JournalArticle") && data == null) {
      // Use the locusdetail factory to get the data.
      data = org.tair.db.locusdetail.LocusdetailFactory.getJournalArticleData(key, rs);
    }
    return data;
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("Reference");
  }
}