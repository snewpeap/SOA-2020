package generators;

import elements.*;
import utils.Converter;

import java.util.ArrayList;
import java.util.List;

public class XML2 {
    private static String XML1 = "xml/1.xml";

    public static Student readXML1() {
        Student student = Converter.toObject(Student.class, XML1);
        return student;
    }

    /*
    private static String[] idList = { "171250654", "171250661", "171250670", "171250573","171250001","171250025","171250558","171250682","171250627","171250014","171250572","171250029","171250579"};
    private static String[] nameList = { "徐志威", "殷承鉴", "罗民胜", "苑宇航","雷媛","濮宗悦","杨日东","章诚","徐志乐","李胜男","李轩","葛巧","许涛"};
    private static String[] genderList = { "男", "男","男","男","女","女", "男", "男","男","女","男","女","男",};
    private static String[] bdList = { "1999-01-01", "1999-01-02", "1999-01-03", "1999-01-04","2001-12-05","1999-01-06","1999-01-07","1998-10-24","1999-01-09","1999-01-10","1999-01-11","1999-01-12","1999-01-13"};
    private static String[] courseIDList = { "000001", "000002", "000003", "000004", "000005"};
    private static String[] scoreTypeList = { "平时成绩", "期末成绩", "总评成绩"};
     */
    private static String[] idList = {"171250025","171250558","171250682"};
    private static String[] nameList = { "濮宗悦","杨日东","章诚"};
    private static String[] genderList = { "女", "男", "男"};
    private static String[] bdList = { "1999-01-06","1999-01-07","1998-10-24"};
    private static String[] courseIDList = { "00000001", "00000002", "00000003", "00000004", "00000005"};
    private static String[] courseNameList={"软工I","软工III","C++","Web","Linux"};
    private static String[] teacherList={"刘钦","刘嘉","郑滔","刘海涛","汤恩义"};
    private static String[] yearList={"2018","2019","2019","2019","2020"};
    private static String[] numList={"2","2","1","1","2"};
    private static String[] campusList={"仙林校区","仙林校区","鼓楼校区","鼓楼校区","鼓楼校区"};
    private static String[] addressList={"仙I-305","仙I-305","教201","教201","教202"};
    private static String[] typeList={"核心","核心","核心","选修","选修"};
    private static String[] scoreTypeList = { "平时成绩", "期末成绩", "总评成绩"};

    private static final String FILE_PATH = "xml/xml2.xml";
    private static final String XSD_PATH = "schema/StudentList.xsd";

    public static void create() {
        StudentList students = createStudentInfo();
        Converter.toXML(StudentList.class, students, FILE_PATH);
        Converter.validate(XSD_PATH, FILE_PATH);
    }

    private static StudentList createStudentInfo() {
        StudentList students = new StudentList();
        Student student1 = readXML1();
        students.getStudentList().add(student1);

        for (int i = 0; i < idList.length; i++) {
            Student student = new Student();
            student.setStudentNo(idList[i]);

            PersonInfo personalInfo = student.getPersonInfo();
            personalInfo.setName(nameList[i]);
            personalInfo.setGender(genderList[i]);
            personalInfo.setBirthday(bdList[i]);
            student.setPersonInfo(personalInfo);

            for (int j = 0; j < courseIDList.length; j++) {
                Course course=new Course();
                CourseInfo courseInfo=new CourseInfo();
                CourseScoreList courseScoreList=new CourseScoreList();
                courseInfo.setId(courseIDList[j]);
                courseInfo.setName(courseNameList[j]);
                courseInfo.setAddress(addressList[j]);
                courseInfo.setCampus(campusList[j]);
                courseInfo.setType(typeList[j]);
                CourseInfo.Term term=new CourseInfo.Term();
                term.setYear(yearList[j]);
                term.setNum(Integer.parseInt(numList[j]));
                courseInfo.setTerm(term);
                courseInfo.getTeachers().getTeacher().add(teacherList[j]);
                /*List<CourseInfo.Teacher> s=new ArrayList<>();
                CourseInfo.Teacher t=new CourseInfo.Teacher();
                t.setTeacher(teacherList[j]);
                s.add(t);
                courseInfo.setTeachers(s);

                 */
                course.setCourseInfo(courseInfo);


                for (int k = 0; k < scoreTypeList.length; k++) {
                    ScoreList scoreList = new ScoreList();
                    scoreList.setScoreAttribute(scoreTypeList[k]);
                    scoreList.setId(courseIDList[j]);
                    ScoreList.Score score=new ScoreList.Score();

                    int mark = 0;
                    if (j < courseIDList.length - 1) {
                        mark = (int) (Math.random() * 40) + 60;
                    } else {
                        mark = (int) (Math.random() * 60);
                    }
                    score.setPoint(mark);
                    score.setStudentno(idList[i]);

                    scoreList.getScoreInfo().add(score);
                    courseScoreList.getScoreList().add(scoreList);
                }
                course.setScoreList(courseScoreList);
                student.getCourseList().getCourseList().add(course);
            }

            students.getStudentList().add(student);

        }

        return students;
    }
}
