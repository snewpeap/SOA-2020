import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class XSLT {
    public static void main(String[] args) {
        String inFilename = "xml/2.xml";
        String outFilename = "xml/3.xml";
        String xslFilename = "xml/transform.xsl";
        try {
            TransformerFactory factory = TransformerFactory.newInstance();

            Templates template = factory.newTemplates(new StreamSource(
                    new FileInputStream(xslFilename)));

            Transformer xformer = template.newTransformer();

            Source source = new StreamSource(new FileInputStream(inFilename));
            Result result = new StreamResult(new FileOutputStream(outFilename));

            xformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
