package vaildator;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XMLValidator {

	public static boolean validateXML(String xsdPath, String xmlPath) {
		// ����schema����
		SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		// ������֤�ĵ��ļ�����
		File schemaFile = new File(xsdPath);

		// ����schema������������֤�ĵ��ļ���������Schema����
		Schema schema = null;
		try {
			schema = schemaFactory.newSchema(schemaFile);
		} catch (SAXException e) {
			e.printStackTrace();
		}

		// ͨ��Schema��������ڴ�Schema����֤��������schenaFile������֤
		Validator validator = schema.newValidator();

		// ��ʼ��֤
		try {
			// �õ���֤������Դ
			Source source = new StreamSource(new FileInputStream(new File(xmlPath)), "utf-8");
			validator.validate(source);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			return false;
		}
		return true;
	}
}
