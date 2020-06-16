
package client.student;

import entity.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the temp package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class StudentObjectFactory {

    private final static QName _课程信息_QNAME = new QName("http://jw.nju.edu.cn/schema", "课程信息");
    private final static QName _学生信息_QNAME = new QName("http://jw.nju.edu.cn/schema", "学生信息");
    private final static QName _StudentNumber_QNAME = new QName("http://jw.nju.edu.cn/schema", "studentNumber");
    private final static QName _StudentInfo_QNAME = new QName("http://jw.nju.edu.cn/schema", "studentInfo");
    private final static QName _学生列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "学生列表");
    private final static QName _InvalidDataError_QNAME = new QName("http://jw.nju.edu.cn/schema", "invalidDataError");
    private final static QName _单位部门信息_QNAME = new QName("http://www.nju.edu.cn/schema", "单位部门信息");
    private final static QName _课程成绩列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "课程成绩列表");
    private final static QName _IfSuccess_QNAME = new QName("http://jw.nju.edu.cn/schema", "ifSuccess");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: temp
     */
    public StudentObjectFactory() {
    }

    /**
     * Create an instance of {@link 课程信息类型 }
     */
    public 课程信息类型 create课程信息类型() {
        return new 课程信息类型();
    }

    /**
     * Create an instance of {@link 学生信息类型 }
     */
    public 学生信息类型 create学生信息类型() {
        return new 学生信息类型();
    }

    /**
     * Create an instance of {@link 课程成绩列表类型 }
     */
    public 课程成绩列表类型 create课程成绩列表类型() {
        return new 课程成绩列表类型();
    }

    /**
     * Create an instance of {@link 学生列表类型 }
     */
    public 学生列表类型 create学生列表类型() {
        return new 学生列表类型();
    }

    /**
     * Create an instance of {@link SimplifiedStudentInfo }
     */
    public SimplifiedStudentInfo createSimplifiedStudentInfo() {
        return new SimplifiedStudentInfo();
    }

    /**
     * Create an instance of {@link 个人基本信息类型 }
     */
    public 个人基本信息类型 create个人基本信息类型() {
        return new 个人基本信息类型();
    }

    /**
     * Create an instance of {@link 个人课程信息 }
     */
    public 个人课程信息 create个人课程信息() {
        return new 个人课程信息();
    }

    /**
     * Create an instance of {@link 权限类型 }
     */
    public 权限类型 create权限类型() {
        return new 权限类型();
    }

    /**
     * Create an instance of {@link 课程成绩类型 }
     */
    public 课程成绩类型 create课程成绩类型() {
        return new 课程成绩类型();
    }

    /**
     * Create an instance of {@link 成绩类型 }
     */
    public 成绩类型 create成绩类型() {
        return new 成绩类型();
    }

    /**
     * Create an instance of {@link 学期类型 }
     */
    public 学期类型 create学期类型() {
        return new 学期类型();
    }

    /**
     * Create an instance of {@link 单位部门信息类型 }
     */
    public 单位部门信息类型 create单位部门信息类型() {
        return new 单位部门信息类型();
    }

    /**
     * Create an instance of {@link 单位类型 }
     */
    public 单位类型 create单位类型() {
        return new 单位类型();
    }

    /**
     * Create an instance of {@link 课程信息类型.课程教师 }
     */
    public 课程信息类型.课程教师 create课程信息类型课程教师() {
        return new 课程信息类型.课程教师();
    }

    /**
     * Create an instance of {@link 学生信息类型.个人课程 }
     */
    public 学生信息类型.个人课程 create学生信息类型个人课程() {
        return new 学生信息类型.个人课程();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程信息类型 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "课程信息")
    public JAXBElement<课程信息类型> create课程信息(课程信息类型 value) {
        return new JAXBElement<课程信息类型>(_课程信息_QNAME, 课程信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生信息类型 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "学生信息")
    public JAXBElement<学生信息类型> create学生信息(学生信息类型 value) {
        return new JAXBElement<学生信息类型>(_学生信息_QNAME, 学生信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "studentNumber")
    public JAXBElement<String> createStudentNumber(String value) {
        return new JAXBElement<String>(_StudentNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生信息类型 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "studentInfo")
    public JAXBElement<学生信息类型> createStudentInfo(学生信息类型 value) {
        return new JAXBElement<学生信息类型>(_StudentInfo_QNAME, 学生信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生列表类型 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "学生列表")
    public JAXBElement<学生列表类型> create学生列表(学生列表类型 value) {
        return new JAXBElement<学生列表类型>(_学生列表_QNAME, 学生列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "invalidDataError")
    public JAXBElement<String> createInvalidDataError(String value) {
        return new JAXBElement<String>(_InvalidDataError_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 单位部门信息类型 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "单位部门信息")
    public JAXBElement<单位部门信息类型> create单位部门信息(单位部门信息类型 value) {
        return new JAXBElement<单位部门信息类型>(_单位部门信息_QNAME, 单位部门信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "课程成绩列表")
    public JAXBElement<课程成绩列表类型> create课程成绩列表(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_课程成绩列表_QNAME, 课程成绩列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "ifSuccess")
    public JAXBElement<String> createIfSuccess(String value) {
        return new JAXBElement<String>(_IfSuccess_QNAME, String.class, null, value);
    }

}
