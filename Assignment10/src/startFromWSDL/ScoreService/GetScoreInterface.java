package startFromWSDL.ScoreService;

import javax.jws.WebService;

@WebService(name = "getScoreInterface",
targetNamespace = "http://jw.nju.edu.cn/wsdl",
wsdlLocation = "/xml/startFromWSDL/ScoreService.wsdl")
public interface GetScoreInterface {

}
