
package entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�γ����͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="�γ�����">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="����"/>
 *     &lt;enumeration value="ƽ̨"/>
 *     &lt;enumeration value="ѡ��"/>
 *     &lt;enumeration value="ͨ��"/>
 *     &lt;enumeration value="ͨʶ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
