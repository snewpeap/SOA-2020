
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>个人基本信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="个人基本信息类型"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="姓名" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="性别" type="{http://www.nju.edu.cn/schema}性别类型"/&gt;
 *         &lt;element name="出生日期" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="单位部门" type="{http://www.nju.edu.cn/schema}单位部门信息类型"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "个人基本信息类型", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "姓名",
    "性别",
    "出生日期",
    "单位部门"
})
public class 个人基本信息类型 {

    @XmlElement(required = true)
    protected String 姓名;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 性别类型 性别;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar 出生日期;
    @XmlElement(required = true)
    protected 单位部门信息类型 单位部门;

    /**
     * 获取姓名属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get姓名() {
        return 姓名;
    }

    /**
     * 设置姓名属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set姓名(String value) {
        this.姓名 = value;
    }

    /**
     * 获取性别属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 性别类型 }
     *     
     */
    public 性别类型 get性别() {
        return 性别;
    }

    /**
     * 设置性别属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 性别类型 }
     *     
     */
    public void set性别(性别类型 value) {
        this.性别 = value;
    }

    /**
     * 获取出生日期属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get出生日期() {
        return 出生日期;
    }

    /**
     * 设置出生日期属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set出生日期(XMLGregorianCalendar value) {
        this.出生日期 = value;
    }

    /**
     * 获取单位部门属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 单位部门信息类型 }
     *     
     */
    public 单位部门信息类型 get单位部门() {
        return 单位部门;
    }

    /**
     * 设置单位部门属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 单位部门信息类型 }
     *     
     */
    public void set单位部门(单位部门信息类型 value) {
        this.单位部门 = value;
    }

}
