
package startFromWSDL.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>单位类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="单位类型"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;group ref="{http://www.nju.edu.cn/schema}院系"/&gt;
 *         &lt;element name="系" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="部门" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "单位类型", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "content"
})
public class 单位类型 {

    @XmlElementRefs({
        @XmlElementRef(name = "学院", namespace = "http://www.nju.edu.cn/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "系", namespace = "http://www.nju.edu.cn/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "部门", namespace = "http://www.nju.edu.cn/schema", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> content;

    /**
     * 获取内容模型的其余部分。
     * 
     * <p>
     * 由于以下原因, 您获取的是此 "catch-all" 属性: 
     * 字段名称 "系" 由模式的两个不同部分使用。请参阅: 
     * file:/D:/programe/Java/SOA/schema/Department.xsd的第 29 行
     * file:/D:/programe/Java/SOA/schema/Department.xsd的第 37 行
     * <p>
     * 要清除此属性, 请将属性定制设置应用于以下两个声明
     * 或其中一个以更改其名称: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<String>>();
        }
        return this.content;
    }

}
