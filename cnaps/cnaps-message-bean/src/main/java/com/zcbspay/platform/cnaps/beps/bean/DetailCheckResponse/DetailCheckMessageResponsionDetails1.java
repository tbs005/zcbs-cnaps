//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 10:08:17 AM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.DetailCheckResponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DetailCheckMessageResponsionDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailCheckMessageResponsionDetails1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SndRcvTp" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}SendReceiveCode1"/>
 *         &lt;element name="MT" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}Max35Text"/>
 *         &lt;element name="RcvDt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}ISODate"/>
 *         &lt;element name="NbOfDtls" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}Max8NumericText"/>
 *         &lt;element name="OrgnlMsgDtls" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}OriginalMessageDetails1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailCheckMessageResponsionDetails1", propOrder = {
    "sndRcvTp",
    "mt",
    "rcvDt",
    "nbOfDtls",
    "orgnlMsgDtls"
})
public class DetailCheckMessageResponsionDetails1 {

    @XmlElement(name = "SndRcvTp", required = true)
    protected SendReceiveCode1 sndRcvTp;
    @XmlElement(name = "MT", required = true)
    protected String mt;
    @XmlElement(name = "RcvDt", required = true)
    protected XMLGregorianCalendar rcvDt;
    @XmlElement(name = "NbOfDtls", required = true)
    protected String nbOfDtls;
    @XmlElement(name = "OrgnlMsgDtls")
    protected List<OriginalMessageDetails1> orgnlMsgDtls;

    /**
     * Gets the value of the sndRcvTp property.
     * 
     * @return
     *     possible object is
     *     {@link SendReceiveCode1 }
     *     
     */
    public SendReceiveCode1 getSndRcvTp() {
        return sndRcvTp;
    }

    /**
     * Sets the value of the sndRcvTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendReceiveCode1 }
     *     
     */
    public void setSndRcvTp(SendReceiveCode1 value) {
        this.sndRcvTp = value;
    }

    /**
     * Gets the value of the mt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMT() {
        return mt;
    }

    /**
     * Sets the value of the mt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMT(String value) {
        this.mt = value;
    }

    /**
     * Gets the value of the rcvDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRcvDt() {
        return rcvDt;
    }

    /**
     * Sets the value of the rcvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRcvDt(XMLGregorianCalendar value) {
        this.rcvDt = value;
    }

    /**
     * Gets the value of the nbOfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfDtls() {
        return nbOfDtls;
    }

    /**
     * Sets the value of the nbOfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfDtls(String value) {
        this.nbOfDtls = value;
    }

    /**
     * Gets the value of the orgnlMsgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlMsgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlMsgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalMessageDetails1 }
     * 
     * 
     */
    public List<OriginalMessageDetails1> getOrgnlMsgDtls() {
        if (orgnlMsgDtls == null) {
            orgnlMsgDtls = new ArrayList<OriginalMessageDetails1>();
        }
        return this.orgnlMsgDtls;
    }

}
