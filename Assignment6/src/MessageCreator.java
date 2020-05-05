import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.*;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class MessageCreator {
    private String fileName;
    private SOAPEnvelope envelope;
    private SOAPBody body;

    private static final String jw_prefix = "jw";
    private static final String env_prefix = "env";

    public MessageCreator(String fileName) {
        this.fileName = fileName;
    }

    public SOAPMessage createMessage(String id) {
        try {
            MessageFactory factory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
            SOAPMessage message = factory.createMessage();
            SOAPPart part = message.getSOAPPart();
            envelope = part.getEnvelope();
            body = envelope.getBody();

            //非法ID
            if (null == id || id.length() == 0 || !isValid(id)) {
                createIllegalFault();
            }
            else {
                XMLParser parser = XMLParser.getInstance(fileName);
                Student student = parser.getStudent(id);

                //ID不存在
                if (null == student) {
                    createNoneFault();
                }
                //返回正常学生信息
                else {
                    createMessage(student);
                }
            }

            message.saveChanges();
            return message;
        } catch (SOAPException | ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
            return null;
        }
    }

    public SOAPMessage createFault(String string) {
        try {
            MessageFactory factory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
            SOAPMessage message = factory.createMessage();
            SOAPPart part = message.getSOAPPart();
            envelope = part.getEnvelope();
            body = envelope.getBody();

            SOAPFault fault = body.addFault();
            fault.setFaultCode(fault.createQName("Sender", env_prefix));
            fault.setFaultString(string, new Locale("zh-CN"));
            message.saveChanges();
            return message;
        } catch (SOAPException e) {
            e.printStackTrace();
            return null;
        }
    }

    /*
     * 判断学号格式是否符合要求：9位数字
     */
    private boolean isValid(String id) {
        if (id.length() != 9) {
            return false;
        }

        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (c > '9' || c < '0') {
                return false;
            }
        }

        return true;
    }

    private void createIllegalFault() {
        try {
            SOAPFault fault = body.addFault();
            fault.setFaultCode(fault.createQName("Sender", env_prefix));
            fault.setFaultString("学号格式不符合要求，应为9位数字", new Locale("zh-CN"));
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }

    private void createNoneFault() {
        try {
            SOAPFault fault = body.addFault();
            fault.setFaultCode(fault.createQName("Sender", env_prefix));
            fault.setFaultString("学号不存在", new Locale("zh-CN"));
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }

    private void createMessage(Student student) {
        try {
            SOAPElement element = body.addChildElement(envelope.createName("课程成绩列表", jw_prefix, "http://jw.nju.edu.cn/schema"));
            element.setAttribute("xmlns:nju", "http://www.nju.edu.cn/schema");

            List<Score> scores = student.getScores();
            for (Score score : scores) {
                SOAPElement scoreElement = element.addChildElement(element.createQName("课程成绩", jw_prefix));
                scoreElement.setAttribute("课程编号", score.getCourseID());
                scoreElement.setAttribute("成绩性质", score.getScoreType());
                SOAPElement sElement = scoreElement.addChildElement(element.createQName("成绩", jw_prefix));
                sElement.addChildElement(element.createQName("学号", jw_prefix)).addTextNode(student.getId());
                sElement.addChildElement(element.createQName("得分", jw_prefix)).addTextNode(score.getScore() + "");
            }
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
