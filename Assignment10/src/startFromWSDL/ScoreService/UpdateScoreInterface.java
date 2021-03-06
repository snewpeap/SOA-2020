package startFromWSDL.ScoreService;

import startFromWSDL.types.课程成绩列表类型;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-05T12:26:43.981+08:00
 * Generated source version: 3.3.6
 */
@WebService(targetNamespace = "http://jw.nju.edu.cn/wsdl", name = "UpdateScoreInterface")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UpdateScoreInterface {

    @WebMethod
    public void opUpdateScore(
            @WebParam(partName = "parameters", mode = WebParam.Mode.INOUT, name = "课程成绩列表", targetNamespace = "http://jw.nju.edu.cn/schema")
                    javax.xml.ws.Holder<课程成绩列表类型> parameters
    ) throws InvalidDataFault;
}
