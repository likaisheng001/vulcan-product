package com.chunbo.codegenerator;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.13
 * 2014-11-10T18:45:01.221+08:00
 * Generated source version: 2.7.13
 * 
 */
@WebServiceClient(name = "serialNumberGeneratorService", 
                  wsdlLocation = "http://172.16.10.233:8080/chunbo-codegenerator-web/services/serialNumberGeneratorService?wsdl",
                  targetNamespace = "http://codegenerator.chunbo.com/") 
public class SerialNumberGeneratorService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://codegenerator.chunbo.com/", "serialNumberGeneratorService");
    public final static QName SerialNumberGeneratorImplPort = new QName("http://codegenerator.chunbo.com/", "SerialNumberGeneratorImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://172.16.10.233:8080/chunbo-codegenerator-web/services/serialNumberGeneratorService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SerialNumberGeneratorService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://172.16.10.233:8080/chunbo-codegenerator-web/services/serialNumberGeneratorService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SerialNumberGeneratorService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SerialNumberGeneratorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SerialNumberGeneratorService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SerialNumberGeneratorService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SerialNumberGeneratorService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SerialNumberGeneratorService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns SerialNumberGenerator
     */
    @WebEndpoint(name = "SerialNumberGeneratorImplPort")
    public SerialNumberGenerator getSerialNumberGeneratorImplPort() {
        return super.getPort(SerialNumberGeneratorImplPort, SerialNumberGenerator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SerialNumberGenerator
     */
    @WebEndpoint(name = "SerialNumberGeneratorImplPort")
    public SerialNumberGenerator getSerialNumberGeneratorImplPort(WebServiceFeature... features) {
        return super.getPort(SerialNumberGeneratorImplPort, SerialNumberGenerator.class, features);
    }

}