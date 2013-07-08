/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Annotation. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A unique combination of category, relationship type, keyword, evidence code,
 * evidence description, evidence-with, and reference that constitutes a functional
 * annotation of a genomic object such as a locus or gene model
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>NaturalKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class Annotation extends AbstractAnnotation {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Annotation as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Annotation() {
    super(); 
  }

  /**
   * <p>
   * Create a Annotation. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Annotation
   * @param category The kind of keyword (GO Biological Process, GO Cellular Component, GO Molecular
Function, Interaction, Expression, Growth and Developmental Stages, Plant
Structure)
   * @param relationshipType The kind of relationship between a locus and a keyword (such as involved in,
located in, functions in, has, not expressed during, or expressed in)
   * @param keyword the keyword associated with the locus (such as nucleus, glucose mediated
signaling pathway, or dry seed stage)
   * @param evidenceCode the standard three-letter code that indicates the kind of evidence association
with the annotation, such as IEA (inferred from electronic annotation) or IDA
(inferred from direct assay).
   * @param evidenceWith information associated with the evidence, such as an affected protein or gene
   * @param reference the reference (publication, communication, etc.) from which the annotation
comes; this is a textual version of the reference used for display
   * @param keywordId the unique identifier for the keyword; used in the URL that links to the keyword
   * @param ontologyId the unique identifier from the ontology for the keyword, such as GO:123456
   * @param evidenceDescription a textual description of the specific evidentiary technique used to provide
evidence for the annotation to the object
   * @param evidenceId unique identifier for the evidence code/description combination ("evidence");
used in the URL that displays the full page for the evidence
   * @param referenceId the unique reference identifier; used in a URL to link to the reference
information
   * @param annotatedBy the community member responsible for the annotation
   */
  public Annotation(IPrimaryKey key, java.lang.String category, java.lang.String relationshipType, java.lang.String keyword, java.lang.String evidenceCode, java.lang.String evidenceWith, java.lang.String reference, java.lang.Long keywordId, java.lang.String ontologyId, java.lang.String evidenceDescription, java.lang.Long evidenceId, java.lang.Long referenceId, java.lang.String annotatedBy) {
    super(key, category, relationshipType, keyword, evidenceCode, evidenceWith, reference, keywordId, ontologyId, evidenceDescription, evidenceId, referenceId, annotatedBy); 
  }
}