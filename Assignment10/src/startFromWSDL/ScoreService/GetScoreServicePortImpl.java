package startFromWSDL.ScoreService;

import startFromWSDL.ServiceBasis;
import startFromWSDL.types.个人课程信息;
import startFromWSDL.types.学生信息类型;
import startFromWSDL.types.学生列表类型;
import startFromWSDL.types.课程成绩列表类型;

import java.util.List;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-05T12:26:43.934+08:00
 * Generated source version: 3.3.6
 */

@javax.jws.WebService(
        serviceName = "ScoreService",
        portName = "GetScoreServicePort",
        targetNamespace = "http://jw.nju.edu.cn/wsdl",
        wsdlLocation = "xml/startFromWSDL/ScoreService.wsdl",
        endpointInterface = "startFromWSDL.ScoreService.GetScoreInterface")

public class GetScoreServicePortImpl extends ServiceBasis implements GetScoreInterface {

    private static final Logger LOG = Logger.getLogger(GetScoreServicePortImpl.class.getName());

    public GetScoreServicePortImpl() {
        super(null);
    }

    public GetScoreServicePortImpl(学生列表类型 studentList) {
        super(studentList);
    }

    /* (non-Javadoc)
     * @see startFromWSDL.ScoreService.GetScoreInterface#opGetScore(java.lang.String parameters)*
     */
    public 课程成绩列表类型 opGetScore(java.lang.String parameters) throws InvalidDataFault {
        LOG.info("Executing operation opGetScore");
        课程成绩列表类型 gradeList = getScore(parameters, studentList);
        if (gradeList == null) {
            throw new InvalidDataFault("没有学生学号为" + parameters);
        } else {
            return gradeList;
        }
    }

    static 课程成绩列表类型 getScore(String studentId, 学生列表类型 studentList) {
        课程成绩列表类型 gradeList = null;
        List<学生信息类型> allStudents = studentList.get学生();
        for (学生信息类型 studentInfo : allStudents) {
            if (studentInfo.get学号().equals(studentId)) {
                gradeList = new 课程成绩列表类型();
                for (个人课程信息 courses : studentInfo.get个人课程().get课程()) {
                    courses.get课程成绩列表().get课程成绩().forEach(gradeList.get课程成绩()::add);
                }
                break;
            }
        }
        return gradeList;
    }
}
