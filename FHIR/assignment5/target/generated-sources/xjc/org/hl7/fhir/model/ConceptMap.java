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
 * <p>Java class for ConceptMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptMap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="copyright" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}ValueSetStatus"/&gt;
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="target" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="concept" type="{http://hl7.org/fhir}ConceptMap.Concept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMap", propOrder = {
    "identifier",
    "version",
    "name",
    "publisher",
    "telecoms",
    "description",
    "copyright",
    "status",
    "experimental",
    "date",
    "source",
    "target",
    "concepts"
})
@XmlRootElement(name = "ConceptMap")
public class ConceptMap
    extends Resource
    implements ToString
{

    protected org.hl7.fhir.model.String identifier;
    protected org.hl7.fhir.model.String version;
    @XmlElement(required = true)
    protected org.hl7.fhir.model.String name;
    protected org.hl7.fhir.model.String publisher;
    @XmlElement(name = "telecom")
    protected List<Contact> telecoms;
    protected org.hl7.fhir.model.String description;
    protected org.hl7.fhir.model.String copyright;
    @XmlElement(required = true)
    protected ValueSetStatus status;
    protected Boolean experimental;
    protected DateTime date;
    @XmlElement(required = true)
    protected ResourceReference source;
    @XmlElement(required = true)
    protected ResourceReference target;
    @XmlElement(name = "concept")
    protected List<ConceptMapConcept> concepts;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setIdentifier(org.hl7.fhir.model.String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setVersion(org.hl7.fhir.model.String value) {
        this.version = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setName(org.hl7.fhir.model.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setPublisher(org.hl7.fhir.model.String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the telecoms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecoms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecoms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getTelecoms() {
        if (telecoms == null) {
            telecoms = new ArrayList<Contact>();
        }
        return this.telecoms;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setCopyright(org.hl7.fhir.model.String value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ValueSetStatus }
     *     
     */
    public ValueSetStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSetStatus }
     *     
     */
    public void setStatus(ValueSetStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the experimental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExperimental() {
        return experimental;
    }

    /**
     * Sets the value of the experimental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExperimental(Boolean value) {
        this.experimental = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSource(ResourceReference value) {
        this.source = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setTarget(ResourceReference value) {
        this.target = value;
    }

    /**
     * Gets the value of the concepts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concepts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcepts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptMapConcept }
     * 
     * 
     */
    public List<ConceptMapConcept> getConcepts() {
        if (concepts == null) {
            concepts = new ArrayList<ConceptMapConcept>();
        }
        return this.concepts;
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
            org.hl7.fhir.model.String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            org.hl7.fhir.model.String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            org.hl7.fhir.model.String thePublisher;
            thePublisher = this.getPublisher();
            strategy.appendField(locator, this, "publisher", buffer, thePublisher);
        }
        {
            List<Contact> theTelecoms;
            theTelecoms = (((this.telecoms!= null)&&(!this.telecoms.isEmpty()))?this.getTelecoms():null);
            strategy.appendField(locator, this, "telecoms", buffer, theTelecoms);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            org.hl7.fhir.model.String theCopyright;
            theCopyright = this.getCopyright();
            strategy.appendField(locator, this, "copyright", buffer, theCopyright);
        }
        {
            ValueSetStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            Boolean theExperimental;
            theExperimental = this.getExperimental();
            strategy.appendField(locator, this, "experimental", buffer, theExperimental);
        }
        {
            DateTime theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            ResourceReference theSource;
            theSource = this.getSource();
            strategy.appendField(locator, this, "source", buffer, theSource);
        }
        {
            ResourceReference theTarget;
            theTarget = this.getTarget();
            strategy.appendField(locator, this, "target", buffer, theTarget);
        }
        {
            List<ConceptMapConcept> theConcepts;
            theConcepts = (((this.concepts!= null)&&(!this.concepts.isEmpty()))?this.getConcepts():null);
            strategy.appendField(locator, this, "concepts", buffer, theConcepts);
        }
        return buffer;
    }

}