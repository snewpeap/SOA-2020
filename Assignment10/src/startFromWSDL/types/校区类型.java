
package startFromWSDL.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>У�����͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="У������"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="����У��"/&gt;
 *     &lt;enumeration value="��¥У��"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "У������", namespace = "http://jw.nju.edu.cn/schema")
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
