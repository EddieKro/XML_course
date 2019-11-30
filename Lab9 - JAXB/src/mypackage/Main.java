
package mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="husband" type="{}husband" maxOccurs="200"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "husband"
})
@XmlRootElement(name = "main")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Main {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Husband> husband;

    /**
     * Gets the value of the husband property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the husband property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHusband().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Husband }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Husband> getHusband() {
        if (husband == null) {
            husband = new ArrayList<Husband>();
        }
        return this.husband;
    }

}
