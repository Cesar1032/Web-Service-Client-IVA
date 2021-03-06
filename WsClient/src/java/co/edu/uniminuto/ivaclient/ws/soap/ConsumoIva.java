
package co.edu.uniminuto.ivaclient.ws.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "consumoIva", targetNamespace = "http://soap.ws.uniminuto.edu.co/", wsdlLocation = "http://localhost:7001/IvaProject-war/consumoIva?wsdl")
public class ConsumoIva
    extends Service
{

    private final static URL CONSUMOIVA_WSDL_LOCATION;
    private final static WebServiceException CONSUMOIVA_EXCEPTION;
    private final static QName CONSUMOIVA_QNAME = new QName("http://soap.ws.uniminuto.edu.co/", "consumoIva");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7001/IvaProject-war/consumoIva?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSUMOIVA_WSDL_LOCATION = url;
        CONSUMOIVA_EXCEPTION = e;
    }

    public ConsumoIva() {
        super(__getWsdlLocation(), CONSUMOIVA_QNAME);
    }

    public ConsumoIva(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSUMOIVA_QNAME, features);
    }

    public ConsumoIva(URL wsdlLocation) {
        super(wsdlLocation, CONSUMOIVA_QNAME);
    }

    public ConsumoIva(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSUMOIVA_QNAME, features);
    }

    public ConsumoIva(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsumoIva(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsIva
     */
    @WebEndpoint(name = "WsIvaPort")
    public WsIva getWsIvaPort() {
        return super.getPort(new QName("http://soap.ws.uniminuto.edu.co/", "WsIvaPort"), WsIva.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsIva
     */
    @WebEndpoint(name = "WsIvaPort")
    public WsIva getWsIvaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.ws.uniminuto.edu.co/", "WsIvaPort"), WsIva.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSUMOIVA_EXCEPTION!= null) {
            throw CONSUMOIVA_EXCEPTION;
        }
        return CONSUMOIVA_WSDL_LOCATION;
    }

}
