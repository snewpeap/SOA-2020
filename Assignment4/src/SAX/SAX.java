package SAX;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import vaildator.XMLValidator;


import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAX {
    private static final String outFilename="xml/4.xml";
    private static final String inFilename="xml/3.xml";
    public static void main(String[] args)throws Exception{
        try{
            //创建解析工厂
            SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
            //通过解析工厂获得解析器
            SAXParser saxParser=saxParserFactory.newSAXParser();
            //通过自定义的解析格式解析执行XML文档
            DefaultHandler handler = new FaidScoreHandler(outFilename);
            saxParser.parse(inFilename,handler);
            //
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }


    }


    /* b
    static class myDefaultHandler extends DefaultHandler{

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes)
                throws SAXException{
            System.out.print("<"+qName+">");
        }
        @Override
        public void characters(char[] ch, int start, int length)throws SAXException{


oolean isValid = XMLValidator.validateXML("xml/ScoreList.xsd", outFilename);
        if (isValid) {
            System.out.println("验证" +outFilename  + "成功");
        } else {
            System.out.println("验证" + outFilename + "失败");
        }

            System.out.print(new String(ch,start,length));

        }
        @Override
        public void endElement(String uri,String localName,String qName)throws SAXException{
            System.out.print("</"+qName+">");
        }
    }*/
}