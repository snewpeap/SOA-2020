package startFromWSDL.ScoreService;

import com.sun.xml.ws.developer.SchemaValidation;
import startFromWSDL.ServiceBasis;
import startFromWSDL.types.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-05T12:26:43.965+08:00
 * Generated source version: 3.3.6
 */

@javax.jws.WebService(
        serviceName = "ScoreService",
        portName = "DeleteScoreServicePort",
        targetNamespace = "http://jw.nju.edu.cn/wsdl",
        wsdlLocation = "xml/startFromWSDL/ScoreService.wsdl",
        endpointInterface = "startFromWSDL.ScoreService.DeleteScoreInterface")
@SchemaValidation
public class DeleteScoreServicePortImpl extends ServiceBasis implements DeleteScoreInterface {

    private static final Logger LOG = Logger.getLogger(DeleteScoreServicePortImpl.class.getName());

    public DeleteScoreServicePortImpl() {
        super(null);
    }

    public DeleteScoreServicePortImpl(学生列表类型 studentList) {
        super(studentList);
    }

    /* (non-Javadoc)
     * @see startFromWSDL.ScoreService.DeleteScoreInterface#opDeleteScore(startFromWSDL.types.课程成绩列表类型 parameters)*
     */
    public java.lang.String opDeleteScore(课程成绩列表类型 parameters) throws InvalidDataFault {
        LOG.info("Executing operation opDeleteScore");
        for (课程成绩类型 scoreType : parameters.get课程成绩()) {
            String paramCourseId = scoreType.get课程编号();
            成绩性质类型 paramGradeType = scoreType.get成绩性质();
            for (成绩类型 grade : scoreType.get成绩()) {
                String studentId = grade.get学号();

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
                                int index = -1;
                                for (int i = 0; i < allGrades.size(); i++) {
                                    课程成绩类型 courseGradeType = allGrades.get(i);
                                    if (courseGradeType.get成绩性质() == paramGradeType) {
                                        index = i;
                                        break;
                                    }
                                }
                                if (index == -1) {
                                    return String.format("学号为%s的学生没有课程%s的%s", studentId, paramCourseId, paramGradeType);
                                } else {
                                    allGrades.remove(index);
                                }
                                break;
                            }
                            if (allCourses.size() - 1 == i1) {
                                throw new InvalidDataFault(String.format("学号为%s的学生没有选修课程%s", studentId, paramCourseId));
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
        return "success";
    }

}
