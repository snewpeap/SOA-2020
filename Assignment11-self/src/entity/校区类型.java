
package entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>У�����͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="У������">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="����У��"/>
 *     &lt;enumeration value="��¥У��"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "У������")
@XmlEnum
public enum У������ {

    ����У��,
    ��¥У��;

    public String value() {
        return name();
    }

    public static У������ fromValue(String v) {
        return valueOf(v);
    }

}
