
package entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学生信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="个人信息" type="{http://www.nju.edu.cn/schema}个人基本信息类型"/>
 *         &lt;element name="学号" type="{http://jw.nju.edu.cn/schema}学号类型"/>
 *         &lt;element name="个人课程">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="课程" type="{http://jw.nju.edu.cn/schema}个人课程信息"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="权限" type="{http://jw.nju.edu.cn/schema}权限类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "学生信息类型", propOrder = {
    "个人信息",
    "学号",
    "个人课程",
    "权限"
})
public class 学生信息类型 {

    @XmlElement(required = true)
    protected 个人基本信息类型 个人信息;
    @XmlElement(required = true)
    protected String 学号;
    @XmlElement(required = true)
    protected 学生信息类型.个人课程 个人课程;
    @XmlElement(required = true)
    protected 权限类型 权限;

    /**
     * 获取个人信息属性的值。
     *
     * @return
     *     possible object is
     *     {@link 个人基本信息类型 }
     *
     */
    public 个人基本信息类型 get个人信息() {
        return 个人信息;
    }

    /**
     * 设置个人信息属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link 个人基本信息类型 }
     *
     */
    public void set个人信息(个人基本信息类型 value) {
        this.个人信息 = value;
    }

    /**
     * 获取学号属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String get学号() {
        return 学号;
    }

    /**
     * 设置学号属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void set学号(String value) {
        this.学号 = value;
    }

    /**
     * 获取个人课程属性的值。
     *
     * @return
     *     possible object is
     *     {@link 学生信息类型.个人课程 }
     *
     */
    public 学生信息类型.个人课程 get个人课程() {
        return 个人课程;
    }

    /**
     * 设置个人课程属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link 学生信息类型.个人课程 }
     *
     */
    public void set个人课程(学生信息类型.个人课程 value) {
        this.个人课程 = value;
    }

    /**
     * 获取权限属性的值。
     *
     * @return
     *     possible object is
     *     {@link 权限类型 }
     *
     */
    public 权限类型 get权限() {
        return 权限;
    }

    /**
     * 设置权限属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link 权限类型 }
     *
     */
    public void set权限(权限类型 value) {
        this.权限 = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="课程" type="{http://jw.nju.edu.cn/schema}个人课程信息"/>
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
        "课程"
    })
    public static class 个人课程 {

        protected List<个人课程信息> 课程;

        /**
         * Gets the value of the 课程 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the 课程 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    get课程().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link 个人课程信息 }
         * 
         * 
         */
        public List<个人课程信息> get课程() {
            if (课程 == null) {
                课程 = new ArrayList<个人课程信息>();
            }
            return this.课程;
        }

    }

}
