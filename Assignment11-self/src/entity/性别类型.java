
package entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�Ա����͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="�Ա�����">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="��"/>
 *     &lt;enumeration value="Ů"/>
 *     &lt;enumeration value="����"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "�Ա�����", namespace = "http://www.nju.edu.cn/schema")
@XmlEnum
public enum �Ա����� {

    ��,
    Ů,
    ����;

    public String value() {
        return name();
    }

    public static �Ա����� fromValue(String v) {
        return valueOf(v);
    }

}
