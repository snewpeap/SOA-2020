
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String id;
    private List<Score> scores;

    public Student() {
        setScores(new ArrayList<>());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

}
