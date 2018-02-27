
package co.edu.uniminuto.ivaclient.ws.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.edu.uniminuto.ivaclient.ws.soap package. 
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

    private final static QName _Exception_QNAME = new QName("http://soap.ws.uniminuto.edu.co/", "Exception");
    private final static QName _ConsumirIva_QNAME = new QName("http://soap.ws.uniminuto.edu.co/", "consumirIva");
    private final static QName _ConsumirIvaResponse_QNAME = new QName("http://soap.ws.uniminuto.edu.co/", "consumirIvaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.edu.uniminuto.ivaclient.ws.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsumirIvaResponse }
     * 
     */
    public ConsumirIvaResponse createConsumirIvaResponse() {
        return new ConsumirIvaResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ConsumirIva }
     * 
     */
    public ConsumirIva createConsumirIva() {
        return new ConsumirIva();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.uniminuto.edu.co/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumirIva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.uniminuto.edu.co/", name = "consumirIva")
    public JAXBElement<ConsumirIva> createConsumirIva(ConsumirIva value) {
        return new JAXBElement<ConsumirIva>(_ConsumirIva_QNAME, ConsumirIva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumirIvaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.uniminuto.edu.co/", name = "consumirIvaResponse")
    public JAXBElement<ConsumirIvaResponse> createConsumirIvaResponse(ConsumirIvaResponse value) {
        return new JAXBElement<ConsumirIvaResponse>(_ConsumirIvaResponse_QNAME, ConsumirIvaResponse.class, null, value);
    }

}
