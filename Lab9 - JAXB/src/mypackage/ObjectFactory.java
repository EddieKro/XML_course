
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _Main_QNAME = new QName("", "main");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Husband }
     * 
     */
    public Husband createHusband() {
        return new Husband();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link Maintype }
     * 
     */
    public Maintype createMaintype() {
        return new Maintype();
    }

    /**
     * Create an instance of {@link PresentType }
     * 
     */
    public PresentType createPresentType() {
        return new PresentType();
    }

    /**
     * Create an instance of {@link CandidateType }
     * 
     */
    public CandidateType createCandidateType() {
        return new CandidateType();
    }

    /**
     * Create an instance of {@link ExType }
     * 
     */
    public ExType createExType() {
        return new ExType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Maintype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "main")
    public JAXBElement<Maintype> createMain(Maintype value) {
        return new JAXBElement<Maintype>(_Main_QNAME, Maintype.class, null, value);
    }

}
