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
 * <p>Java class for ImagingStudy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImagingStudy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="uid" type="{http://hl7.org/fhir}oid"/&gt;
 *         &lt;element name="accessionNo" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="order" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="modality" type="{http://hl7.org/fhir}ImagingModality" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referrer" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="availability" type="{http://hl7.org/fhir}InstanceAvailability" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="numberOfSeries" type="{http://hl7.org/fhir}integer"/&gt;
 *         &lt;element name="numberOfInstances" type="{http://hl7.org/fhir}integer"/&gt;
 *         &lt;element name="clinicalInformation" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="procedure" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="interpreter" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="series" type="{http://hl7.org/fhir}ImagingStudy.Series" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingStudy", propOrder = {
    "dateTime",
    "subject",
    "uid",
    "accessionNo",
    "identifiers",
    "orders",
    "modalities",
    "referrer",
    "availability",
    "url",
    "numberOfSeries",
    "numberOfInstances",
    "clinicalInformation",
    "procedures",
    "interpreter",
    "description",
    "series"
})
@XmlRootElement(name = "ImagingStudy")
public class ImagingStudy
    extends Resource
    implements ToString
{

    protected DateTime dateTime;
    @XmlElement(required = true)
    protected ResourceReference subject;
    @XmlElement(required = true)
    protected Oid uid;
    protected Identifier accessionNo;
    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    @XmlElement(name = "order")
    protected List<ResourceReference> orders;
    @XmlElement(name = "modality")
    protected List<ImagingModality> modalities;
    protected ResourceReference referrer;
    protected InstanceAvailability availability;
    protected Uri url;
    @XmlElement(required = true)
    protected Integer numberOfSeries;
    @XmlElement(required = true)
    protected Integer numberOfInstances;
    protected org.hl7.fhir.model.String clinicalInformation;
    @XmlElement(name = "procedure")
    protected List<Coding> procedures;
    protected ResourceReference interpreter;
    protected org.hl7.fhir.model.String description;
    protected List<ImagingStudySeries> series;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateTime(DateTime value) {
        this.dateTime = value;
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
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setUid(Oid value) {
        this.uid = value;
    }

    /**
     * Gets the value of the accessionNo property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getAccessionNo() {
        return accessionNo;
    }

    /**
     * Sets the value of the accessionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setAccessionNo(Identifier value) {
        this.accessionNo = value;
    }

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
     * Gets the value of the orders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getOrders() {
        if (orders == null) {
            orders = new ArrayList<ResourceReference>();
        }
        return this.orders;
    }

    /**
     * Gets the value of the modalities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modalities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModalities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagingModality }
     * 
     * 
     */
    public List<ImagingModality> getModalities() {
        if (modalities == null) {
            modalities = new ArrayList<ImagingModality>();
        }
        return this.modalities;
    }

    /**
     * Gets the value of the referrer property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getReferrer() {
        return referrer;
    }

    /**
     * Sets the value of the referrer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setReferrer(ResourceReference value) {
        this.referrer = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceAvailability }
     *     
     */
    public InstanceAvailability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceAvailability }
     *     
     */
    public void setAvailability(InstanceAvailability value) {
        this.availability = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setUrl(Uri value) {
        this.url = value;
    }

    /**
     * Gets the value of the numberOfSeries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfSeries() {
        return numberOfSeries;
    }

    /**
     * Sets the value of the numberOfSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSeries(Integer value) {
        this.numberOfSeries = value;
    }

    /**
     * Gets the value of the numberOfInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfInstances() {
        return numberOfInstances;
    }

    /**
     * Sets the value of the numberOfInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfInstances(Integer value) {
        this.numberOfInstances = value;
    }

    /**
     * Gets the value of the clinicalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getClinicalInformation() {
        return clinicalInformation;
    }

    /**
     * Sets the value of the clinicalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setClinicalInformation(org.hl7.fhir.model.String value) {
        this.clinicalInformation = value;
    }

    /**
     * Gets the value of the procedures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getProcedures() {
        if (procedures == null) {
            procedures = new ArrayList<Coding>();
        }
        return this.procedures;
    }

    /**
     * Gets the value of the interpreter property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getInterpreter() {
        return interpreter;
    }

    /**
     * Sets the value of the interpreter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setInterpreter(ResourceReference value) {
        this.interpreter = value;
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
     * Gets the value of the series property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the series property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagingStudySeries }
     * 
     * 
     */
    public List<ImagingStudySeries> getSeries() {
        if (series == null) {
            series = new ArrayList<ImagingStudySeries>();
        }
        return this.series;
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
            DateTime theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            Oid theUid;
            theUid = this.getUid();
            strategy.appendField(locator, this, "uid", buffer, theUid);
        }
        {
            Identifier theAccessionNo;
            theAccessionNo = this.getAccessionNo();
            strategy.appendField(locator, this, "accessionNo", buffer, theAccessionNo);
        }
        {
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            strategy.appendField(locator, this, "identifiers", buffer, theIdentifiers);
        }
        {
            List<ResourceReference> theOrders;
            theOrders = (((this.orders!= null)&&(!this.orders.isEmpty()))?this.getOrders():null);
            strategy.appendField(locator, this, "orders", buffer, theOrders);
        }
        {
            List<ImagingModality> theModalities;
            theModalities = (((this.modalities!= null)&&(!this.modalities.isEmpty()))?this.getModalities():null);
            strategy.appendField(locator, this, "modalities", buffer, theModalities);
        }
        {
            ResourceReference theReferrer;
            theReferrer = this.getReferrer();
            strategy.appendField(locator, this, "referrer", buffer, theReferrer);
        }
        {
            InstanceAvailability theAvailability;
            theAvailability = this.getAvailability();
            strategy.appendField(locator, this, "availability", buffer, theAvailability);
        }
        {
            Uri theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        {
            Integer theNumberOfSeries;
            theNumberOfSeries = this.getNumberOfSeries();
            strategy.appendField(locator, this, "numberOfSeries", buffer, theNumberOfSeries);
        }
        {
            Integer theNumberOfInstances;
            theNumberOfInstances = this.getNumberOfInstances();
            strategy.appendField(locator, this, "numberOfInstances", buffer, theNumberOfInstances);
        }
        {
            org.hl7.fhir.model.String theClinicalInformation;
            theClinicalInformation = this.getClinicalInformation();
            strategy.appendField(locator, this, "clinicalInformation", buffer, theClinicalInformation);
        }
        {
            List<Coding> theProcedures;
            theProcedures = (((this.procedures!= null)&&(!this.procedures.isEmpty()))?this.getProcedures():null);
            strategy.appendField(locator, this, "procedures", buffer, theProcedures);
        }
        {
            ResourceReference theInterpreter;
            theInterpreter = this.getInterpreter();
            strategy.appendField(locator, this, "interpreter", buffer, theInterpreter);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            List<ImagingStudySeries> theSeries;
            theSeries = (((this.series!= null)&&(!this.series.isEmpty()))?this.getSeries():null);
            strategy.appendField(locator, this, "series", buffer, theSeries);
        }
        return buffer;
    }

}
