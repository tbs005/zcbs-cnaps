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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CmonConfInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmonConfInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrcSts" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.900.001.02}Max4Text"/>
 *         &lt;element name="PrcCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.900.001.02}Max8Text" minOccurs="0"/>
 *         &lt;element name="PtyId" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.900.001.02}Max14Text" minOccurs="0"/>
 *         &lt;element name="PtyPrcCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.900.001.02}Max4Text" minOccurs="0"/>
 *         &lt;element name="RjctInf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.900.001.02}Max105Text" minOccurs="0"/>
 *         &lt;element name="PrcDt" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.900.001.02}ISODate" minOccurs="0"/>
 *         &lt;element name="NetgRnd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.900.001.02}Max2Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmonConfInf1", propOrder = {
    "prcSts",
    "prcCd",
    "ptyId",
    "ptyPrcCd",
    "rjctInf",
    "prcDt",
    "netgRnd"
})
public class CmonConfInf1 {

    @XmlElement(name = "PrcSts", required = true)
    protected String prcSts;
    @XmlElement(name = "PrcCd")
    protected String prcCd;
    @XmlElement(name = "PtyId")
    protected String ptyId;
    @XmlElement(name = "PtyPrcCd")
    protected String ptyPrcCd;
    @XmlElement(name = "RjctInf")
    protected String rjctInf;
    @XmlElement(name = "PrcDt")
    protected XMLGregorianCalendar prcDt;
    @XmlElement(name = "NetgRnd")
    protected String netgRnd;

    /**
     * Gets the value of the prcSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcSts() {
        return prcSts;
    }

    /**
     * Sets the value of the prcSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcSts(String value) {
        this.prcSts = value;
    }

    /**
     * Gets the value of the prcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcCd() {
        return prcCd;
    }

    /**
     * Sets the value of the prcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcCd(String value) {
        this.prcCd = value;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtyId(String value) {
        this.ptyId = value;
    }

    /**
     * Gets the value of the ptyPrcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtyPrcCd() {
        return ptyPrcCd;
    }

    /**
     * Sets the value of the ptyPrcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtyPrcCd(String value) {
        this.ptyPrcCd = value;
    }

    /**
     * Gets the value of the rjctInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctInf() {
        return rjctInf;
    }

    /**
     * Sets the value of the rjctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctInf(String value) {
        this.rjctInf = value;
    }

    /**
     * Gets the value of the prcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrcDt() {
        return prcDt;
    }

    /**
     * Sets the value of the prcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrcDt(XMLGregorianCalendar value) {
        this.prcDt = value;
    }

    /**
     * Gets the value of the netgRnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetgRnd() {
        return netgRnd;
    }

    /**
     * Sets the value of the netgRnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetgRnd(String value) {
        this.netgRnd = value;
    }

}
