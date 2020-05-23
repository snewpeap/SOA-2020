package elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Course {
    @XmlElement(name = "课程信息", namespace = "http://jw.nju.edu.cn/schema")
    private CourseInfo courseInfo=new CourseInfo();

    @XmlElement(name = "课程成绩列表", namespace = "http://jw.nju.edu.cn/schema")
    private CourseScoreList courseScoreList=new CourseScoreList();

    public CourseInfo getCourseInfo() {
        return courseInfo;
    }

    public CourseScoreList getScoreList() {
        return courseScoreList;
    }

    public void setCourseInfo(CourseInfo courseInfo) {
        this.courseInfo = courseInfo;
    }

    public void setScoreList(CourseScoreList courseScoreList) {
        this.courseScoreList = courseScoreList;
    }
}
