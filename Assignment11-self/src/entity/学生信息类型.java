
package entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ѧ����Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ѧ����Ϣ����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="������Ϣ" type="{http://www.nju.edu.cn/schema}���˻�����Ϣ����"/>
 *         &lt;element name="ѧ��" type="{http://jw.nju.edu.cn/schema}ѧ������"/>
 *         &lt;element name="���˿γ�">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="�γ�" type="{http://jw.nju.edu.cn/schema}���˿γ���Ϣ"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ȩ��" type="{http://jw.nju.edu.cn/schema}Ȩ������"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ѧ����Ϣ����", propOrder = {
    "������Ϣ",
    "ѧ��",
    "���˿γ�",
    "Ȩ��"
})
public class ѧ����Ϣ���� {

    @XmlElement(required = true)
    protected ���˻�����Ϣ���� ������Ϣ;
    @XmlElement(required = true)
    protected String ѧ��;
    @XmlElement(required = true)
    protected ѧ����Ϣ����.���˿γ� ���˿γ�;
    @XmlElement(required = true)
    protected Ȩ������ Ȩ��;

    /**
     * ��ȡ������Ϣ���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link ���˻�����Ϣ���� }
     *
     */
    public ���˻�����Ϣ���� get������Ϣ() {
        return ������Ϣ;
    }

    /**
     * ���ø�����Ϣ���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link ���˻�����Ϣ���� }
     *
     */
    public void set������Ϣ(���˻�����Ϣ���� value) {
        this.������Ϣ = value;
    }

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
     * ��ȡ���˿γ����Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link ѧ����Ϣ����.���˿γ� }
     *
     */
    public ѧ����Ϣ����.���˿γ� get���˿γ�() {
        return ���˿γ�;
    }

    /**
     * ���ø��˿γ����Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link ѧ����Ϣ����.���˿γ� }
     *
     */
    public void set���˿γ�(ѧ����Ϣ����.���˿γ� value) {
        this.���˿γ� = value;
    }

    /**
     * ��ȡȨ�����Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link Ȩ������ }
     *
     */
    public Ȩ������ getȨ��() {
        return Ȩ��;
    }

    /**
     * ����Ȩ�����Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link Ȩ������ }
     *
     */
    public void setȨ��(Ȩ������ value) {
        this.Ȩ�� = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="�γ�" type="{http://jw.nju.edu.cn/schema}���˿γ���Ϣ"/>
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
        "�γ�"
    })
    public static class ���˿γ� {

        protected List<���˿γ���Ϣ> �γ�;

        /**
         * Gets the value of the �γ� property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the �γ� property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    get�γ�().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ���˿γ���Ϣ }
         * 
         * 
         */
        public List<���˿γ���Ϣ> get�γ�() {
            if (�γ� == null) {
                �γ� = new ArrayList<���˿γ���Ϣ>();
            }
            return this.�γ�;
        }

    }

}
