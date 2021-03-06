
package client.student;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebServiceClient(name = "StudentService", targetNamespace = "http://jw.nju.edu.cn/wsdl", wsdlLocation = "xml/StudentService.wsdl")
public class StudentService
        extends Service {

    private final static URL STUDENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException STUDENTSERVICE_EXCEPTION;
    private final static QName STUDENTSERVICE_QNAME = new QName("http://jw.nju.edu.cn/wsdl", "StudentService");

    static {
        URL url = null;
        WebServiceException e = null;
        url = StudentService.class.getResource("/xml/ScoreService.wsdl");
        STUDENTSERVICE_WSDL_LOCATION = url;
        STUDENTSERVICE_EXCEPTION = e;
    }

    public StudentService() {
        super(__getWsdlLocation(), STUDENTSERVICE_QNAME);
    }

    public StudentService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTSERVICE_QNAME, features);
    }

    public StudentService(URL wsdlLocation) {
        super(wsdlLocation, STUDENTSERVICE_QNAME);
    }

    public StudentService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTSERVICE_QNAME, features);
    }

    public StudentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * @return returns GetStudentInterface
     */
    @WebEndpoint(name = "GetStudentServicePort")
    public GetStudentInterface getGetStudentServicePort() {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "GetStudentServicePort"), GetStudentInterface.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns GetStudentInterface
     */
    @WebEndpoint(name = "GetStudentServicePort")
    public GetStudentInterface getGetStudentServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "GetStudentServicePort"), GetStudentInterface.class, features);
    }

    /**
     * @return returns UpdateStudentInterface
     */
    @WebEndpoint(name = "UpdateStudentServicePort")
    public UpdateStudentInterface getUpdateStudentServicePort() {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "UpdateStudentServicePort"), UpdateStudentInterface.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns UpdateStudentInterface
     */
    @WebEndpoint(name = "UpdateStudentServicePort")
    public UpdateStudentInterface getUpdateStudentServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "UpdateStudentServicePort"), UpdateStudentInterface.class, features);
    }

    /**
     * @return returns DeleteStudentInterface
     */
    @WebEndpoint(name = "DeleteStudentServicePort")
    public DeleteStudentInterface getDeleteStudentServicePort() {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "DeleteStudentServicePort"), DeleteStudentInterface.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns DeleteStudentInterface
     */
    @WebEndpoint(name = "DeleteStudentServicePort")
    public DeleteStudentInterface getDeleteStudentServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jw.nju.edu.cn/wsdl", "DeleteStudentServicePort"), DeleteStudentInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTSERVICE_EXCEPTION != null) {
            throw STUDENTSERVICE_EXCEPTION;
        }
        return STUDENTSERVICE_WSDL_LOCATION;
    }

}
