//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:52:29 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.GetTransactionResponse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinalStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinalStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STLD"/>
 *     &lt;enumeration value="RJTD"/>
 *     &lt;enumeration value="CAND"/>
 *     &lt;enumeration value="FNLD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FinalStatusCode")
@XmlEnum
public enum FinalStatusCode {

    STLD,
    RJTD,
    CAND,
    FNLD;

    public String value() {
        return name();
    }

    public static FinalStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
