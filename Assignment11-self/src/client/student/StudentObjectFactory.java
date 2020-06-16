
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

    private final static QName _�γ���Ϣ_QNAME = new QName("http://jw.nju.edu.cn/schema", "�γ���Ϣ");
    private final static QName _ѧ����Ϣ_QNAME = new QName("http://jw.nju.edu.cn/schema", "ѧ����Ϣ");
    private final static QName _StudentNumber_QNAME = new QName("http://jw.nju.edu.cn/schema", "studentNumber");
    private final static QName _StudentInfo_QNAME = new QName("http://jw.nju.edu.cn/schema", "studentInfo");
    private final static QName _ѧ���б�_QNAME = new QName("http://jw.nju.edu.cn/schema", "ѧ���б�");
    private final static QName _InvalidDataError_QNAME = new QName("http://jw.nju.edu.cn/schema", "invalidDataError");
    private final static QName _��λ������Ϣ_QNAME = new QName("http://www.nju.edu.cn/schema", "��λ������Ϣ");
    private final static QName _�γ̳ɼ��б�_QNAME = new QName("http://jw.nju.edu.cn/schema", "�γ̳ɼ��б�");
    private final static QName _IfSuccess_QNAME = new QName("http://jw.nju.edu.cn/schema", "ifSuccess");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: temp
     */
    public StudentObjectFactory() {
    }

    /**
     * Create an instance of {@link �γ���Ϣ���� }
     */
    public �γ���Ϣ���� create�γ���Ϣ����() {
        return new �γ���Ϣ����();
    }

    /**
     * Create an instance of {@link ѧ����Ϣ���� }
     */
    public ѧ����Ϣ���� createѧ����Ϣ����() {
        return new ѧ����Ϣ����();
    }

    /**
     * Create an instance of {@link �γ̳ɼ��б����� }
     */
    public �γ̳ɼ��б����� create�γ̳ɼ��б�����() {
        return new �γ̳ɼ��б�����();
    }

    /**
     * Create an instance of {@link ѧ���б����� }
     */
    public ѧ���б����� createѧ���б�����() {
        return new ѧ���б�����();
    }

    /**
     * Create an instance of {@link SimplifiedStudentInfo }
     */
    public SimplifiedStudentInfo createSimplifiedStudentInfo() {
        return new SimplifiedStudentInfo();
    }

    /**
     * Create an instance of {@link ���˻�����Ϣ���� }
     */
    public ���˻�����Ϣ���� create���˻�����Ϣ����() {
        return new ���˻�����Ϣ����();
    }

    /**
     * Create an instance of {@link ���˿γ���Ϣ }
     */
    public ���˿γ���Ϣ create���˿γ���Ϣ() {
        return new ���˿γ���Ϣ();
    }

    /**
     * Create an instance of {@link Ȩ������ }
     */
    public Ȩ������ createȨ������() {
        return new Ȩ������();
    }

    /**
     * Create an instance of {@link �γ̳ɼ����� }
     */
    public �γ̳ɼ����� create�γ̳ɼ�����() {
        return new �γ̳ɼ�����();
    }

    /**
     * Create an instance of {@link �ɼ����� }
     */
    public �ɼ����� create�ɼ�����() {
        return new �ɼ�����();
    }

    /**
     * Create an instance of {@link ѧ������ }
     */
    public ѧ������ createѧ������() {
        return new ѧ������();
    }

    /**
     * Create an instance of {@link ��λ������Ϣ���� }
     */
    public ��λ������Ϣ���� create��λ������Ϣ����() {
        return new ��λ������Ϣ����();
    }

    /**
     * Create an instance of {@link ��λ���� }
     */
    public ��λ���� create��λ����() {
        return new ��λ����();
    }

    /**
     * Create an instance of {@link �γ���Ϣ����.�γ̽�ʦ }
     */
    public �γ���Ϣ����.�γ̽�ʦ create�γ���Ϣ���Ϳγ̽�ʦ() {
        return new �γ���Ϣ����.�γ̽�ʦ();
    }

    /**
     * Create an instance of {@link ѧ����Ϣ����.���˿γ� }
     */
    public ѧ����Ϣ����.���˿γ� createѧ����Ϣ���͸��˿γ�() {
        return new ѧ����Ϣ����.���˿γ�();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �γ���Ϣ���� }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "�γ���Ϣ")
    public JAXBElement<�γ���Ϣ����> create�γ���Ϣ(�γ���Ϣ���� value) {
        return new JAXBElement<�γ���Ϣ����>(_�γ���Ϣ_QNAME, �γ���Ϣ����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ѧ����Ϣ���� }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "ѧ����Ϣ")
    public JAXBElement<ѧ����Ϣ����> createѧ����Ϣ(ѧ����Ϣ���� value) {
        return new JAXBElement<ѧ����Ϣ����>(_ѧ����Ϣ_QNAME, ѧ����Ϣ����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "studentNumber")
    public JAXBElement<String> createStudentNumber(String value) {
        return new JAXBElement<String>(_StudentNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ѧ����Ϣ���� }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "studentInfo")
    public JAXBElement<ѧ����Ϣ����> createStudentInfo(ѧ����Ϣ���� value) {
        return new JAXBElement<ѧ����Ϣ����>(_StudentInfo_QNAME, ѧ����Ϣ����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ѧ���б����� }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "ѧ���б�")
    public JAXBElement<ѧ���б�����> createѧ���б�(ѧ���б����� value) {
        return new JAXBElement<ѧ���б�����>(_ѧ���б�_QNAME, ѧ���б�����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "invalidDataError")
    public JAXBElement<String> createInvalidDataError(String value) {
        return new JAXBElement<String>(_InvalidDataError_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ��λ������Ϣ���� }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "��λ������Ϣ")
    public JAXBElement<��λ������Ϣ����> create��λ������Ϣ(��λ������Ϣ���� value) {
        return new JAXBElement<��λ������Ϣ����>(_��λ������Ϣ_QNAME, ��λ������Ϣ����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �γ̳ɼ��б����� }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "�γ̳ɼ��б�")
    public JAXBElement<�γ̳ɼ��б�����> create�γ̳ɼ��б�(�γ̳ɼ��б����� value) {
        return new JAXBElement<�γ̳ɼ��б�����>(_�γ̳ɼ��б�_QNAME, �γ̳ɼ��б�����.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "ifSuccess")
    public JAXBElement<String> createIfSuccess(String value) {
        return new JAXBElement<String>(_IfSuccess_QNAME, String.class, null, value);
    }

}
