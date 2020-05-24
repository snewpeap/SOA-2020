package generators;

import elements.*;
import utils.Converter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class XML3 {
    private static String XML2 = "xml/xml2.xml";
    private static String XML3 = "xml/xml3.xml";
    private static String XSD_PATH = "schema/ScoreList.xsd";

    private static StudentList readXML2() {
        StudentList studentList = Converter.toObject(StudentList.class, XML2);
        return studentList;
    }

    private static void insertIntoResult(ArrayList<String> index, String courseId, String attribute,
                                        ScoreList.Score score, CourseScoreList result){
        if(index.contains(courseId + attribute)){
            result.getScoreList().get(index.indexOf(courseId + attribute)).getScoreInfo().add(score);
        }

        ScoreList scoreList = new ScoreList();
        scoreList.setId(courseId);
        scoreList.setScoreAttribute(attribute);
        scoreList.getScoreInfo().add(score);
        result.getScoreList().add(scoreList);

        index.add(courseId + attribute);
    }

    private static CourseScoreList getScoreList(StudentList studentList){
        ArrayList<String> index = new ArrayList<>();

        CourseScoreList result = new CourseScoreList();

        // read all scores
        for(int i = 0; i < studentList.getStudentList().size(); i++){
            List<Course> courseList = studentList.getStudentList().get(i).getCourseList().getCourseList();
            for(int j = 0; j < courseList.size(); j++){
                List<ScoreList> courseScoreList = courseList.get(j).getScoreList().getScoreList();
                for(int k = 0; k < courseScoreList.size(); k++){
                    List<ScoreList.Score> currentScores = courseScoreList.get(k).getScoreInfo();
                    for(int m = 0; m < currentScores.size(); m++) {
                        insertIntoResult(index, courseScoreList.get(k).getId(),
                                courseScoreList.get(k).getScoreAttribute(),currentScores.get(m), result);
                    }
                }
            }
        }

        //sort scores
        for(int i = 0; i < result.getScoreList().size(); i++){
            ScoreList scoreList = result.getScoreList().get(i);
            Collections.sort(scoreList.getScoreInfo());
        }

        return result;
    }

    public static void create() {
        StudentList studentList = readXML2();
        CourseScoreList courseScoreList = getScoreList(studentList);
        Converter.toXML(CourseScoreList.class, courseScoreList, XML3);
        Converter.validate(XSD_PATH, XML3);
    }
}
