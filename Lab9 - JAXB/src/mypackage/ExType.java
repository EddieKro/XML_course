
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ex_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ex_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute ref="{}marriage_date use="required""/>
 *       &lt;attribute ref="{}divorce_date use="required""/>
 *       &lt;attribute ref="{}divorce_reason"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ex_type")
public class ExType {

    @XmlAttribute(name = "marriage_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar marriageDate;
    @XmlAttribute(name = "divorce_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar divorceDate;
    @XmlAttribute(name = "divorce_reason")
    protected String divorceReason;

    /**
     * Gets the value of the marriageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMarriageDate() {
        return marriageDate;
    }

    /**
     * Sets the value of the marriageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMarriageDate(XMLGregorianCalendar value) {
        this.marriageDate = value;
    }

    /**
     * Gets the value of the divorceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDivorceDate() {
        return divorceDate;
    }

    /**
     * Sets the value of the divorceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDivorceDate(XMLGregorianCalendar value) {
        this.divorceDate = value;
    }

    /**
     * Gets the value of the divorceReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivorceReason() {
        return divorceReason;
    }

    /**
     * Sets the value of the divorceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivorceReason(String value) {
        this.divorceReason = value;
    }

}
