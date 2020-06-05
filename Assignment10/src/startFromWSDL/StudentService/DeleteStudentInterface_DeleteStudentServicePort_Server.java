
package startFromWSDL.StudentService;

import startFromWSDL.types.学生列表类型;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-05T17:34:15.996+08:00
 * Generated source version: 3.3.6
 *
 */

public class DeleteStudentInterface_DeleteStudentServicePort_Server{

    public DeleteStudentInterface_DeleteStudentServicePort_Server(学生列表类型 studentList) {
        System.out.println("Starting " + getClass().getName());
        Object implementor = new DeleteStudentServicePortImpl(studentList);
        String address = "http://localhost:8080/student/delete";
        Endpoint.publish(address, implementor);
    }

}
