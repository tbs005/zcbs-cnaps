//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.21 at 05:02:31 PM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.BusinessConfirmation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BizConfV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BizConfV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.389.001.01}GroupHeader1"/>
 *         &lt;element name="OrgnlGrpHdr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.389.001.01}OrgnlGrpHdr1"/>
 *         &lt;element name="BizConfInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.389.001.01}BizConfInf1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BizConfV01", propOrder = {
    "grpHdr",
    "orgnlGrpHdr",
    "bizConfInf"
})
public class BizConfV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "OrgnlGrpHdr", required = true)
    protected OrgnlGrpHdr1 orgnlGrpHdr;
    @XmlElement(name = "BizConfInf", required = true)
    protected BizConfInf1 bizConfInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader1 }
     *     
     */
    public GroupHeader1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader1 }
     *     
     */
    public void setGrpHdr(GroupHeader1 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the orgnlGrpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link OrgnlGrpHdr1 }
     *     
     */
    public OrgnlGrpHdr1 getOrgnlGrpHdr() {
        return orgnlGrpHdr;
    }

    /**
     * Sets the value of the orgnlGrpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgnlGrpHdr1 }
     *     
     */
    public void setOrgnlGrpHdr(OrgnlGrpHdr1 value) {
        this.orgnlGrpHdr = value;
    }

    /**
     * Gets the value of the bizConfInf property.
     * 
     * @return
     *     possible object is
     *     {@link BizConfInf1 }
     *     
     */
    public BizConfInf1 getBizConfInf() {
        return bizConfInf;
    }

    /**
     * Sets the value of the bizConfInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BizConfInf1 }
     *     
     */
    public void setBizConfInf(BizConfInf1 value) {
        this.bizConfInf = value;
    }

}
