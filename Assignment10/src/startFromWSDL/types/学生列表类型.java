
package startFromWSDL.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ѧ���б����� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ѧ���б�����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="ѧ��" type="{http://jw.nju.edu.cn/schema}ѧ����Ϣ����"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ѧ���б�����", propOrder = {
    "ѧ��"
})
public class ѧ���б����� {

    protected List<ѧ����Ϣ����> ѧ��;

    /**
     * Gets the value of the ѧ�� property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ѧ�� property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getѧ��().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ѧ����Ϣ���� }
     * 
     * 
     */
    public List<ѧ����Ϣ����> getѧ��() {
        if (ѧ�� == null) {
            ѧ�� = new ArrayList<ѧ����Ϣ����>();
        }
        return this.ѧ��;
    }

}
