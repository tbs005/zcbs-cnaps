//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:53:56 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.BankCodeChangeNotification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemCode1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemCode1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAPS"/>
 *     &lt;enumeration value="HVPS"/>
 *     &lt;enumeration value="BEPS"/>
 *     &lt;enumeration value="CCMS"/>
 *     &lt;enumeration value="PMIS"/>
 *     &lt;enumeration value="IBPS"/>
 *     &lt;enumeration value="NCIS"/>
 *     &lt;enumeration value="ECDS"/>
 *     &lt;enumeration value="FXPS"/>
 *     &lt;enumeration value="NETS"/>
 *     &lt;enumeration value="PBCS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SystemCode1")
@XmlEnum
public enum SystemCode1 {

    SAPS,
    HVPS,
    BEPS,
    CCMS,
    PMIS,
    IBPS,
    NCIS,
    ECDS,
    FXPS,
    NETS,
    PBCS;

    public String value() {
        return name();
    }

    public static SystemCode1 fromValue(String v) {
        return valueOf(v);
    }

}
