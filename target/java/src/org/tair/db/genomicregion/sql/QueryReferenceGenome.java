/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Query.vsl

package org.tair.db.genomicregion.sql;


/**
 * <p>
 * A single-object query of a ReferenceGenome using its primary key. This class
 * is the concrete subclass of the generated abstract class AbstractQueryReferenceGenome. 
 * Make any changes to query behavior by overriding methods here rather than 
 * changing the abstract superclass; AndroMDA will overwrite that class when you
 * run it but will never overwrite this concrete subclass.
 * </p>
* <p>
 * This class contains the specification of the SQL statement that queries a
 * single ReferenceGenome object from the database.
 * </p>
${dto.getDocumentation}
 * 
 * @author Poesys/DB Cartridge
 */
public class QueryReferenceGenome extends AbstractQueryReferenceGenome {
}