import org.xml.sax.SAXException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@WebServlet("/scoreServlet")
public class Servlet extends HttpServlet {
    private XMLParser xmlParser;
    private MessageCreator creator;

    public Servlet() {
        super();
        creator = new MessageCreator("/xml/2.xml");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if (xmlParser == null) {
            try {
                xmlParser = XMLParser.getInstance(getServletContext().getRealPath("/xml/2.xml"));
            } catch (SAXException | ParserConfigurationException e) {
                e.printStackTrace();
            }
        }
        String id = req.getParameter("id");
        resp.setContentType("application/xml;charset=utf-8");

        SOAPMessage message = creator.createMessage(id);

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            message.writeTo(baos);
            resp.getOutputStream().write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".concat(baos.toString("UTF-8")).getBytes(StandardCharsets.UTF_8));
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if (xmlParser == null) {
            try {
                xmlParser = XMLParser.getInstance(getServletContext().getRealPath("/xml/2.xml"));
            } catch (SAXException | ParserConfigurationException e) {
                e.printStackTrace();
            }
        }
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream(), StandardCharsets.UTF_8));
            while ((line = br.readLine()) != null) {
                sb.append(line.trim());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String xml = sb.toString();
        SOAPMessage message;
        try {
            Student student = xmlParser.parseReqPayload(xml, getServletContext().getRealPath("/xml/ScoreList.xsd"));
            validate(student);
            xmlParser.modifyScore(student, student.getScores().get(0));
            message = creator.createMessage(student.getId());
        } catch (ServiceException e) {
            message = creator.createFault(e.getMessage());
        }

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            message.writeTo(baos);
            resp.getOutputStream().write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".concat(baos.toString("UTF-8")).getBytes(StandardCharsets.UTF_8));
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }

    private void validate(Student student) throws ServiceException {
        if (student == null) {
            throw new ServiceException("服务器错误");
        }
    }

}
