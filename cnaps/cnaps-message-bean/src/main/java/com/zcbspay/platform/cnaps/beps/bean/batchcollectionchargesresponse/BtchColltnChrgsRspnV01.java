//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.21 at 04:55:00 PM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.batchcollectionchargesresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BtchColltnChrgsRspnV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BtchColltnChrgsRspnV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.381.001.01}GroupHeader1"/>
 *         &lt;element name="OrgnlMsgInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.381.001.01}OrgnlMsgInf1"/>
 *         &lt;element name="NPCPrcInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.381.001.01}NPCPrcInf1" minOccurs="0"/>
 *         &lt;element name="BtchColltnChrgsRspnInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.381.001.01}BtchColltnChrgsRspnInf1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BtchColltnChrgsRspnV01", propOrder = {
    "grpHdr",
    "orgnlMsgInf",
    "npcPrcInf",
    "btchColltnChrgsRspnInf"
})
public class BtchColltnChrgsRspnV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "OrgnlMsgInf", required = true)
    protected OrgnlMsgInf1 orgnlMsgInf;
    @XmlElement(name = "NPCPrcInf")
    protected NPCPrcInf1 npcPrcInf;
    @XmlElement(name = "BtchColltnChrgsRspnInf", required = true)
    protected BtchColltnChrgsRspnInf1 btchColltnChrgsRspnInf;

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
     * Gets the value of the orgnlMsgInf property.
     * 
     * @return
     *     possible object is
     *     {@link OrgnlMsgInf1 }
     *     
     */
    public OrgnlMsgInf1 getOrgnlMsgInf() {
        return orgnlMsgInf;
    }

    /**
     * Sets the value of the orgnlMsgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgnlMsgInf1 }
     *     
     */
    public void setOrgnlMsgInf(OrgnlMsgInf1 value) {
        this.orgnlMsgInf = value;
    }

    /**
     * Gets the value of the npcPrcInf property.
     * 
     * @return
     *     possible object is
     *     {@link NPCPrcInf1 }
     *     
     */
    public NPCPrcInf1 getNPCPrcInf() {
        return npcPrcInf;
    }

    /**
     * Sets the value of the npcPrcInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NPCPrcInf1 }
     *     
     */
    public void setNPCPrcInf(NPCPrcInf1 value) {
        this.npcPrcInf = value;
    }

    /**
     * Gets the value of the btchColltnChrgsRspnInf property.
     * 
     * @return
     *     possible object is
     *     {@link BtchColltnChrgsRspnInf1 }
     *     
     */
    public BtchColltnChrgsRspnInf1 getBtchColltnChrgsRspnInf() {
        return btchColltnChrgsRspnInf;
    }

    /**
     * Sets the value of the btchColltnChrgsRspnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BtchColltnChrgsRspnInf1 }
     *     
     */
    public void setBtchColltnChrgsRspnInf(BtchColltnChrgsRspnInf1 value) {
        this.btchColltnChrgsRspnInf = value;
    }

}
