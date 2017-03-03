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
 * <p>Java class for DetailCheckResponsionDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailCheckResponsionDetails1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SndRcvTp" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}SendReceiveCode1"/>
 *         &lt;element name="TxNetgDt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}ISODate"/>
 *         &lt;element name="TxNetgRnd" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}Max2Text"/>
 *         &lt;element name="MT" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}Max35Text"/>
 *         &lt;element name="PrcSts" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}Max4Text"/>
 *         &lt;element name="NbOfDtls" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}Max8NumericText"/>
 *         &lt;element name="OrgnlPmtDtls" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}OriginalPaymentDetails1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailCheckResponsionDetails1", propOrder = {
    "sndRcvTp",
    "txNetgDt",
    "txNetgRnd",
    "mt",
    "prcSts",
    "nbOfDtls",
    "orgnlPmtDtls"
})
public class DetailCheckResponsionDetails1 {

    @XmlElement(name = "SndRcvTp", required = true)
    protected SendReceiveCode1 sndRcvTp;
    @XmlElement(name = "TxNetgDt", required = true)
    protected XMLGregorianCalendar txNetgDt;
    @XmlElement(name = "TxNetgRnd", required = true)
    protected String txNetgRnd;
    @XmlElement(name = "MT", required = true)
    protected String mt;
    @XmlElement(name = "PrcSts", required = true)
    protected String prcSts;
    @XmlElement(name = "NbOfDtls", required = true)
    protected String nbOfDtls;
    @XmlElement(name = "OrgnlPmtDtls")
    protected List<OriginalPaymentDetails1> orgnlPmtDtls;

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
     * Gets the value of the txNetgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxNetgDt() {
        return txNetgDt;
    }

    /**
     * Sets the value of the txNetgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxNetgDt(XMLGregorianCalendar value) {
        this.txNetgDt = value;
    }

    /**
     * Gets the value of the txNetgRnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxNetgRnd() {
        return txNetgRnd;
    }

    /**
     * Sets the value of the txNetgRnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxNetgRnd(String value) {
        this.txNetgRnd = value;
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
     * Gets the value of the orgnlPmtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlPmtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlPmtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalPaymentDetails1 }
     * 
     * 
     */
    public List<OriginalPaymentDetails1> getOrgnlPmtDtls() {
        if (orgnlPmtDtls == null) {
            orgnlPmtDtls = new ArrayList<OriginalPaymentDetails1>();
        }
        return this.orgnlPmtDtls;
    }

}
