package generators;

import elements.*;
import utils.Converter;
import utils.Utility;

public class XML2 {
    private static String XML1 = "xml/1.xml";

    public static void generateXML2() {
        StudentList studentList = new StudentList();
        // get first student from 1.xml
        Student student = readXML1();
        studentList.getStudentList().add(student);
    }

    public static Student readXML1() {
        Student student = Converter.toObject(Student.class, XML1);
        return student;
    }

    private static String[] idList = { "171250654", "171250661", "171250670", "171250573","171250001","171250025","171250558","171250682","171250627","171250014","171250572","171250029","171250579"};
    private static String[] nameList = { "徐志威", "殷承鉴", "罗民胜", "苑宇航","雷媛","濮宗悦","杨日东","章诚","徐志乐","李胜男","李轩","葛巧","许涛"};
    private static String[] genderList = { "男", "男","男","男","女","女", "男", "男","男","女","男","女","男",};
    private static String[] bdList = { "1999-01-01", "1999-01-02", "1999-01-03", "1999-01-04","2001-12-05","1999-01-06","1999-01-07","1998-10-24","1999-01-09","1999-01-10","1999-01-11","1999-01-12","1999-01-13"};
    private static String[] courseIDList = { "000001", "000002", "000003", "000004", "000005"};
    private static String[] scoreTypeList = { "平时成绩", "期末成绩", "总评成绩"};

    private static final String FILE_PATH = "xml/doc2.xml";
    private static final String XSD_PATH = "schema/StudentList.xsd";

    public static void create() {
        StudentList students = createStudentInfo();
        Utility.toXML(StudentList.class, students, FILE_PATH);
        Utility.validate(XSD_PATH, FILE_PATH);
    }

    private static StudentList createStudentInfo() {
        StudentList students = new StudentList();

        for (int i = 0; i < idList.length; i++) {
            Student student = new Student();
            student.setStudentNo(idList[i]);

            PersonInfo personalInfo = student.getPersonInfo();
            personalInfo.setName(nameList[i]);
            personalInfo.setGender(genderList[i]);
            personalInfo.setBirthday(bdList[i]);
            student.setPersonInfo(personalInfo);

            CourseList courseList = student.getCourseList();
            for (int j = 0; j < courseIDList.length; j++) {
                CourseInfo courseInfo=new CourseInfo();
                CourseScoreList courseScoreList=new CourseScoreList();
                courseInfo.setId(courseIDList[j]);

                for (int k = 0; k < scoreTypeList.length; k++) {
                    ScoreList scoreList = new ScoreList();
                    scoreList.setScoreAttribute(scoreTypeList[k]);
                    scoreList.setId(courseIDList[j]);
                    ScoreList.Score score=new ScoreList.Score();
                    /*
                     * 随机生成成绩，且使最后一名同学的成绩低于60
                     */
                    int mark = 0;
                    if (i < nameList.length - 1) {
                        mark = (int) (Math.random() * 40) + 60;
                    } else {
                        mark = (int) (Math.random() * 60);
                    }
                    score.setPoint(mark);
                    score.setStudentno(idList[i]);

                    scoreList.setScoreInfo(score);
                    courseScoreList.getScoreList().add(scoreList);
                }

            }

            students.getStudentList().add(student);
        }

        return students;
    }
}
