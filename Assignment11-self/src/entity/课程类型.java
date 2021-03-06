
package entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>课程类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="课程类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="核心"/>
 *     &lt;enumeration value="平台"/>
 *     &lt;enumeration value="选修"/>
 *     &lt;enumeration value="通修"/>
 *     &lt;enumeration value="通识"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "课程类型")
@XmlEnum
public enum 课程类型 {

    核心,
    平台,
    选修,
    通修,
    通识;

    public String value() {
        return name();
    }

    public static 课程类型 fromValue(String v) {
        return valueOf(v);
    }

}
