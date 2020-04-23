import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SAXHandler extends DefaultHandler {
    boolean isFailed = false;
    String tmpStr = "";
    int count=0;
    boolean isProcessingScore = false;
    boolean isReadingScore = false;
    String fileName = "xml/4.xml";
    BufferedWriter writer = null;


    @Override
    public void startDocument() throws SAXException {
        File file = new File(fileName);
        try {
            writer=new BufferedWriter(new FileWriter(file));
            System.out.println("开始解析");
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void endDocument() throws SAXException {
        try {
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("解析完成");
    }

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        if (qName.equals("成绩")) {
            isProcessingScore = true;
            tmpStr += "<" + qName + ">";
        }else if (qName.equals("得分")) {
            isReadingScore = true;
            tmpStr += "<" + qName + ">";
        }else if (isProcessingScore) {
            tmpStr += "<" + qName + ">";
        }else {
            tmpStr+=("<"+qName);
            for (int i = 0; i < attributes.getLength(); i++) {
                String attrName = attributes.getQName(i);
                String attrValue = attributes.getValue(i);
                tmpStr+=(" " + attrName + "=\"" + attrValue + "\"");
            }
            tmpStr+=">\n";
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        if (qName.equals("成绩")) {
            tmpStr += "</" + qName + ">\n";
            if (isFailed) {
                try {
                    writer.write(tmpStr);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            isProcessingScore = false;
            tmpStr = "";
        }
        else if(qName.equals("课程成绩列表")){
            try{
                writer.write("</"+qName+">\n");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else if (qName.equals("得分")) {
            isReadingScore = false;
            tmpStr += "</" + qName + ">";
        }else if (isProcessingScore) {
            tmpStr += "</" + qName + ">";
        }else {
            try {
                if(count>0){
                    writer.write("</" + qName + ">\n");
                    count=0;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        String str = new String(ch, start, length).trim();
        if (isReadingScore) {
            int score = Integer.parseInt(str);
            if (score < 60) {
                isFailed = true;
                count++;
            }else {
                isFailed = false;
            }
            tmpStr += str;
        }else if (isProcessingScore) {
            tmpStr += str;
        } else {
            if (!str.equals("")) {
                System.out.println(str);
            }
        }
    }
}
