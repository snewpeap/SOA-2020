
package entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�γ���Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="�γ���Ϣ����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="�γ̱��" type="{http://jw.nju.edu.cn/schema}�γ̱������"/>
 *         &lt;element name="�γ�����" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="�γ̽�ʦ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="��ʦ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ѧ��" type="{http://jw.nju.edu.cn/schema}ѧ������"/>
 *         &lt;element name="�Ͽ�У��" type="{http://jw.nju.edu.cn/schema}У������"/>
 *         &lt;element name="�Ͽεص�" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="�γ�����" type="{http://jw.nju.edu.cn/schema}�γ�����"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "�γ���Ϣ����", propOrder = {
    "�γ̱��",
    "�γ�����",
    "�γ̽�ʦ",
    "ѧ��",
    "�Ͽ�У��",
    "�Ͽεص�",
    "�γ�����"
})
public class �γ���Ϣ���� {

    @XmlElement(required = true)
    protected String �γ̱��;
    @XmlElement(required = true)
    protected String �γ�����;
    @XmlElement(required = true)
    protected �γ���Ϣ����.�γ̽�ʦ �γ̽�ʦ;
    @XmlElement(required = true)
    protected ѧ������ ѧ��;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected У������ �Ͽ�У��;
    @XmlElement(required = true)
    protected String �Ͽεص�;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected entity.�γ����� �γ�����;

    /**
     * ��ȡ�γ̱�����Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String get�γ̱��() {
        return �γ̱��;
    }

    /**
     * ���ÿγ̱�����Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void set�γ̱��(String value) {
        this.�γ̱�� = value;
    }

    /**
     * ��ȡ�γ��������Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String get�γ�����() {
        return �γ�����;
    }

    /**
     * ���ÿγ��������Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void set�γ�����(String value) {
        this.�γ����� = value;
    }

    /**
     * ��ȡ�γ̽�ʦ���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link �γ���Ϣ����.�γ̽�ʦ }
     *
     */
    public �γ���Ϣ����.�γ̽�ʦ get�γ̽�ʦ() {
        return �γ̽�ʦ;
    }

    /**
     * ���ÿγ̽�ʦ���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link �γ���Ϣ����.�γ̽�ʦ }
     *
     */
    public void set�γ̽�ʦ(�γ���Ϣ����.�γ̽�ʦ value) {
        this.�γ̽�ʦ = value;
    }

    /**
     * ��ȡѧ�����Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link ѧ������ }
     *
     */
    public ѧ������ getѧ��() {
        return ѧ��;
    }

    /**
     * ����ѧ�����Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link ѧ������ }
     *
     */
    public void setѧ��(ѧ������ value) {
        this.ѧ�� = value;
    }

    /**
     * ��ȡ�Ͽ�У�����Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link У������ }
     *
     */
    public У������ get�Ͽ�У��() {
        return �Ͽ�У��;
    }

    /**
     * �����Ͽ�У�����Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link У������ }
     *
     */
    public void set�Ͽ�У��(У������ value) {
        this.�Ͽ�У�� = value;
    }

    /**
     * ��ȡ�Ͽεص����Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String get�Ͽεص�() {
        return �Ͽεص�;
    }

    /**
     * �����Ͽεص����Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void set�Ͽεص�(String value) {
        this.�Ͽεص� = value;
    }

    /**
     * ��ȡ�γ��������Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link entity.�γ����� }
     *
     */
    public entity.�γ����� get�γ�����() {
        return �γ�����;
    }

    /**
     * ���ÿγ��������Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link entity.�γ����� }
     *
     */
    public void set�γ�����(entity.�γ����� value) {
        this.�γ����� = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     *
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="��ʦ" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "��ʦ"
    })
    public static class �γ̽�ʦ {

        @XmlElement(required = true)
        protected List<String> ��ʦ;

        /**
         * Gets the value of the ��ʦ property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ��ʦ property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    get��ʦ().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> get��ʦ() {
            if (��ʦ == null) {
                ��ʦ = new ArrayList<String>();
            }
            return this.��ʦ;
        }

    }

}
