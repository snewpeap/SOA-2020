
package startFromWSDL.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>学生列表类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生列表类型"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="学生" type="{http://jw.nju.edu.cn/schema}学生信息类型"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "学生列表", namespace = "http://jw.nju.edu.cn/schema")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "学生列表类型", namespace = "http://jw.nju.edu.cn/schema", propOrder = {
    "学生"
})
public class 学生列表类型 {

    @XmlElement(namespace = "http://jw.nju.edu.cn/schema")
    protected List<学生信息类型> 学生;

    /**
     * Gets the value of the 学生 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 学生 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get学生().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link 学生信息类型 }
     * 
     * 
     */
    public List<学生信息类型> get学生() {
        if (学生 == null) {
            学生 = new ArrayList<学生信息类型>();
        }
        return this.学生;
    }

}
