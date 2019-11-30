
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ex" type="{}exType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusType", propOrder = {
    "ex"
})
public class StatusType {

    @XmlElement(required = true)
    protected ExType ex;

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

}
