
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for status_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="status_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ex" type="{}ex_type"/>
 *         &lt;element name="present" type="{}present_type"/>
 *         &lt;element name="candidate" type="{}candidate_type"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "status_type", propOrder = {
    "ex",
    "present",
    "candidate"
})
public class StatusType {

    protected ExType ex;
    protected PresentType present;
    protected CandidateType candidate;

    /**
     * Gets the value of the ex property.
     * 
     * @return
     *     possible object is
     *     {@link ExType }
     *     
     */
    public ExType getEx() {
        return ex;
    }

    /**
     * Sets the value of the ex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExType }
     *     
     */
    public void setEx(ExType value) {
        this.ex = value;
    }

    /**
     * Gets the value of the present property.
     * 
     * @return
     *     possible object is
     *     {@link PresentType }
     *     
     */
    public PresentType getPresent() {
        return present;
    }

    /**
     * Sets the value of the present property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentType }
     *     
     */
    public void setPresent(PresentType value) {
        this.present = value;
    }

    /**
     * Gets the value of the candidate property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateType }
     *     
     */
    public CandidateType getCandidate() {
        return candidate;
    }

    /**
     * Sets the value of the candidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateType }
     *     
     */
    public void setCandidate(CandidateType value) {
        this.candidate = value;
    }

}
