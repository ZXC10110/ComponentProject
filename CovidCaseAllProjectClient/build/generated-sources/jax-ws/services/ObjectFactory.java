
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

    private final static QName _FindCovidCaseAllByWeeknum_QNAME = new QName("http://services/", "findCovidCaseAllByWeeknum");
    private final static QName _FindCovidCaseAllByWeeknumResponse_QNAME = new QName("http://services/", "findCovidCaseAllByWeeknumResponse");
    private final static QName _Covidcaseallpro_QNAME = new QName("http://services/", "covidcaseallpro");
    private final static QName _FindCovidCaseAll_QNAME = new QName("http://services/", "findCovidCaseAll");
    private final static QName _FindCovidCaseAllById_QNAME = new QName("http://services/", "findCovidCaseAllById");
    private final static QName _FindCovidCaseAllByIdResponse_QNAME = new QName("http://services/", "findCovidCaseAllByIdResponse");
    private final static QName _FindCovidCaseAllResponse_QNAME = new QName("http://services/", "findCovidCaseAllResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindCovidCaseAllResponse }
     * 
     */
    public FindCovidCaseAllResponse createFindCovidCaseAllResponse() {
        return new FindCovidCaseAllResponse();
    }

    /**
     * Create an instance of {@link FindCovidCaseAllByWeeknum }
     * 
     */
    public FindCovidCaseAllByWeeknum createFindCovidCaseAllByWeeknum() {
        return new FindCovidCaseAllByWeeknum();
    }

    /**
     * Create an instance of {@link FindCovidCaseAllByWeeknumResponse }
     * 
     */
    public FindCovidCaseAllByWeeknumResponse createFindCovidCaseAllByWeeknumResponse() {
        return new FindCovidCaseAllByWeeknumResponse();
    }

    /**
     * Create an instance of {@link Covidcaseallpro }
     * 
     */
    public Covidcaseallpro createCovidcaseallpro() {
        return new Covidcaseallpro();
    }

    /**
     * Create an instance of {@link FindCovidCaseAll }
     * 
     */
    public FindCovidCaseAll createFindCovidCaseAll() {
        return new FindCovidCaseAll();
    }

    /**
     * Create an instance of {@link FindCovidCaseAllById }
     * 
     */
    public FindCovidCaseAllById createFindCovidCaseAllById() {
        return new FindCovidCaseAllById();
    }

    /**
     * Create an instance of {@link FindCovidCaseAllByIdResponse }
     * 
     */
    public FindCovidCaseAllByIdResponse createFindCovidCaseAllByIdResponse() {
        return new FindCovidCaseAllByIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidCaseAllByWeeknum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidCaseAllByWeeknum")
    public JAXBElement<FindCovidCaseAllByWeeknum> createFindCovidCaseAllByWeeknum(FindCovidCaseAllByWeeknum value) {
        return new JAXBElement<FindCovidCaseAllByWeeknum>(_FindCovidCaseAllByWeeknum_QNAME, FindCovidCaseAllByWeeknum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidCaseAllByWeeknumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidCaseAllByWeeknumResponse")
    public JAXBElement<FindCovidCaseAllByWeeknumResponse> createFindCovidCaseAllByWeeknumResponse(FindCovidCaseAllByWeeknumResponse value) {
        return new JAXBElement<FindCovidCaseAllByWeeknumResponse>(_FindCovidCaseAllByWeeknumResponse_QNAME, FindCovidCaseAllByWeeknumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Covidcaseallpro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "covidcaseallpro")
    public JAXBElement<Covidcaseallpro> createCovidcaseallpro(Covidcaseallpro value) {
        return new JAXBElement<Covidcaseallpro>(_Covidcaseallpro_QNAME, Covidcaseallpro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidCaseAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidCaseAll")
    public JAXBElement<FindCovidCaseAll> createFindCovidCaseAll(FindCovidCaseAll value) {
        return new JAXBElement<FindCovidCaseAll>(_FindCovidCaseAll_QNAME, FindCovidCaseAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidCaseAllById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidCaseAllById")
    public JAXBElement<FindCovidCaseAllById> createFindCovidCaseAllById(FindCovidCaseAllById value) {
        return new JAXBElement<FindCovidCaseAllById>(_FindCovidCaseAllById_QNAME, FindCovidCaseAllById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidCaseAllByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidCaseAllByIdResponse")
    public JAXBElement<FindCovidCaseAllByIdResponse> createFindCovidCaseAllByIdResponse(FindCovidCaseAllByIdResponse value) {
        return new JAXBElement<FindCovidCaseAllByIdResponse>(_FindCovidCaseAllByIdResponse_QNAME, FindCovidCaseAllByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidCaseAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidCaseAllResponse")
    public JAXBElement<FindCovidCaseAllResponse> createFindCovidCaseAllResponse(FindCovidCaseAllResponse value) {
        return new JAXBElement<FindCovidCaseAllResponse>(_FindCovidCaseAllResponse_QNAME, FindCovidCaseAllResponse.class, null, value);
    }

}
