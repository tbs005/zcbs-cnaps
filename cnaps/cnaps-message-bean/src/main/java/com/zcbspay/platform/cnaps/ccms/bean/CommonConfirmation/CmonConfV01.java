//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:53:22 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.CommonConfirmation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmonConfV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmonConfV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.900.001.02}GroupHeader1"/>
 *         &lt;element name="OrgnlGrpHdr" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.900.001.02}OrgnlGrpHdr1"/>
 *         &lt;element name="CmonConfInf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.900.001.02}CmonConfInf1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmonConfV01", propOrder = {
    "grpHdr",
    "orgnlGrpHdr",
    "cmonConfInf"
})
public class CmonConfV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "OrgnlGrpHdr", required = true)
    protected OrgnlGrpHdr1 orgnlGrpHdr;
    @XmlElement(name = "CmonConfInf", required = true)
    protected CmonConfInf1 cmonConfInf;

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
     * Gets the value of the cmonConfInf property.
     * 
     * @return
     *     possible object is
     *     {@link CmonConfInf1 }
     *     
     */
    public CmonConfInf1 getCmonConfInf() {
        return cmonConfInf;
    }

    /**
     * Sets the value of the cmonConfInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmonConfInf1 }
     *     
     */
    public void setCmonConfInf(CmonConfInf1 value) {
        this.cmonConfInf = value;
    }

}
