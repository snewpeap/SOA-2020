package com.company;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        dbf.setValidating(true);
        DocumentBuilder db = null;
        try {
            db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = db.newDocument();

        String njuURl_jw = "http://jw.nju.edu.cn/schema";
        String njuURI = "http://www.nju.edu.cn/schema";
        String xsiURI = "http://www.w3.org/2001/XMLSchema-instance";

        //Generate elements
        Element root = doc.createElementNS(njuURl_jw, "学生列表");
        root.setAttribute("xmlns",njuURl_jw);
        root.setAttribute("xmlns:nju",njuURI);
        root.setAttribute("xmlns:xsi",xsiURI);
        root.setAttribute("xsi:schemaLocation",njuURl_jw + " StudentList.xsd");
        doc.appendChild(root);

        int studentC = 1;
        for(int i = 0; i < studentC; i++) {

        }

        //Generate xml file
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("test.xml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        OutputFormat format = new OutputFormat(doc);
        XMLSerializer xmlSerilizer = new XMLSerializer(out, format);

        try {
            xmlSerilizer.serialize(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
