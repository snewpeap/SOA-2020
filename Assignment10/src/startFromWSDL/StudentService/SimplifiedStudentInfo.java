
package startFromWSDL.StudentService;

import startFromWSDL.types.���˻�����Ϣ����;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personalInfo" type="{http://www.nju.edu.cn/schema}���˻�����Ϣ����"/&gt;
 *         &lt;element name="studentId" type="{http://jw.nju.edu.cn/schema}ѧ������"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personalInfo",
    "studentId"
})
@XmlRootElement(name = "studentInfo")
public class SimplifiedStudentInfo {

    @XmlElement(namespace = "", required = true)
    protected ���˻�����Ϣ���� personalInfo;
    @XmlElement(namespace = "", required = true)
    protected String studentId;

    /**
     * ��ȡpersonalInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ���˻�����Ϣ���� }
     *     
     */
    public ���˻�����Ϣ���� getPersonalInfo() {
        return personalInfo;
    }

    /**
     * ����personalInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ���˻�����Ϣ���� }
     *     
     */
    public void setPersonalInfo(���˻�����Ϣ���� value) {
        this.personalInfo = value;
    }

    /**
     * ��ȡstudentId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * ����studentId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentId(String value) {
        this.studentId = value;
    }

}
