//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:52:18 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.BusinessQueryResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BizRspnInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BizRspnInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QryTp" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.315.001.01}BusinessQueryTypeCode1" minOccurs="0"/>
 *         &lt;element name="OrgnlInf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.315.001.01}OrgnlInf1"/>
 *         &lt;element name="Cntt" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.315.001.01}Max256Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BizRspnInf1", propOrder = {
    "qryTp",
    "orgnlInf",
    "cntt"
})
public class BizRspnInf1 {

    @XmlElement(name = "QryTp")
    protected BusinessQueryTypeCode1 qryTp;
    @XmlElement(name = "OrgnlInf", required = true)
    protected OrgnlInf1 orgnlInf;
    @XmlElement(name = "Cntt", required = true)
    protected String cntt;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessQueryTypeCode1 }
     *     
     */
    public BusinessQueryTypeCode1 getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessQueryTypeCode1 }
     *     
     */
    public void setQryTp(BusinessQueryTypeCode1 value) {
        this.qryTp = value;
    }

    /**
     * Gets the value of the orgnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link OrgnlInf1 }
     *     
     */
    public OrgnlInf1 getOrgnlInf() {
        return orgnlInf;
    }

    /**
     * Sets the value of the orgnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgnlInf1 }
     *     
     */
    public void setOrgnlInf(OrgnlInf1 value) {
        this.orgnlInf = value;
    }

    /**
     * Gets the value of the cntt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntt() {
        return cntt;
    }

    /**
     * Sets the value of the cntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntt(String value) {
        this.cntt = value;
    }

}
