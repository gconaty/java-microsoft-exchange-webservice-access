package com.microsoft.schemas.exchange.services._2006.messages;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-09-02T10:13:44.789+02:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "ExchangeService", 
                  wsdlLocation = "file:/C:/itpearls-src/hoduflu/trunk/exchange-service-client/src/wsdl/microsoft_exchange_2007.wsdl",
                  targetNamespace = "http://schemas.microsoft.com/exchange/services/2006/messages") 
public class ExchangeService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "ExchangeService");
    public final static QName ExchangeServicePort = new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "ExchangeServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/itpearls-src/hoduflu/trunk/exchange-service-client/src/wsdl/microsoft_exchange_2007.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ExchangeService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/itpearls-src/hoduflu/trunk/exchange-service-client/src/wsdl/microsoft_exchange_2007.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ExchangeService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ExchangeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExchangeService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ExchangeServicePortType
     */
    @WebEndpoint(name = "ExchangeServicePort")
    public ExchangeServicePortType getExchangeServicePort() {
        return super.getPort(ExchangeServicePort, ExchangeServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExchangeServicePortType
     */
    @WebEndpoint(name = "ExchangeServicePort")
    public ExchangeServicePortType getExchangeServicePort(WebServiceFeature... features) {
        return super.getPort(ExchangeServicePort, ExchangeServicePortType.class, features);
    }

}
