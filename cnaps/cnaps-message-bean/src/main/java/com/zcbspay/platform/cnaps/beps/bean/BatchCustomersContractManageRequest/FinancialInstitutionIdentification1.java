//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 10:07:19 AM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.BatchCustomersContractManageRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstitutionIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstitutionIdentification1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClrSysMmbId" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.392.001.01}ClearingSystemMemberIdentification1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionIdentification1", propOrder = {
    "clrSysMmbId"
})
public class FinancialInstitutionIdentification1 {

    @XmlElement(name = "ClrSysMmbId", required = true)
    protected ClearingSystemMemberIdentification1 clrSysMmbId;

    /**
     * Gets the value of the clrSysMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemMemberIdentification1 }
     *     
     */
    public ClearingSystemMemberIdentification1 getClrSysMmbId() {
        return clrSysMmbId;
    }

    /**
     * Sets the value of the clrSysMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemMemberIdentification1 }
     *     
     */
    public void setClrSysMmbId(ClearingSystemMemberIdentification1 value) {
        this.clrSysMmbId = value;
    }

}
