//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:53:41 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.DiscardMessageNotification;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zcbspay.platform.cnaps.ccms.bean.DiscardMessageNotification package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Document_QNAME = new QName("urn:cnaps:std:ccms:2010:tech:xsd:ccms.911.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zcbspay.platform.cnaps.ccms.bean.DiscardMessageNotification
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link DscrdInfV01 }
     * 
     */
    public DscrdInfV01 createDscrdInfV01() {
        return new DscrdInfV01();
    }

    /**
     * Create an instance of {@link DscrdMsgNtfctnV01 }
     * 
     */
    public DscrdMsgNtfctnV01 createDscrdMsgNtfctnV01() {
        return new DscrdMsgNtfctnV01();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cnaps:std:ccms:2010:tech:xsd:ccms.911.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}
