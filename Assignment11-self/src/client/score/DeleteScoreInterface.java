
package client.score;

import client.InvalidDataFault;
import entity.�γ̳ɼ��б�����;

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
@WebService(name = "DeleteScoreInterface", targetNamespace = "http://jw.nju.edu.cn/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ScoreObjectFactory.class
})
public interface DeleteScoreInterface {


    /**
     * 
     * @param parameters
     * @return
     *     returns java.lang.String
     * @throws InvalidDataFault
     */
    @WebMethod
    @WebResult(name = "ifSuccess", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "parameters")
    public String opDeleteScore(
        @WebParam(name = "�γ̳ɼ��б�", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "parameters")
                �γ̳ɼ��б����� parameters)
        throws InvalidDataFault
    ;

}