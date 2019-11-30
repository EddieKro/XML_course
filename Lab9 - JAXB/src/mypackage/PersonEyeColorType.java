
package mypackage;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonEyeColorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonEyeColorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Black"/>
 *     &lt;enumeration value="Hazel"/>
 *     &lt;enumeration value="Gray"/>
 *     &lt;enumeration value="Brown"/>
 *     &lt;enumeration value="Blue"/>
 *     &lt;enumeration value="Violet"/>
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="Dichromatic"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonEyeColorType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PersonEyeColorType {

    @XmlEnumValue("Black")
    BLACK("Black"),
    @XmlEnumValue("Hazel")
    HAZEL("Hazel"),
    @XmlEnumValue("Gray")
    GRAY("Gray"),
    @XmlEnumValue("Brown")
    BROWN("Brown"),
    @XmlEnumValue("Blue")
    BLUE("Blue"),
    @XmlEnumValue("Violet")
    VIOLET("Violet"),
    @XmlEnumValue("Green")
    GREEN("Green"),
    @XmlEnumValue("Dichromatic")
    DICHROMATIC("Dichromatic"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PersonEyeColorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonEyeColorType fromValue(String v) {
        for (PersonEyeColorType c: PersonEyeColorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
