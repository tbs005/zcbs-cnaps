//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:53:52 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.AuthorityChangeNotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthrtyChngNtfctn" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.915.001.01}AuthrtyChngNtfctnV01"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "authrtyChngNtfctn"
})
public class Document {

    @XmlElement(name = "AuthrtyChngNtfctn", required = true)
    protected AuthrtyChngNtfctnV01 authrtyChngNtfctn;

    /**
     * Gets the value of the authrtyChngNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link AuthrtyChngNtfctnV01 }
     *     
     */
    public AuthrtyChngNtfctnV01 getAuthrtyChngNtfctn() {
        return authrtyChngNtfctn;
    }

    /**
     * Sets the value of the authrtyChngNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthrtyChngNtfctnV01 }
     *     
     */
    public void setAuthrtyChngNtfctn(AuthrtyChngNtfctnV01 value) {
        this.authrtyChngNtfctn = value;
    }

}
