
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for exType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="marriage_date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="divorce_date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="divorce_reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exType", propOrder = {
    "value"
})
public class ExType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "marriage_date")
    protected String marriageDate;
    @XmlAttribute(name = "divorce_date")
    protected String divorceDate;
    @XmlAttribute(name = "divorce_reason")
    protected String divorceReason;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the marriageDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageDate() {
        return marriageDate;
    }

    /**
     * Sets the value of the marriageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageDate(String value) {
        this.marriageDate = value;
    }

    /**
     * Gets the value of the divorceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivorceDate() {
        return divorceDate;
    }

    /**
     * Sets the value of the divorceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivorceDate(String value) {
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
