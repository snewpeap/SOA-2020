import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
public class ScoreList {
    @XmlElement(name = "成绩", namespace = "http://jw.nju.edu.cn/schema")
    private Score score;

    @XmlAttribute(name="课程编号",required = true)
    private String id;

    @XmlAttribute(name="成绩性质",required = true)
    private String scoreAttribute;

    public static class Score{
        @XmlElement(name = "学号", namespace = "http://jw.nju.edu.cn/schema")
        private String studentno;
        @XmlElement(name = "得分", namespace = "http://jw.nju.edu.cn/schema")
        private int score;

        public String getStudentno() {
            return studentno;
        }

        public void setStudentno(String studentno) {
            this.studentno = studentno;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Score getScore() {
        return score;
    }

    public String getScoreAttribute() {
        return scoreAttribute;
    }

    public void setScoreAttribute(String scoreAttribute) {
        this.scoreAttribute = scoreAttribute;
    }
}
