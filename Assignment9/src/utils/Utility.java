package utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Utility {
    public static <T> void toXML(Class<T> kind, T object, String filePath) {
        try {
            File doc = new File(filePath);
            JAXBContext context = JAXBContext.newInstance(kind);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(object, doc);

            System.out.println(filePath + "生成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <T> T toObject(Class<T> kind, String filePath) {
        try {
            File doc = new File(filePath);
            JAXBContext context = JAXBContext.newInstance(kind);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            @SuppressWarnings("unchecked")
            T result = (T)unmarshaller.unmarshal(doc);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void validate(String xsdPath, String filePath) {
        boolean isValid = XMLValidator.validateXML(xsdPath, filePath);
        if (isValid) {
            System.out.println("验证" + filePath + "成功");
        } else {
            System.out.println("验证" + filePath + "失败");
        }
    }
}
