import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import startFromWSDL.ScoreService.DeleteScoreInterface_DeleteScoreServicePort_Server;
import startFromWSDL.ScoreService.GetScoreInterface_GetScoreServicePort_Server;
import startFromWSDL.ScoreService.UpdateScoreInterface_UpdateScoreServicePort_Server;
import startFromWSDL.StudentService.DeleteStudentInterface_DeleteStudentServicePort_Server;
import startFromWSDL.StudentService.GetStudentInterface_GetStudentServicePort_Server;
import startFromWSDL.StudentService.UpdateStudentInterface_UpdateStudentServicePort_Server;
import startFromWSDL.types.ѧ���б�����;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    private Document document;

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setDocument();
        main.initService();
    }

    private void setDocument() throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        factory.setIgnoringComments(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.parse(this.getClass().getResourceAsStream("/xml/document.xml"));
    }

    private void initService() throws Exception {
        ѧ���б����� studentList = new ѧ���б�����();
        JAXBContext jaxbContext = JAXBContext.newInstance(ѧ���б�����.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        studentList = (ѧ���б�����) unmarshaller.unmarshal(document);

        new DeleteScoreInterface_DeleteScoreServicePort_Server(studentList);
        new GetScoreInterface_GetScoreServicePort_Server(studentList);
        new UpdateScoreInterface_UpdateScoreServicePort_Server(studentList);

        new DeleteStudentInterface_DeleteStudentServicePort_Server(studentList);
        new GetStudentInterface_GetStudentServicePort_Server(studentList);
        new UpdateStudentInterface_UpdateStudentServicePort_Server(studentList);
    }
}
