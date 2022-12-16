
package services;

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
@WebServiceClient(name = "CovidCaseAll", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/CovidCaseAllProject/CovidCaseAll?WSDL")
public class CovidCaseAll_Service
    extends Service
{

    private final static URL COVIDCASEALL_WSDL_LOCATION;
    private final static WebServiceException COVIDCASEALL_EXCEPTION;
    private final static QName COVIDCASEALL_QNAME = new QName("http://services/", "CovidCaseAll");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CovidCaseAllProject/CovidCaseAll?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COVIDCASEALL_WSDL_LOCATION = url;
        COVIDCASEALL_EXCEPTION = e;
    }

    public CovidCaseAll_Service() {
        super(__getWsdlLocation(), COVIDCASEALL_QNAME);
    }

    public CovidCaseAll_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), COVIDCASEALL_QNAME, features);
    }

    public CovidCaseAll_Service(URL wsdlLocation) {
        super(wsdlLocation, COVIDCASEALL_QNAME);
    }

    public CovidCaseAll_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COVIDCASEALL_QNAME, features);
    }

    public CovidCaseAll_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CovidCaseAll_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CovidCaseAll
     */
    @WebEndpoint(name = "CovidCaseAllPort")
    public CovidCaseAll getCovidCaseAllPort() {
        return super.getPort(new QName("http://services/", "CovidCaseAllPort"), CovidCaseAll.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CovidCaseAll
     */
    @WebEndpoint(name = "CovidCaseAllPort")
    public CovidCaseAll getCovidCaseAllPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "CovidCaseAllPort"), CovidCaseAll.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COVIDCASEALL_EXCEPTION!= null) {
            throw COVIDCASEALL_EXCEPTION;
        }
        return COVIDCASEALL_WSDL_LOCATION;
    }

}
