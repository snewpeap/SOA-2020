package elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "学生列表", namespace = "http://jw.nju.edu.cn/schema")
public class StudentList {
    @XmlElement(name = "学生", namespace = "http://jw.nju.edu.cn/schema")
    private List<Student> studentList=new ArrayList<>();

    public List<Student> getStudentList(){
        return studentList;
    }
}
