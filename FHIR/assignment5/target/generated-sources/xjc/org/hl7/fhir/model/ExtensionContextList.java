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
 * <p>Java class for ExtensionContext-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtensionContext-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="resource"/&gt;
 *     &lt;enumeration value="datatype"/&gt;
 *     &lt;enumeration value="mapping"/&gt;
 *     &lt;enumeration value="extension"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExtensionContext-list")
@XmlEnum
public enum ExtensionContextList {


    /**
     * The context is all elements matching a particular resource element path.
     * 
     */
    @XmlEnumValue("resource")
    RESOURCE("resource"),

    /**
     * The context is all nodes matching a particular data type element path (root or repeating element) or all elements referencing a particular primitive data type (expressed as the datatype name).
     * 
     */
    @XmlEnumValue("datatype")
    DATATYPE("datatype"),

    /**
     * The context is all nodes whose mapping to a specified reference model corresponds to a particular mapping structure.  The context identifies the mapping target. The mapping should clearly identify where such an extension could be used.
     * 
     */
    @XmlEnumValue("mapping")
    MAPPING("mapping"),

    /**
     * The context is a particular extension from a particular profile.  Expressed as uri#name, where uri identifies the profile and #name identifies the extension code.
     * 
     */
    @XmlEnumValue("extension")
    EXTENSION("extension");
    private final java.lang.String value;

    ExtensionContextList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ExtensionContextList fromValue(java.lang.String v) {
        for (ExtensionContextList c: ExtensionContextList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
