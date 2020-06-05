
package startFromWSDL.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>课程信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="课程信息类型"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="课程编号" type="{http://jw.nju.edu.cn/schema}课程编号类型"/&gt;
 *         &lt;element name="课程名称" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="课程教师"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="教师" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="学期" type="{http://jw.nju.edu.cn/schema}学期类型"/&gt;
 *         &lt;element name="上课校区" type="{http://jw.nju.edu.cn/schema}校区类型"/&gt;
 *         &lt;element name="上课地点" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="课程类型" type="{http://jw.nju.edu.cn/schema}课程类型"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "课程信息类型", propOrder = {
    "课程编号",
    "课程名称",
    "课程教师",
    "学期",
    "上课校区",
    "上课地点",
    "课程类型"
})
public class 课程信息类型 {

    @XmlElement(required = true)
    protected String 课程编号;
    @XmlElement(required = true)
    protected String 课程名称;
    @XmlElement(required = true)
    protected 课程信息类型.课程教师 课程教师;
    @XmlElement(required = true)
    protected 学期类型 学期;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 校区类型 上课校区;
    @XmlElement(required = true)
    protected String 上课地点;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected startFromWSDL.types.课程类型 课程类型;

    /**
     * 获取课程编号属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String get课程编号() {
        return 课程编号;
    }

    /**
     * 设置课程编号属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void set课程编号(String value) {
        this.课程编号 = value;
    }

    /**
     * 获取课程名称属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String get课程名称() {
        return 课程名称;
    }

    /**
     * 设置课程名称属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void set课程名称(String value) {
        this.课程名称 = value;
    }

    /**
     * 获取课程教师属性的值。
     *
     * @return
     *     possible object is
     *     {@link 课程信息类型.课程教师 }
     *
     */
    public 课程信息类型.课程教师 get课程教师() {
        return 课程教师;
    }

    /**
     * 设置课程教师属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link 课程信息类型.课程教师 }
     *
     */
    public void set课程教师(课程信息类型.课程教师 value) {
        this.课程教师 = value;
    }

    /**
     * 获取学期属性的值。
     *
     * @return
     *     possible object is
     *     {@link 学期类型 }
     *
     */
    public 学期类型 get学期() {
        return 学期;
    }

    /**
     * 设置学期属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link 学期类型 }
     *
     */
    public void set学期(学期类型 value) {
        this.学期 = value;
    }

    /**
     * 获取上课校区属性的值。
     *
     * @return
     *     possible object is
     *     {@link 校区类型 }
     *
     */
    public 校区类型 get上课校区() {
        return 上课校区;
    }

    /**
     * 设置上课校区属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link 校区类型 }
     *
     */
    public void set上课校区(校区类型 value) {
        this.上课校区 = value;
    }

    /**
     * 获取上课地点属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String get上课地点() {
        return 上课地点;
    }

    /**
     * 设置上课地点属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void set上课地点(String value) {
        this.上课地点 = value;
    }

    /**
     * 获取课程类型属性的值。
     *
     * @return
     *     possible object is
     *     {@link startFromWSDL.types.课程类型 }
     *
     */
    public startFromWSDL.types.课程类型 get课程类型() {
        return 课程类型;
    }

    /**
     * 设置课程类型属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link startFromWSDL.types.课程类型 }
     *
     */
    public void set课程类型(startFromWSDL.types.课程类型 value) {
        this.课程类型 = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="教师" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "教师"
    })
    public static class 课程教师 {

        @XmlElement(required = true)
        protected List<String> 教师;

        /**
         * Gets the value of the 教师 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the 教师 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    get教师().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> get教师() {
            if (教师 == null) {
                教师 = new ArrayList<String>();
            }
            return this.教师;
        }

    }

}
