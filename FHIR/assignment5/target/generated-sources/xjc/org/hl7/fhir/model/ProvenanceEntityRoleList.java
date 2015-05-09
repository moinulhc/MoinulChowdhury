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
 * <p>Java class for ProvenanceEntityRole-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProvenanceEntityRole-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="derivation"/&gt;
 *     &lt;enumeration value="revision"/&gt;
 *     &lt;enumeration value="quotation"/&gt;
 *     &lt;enumeration value="source"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProvenanceEntityRole-list")
@XmlEnum
public enum ProvenanceEntityRoleList {


    /**
     * A transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a preexisting entity.
     * 
     */
    @XmlEnumValue("derivation")
    DERIVATION("derivation"),

    /**
     * A derivation for which the resulting entity is a revised version of some original.
     * 
     */
    @XmlEnumValue("revision")
    REVISION("revision"),

    /**
     * The repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author.
     * 
     */
    @XmlEnumValue("quotation")
    QUOTATION("quotation"),

    /**
     * A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.
     * 
     */
    @XmlEnumValue("source")
    SOURCE("source");
    private final java.lang.String value;

    ProvenanceEntityRoleList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ProvenanceEntityRoleList fromValue(java.lang.String v) {
        for (ProvenanceEntityRoleList c: ProvenanceEntityRoleList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
