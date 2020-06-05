
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>权限类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="权限类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="图书馆" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="教学楼A" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="教学楼B" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="学生食堂" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="教职工食堂" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "权限类型", namespace = "http://jw.nju.edu.cn/schema")
public class 权限类型 {

    @XmlAttribute
    protected Boolean 图书馆;
    @XmlAttribute
    protected Boolean 教学楼A;
    @XmlAttribute
    protected Boolean 教学楼B;
    @XmlAttribute
    protected Boolean 学生食堂;
    @XmlAttribute
    protected Boolean 教职工食堂;

    public static 权限类型 getDefaultStudentAuthority() {
        权限类型 auth = new 权限类型();
        auth.图书馆 = true;
        auth.教学楼A = true;
        auth.教学楼B = true;
        auth.学生食堂 = true;
        auth.教职工食堂 = false;
        return auth;
    }

    /**
     * 获取图书馆属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean is图书馆() {
        return 图书馆;
    }

    /**
     * 设置图书馆属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void set图书馆(Boolean value) {
        this.图书馆 = value;
    }

    /**
     * 获取教学楼A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean is教学楼A() {
        return 教学楼A;
    }

    /**
     * 设置教学楼A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void set教学楼A(Boolean value) {
        this.教学楼A = value;
    }

    /**
     * 获取教学楼B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean is教学楼B() {
        return 教学楼B;
    }

    /**
     * 设置教学楼B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void set教学楼B(Boolean value) {
        this.教学楼B = value;
    }

    /**
     * 获取学生食堂属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean is学生食堂() {
        return 学生食堂;
    }

    /**
     * 设置学生食堂属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void set学生食堂(Boolean value) {
        this.学生食堂 = value;
    }

    /**
     * 获取教职工食堂属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean is教职工食堂() {
        return 教职工食堂;
    }

    /**
     * 设置教职工食堂属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void set教职工食堂(Boolean value) {
        this.教职工食堂 = value;
    }

}
