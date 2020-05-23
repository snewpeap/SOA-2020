import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "课程信息", namespace = "http://jw.nju.edu.cn/schema")
public class CourseInfo {
    @XmlElement(name = "课程编号", namespace = "http://jw.nju.edu.cn/schema")
    private String id;

    @XmlElement(name = "课程名称", namespace = "http://jw.nju.edu.cn/schema")
    private String name;

    @XmlElement(name = "课程教师", namespace = "http://jw.nju.edu.cn/schema")
    private List<Teacher> teachers=new ArrayList<>();

    @XmlElement(name = "学期", namespace = "http://jw.nju.edu.cn/schema")
    private Term term;

    @XmlElement(name = "上课校区", namespace = "http://jw.nju.edu.cn/schema")
    private String campus;

    @XmlElement(name = "上课地点", namespace = "http://jw.nju.edu.cn/schema")
    private String address;

    @XmlElement(name = "课程类型", namespace = "http://jw.nju.edu.cn/schema")
    private String type;

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Teacher{
        @XmlElement(name = "教师", namespace = "http://jw.nju.edu.cn/schema")
        private String teacher;

        public String getTeacher() {
            return teacher;
        }

        public void setTeacher(String teacher) {
            this.teacher = teacher;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Term{
        @XmlElement(name = "学年", namespace = "http://jw.nju.edu.cn/schema")
        private String year;
        @XmlElement(name = "学期数", namespace = "http://jw.nju.edu.cn/schema")
        private int num;

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }
}
