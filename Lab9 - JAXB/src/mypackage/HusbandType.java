
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for husbandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="husbandType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{}statusType"/>
 *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="haircolor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eyecolor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "husbandType", propOrder = {
    "status",
    "fullname",
    "address",
    "email",
    "haircolor",
    "eyecolor",
    "height"
})
public class HusbandType {

    @XmlElement(required = true)
    protected StatusType status;
    @XmlElement(required = true)
    protected String fullname;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String haircolor;
    @XmlElement(required = true)
    protected String eyecolor;
    @XmlElement(required = true)
    protected String height;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullname(String value) {
        this.fullname = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the haircolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaircolor() {
        return haircolor;
    }

    /**
     * Sets the value of the haircolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaircolor(String value) {
        this.haircolor = value;
    }

    /**
     * Gets the value of the eyecolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEyecolor() {
        return eyecolor;
    }

    /**
     * Sets the value of the eyecolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEyecolor(String value) {
        this.eyecolor = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

}
