package elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PersonInfo {
    @XmlElement(name = "姓名", namespace = "http://www.nju.edu.cn/schema")
    private String name;

    @XmlElement(name = "性别", namespace = "http://www.nju.edu.cn/schema")
    private String gender;

    @XmlElement(name = "出生日期", namespace = "http://www.nju.edu.cn/schema", type = String.class)
    private String birthday;

    @XmlElement(name = "单位部门", namespace = "http://www.nju.edu.cn/schema")
    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
