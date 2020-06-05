
package startFromWSDL.StudentService;

import startFromWSDL.types.个人基本信息类型;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personalInfo" type="{http://www.nju.edu.cn/schema}个人基本信息类型"/&gt;
 *         &lt;element name="studentId" type="{http://jw.nju.edu.cn/schema}学号类型"/&gt;
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
    protected 个人基本信息类型 personalInfo;
    @XmlElement(namespace = "", required = true)
    protected String studentId;

    /**
     * 获取personalInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 个人基本信息类型 }
     *     
     */
    public 个人基本信息类型 getPersonalInfo() {
        return personalInfo;
    }

    /**
     * 设置personalInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 个人基本信息类型 }
     *     
     */
    public void setPersonalInfo(个人基本信息类型 value) {
        this.personalInfo = value;
    }

    /**
     * 获取studentId属性的值。
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
     * 设置studentId属性的值。
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
