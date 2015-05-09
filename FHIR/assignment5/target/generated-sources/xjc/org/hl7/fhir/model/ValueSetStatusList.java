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
 * <p>Java class for ValueSetStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueSetStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="draft"/&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="retired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValueSetStatus-list")
@XmlEnum
public enum ValueSetStatusList {


    /**
     * This valueset is still under development.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * This valueset is ready for normal use.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * This valueset has been withdrawn or superceded and should no longer be used.
     * 
     */
    @XmlEnumValue("retired")
    RETIRED("retired");
    private final java.lang.String value;

    ValueSetStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ValueSetStatusList fromValue(java.lang.String v) {
        for (ValueSetStatusList c: ValueSetStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
