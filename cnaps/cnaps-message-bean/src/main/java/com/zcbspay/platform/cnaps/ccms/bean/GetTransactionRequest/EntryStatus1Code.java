//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:52:24 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.GetTransactionRequest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntryStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntryStatus1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOOK"/>
 *     &lt;enumeration value="PDNG"/>
 *     &lt;enumeration value="FUTR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntryStatus1Code")
@XmlEnum
public enum EntryStatus1Code {

    BOOK,
    PDNG,
    FUTR;

    public String value() {
        return name();
    }

    public static EntryStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
