
package mypackage;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for present_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="present_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute ref="{}marriage_date use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "present_type")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PresentType {

    @XmlAttribute(name = "marriage_date", required = true)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar marriageDate;

    /**
     * Gets the value of the marriageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMarriageDate(XMLGregorianCalendar value) {
        this.marriageDate = value;
    }

}
