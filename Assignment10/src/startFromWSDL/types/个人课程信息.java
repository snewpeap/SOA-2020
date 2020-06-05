
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>个人课程信息 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="个人课程信息"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="课程信息" type="{http://jw.nju.edu.cn/schema}课程信息类型"/&gt;
 *         &lt;element name="课程成绩列表" type="{http://jw.nju.edu.cn/schema}课程成绩列表类型"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "个人课程信息", namespace = "http://jw.nju.edu.cn/schema", propOrder = {
    "课程信息",
    "课程成绩列表"
})
public class 个人课程信息 {

    @XmlElement(required = true, namespace = "http://jw.nju.edu.cn/schema")
    protected 课程信息类型 课程信息;
    @XmlElement(required = true, namespace = "http://jw.nju.edu.cn/schema")
    protected 课程成绩列表类型 课程成绩列表;

    /**
     * 获取课程信息属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 课程信息类型 }
     *     
     */
    public 课程信息类型 get课程信息() {
        return 课程信息;
    }

    /**
     * 设置课程信息属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 课程信息类型 }
     *     
     */
    public void set课程信息(课程信息类型 value) {
        this.课程信息 = value;
    }

    /**
     * 获取课程成绩列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 课程成绩列表类型 }
     *     
     */
    public 课程成绩列表类型 get课程成绩列表() {
        return 课程成绩列表;
    }

    /**
     * 设置课程成绩列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 课程成绩列表类型 }
     *     
     */
    public void set课程成绩列表(课程成绩列表类型 value) {
        this.课程成绩列表 = value;
    }

}
