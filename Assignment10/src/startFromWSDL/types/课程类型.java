
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�γ����͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="�γ�����"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="����"/&gt;
 *     &lt;enumeration value="ƽ̨"/&gt;
 *     &lt;enumeration value="ѡ��"/&gt;
 *     &lt;enumeration value="ͨ��"/&gt;
 *     &lt;enumeration value="ͨʶ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "�γ�����")
@XmlEnum
public enum �γ����� {

    ����,
    ƽ̨,
    ѡ��,
    ͨ��,
    ͨʶ;

    public String value() {
        return name();
    }

    public static �γ����� fromValue(String v) {
        return valueOf(v);
    }

}
