
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>性别类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="性别类型"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="男"/&gt;
 *     &lt;enumeration value="女"/&gt;
 *     &lt;enumeration value="其他"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "性别类型", namespace = "http://www.nju.edu.cn/schema")
@XmlEnum
public enum 性别类型 {

    男,
    女,
    其他;

    public String value() {
        return name();
    }

    public static 性别类型 fromValue(String v) {
        return valueOf(v);
    }

}
