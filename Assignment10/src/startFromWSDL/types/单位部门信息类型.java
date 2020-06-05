
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>单位部门信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="单位部门信息类型"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="单位" type="{http://www.nju.edu.cn/schema}单位类型"/&gt;
 *         &lt;element name="地址" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="电话" type="{http://www.nju.edu.cn/schema}通讯类型"/&gt;
 *         &lt;element name="传真" type="{http://www.nju.edu.cn/schema}通讯类型"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "单位部门信息类型", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "单位",
    "地址",
    "电话",
    "传真"
})
public class 单位部门信息类型 {

    @XmlElement(required = true, namespace = "http://www.nju.edu.cn/schema")
    protected 单位类型 单位;
    @XmlElement(required = true)
    protected String 地址;
    @XmlElement(required = true)
    protected String 电话;
    @XmlElement(required = true)
    protected String 传真;

    /**
     * 获取单位属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 单位类型 }
     *     
     */
    public 单位类型 get单位() {
        return 单位;
    }

    /**
     * 设置单位属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 单位类型 }
     *     
     */
    public void set单位(单位类型 value) {
        this.单位 = value;
    }

    /**
     * 获取地址属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get地址() {
        return 地址;
    }

    /**
     * 设置地址属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set地址(String value) {
        this.地址 = value;
    }

    /**
     * 获取电话属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get电话() {
        return 电话;
    }

    /**
     * 设置电话属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set电话(String value) {
        this.电话 = value;
    }

    /**
     * 获取传真属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get传真() {
        return 传真;
    }

    /**
     * 设置传真属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set传真(String value) {
        this.传真 = value;
    }

}
