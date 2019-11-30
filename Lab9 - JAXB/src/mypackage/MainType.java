
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="husband" type="{}husbandType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mainType", propOrder = {
    "husband"
})
public class MainType {

    @XmlElement(required = true)
    protected HusbandType husband;

    /**
     * Gets the value of the husband property.
     * 
     * @return
     *     possible object is
     *     {@link HusbandType }
     *     
     */
    public HusbandType getHusband() {
        return husband;
    }

    /**
     * Sets the value of the husband property.
     * 
     * @param value
     *     allowed object is
     *     {@link HusbandType }
     *     
     */
    public void setHusband(HusbandType value) {
        this.husband = value;
    }

}
