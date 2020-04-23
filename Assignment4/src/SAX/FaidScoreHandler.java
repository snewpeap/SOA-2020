package SAX;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class FaidScoreHandler extends DefaultHandler {
    /*
     *0,初始状态，不及格，收集；1，及格，不用
     * -1，待判断，放入queue
     */
    private static int FLAG = 0;
    private static boolean isScore = false;

    private TransformerHandler transformerHandle;
    private Queue<Filter> queue;
    public FaidScoreHandler(final String outFiename){
        queue = new LinkedList<Filter>();
        try{
            Result result = new StreamResult(new File(outFiename));
            //获取sax生产工厂实例
            SAXTransformerFactory saxTransformerFactory=(SAXTransformerFactory) SAXTransformerFactory.newInstance();
            //获取sax生产处理对象实例
            transformerHandle=saxTransformerFactory.newTransformerHandler();
            Transformer transformer = transformerHandle.getTransformer();

            transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformerHandle.setResult(result);
        }catch (TransformerConfigurationException e){
            e.printStackTrace();
        }
    }
    @Override
    public void startDocument() throws SAXException {
        transformerHandle.startDocument();
    }
    @Override
    public void endDocument() throws SAXException {
        transformerHandle.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("得分")) {
            isScore = true;
        }
        if (0 == FLAG) {
            while (!queue.isEmpty()) {
                queue.poll().add();
            }
            if (qName.equals("成绩")) {
                //遇到成绩元素，则进入待判断状态，预存元素至queue中
                FLAG = -1;
                queue.add(new FilterStartElement(transformerHandle, uri, localName, qName, attributes));
            } else {
                transformerHandle.startElement(uri, localName, qName, attributes);
            }
        }
        else if (-1 == FLAG) {
            queue.add(new FilterStartElement(transformerHandle, uri, localName, qName, attributes));
        }
        else if (1 == FLAG) {
            while (!queue.isEmpty()) {
                queue.poll();
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("得分")) {
            isScore = false;
        }
        if (0 == FLAG) {
            while (!queue.isEmpty()) {
                queue.poll().add();
            }
            transformerHandle.endElement(uri, localName, qName);
        }
        else if (-1 == FLAG) {
            queue.add(new FilterEndElement(transformerHandle, uri, localName, qName));
        }
        else if (1 == FLAG) {
            while (!queue.isEmpty()) {
                queue.poll();
            }
            if (qName.equals("成绩")) {
                FLAG = 0;
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (0 == FLAG) {
            transformerHandle.characters(ch, start, length);
        }
        else if (-1 == FLAG) {
            String str = new String(ch, start, length);
            //“得分”元素，根据分数更新状态
            if (isScore && !str.trim().isEmpty()) {
                int score = Integer.parseInt(str);
                if (score >= 60) {
                    FLAG = 1;
                    while (!queue.isEmpty()) {
                        queue.poll();
                    }
                }
                else {
                    FLAG = 0;
                    while (!queue.isEmpty()) {
                        queue.poll().add();
                    }
                    transformerHandle.characters(ch, start, length);
                }
            }
            else {
                queue.add(new FilterCharacter(transformerHandle, ch, start, length));
            }
        }
    }
}

