
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
 * <p>��λ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="��λ����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;group ref="{http://www.nju.edu.cn/schema}Ժϵ"/&gt;
 *         &lt;element name="ϵ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="����" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "��λ����", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "content"
})
public class ��λ���� {

    @XmlElementRefs({
        @XmlElementRef(name = "ѧԺ", namespace = "http://www.nju.edu.cn/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ϵ", namespace = "http://www.nju.edu.cn/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "����", namespace = "http://www.nju.edu.cn/schema", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> content;

    /**
     * ��ȡ����ģ�͵����ಿ�֡�
     * 
     * <p>
     * ��������ԭ��, ����ȡ���Ǵ� "catch-all" ����: 
     * �ֶ����� "ϵ" ��ģʽ��������ͬ����ʹ�á������: 
     * file:/D:/programe/Java/SOA/schema/Department.xsd�ĵ� 29 ��
     * file:/D:/programe/Java/SOA/schema/Department.xsd�ĵ� 37 ��
     * <p>
     * Ҫ���������, �뽫���Զ�������Ӧ����������������
     * ������һ���Ը���������: 
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
