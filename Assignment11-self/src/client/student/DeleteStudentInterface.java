
package client.student;

import client.InvalidDataFault;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DeleteStudentInterface", targetNamespace = "http://jw.nju.edu.cn/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    StudentObjectFactory.class
})
public interface DeleteStudentInterface {


    /**
     * 
     * @param parameters
     * @return
     *     returns java.lang.String
     * @throws InvalidDataFault
     */
    @WebMethod
    @WebResult(name = "ifSuccess", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "parameters")
    public String opDeleteStudent(
        @WebParam(name = "studentNumber", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "parameters")
        String parameters)
        throws InvalidDataFault
    ;

}
