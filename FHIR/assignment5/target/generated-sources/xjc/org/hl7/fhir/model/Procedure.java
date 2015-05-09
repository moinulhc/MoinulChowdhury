//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.09 at 03:29:45 PM MST 
//


package org.hl7.fhir.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Procedure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Procedure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="indication" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="performer" type="{http://hl7.org/fhir}Procedure.Performer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}Period" minOccurs="0"/&gt;
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="report" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="complication" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="followUp" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="relatedItem" type="{http://hl7.org/fhir}Procedure.RelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Procedure", propOrder = {
    "identifiers",
    "subject",
    "type",
    "bodySites",
    "indications",
    "performers",
    "date",
    "encounter",
    "outcome",
    "reports",
    "complications",
    "followUp",
    "relatedItems",
    "notes"
})
@XmlRootElement(name = "Procedure")
public class Procedure
    extends Resource
    implements ToString
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    @XmlElement(required = true)
    protected ResourceReference subject;
    @XmlElement(required = true)
    protected CodeableConcept type;
    @XmlElement(name = "bodySite")
    protected List<CodeableConcept> bodySites;
    @XmlElement(name = "indication")
    protected List<CodeableConcept> indications;
    @XmlElement(name = "performer")
    protected List<ProcedurePerformer> performers;
    protected Period date;
    protected ResourceReference encounter;
    protected org.hl7.fhir.model.String outcome;
    @XmlElement(name = "report")
    protected List<ResourceReference> reports;
    @XmlElement(name = "complication")
    protected List<CodeableConcept> complications;
    protected org.hl7.fhir.model.String followUp;
    @XmlElement(name = "relatedItem")
    protected List<ProcedureRelatedItem> relatedItems;
    protected org.hl7.fhir.model.String notes;

    /**
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSubject(ResourceReference value) {
        this.subject = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the bodySites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodySites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodySites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getBodySites() {
        if (bodySites == null) {
            bodySites = new ArrayList<CodeableConcept>();
        }
        return this.bodySites;
    }

    /**
     * Gets the value of the indications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getIndications() {
        if (indications == null) {
            indications = new ArrayList<CodeableConcept>();
        }
        return this.indications;
    }

    /**
     * Gets the value of the performers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedurePerformer }
     * 
     * 
     */
    public List<ProcedurePerformer> getPerformers() {
        if (performers == null) {
            performers = new ArrayList<ProcedurePerformer>();
        }
        return this.performers;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setDate(Period value) {
        this.date = value;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setEncounter(ResourceReference value) {
        this.encounter = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setOutcome(org.hl7.fhir.model.String value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getReports() {
        if (reports == null) {
            reports = new ArrayList<ResourceReference>();
        }
        return this.reports;
    }

    /**
     * Gets the value of the complications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getComplications() {
        if (complications == null) {
            complications = new ArrayList<CodeableConcept>();
        }
        return this.complications;
    }

    /**
     * Gets the value of the followUp property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getFollowUp() {
        return followUp;
    }

    /**
     * Sets the value of the followUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setFollowUp(org.hl7.fhir.model.String value) {
        this.followUp = value;
    }

    /**
     * Gets the value of the relatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedureRelatedItem }
     * 
     * 
     */
    public List<ProcedureRelatedItem> getRelatedItems() {
        if (relatedItems == null) {
            relatedItems = new ArrayList<ProcedureRelatedItem>();
        }
        return this.relatedItems;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setNotes(org.hl7.fhir.model.String value) {
        this.notes = value;
    }

    public java.lang.String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            strategy.appendField(locator, this, "identifiers", buffer, theIdentifiers);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            List<CodeableConcept> theBodySites;
            theBodySites = (((this.bodySites!= null)&&(!this.bodySites.isEmpty()))?this.getBodySites():null);
            strategy.appendField(locator, this, "bodySites", buffer, theBodySites);
        }
        {
            List<CodeableConcept> theIndications;
            theIndications = (((this.indications!= null)&&(!this.indications.isEmpty()))?this.getIndications():null);
            strategy.appendField(locator, this, "indications", buffer, theIndications);
        }
        {
            List<ProcedurePerformer> thePerformers;
            thePerformers = (((this.performers!= null)&&(!this.performers.isEmpty()))?this.getPerformers():null);
            strategy.appendField(locator, this, "performers", buffer, thePerformers);
        }
        {
            Period theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            ResourceReference theEncounter;
            theEncounter = this.getEncounter();
            strategy.appendField(locator, this, "encounter", buffer, theEncounter);
        }
        {
            org.hl7.fhir.model.String theOutcome;
            theOutcome = this.getOutcome();
            strategy.appendField(locator, this, "outcome", buffer, theOutcome);
        }
        {
            List<ResourceReference> theReports;
            theReports = (((this.reports!= null)&&(!this.reports.isEmpty()))?this.getReports():null);
            strategy.appendField(locator, this, "reports", buffer, theReports);
        }
        {
            List<CodeableConcept> theComplications;
            theComplications = (((this.complications!= null)&&(!this.complications.isEmpty()))?this.getComplications():null);
            strategy.appendField(locator, this, "complications", buffer, theComplications);
        }
        {
            org.hl7.fhir.model.String theFollowUp;
            theFollowUp = this.getFollowUp();
            strategy.appendField(locator, this, "followUp", buffer, theFollowUp);
        }
        {
            List<ProcedureRelatedItem> theRelatedItems;
            theRelatedItems = (((this.relatedItems!= null)&&(!this.relatedItems.isEmpty()))?this.getRelatedItems():null);
            strategy.appendField(locator, this, "relatedItems", buffer, theRelatedItems);
        }
        {
            org.hl7.fhir.model.String theNotes;
            theNotes = this.getNotes();
            strategy.appendField(locator, this, "notes", buffer, theNotes);
        }
        return buffer;
    }

}