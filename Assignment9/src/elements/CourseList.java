package elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class CourseList {
    @XmlElement(name = "课程", namespace = "http://jw.nju.edu.cn/schema")
    private List<Course> courseList=new ArrayList<>();

    public List<Course> getCourseList(){
        return courseList;
    }
}
