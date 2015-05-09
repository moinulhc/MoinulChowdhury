//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.09 at 03:29:45 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticOrderPriority-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticOrderPriority-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="routine"/&gt;
 *     &lt;enumeration value="urgent"/&gt;
 *     &lt;enumeration value="stat"/&gt;
 *     &lt;enumeration value="asap"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticOrderPriority-list")
@XmlEnum
public enum DiagnosticOrderPriorityList {


    /**
     * The order has a normal priority.
     * 
     */
    @XmlEnumValue("routine")
    ROUTINE("routine"),

    /**
     * The order should be urgently.
     * 
     */
    @XmlEnumValue("urgent")
    URGENT("urgent"),

    /**
     * The order is time-critical.
     * 
     */
    @XmlEnumValue("stat")
    STAT("stat"),

    /**
     * The order should be acted on as soon as possible.
     * 
     */
    @XmlEnumValue("asap")
    ASAP("asap");
    private final java.lang.String value;

    DiagnosticOrderPriorityList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticOrderPriorityList fromValue(java.lang.String v) {
        for (DiagnosticOrderPriorityList c: DiagnosticOrderPriorityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
