
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>��λ������Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="��λ������Ϣ����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="��λ" type="{http://www.nju.edu.cn/schema}��λ����"/&gt;
 *         &lt;element name="��ַ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="�绰" type="{http://www.nju.edu.cn/schema}ͨѶ����"/&gt;
 *         &lt;element name="����" type="{http://www.nju.edu.cn/schema}ͨѶ����"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "��λ������Ϣ����", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "��λ",
    "��ַ",
    "�绰",
    "����"
})
public class ��λ������Ϣ���� {

    @XmlElement(required = true, namespace = "http://www.nju.edu.cn/schema")
    protected ��λ���� ��λ;
    @XmlElement(required = true)
    protected String ��ַ;
    @XmlElement(required = true)
    protected String �绰;
    @XmlElement(required = true)
    protected String ����;

    /**
     * ��ȡ��λ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ��λ���� }
     *     
     */
    public ��λ���� get��λ() {
        return ��λ;
    }

    /**
     * ���õ�λ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ��λ���� }
     *     
     */
    public void set��λ(��λ���� value) {
        this.��λ = value;
    }

    /**
     * ��ȡ��ַ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get��ַ() {
        return ��ַ;
    }

    /**
     * ���õ�ַ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set��ַ(String value) {
        this.��ַ = value;
    }

    /**
     * ��ȡ�绰���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�绰() {
        return �绰;
    }

    /**
     * ���õ绰���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�绰(String value) {
        this.�绰 = value;
    }

    /**
     * ��ȡ�������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get����() {
        return ����;
    }

    /**
     * ���ô������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set����(String value) {
        this.���� = value;
    }

}
