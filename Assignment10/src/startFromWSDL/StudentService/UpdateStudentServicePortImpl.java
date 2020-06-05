package startFromWSDL.StudentService;

import startFromWSDL.ServiceBasis;
import startFromWSDL.types.学生信息类型;
import startFromWSDL.types.学生列表类型;
import startFromWSDL.types.权限类型;

import java.util.List;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-05T16:48:37.650+08:00
 * Generated source version: 3.3.6
 *
 */

@javax.jws.WebService(
                      serviceName = "StudentService",
                      portName = "UpdateStudentServicePort",
                      targetNamespace = "http://jw.nju.edu.cn/wsdl",
                      wsdlLocation = "xml/startFromWSDL/StudentService.wsdl",
                      endpointInterface = "startFromWSDL.StudentService.UpdateStudentInterface")

public class UpdateStudentServicePortImpl extends ServiceBasis implements UpdateStudentInterface {

    private static final Logger LOG = Logger.getLogger(UpdateStudentServicePortImpl.class.getName());

    public UpdateStudentServicePortImpl() {
        super(null);
    }

    public UpdateStudentServicePortImpl(学生列表类型 studentList) {
        super(studentList);
    }

    /* (non-Javadoc)
     * @see startFromWSDL.StudentService.UpdateStudentInterface#opUpdateStudent(startFromWSDL.StudentService.StudentInfo parameters)*
     */
    public 学生信息类型 opUpdateStudent(SimplifiedStudentInfo parameters) throws InvalidDataFault   {
        LOG.info("Executing operation opUpdateStudent");
        String studentId = parameters.getStudentId();
        List<学生信息类型> students = studentList.get学生();
        for (学生信息类型 student : students) {
            if (student.get学号().equals(studentId)) {
                student.set个人信息(parameters.personalInfo);
                return student;
            }
        }
        学生信息类型 student = createNewStudent(parameters);
        studentList.get学生().add(student);
        return student;
    }

    private 学生信息类型 createNewStudent(SimplifiedStudentInfo studentInfo) {
        学生信息类型 student = new 学生信息类型();
        student.set学号(studentInfo.getStudentId());
        student.set个人信息(studentInfo.getPersonalInfo());
        startFromWSDL.types.学生信息类型.个人课程 personalCourses = new 学生信息类型.个人课程();
        personalCourses.get课程();
        student.set个人课程(personalCourses);
        student.set权限(权限类型.getDefaultStudentAuthority());
        return student;
    }
}
