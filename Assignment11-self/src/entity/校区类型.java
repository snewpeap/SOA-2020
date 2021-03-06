
package entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>校区类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="校区类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="仙林校区"/>
 *     &lt;enumeration value="鼓楼校区"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "校区类型")
@XmlEnum
public enum 校区类型 {

    仙林校区,
    鼓楼校区;

    public String value() {
        return name();
    }

    public static 校区类型 fromValue(String v) {
        return valueOf(v);
    }

}
