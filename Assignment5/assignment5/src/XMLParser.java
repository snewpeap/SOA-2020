
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParser {

	private String fileName;
	
	public void setXMLFileName(String xml) {
		fileName = xml;
	}

	public Student getStudent(String id) {
		Student student = new Student();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringElementContentWhitespace(true);
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(fileName);
			Element students = document.getDocumentElement();
			NodeList nodes = students.getElementsByTagName("学号");
			
			for (int i = 0; i < nodes.getLength(); i++) {
				Node node = nodes.item(i);
				String studentID = node.getTextContent();
				
				if (studentID.equals(id)) {
					student.setId(id);
					Element element = (Element)node.getParentNode();

					NodeList scoreInfo = element.getElementsByTagName("课程成绩列表");
					List<Score> scoreList = new ArrayList<Score>();
					for (int j = 0; j < scoreInfo.getLength(); j++) {
						Element info = (Element) scoreInfo.item(j);

						NodeList scores = info.getElementsByTagName("课程成绩");
						for (int k = 0; k < scores.getLength(); k++) {
							Element single_score = (Element)scores.item(k);
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
