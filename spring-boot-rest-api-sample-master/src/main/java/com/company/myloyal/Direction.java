//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.10 at 03:19:28 PM IST 
//


package com.company.myloyal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for direction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="direction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INBOUND"/>
 *     &lt;enumeration value="OUTBOUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "direction", namespace = "http://company.com/myloyal/domain")
@XmlEnum
public enum Direction {

    INBOUND,
    OUTBOUND;

    public String value() {
        return name();
    }

    public static Direction fromValue(String v) {
        return valueOf(v);
    }

}
