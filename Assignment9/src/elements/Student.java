package elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    @XmlElement(name = "个人信息", namespace = "http://jw.nju.edu.cn/schema")
    private PersonInfo personInfo = new PersonInfo();

    @XmlElement(name = "学号", namespace = "http://jw.nju.edu.cn/schema")
    private String studentNo;

    @XmlElement(name = "个人课程", namespace = "http://jw.nju.edu.cn/schema")
    private CourseList courseList=new CourseList();

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    public CourseList getCourseList() {
        return courseList;
    }

    public void setCourseList(CourseList courseList) {
        this.courseList = courseList;
    }
}
