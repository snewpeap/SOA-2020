
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Ȩ������ complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Ȩ������">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ͼ���" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="��ѧ¥A" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="��ѧ¥B" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ѧ��ʳ��" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="��ְ��ʳ��" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ȩ������", namespace = "http://jw.nju.edu.cn/schema")
public class Ȩ������ {

    @XmlAttribute
    protected Boolean ͼ���;
    @XmlAttribute
    protected Boolean ��ѧ¥A;
    @XmlAttribute
    protected Boolean ��ѧ¥B;
    @XmlAttribute
    protected Boolean ѧ��ʳ��;
    @XmlAttribute
    protected Boolean ��ְ��ʳ��;

    public static Ȩ������ getDefaultStudentAuthority() {
        Ȩ������ auth = new Ȩ������();
        auth.ͼ��� = true;
        auth.��ѧ¥A = true;
        auth.��ѧ¥B = true;
        auth.ѧ��ʳ�� = true;
        auth.��ְ��ʳ�� = false;
        return auth;
    }

    /**
     * ��ȡͼ������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isͼ���() {
        return ͼ���;
    }

    /**
     * ����ͼ������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setͼ���(Boolean value) {
        this.ͼ��� = value;
    }

    /**
     * ��ȡ��ѧ¥A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean is��ѧ¥A() {
        return ��ѧ¥A;
    }

    /**
     * ���ý�ѧ¥A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void set��ѧ¥A(Boolean value) {
        this.��ѧ¥A = value;
    }

    /**
     * ��ȡ��ѧ¥B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean is��ѧ¥B() {
        return ��ѧ¥B;
    }

    /**
     * ���ý�ѧ¥B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void set��ѧ¥B(Boolean value) {
        this.��ѧ¥B = value;
    }

    /**
     * ��ȡѧ��ʳ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isѧ��ʳ��() {
        return ѧ��ʳ��;
    }

    /**
     * ����ѧ��ʳ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setѧ��ʳ��(Boolean value) {
        this.ѧ��ʳ�� = value;
    }

    /**
     * ��ȡ��ְ��ʳ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean is��ְ��ʳ��() {
        return ��ְ��ʳ��;
    }

    /**
     * ���ý�ְ��ʳ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void set��ְ��ʳ��(Boolean value) {
        this.��ְ��ʳ�� = value;
    }

}
