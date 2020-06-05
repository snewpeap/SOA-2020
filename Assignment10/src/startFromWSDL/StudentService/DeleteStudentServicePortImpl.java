package startFromWSDL.StudentService;

import startFromWSDL.ServiceBasis;
import startFromWSDL.types.学生信息类型;
import startFromWSDL.types.学生列表类型;

import java.util.List;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-05T16:48:37.607+08:00
 * Generated source version: 3.3.6
 */

@javax.jws.WebService(
        serviceName = "StudentService",
        portName = "DeleteStudentServicePort",
        targetNamespace = "http://jw.nju.edu.cn/wsdl",
        wsdlLocation = "file:/D:/programe/Java/SOA/Assignment10/resources/xml/startFromWSDL/StudentService.wsdl",
        endpointInterface = "startFromWSDL.StudentService.DeleteStudentInterface")

public class DeleteStudentServicePortImpl extends ServiceBasis implements DeleteStudentInterface {

    private static final Logger LOG = Logger.getLogger(DeleteStudentServicePortImpl.class.getName());

    public DeleteStudentServicePortImpl() {
        super(null);
    }

    public DeleteStudentServicePortImpl(学生列表类型 studentList) {
        super(studentList);
    }

    /* (non-Javadoc)
     * @see startFromWSDL.StudentService.DeleteStudentInterface#opDeleteStudent(startFromWSDL.StudentService.StudentInfo parameters)*
     */
    public java.lang.String opDeleteStudent(String parameters) throws InvalidDataFault {
        LOG.info("Executing operation opDeleteStudent");
        List<学生信息类型> allStudents = studentList.get学生();
        int index = -1;
        for (int i = 0; i < allStudents.size(); i++) {
            学生信息类型 studentInfo = allStudents.get(i);
            if (studentInfo.get学号().equals(parameters)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return "不存在学号为" + parameters + "的学生";
        } else {
            studentList.get学生().remove(index);
        }
        return "success";
    }

}
