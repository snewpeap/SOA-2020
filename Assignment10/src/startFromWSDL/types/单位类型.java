
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>��λ���� complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType name="��λ����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ѧԺ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ϵ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "��λ����", namespace = "http://www.nju.edu.cn/schema", propOrder = {
        "ѧԺ",
        "ϵ"
})
public class ��λ���� {

    @XmlElement(namespace = "http://www.nju.edu.cn/schema", required = true)
    protected String ѧԺ;
    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    protected String ϵ;

    /**
     * ��ȡѧԺ���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getѧԺ() {
        return ѧԺ;
    }

    /**
     * ����ѧԺ���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setѧԺ(String value) {
        this.ѧԺ = value;
    }

    /**
     * ��ȡϵ���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getϵ() {
        return ϵ;
    }

    /**
     * ����ϵ���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setϵ(String value) {
        this.ϵ = value;
    }

}
