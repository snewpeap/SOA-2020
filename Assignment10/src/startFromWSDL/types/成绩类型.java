
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�ɼ����� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="�ɼ�����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ѧ��" type="{http://jw.nju.edu.cn/schema}ѧ������"/&gt;
 *         &lt;element name="�÷�" type="{http://jw.nju.edu.cn/schema}�÷�����"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "�ɼ�����", namespace = "http://jw.nju.edu.cn/schema", propOrder = {
    "ѧ��",
    "�÷�"
})
public class �ɼ����� {

    @XmlElement(required = true, namespace = "http://jw.nju.edu.cn/schema")
    protected String ѧ��;
    @XmlElement(namespace = "http://jw.nju.edu.cn/schema")
    protected int �÷�;

    /**
     * ��ȡѧ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getѧ��() {
        return ѧ��;
    }

    /**
     * ����ѧ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setѧ��(String value) {
        this.ѧ�� = value;
    }

    /**
     * ��ȡ�÷����Ե�ֵ��
     * 
     */
    public int get�÷�() {
        return �÷�;
    }

    /**
     * ���õ÷����Ե�ֵ��
     * 
     */
    public void set�÷�(int value) {
        this.�÷� = value;
    }

}
