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
 * <p>Java class for HierarchicalRelationshipType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HierarchicalRelationshipType-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="parent"/&gt;
 *     &lt;enumeration value="child"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HierarchicalRelationshipType-list")
@XmlEnum
public enum HierarchicalRelationshipTypeList {


    /**
     * The target resource is the parent of the focal specimen resource.
     * 
     */
    @XmlEnumValue("parent")
    PARENT("parent"),

    /**
     * The target resource is the child of the focal specimen resource.
     * 
     */
    @XmlEnumValue("child")
    CHILD("child");
    private final java.lang.String value;

    HierarchicalRelationshipTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HierarchicalRelationshipTypeList fromValue(java.lang.String v) {
        for (HierarchicalRelationshipTypeList c: HierarchicalRelationshipTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
