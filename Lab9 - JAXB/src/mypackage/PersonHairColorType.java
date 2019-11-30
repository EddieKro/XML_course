
package mypackage;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonHairColorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonHairColorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Maroon"/>
 *     &lt;enumeration value="Pink"/>
 *     &lt;enumeration value="Ginger"/>
 *     &lt;enumeration value="Blond"/>
 *     &lt;enumeration value="Grey"/>
 *     &lt;enumeration value="White"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonHairColorType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-11-30T11:08:12+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PersonHairColorType {

    @XmlEnumValue("Maroon")
    MAROON("Maroon"),
    @XmlEnumValue("Pink")
    PINK("Pink"),
    @XmlEnumValue("Ginger")
    GINGER("Ginger"),
    @XmlEnumValue("Blond")
    BLOND("Blond"),
    @XmlEnumValue("Grey")
    GREY("Grey"),
    @XmlEnumValue("White")
    WHITE("White");
    private final String value;

    PersonHairColorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonHairColorType fromValue(String v) {
        for (PersonHairColorType c: PersonHairColorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
