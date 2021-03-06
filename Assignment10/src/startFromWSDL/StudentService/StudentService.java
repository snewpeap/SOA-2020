package startFromWSDL.StudentService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-05T17:34:16.013+08:00
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "StudentService",
                  wsdlLocation = "file:/D:/programe/Java/SOA/Assignment10/resources/xml/startFromWSDL/StudentService.wsdl",
                  targetNamespace = "http://jw.nju.edu.cn/wsdl")
public class StudentService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://jw.nju.edu.cn/wsdl", "StudentService");
    public final static QName DeleteStudentServicePort = new QName("http://jw.nju.edu.cn/wsdl", "DeleteStudentServicePort");
    public final static QName GetStudentServicePort = new QName("http://jw.nju.edu.cn/wsdl", "GetStudentServicePort");
    public final static QName UpdateStudentServicePort = new QName("http://jw.nju.edu.cn/wsdl", "UpdateStudentServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/programe/Java/SOA/Assignment10/resources/xml/startFromWSDL/StudentService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(StudentService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/programe/Java/SOA/Assignment10/resources/xml/startFromWSDL/StudentService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public StudentService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StudentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public StudentService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public StudentService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public StudentService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns DeleteStudentInterface
     */
    @WebEndpoint(name = "DeleteStudentServicePort")
    public DeleteStudentInterface getDeleteStudentServicePort() {
        return super.getPort(DeleteStudentServicePort, DeleteStudentInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeleteStudentInterface
     */
    @WebEndpoint(name = "DeleteStudentServicePort")
    public DeleteStudentInterface getDeleteStudentServicePort(WebServiceFeature... features) {
        return super.getPort(DeleteStudentServicePort, DeleteStudentInterface.class, features);
    }


    /**
     *
     * @return
     *     returns GetStudentInterface
     */
    @WebEndpoint(name = "GetStudentServicePort")
    public GetStudentInterface getGetStudentServicePort() {
        return super.getPort(GetStudentServicePort, GetStudentInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetStudentInterface
     */
    @WebEndpoint(name = "GetStudentServicePort")
    public GetStudentInterface getGetStudentServicePort(WebServiceFeature... features) {
        return super.getPort(GetStudentServicePort, GetStudentInterface.class, features);
    }


    /**
     *
     * @return
     *     returns UpdateStudentInterface
     */
    @WebEndpoint(name = "UpdateStudentServicePort")
    public UpdateStudentInterface getUpdateStudentServicePort() {
        return super.getPort(UpdateStudentServicePort, UpdateStudentInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UpdateStudentInterface
     */
    @WebEndpoint(name = "UpdateStudentServicePort")
    public UpdateStudentInterface getUpdateStudentServicePort(WebServiceFeature... features) {
        return super.getPort(UpdateStudentServicePort, UpdateStudentInterface.class, features);
    }

}
