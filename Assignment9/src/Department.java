import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Department {
    @XmlElement(name="单位",namespace="http://www.nju.edu.cn/schema")
    private Unit unit;

    @XmlElement(name="地址",namespace="http://www.nju.edu.cn/schema")
    private String address;

    @XmlElement(name = "电话", namespace = "http://www.nju.edu.cn/schema")
    private String phone;

    @XmlElement(name = "传真", namespace = "http://www.nju.edu.cn/schema")
    private String fax;

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Unit{
        @XmlElement(name="学院",namespace="http://www.nju.edu.cn/schema")
        private String college;

        public String getCollege() {
            return college;
        }

        public void setCollege(String college) {
            this.college = college;
        }
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
