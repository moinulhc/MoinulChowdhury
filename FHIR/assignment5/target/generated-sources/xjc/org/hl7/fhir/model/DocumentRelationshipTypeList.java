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
 * <p>Java class for DocumentRelationshipType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentRelationshipType-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="replaces"/&gt;
 *     &lt;enumeration value="transforms"/&gt;
 *     &lt;enumeration value="signs"/&gt;
 *     &lt;enumeration value="appends"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentRelationshipType-list")
@XmlEnum
public enum DocumentRelationshipTypeList {


    /**
     * This document logically replaces or supercedes the target document.
     * 
     */
    @XmlEnumValue("replaces")
    REPLACES("replaces"),

    /**
     * This document was generated by transforming the target document (e.g. format or language conversion).
     * 
     */
    @XmlEnumValue("transforms")
    TRANSFORMS("transforms"),

    /**
     * This document is a signature of the target document.
     * 
     */
    @XmlEnumValue("signs")
    SIGNS("signs"),

    /**
     * This document adds additional information to the target document.
     * 
     */
    @XmlEnumValue("appends")
    APPENDS("appends");
    private final java.lang.String value;

    DocumentRelationshipTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DocumentRelationshipTypeList fromValue(java.lang.String v) {
        for (DocumentRelationshipTypeList c: DocumentRelationshipTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
