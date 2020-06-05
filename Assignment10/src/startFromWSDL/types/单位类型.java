
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>单位类型 complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="单位类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学院" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="系" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "单位类型", namespace = "http://www.nju.edu.cn/schema", propOrder = {
        "学院",
        "系"
})
public class 单位类型 {

    @XmlElement(namespace = "http://www.nju.edu.cn/schema", required = true)
    protected String 学院;
    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    protected String 系;

    /**
     * 获取学院属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String get学院() {
        return 学院;
    }

    /**
     * 设置学院属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void set学院(String value) {
        this.学院 = value;
    }

    /**
     * 获取系属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String get系() {
        return 系;
    }

    /**
     * 设置系属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void set系(String value) {
        this.系 = value;
    }

}
