
package mypackage;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for husband complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="husband">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{}status_type"/>
 *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{}email_type" minOccurs="0"/>
 *         &lt;element name="haircolor" type="{}color_type" minOccurs="0"/>
 *         &lt;element name="eyecolor" type="{}color_type" minOccurs="0"/>
 *         &lt;element name="height" type="{}height_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "husband", propOrder = {
    "status",
    "fullname",
    "address",
    "email",
    "haircolor",
    "eyecolor",
    "height"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Husband {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected StatusType status;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String fullname;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String address;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String email;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String haircolor;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String eyecolor;
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int height;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEyecolor(String value) {
        this.eyecolor = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setHeight(int value) {
        this.height = value;
    }

}
