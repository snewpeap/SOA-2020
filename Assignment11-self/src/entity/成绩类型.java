
package entity;

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
 * &lt;complexType name="�ɼ�����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ѧ��" type="{http://jw.nju.edu.cn/schema}ѧ������"/>
 *         &lt;element name="�÷�" type="{http://jw.nju.edu.cn/schema}�÷�����"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "�ɼ�����", propOrder = {
    "ѧ��",
    "�÷�"
})
public class �ɼ����� {

    @XmlElement(required = true)
    protected String ѧ��;
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
