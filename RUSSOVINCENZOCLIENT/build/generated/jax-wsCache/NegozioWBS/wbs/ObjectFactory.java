
package wbs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wbs package. 
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

    private final static QName _StampaTutti_QNAME = new QName("http://wbs/", "stampaTutti");
    private final static QName _StampaTuttiResponse_QNAME = new QName("http://wbs/", "stampaTuttiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wbs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StampaTutti }
     * 
     */
    public StampaTutti createStampaTutti() {
        return new StampaTutti();
    }

    /**
     * Create an instance of {@link StampaTuttiResponse }
     * 
     */
    public StampaTuttiResponse createStampaTuttiResponse() {
        return new StampaTuttiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StampaTutti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wbs/", name = "stampaTutti")
    public JAXBElement<StampaTutti> createStampaTutti(StampaTutti value) {
        return new JAXBElement<StampaTutti>(_StampaTutti_QNAME, StampaTutti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StampaTuttiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wbs/", name = "stampaTuttiResponse")
    public JAXBElement<StampaTuttiResponse> createStampaTuttiResponse(StampaTuttiResponse value) {
        return new JAXBElement<StampaTuttiResponse>(_StampaTuttiResponse_QNAME, StampaTuttiResponse.class, null, value);
    }

}
