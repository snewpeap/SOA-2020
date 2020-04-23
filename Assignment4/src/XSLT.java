import org.xml.sax.SAXException;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;

public class XSLT {
    public static void main(String[] args) throws SAXException, FileNotFoundException {
        String inFilename = "xml/2.xml";
        String outFilename = "xml/3.xml";
        String xslFilename = "xml/transform.xsl";
        String xsdFilename="xml/ScoreList.xsd";

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



        SchemaFactory sf=SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        File schemaFile=new File(xsdFilename);
        Schema schema=sf.newSchema(schemaFile);
        Validator validator=schema.newValidator();
        Source res=new StreamSource(new FileInputStream(new File(outFilename)),"utf-8");
        try{
            validator.validate(res);
            System.out.println("成功");
        } catch (Exception e) {
            System.out.println("失败");
        }
    }
}
