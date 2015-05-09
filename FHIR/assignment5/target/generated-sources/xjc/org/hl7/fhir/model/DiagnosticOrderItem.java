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
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * A request for a diagnostic investigation service to be performed.
 * 
 * <p>Java class for DiagnosticOrder.Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticOrder.Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="specimen" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}DiagnosticOrderStatus" minOccurs="0"/&gt;
 *         &lt;element name="event" type="{http://hl7.org/fhir}DiagnosticOrder.Event" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticOrder.Item", propOrder = {
    "code",
    "specimens",
    "bodySite",
    "status",
    "events"
})
public class DiagnosticOrderItem
    extends BackboneElement
    implements ToString
{

    @XmlElement(required = true)
    protected CodeableConcept code;
    @XmlElement(name = "specimen")
    protected List<ResourceReference> specimens;
    protected CodeableConcept bodySite;
    protected DiagnosticOrderStatus status;
    @XmlElement(name = "event")
    protected List<DiagnosticOrderEvent> events;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * Gets the value of the specimens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specimens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecimens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getSpecimens() {
        if (specimens == null) {
            specimens = new ArrayList<ResourceReference>();
        }
        return this.specimens;
    }

    /**
     * Gets the value of the bodySite property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getBodySite() {
        return bodySite;
    }

    /**
     * Sets the value of the bodySite property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setBodySite(CodeableConcept value) {
        this.bodySite = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticOrderStatus }
     *     
     */
    public DiagnosticOrderStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticOrderStatus }
     *     
     */
    public void setStatus(DiagnosticOrderStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticOrderEvent }
     * 
     * 
     */
    public List<DiagnosticOrderEvent> getEvents() {
        if (events == null) {
            events = new ArrayList<DiagnosticOrderEvent>();
        }
        return this.events;
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
            CodeableConcept theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            List<ResourceReference> theSpecimens;
            theSpecimens = (((this.specimens!= null)&&(!this.specimens.isEmpty()))?this.getSpecimens():null);
            strategy.appendField(locator, this, "specimens", buffer, theSpecimens);
        }
        {
            CodeableConcept theBodySite;
            theBodySite = this.getBodySite();
            strategy.appendField(locator, this, "bodySite", buffer, theBodySite);
        }
        {
            DiagnosticOrderStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            List<DiagnosticOrderEvent> theEvents;
            theEvents = (((this.events!= null)&&(!this.events.isEmpty()))?this.getEvents():null);
            strategy.appendField(locator, this, "events", buffer, theEvents);
        }
        return buffer;
    }

}
