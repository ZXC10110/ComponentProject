
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _Covidround1To2All_QNAME = new QName("http://services/", "covidround1To2All");
    private final static QName _FindCovidCaseRound1To2ById_QNAME = new QName("http://services/", "findCovidCaseRound1To2ById");
    private final static QName _RemoveCovidCaseRound1To2ByIdResponse_QNAME = new QName("http://services/", "removeCovidCaseRound1To2ByIdResponse");
    private final static QName _FindCovidCaseRound1To2ByIdResponse_QNAME = new QName("http://services/", "findCovidCaseRound1To2ByIdResponse");
    private final static QName _RemoveCovidCaseRound1To2ById_QNAME = new QName("http://services/", "removeCovidCaseRound1To2ById");
    private final static QName _UpdateCovidCaseRound1To2ById_QNAME = new QName("http://services/", "updateCovidCaseRound1To2ById");
    private final static QName _UpdateCovidCaseRound1To2ByIdResponse_QNAME = new QName("http://services/", "updateCovidCaseRound1To2ByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateCovidCaseRound1To2ById }
     * 
     */
    public UpdateCovidCaseRound1To2ById createUpdateCovidCaseRound1To2ById() {
        return new UpdateCovidCaseRound1To2ById();
    }

    /**
     * Create an instance of {@link FindCovidCaseRound1To2ByIdResponse }
     * 
     */
    public FindCovidCaseRound1To2ByIdResponse createFindCovidCaseRound1To2ByIdResponse() {
        return new FindCovidCaseRound1To2ByIdResponse();
    }

    /**
     * Create an instance of {@link RemoveCovidCaseRound1To2ById }
     * 
     */
    public RemoveCovidCaseRound1To2ById createRemoveCovidCaseRound1To2ById() {
        return new RemoveCovidCaseRound1To2ById();
    }

    /**
     * Create an instance of {@link UpdateCovidCaseRound1To2ByIdResponse }
     * 
     */
    public UpdateCovidCaseRound1To2ByIdResponse createUpdateCovidCaseRound1To2ByIdResponse() {
        return new UpdateCovidCaseRound1To2ByIdResponse();
    }

    /**
     * Create an instance of {@link Covidround1To2All }
     * 
     */
    public Covidround1To2All createCovidround1To2All() {
        return new Covidround1To2All();
    }

    /**
     * Create an instance of {@link RemoveCovidCaseRound1To2ByIdResponse }
     * 
     */
    public RemoveCovidCaseRound1To2ByIdResponse createRemoveCovidCaseRound1To2ByIdResponse() {
        return new RemoveCovidCaseRound1To2ByIdResponse();
    }

    /**
     * Create an instance of {@link FindCovidCaseRound1To2ById }
     * 
     */
    public FindCovidCaseRound1To2ById createFindCovidCaseRound1To2ById() {
        return new FindCovidCaseRound1To2ById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Covidround1To2All }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "covidround1To2All")
    public JAXBElement<Covidround1To2All> createCovidround1To2All(Covidround1To2All value) {
        return new JAXBElement<Covidround1To2All>(_Covidround1To2All_QNAME, Covidround1To2All.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidCaseRound1To2ById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidCaseRound1To2ById")
    public JAXBElement<FindCovidCaseRound1To2ById> createFindCovidCaseRound1To2ById(FindCovidCaseRound1To2ById value) {
        return new JAXBElement<FindCovidCaseRound1To2ById>(_FindCovidCaseRound1To2ById_QNAME, FindCovidCaseRound1To2ById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCovidCaseRound1To2ByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "removeCovidCaseRound1To2ByIdResponse")
    public JAXBElement<RemoveCovidCaseRound1To2ByIdResponse> createRemoveCovidCaseRound1To2ByIdResponse(RemoveCovidCaseRound1To2ByIdResponse value) {
        return new JAXBElement<RemoveCovidCaseRound1To2ByIdResponse>(_RemoveCovidCaseRound1To2ByIdResponse_QNAME, RemoveCovidCaseRound1To2ByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidCaseRound1To2ByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidCaseRound1To2ByIdResponse")
    public JAXBElement<FindCovidCaseRound1To2ByIdResponse> createFindCovidCaseRound1To2ByIdResponse(FindCovidCaseRound1To2ByIdResponse value) {
        return new JAXBElement<FindCovidCaseRound1To2ByIdResponse>(_FindCovidCaseRound1To2ByIdResponse_QNAME, FindCovidCaseRound1To2ByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCovidCaseRound1To2ById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "removeCovidCaseRound1To2ById")
    public JAXBElement<RemoveCovidCaseRound1To2ById> createRemoveCovidCaseRound1To2ById(RemoveCovidCaseRound1To2ById value) {
        return new JAXBElement<RemoveCovidCaseRound1To2ById>(_RemoveCovidCaseRound1To2ById_QNAME, RemoveCovidCaseRound1To2ById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCovidCaseRound1To2ById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateCovidCaseRound1To2ById")
    public JAXBElement<UpdateCovidCaseRound1To2ById> createUpdateCovidCaseRound1To2ById(UpdateCovidCaseRound1To2ById value) {
        return new JAXBElement<UpdateCovidCaseRound1To2ById>(_UpdateCovidCaseRound1To2ById_QNAME, UpdateCovidCaseRound1To2ById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCovidCaseRound1To2ByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateCovidCaseRound1To2ByIdResponse")
    public JAXBElement<UpdateCovidCaseRound1To2ByIdResponse> createUpdateCovidCaseRound1To2ByIdResponse(UpdateCovidCaseRound1To2ByIdResponse value) {
        return new JAXBElement<UpdateCovidCaseRound1To2ByIdResponse>(_UpdateCovidCaseRound1To2ByIdResponse_QNAME, UpdateCovidCaseRound1To2ByIdResponse.class, null, value);
    }

}
