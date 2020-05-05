
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.*;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XMLParser {
    private static XMLParser instance;
    private Document document;

    private XMLParser(String fileName) throws ParserConfigurationException, IOException, SAXException {
        super();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.parse(fileName);
    }

    public static XMLParser getInstance(String fileName) throws IOException, SAXException, ParserConfigurationException {
        if (instance == null) {
            instance = new XMLParser(fileName);
        }
        return instance;
    }

    public Student getStudent(String id) {
        Student student = new Student();
        Element students = document.getDocumentElement();
        NodeList nodes = students.getElementsByTagName("学号");

        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            String studentID = node.getTextContent();

            if (studentID.equals(id)) {
                student.setId(id);
                Element element = (Element) node.getParentNode();

                NodeList scoreInfo = element.getElementsByTagName("课程成绩列表");
                List<Score> scoreList = new ArrayList<>();
                for (int j = 0; j < scoreInfo.getLength(); j++) {
                    Element info = (Element) scoreInfo.item(j);

                    NodeList scores = info.getElementsByTagName("课程成绩");
                    for (int k = 0; k < scores.getLength(); k++) {
                        Element single_score = (Element) scores.item(k);
                        String courseID = single_score.getAttribute("课程编号");
                        String type = single_score.getAttribute("成绩性质");
                        int s = Integer.parseInt(single_score.getElementsByTagName("得分").item(0).getTextContent());

                        Score score = new Score(courseID, type, s);
                        scoreList.add(score);
                    }
                }
                student.setScores(scoreList);

                return student;
            }
        }
        return null;
    }

    public Student parseReqPayload(String payload, String schemaLocation) throws ServiceException {
        SOAPBody body;
        Schema schema;
        try {
            SOAPMessage message = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL).createMessage(new MimeHeaders(), new ByteArrayInputStream(payload.getBytes(StandardCharsets.UTF_8)));
            body = message.getSOAPBody();
            SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            schema = schemaFactory.newSchema(new File(schemaLocation));
        } catch (IOException | SOAPException | SAXException e) {
            e.printStackTrace();
            return null;
        }
        Iterator<SOAPElement> iterator = body.getChildElements();
        Validator validator = schema.newValidator();
        Student student = new Student();
        while (iterator.hasNext()) {
            SOAPElement scoreList = iterator.next();
            try {
                Source source = new DOMSource(body.extractContentAsDocument());
                validator.validate(source);
            } catch (SAXException e) {
                e.printStackTrace();
                throw new ServiceException("消息格式不符合ScoreList Schema: " + e.getMessage());
            } catch (IOException | SOAPException e) {
                e.printStackTrace();
                break;
            }

            Iterator<SOAPElement> courseIterator = scoreList.getChildElements();
            while (courseIterator.hasNext()) {
                SOAPElement courseScore = courseIterator.next();
                String courseID = courseScore.getAttribute("课程编号");
                String type = courseScore.getAttribute("成绩性质");
                Iterator<SOAPElement> scoreIterator = courseScore.getChildElements();
                while (scoreIterator.hasNext()) {
                    SOAPElement scoreElement = scoreIterator.next();
                    String id = scoreElement.getFirstChild().getTextContent();
                    try {
                        int score = Integer.parseInt(scoreElement.getLastChild().getTextContent());
                        student.setId(id);
                        student.getScores().add(new Score(courseID, type, score));
                    } catch (NumberFormatException e) {
                        throw new ServiceException("分数非数值");
                    }
                }
            }
        }
        return student;
    }

    public void modifyScore(Student student, Score score) throws ServiceException {
        Element students = document.getDocumentElement();
        NodeList nodes = students.getElementsByTagName("学号");

        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            String studentID = node.getTextContent();

            if (studentID.equals(student.getId())) {
                Element element = (Element) node.getParentNode();

                NodeList scoreInfo = element.getElementsByTagName("课程成绩列表");
                for (int j = 0; j < scoreInfo.getLength(); j++) {
                    Element info = (Element) scoreInfo.item(j);
                    NodeList scores = info.getElementsByTagName("课程成绩");
                    for (int k = 0; k < scores.getLength(); k++) {
                        Element single_score = (Element) scores.item(k);
                        String courseID = single_score.getAttribute("课程编号");
                        String type = single_score.getAttribute("成绩性质");
                        if (courseID.equals(score.getCourseID()) && type.equals(score.getScoreType())) {
                            single_score.getElementsByTagName("得分").item(0).setTextContent(String.valueOf(score.getScore()));
                            return;
                        }
                    }
                }
                throw new ServiceException(String.format("不存在学生%s的课程%s的%s", studentID, score.getCourseID(), score.getScoreType()));
            }
        }
        throw new ServiceException(String.format("不存在学号为%s的学生", student.getId()));
    }
}
