package startFromWSDL.ScoreService;

import startFromWSDL.ServiceBasis;
import startFromWSDL.types.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-05T12:26:43.881+08:00
 * Generated source version: 3.3.6
 */

@javax.jws.WebService(
        serviceName = "ScoreService",
        portName = "UpdateScoreServicePort",
        targetNamespace = "http://jw.nju.edu.cn/wsdl",
        wsdlLocation = "xml/startFromWSDL/ScoreService.wsdl",
        endpointInterface = "startFromWSDL.ScoreService.UpdateScoreInterface")

public class UpdateScoreServicePortImpl extends ServiceBasis implements UpdateScoreInterface {

    private static final Logger LOG = Logger.getLogger(UpdateScoreServicePortImpl.class.getName());

    public UpdateScoreServicePortImpl() {
        super(null);
    }

    public UpdateScoreServicePortImpl(学生列表类型 studentList) {
        super(studentList);
    }

    /* (non-Javadoc)
     * @see startFromWSDL.ScoreService.UpdateScoreInterface#opUpdateScore(startFromWSDL.types.课程成绩列表类型 parameters)*
     */
    public void opUpdateScore(javax.xml.ws.Holder<课程成绩列表类型> parameters) throws InvalidDataFault {
        LOG.info("Executing operation opUpdateScore");
        String studentId = "";
        for (课程成绩类型 scoreType : parameters.value.get课程成绩()) {
            String paramCourseId = scoreType.get课程编号();
            成绩性质类型 paramGradeType = scoreType.get成绩性质();
            for (成绩类型 grade : scoreType.get成绩()) {
                studentId = grade.get学号();
                int paramGrade = grade.get得分();

                //遍历学生列表
                List<学生信息类型> allStudents = studentList.get学生();
                for (int i2 = 0; i2 < allStudents.size(); i2++) {
                    学生信息类型 studentInfo = allStudents.get(i2);
                    if (studentInfo.get学号().equals(studentId)) {
                        List<个人课程信息> allCourses = studentInfo.get个人课程().get课程();
                        for (int i1 = 0; i1 < allCourses.size(); i1++) {
                            个人课程信息 personalGradeType = allCourses.get(i1);
                            if (personalGradeType.get课程信息().get课程编号().equals(paramCourseId)) {
                                List<课程成绩类型> allGrades = personalGradeType.get课程成绩列表().get课程成绩();
                                for (int i = 0; i < allGrades.size(); i++) {
                                    课程成绩类型 courseGradeType = allGrades.get(i);
                                    if (courseGradeType.get成绩性质() == paramGradeType) {
                                        courseGradeType.get成绩().get(0).set得分(paramGrade);
                                        break;
                                    }
                                    if (allGrades.size() - 1 == i) {
                                        allGrades.add(createNewGrade(paramCourseId, paramGradeType, studentId, paramGrade));
                                        break;
                                    }
                                }
                                break;
                            }
                            if (allCourses.size() - 1 == i1) {
                                throw new InvalidDataFault(String.format("学号%s的学生未选秀课程%s", studentId, paramCourseId));
                            }
                        }
                        break;
                    }
                    if (allStudents.size() - 1 == i2) {
                        throw new InvalidDataFault("没有学生学号为" + studentId);
                    }
                }
            }
        }
        parameters.value = GetScoreServicePortImpl.getScore(studentId, studentList);
    }

    private 课程成绩类型 createNewGrade(String courseId, 成绩性质类型 gradeType, String studentId, int grade) {
        课程成绩类型 addGrade = new 课程成绩类型();
        addGrade.set课程编号(courseId);
        addGrade.set成绩性质(gradeType);
        成绩类型 a = new 成绩类型();
        a.set学号(studentId);
        a.set得分(grade);
        addGrade.get成绩().add(a);
        return addGrade;
    }
}
