//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:53:59 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.BasisChangeNotification;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zcbspay.platform.cnaps.ccms.bean.BasisChangeNotification package. 
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

    private final static QName _Document_QNAME = new QName("urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zcbspay.platform.cnaps.ccms.bean.BasisChangeNotification
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
     * Create an instance of {@link RcrdNbInf1 }
     * 
     */
    public RcrdNbInf1 createRcrdNbInf1() {
        return new RcrdNbInf1();
    }

    /**
     * Create an instance of {@link GroupHeader1 }
     * 
     */
    public GroupHeader1 createGroupHeader1() {
        return new GroupHeader1();
    }

    /**
     * Create an instance of {@link NbInf1 }
     * 
     */
    public NbInf1 createNbInf1() {
        return new NbInf1();
    }

    /**
     * Create an instance of {@link BsisChngNtfctnV01 }
     * 
     */
    public BsisChngNtfctnV01 createBsisChngNtfctnV01() {
        return new BsisChngNtfctnV01();
    }

    /**
     * Create an instance of {@link CityChngInf1 }
     * 
     */
    public CityChngInf1 createCityChngInf1() {
        return new CityChngInf1();
    }

    /**
     * Create an instance of {@link InstgPty1 }
     * 
     */
    public InstgPty1 createInstgPty1() {
        return new InstgPty1();
    }

    /**
     * Create an instance of {@link BkTpChngInf1 }
     * 
     */
    public BkTpChngInf1 createBkTpChngInf1() {
        return new BkTpChngInf1();
    }

    /**
     * Create an instance of {@link CCPCChngInf1 }
     * 
     */
    public CCPCChngInf1 createCCPCChngInf1() {
        return new CCPCChngInf1();
    }

    /**
     * Create an instance of {@link ChngCtrl1 }
     * 
     */
    public ChngCtrl1 createChngCtrl1() {
        return new ChngCtrl1();
    }

    /**
     * Create an instance of {@link InstdPty1 }
     * 
     */
    public InstdPty1 createInstdPty1() {
        return new InstdPty1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}
