package elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class CourseScoreList {
    @XmlElement(name = "课程成绩", namespace = "http://jw.nju.edu.cn/schema")
    List<ScoreList> scoreList=new ArrayList<>();

    public List<ScoreList> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<ScoreList> scoreList) {
        this.scoreList = scoreList;
    }
}
