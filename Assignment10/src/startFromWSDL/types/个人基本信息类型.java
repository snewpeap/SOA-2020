
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>���˻�����Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="���˻�����Ϣ����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="����" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="�Ա�" type="{http://www.nju.edu.cn/schema}�Ա�����"/&gt;
 *         &lt;element name="��������" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="��λ����" type="{http://www.nju.edu.cn/schema}��λ������Ϣ����"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "���˻�����Ϣ����", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "����",
    "�Ա�",
    "��������",
    "��λ����"
})
public class ���˻�����Ϣ���� {

    @XmlElement(required = true)
    protected String ����;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected �Ա����� �Ա�;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ��������;
    @XmlElement(required = true)
    protected ��λ������Ϣ���� ��λ����;

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
     * �����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set����(String value) {
        this.���� = value;
    }

    /**
     * ��ȡ�Ա����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �Ա����� }
     *     
     */
    public �Ա����� get�Ա�() {
        return �Ա�;
    }

    /**
     * �����Ա����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �Ա����� }
     *     
     */
    public void set�Ա�(�Ա����� value) {
        this.�Ա� = value;
    }

    /**
     * ��ȡ�����������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get��������() {
        return ��������;
    }

    /**
     * ���ó����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set��������(XMLGregorianCalendar value) {
        this.�������� = value;
    }

    /**
     * ��ȡ��λ�������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ��λ������Ϣ���� }
     *     
     */
    public ��λ������Ϣ���� get��λ����() {
        return ��λ����;
    }

    /**
     * ���õ�λ�������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ��λ������Ϣ���� }
     *     
     */
    public void set��λ����(��λ������Ϣ���� value) {
        this.��λ���� = value;
    }

}
