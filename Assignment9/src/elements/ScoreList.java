package elements;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
public class ScoreList {
    @XmlElement(name = "成绩", namespace = "http://jw.nju.edu.cn/schema")
    private List<Score> scoreInfo=new ArrayList<>();

    @XmlAttribute(name="课程编号",required = true)
    private String id;

    @XmlAttribute(name="成绩性质",required = true)
    private String scoreAttribute;

    public static class Score implements Comparable{
        @XmlElement(name = "学号", namespace = "http://jw.nju.edu.cn/schema")
        private String studentno;
        @XmlElement(name = "得分", namespace = "http://jw.nju.edu.cn/schema")
        private int point;

        @XmlTransient
        public String getStudentno() {
            return studentno;
        }

        public void setStudentno(String studentno) {
            this.studentno = studentno;
        }

        @XmlTransient
        public int getPoint() {
            return point;
        }

        public void setPoint(int point) {
            this.point = point;
        }

        @Override
        public int compareTo(Object o) {
            Score anotherScore = (Score) o;
            if(this.point > anotherScore.point)
                return 1;
            if(this.point < anotherScore.point)
                return -1;
            return 0;
        }
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setScoreInfo(List<Score> scoreInfo) {
        this.scoreInfo = scoreInfo;
    }

    public List<Score> getScoreInfo() {
        return scoreInfo;
    }

    public String getScoreAttribute() {
        return scoreAttribute;
    }

    public void setScoreAttribute(String scoreAttribute) {
        this.scoreAttribute = scoreAttribute;
    }
}
