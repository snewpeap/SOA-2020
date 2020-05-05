
public class Score {

    private String courseID;
    private String scoreType;
    private int score;

    public Score(String id, String type, int s) {
        courseID = id;
        scoreType = type;
        score = s;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getScoreType() {
        return scoreType;
    }

    public void setScoreType(String scoreType) {
        this.scoreType = scoreType;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
