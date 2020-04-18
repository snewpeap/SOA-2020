package com.company;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.HashMap;



public class Main {
    static HashMap<String,String> commonValues;

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
        initCommonValues();

        // Read from excel file
        File studentExcelFile = new File("./data/studentMsg.xlsx");
        FileInputStream is = null;// 获取文件输入流
        try {
            is = new FileInputStream(studentExcelFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook2003 = null;
        try {
            workbook2003 = new XSSFWorkbook(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet std_sheet = workbook2003.getSheetAt(0);
        int studentC = std_sheet.getLastRowNum();

        //Generate elements
        Element root = doc.createElementNS(njuURl_jw, "学生列表");
        root.setAttribute("xmlns",njuURl_jw);
        root.setAttribute("xmlns:nju",njuURI);
        root.setAttribute("xmlns:xsi",xsiURI);
        root.setAttribute("xsi:schemaLocation",njuURl_jw + " StudentList.xsd");
        doc.appendChild(root);

        XSSFRow std_row = null;
        for(int i = 1; i < studentC; i++) {
            std_row = std_sheet.getRow(i);

            Element std = doc.createElementNS(njuURl_jw, "学生");
            root.appendChild(std);

            Element std_personInfo = doc.createElementNS(njuURl_jw, "个人信息");
            std.appendChild(std_personInfo);

            Element std_name = doc.createElementNS(njuURI, "nju:姓名");
            std_name.appendChild(doc.createTextNode(std_row.getCell(0).toString()));
            std_personInfo.appendChild(std_name);

            Element std_gender = doc.createElementNS(njuURI, "nju:性别");
            std_gender.appendChild(doc.createTextNode(std_row.getCell(1).toString()));
            std_personInfo.appendChild(std_gender);

            Element std_birth = doc.createElementNS(njuURI, "nju:出生日期");
            std_birth.appendChild(doc.createTextNode(std_row.getCell(2).toString()));
            std_personInfo.appendChild(std_birth);

            Element std_department = doc.createElementNS(njuURI, "nju:单位部门");
            std_personInfo.appendChild(std_department);
            Element department = doc.createElementNS(njuURI,"nju:学院");
            department.appendChild(doc.createTextNode(commonValues.get("std_department")));
            Element depart = doc.createElementNS(njuURI,"nju:单位");
            depart.appendChild(department);
            std_department.appendChild(depart);

            Element depart_address = doc.createElementNS(njuURI,"nju:地址");
            depart_address.appendChild(doc.createTextNode(commonValues.get("depart_address")));
            std_department.appendChild(depart_address);
            Element depart_phone = doc.createElementNS(njuURI,"nju:电话");
            depart_phone.appendChild(doc.createTextNode(commonValues.get("depart_phone")));
            std_department.appendChild(depart_phone);
            Element depart_fax = doc.createElementNS(njuURI,"nju:传真");
            depart_fax.appendChild(doc.createTextNode(commonValues.get("depart_fax")));
            std_department.appendChild(depart_fax);

            Element std_number = doc.createElementNS(njuURl_jw,"学号");
            std_row.getCell(3).setCellType(CellType.STRING);
            std_number.appendChild(doc.createTextNode(std_row.getCell(3).getStringCellValue()));
            std.appendChild(std_number);

            //TODO Add score list
        }


        //Generate output file
        TransformerFactory tff = TransformerFactory.newInstance();
        Transformer trans = null;
        try {
            trans = tff.newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }

        trans.setOutputProperty("encoding", "utf-8");
        DOMSource domSource = new DOMSource(doc);
        StreamResult sr = new StreamResult(new File("./xml/2.xml"));
        trans.setOutputProperty(OutputKeys.INDENT, "yes");
        try {
            trans.transform(domSource, sr);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    static void initCommonValues() {
        commonValues = new HashMap<String, String>();

        commonValues.put("std_department","软件学院");
        commonValues.put("depart_address","南京市汉口路22号，南京大学软件学院（费彝民楼）");
        commonValues.put("depart_phone","025-83621369");
        commonValues.put("depart_fax","025-83621370");

        commonValues.put("score_midterm","期中成绩");
        commonValues.put("score_final","期末成绩");
        commonValues.put("score_overall","总评成绩");
    }

    static int generateRandomScore(boolean isOverSixty){
        if(!isOverSixty){
            return (int) (Math.random() * 60);
        }
        return Math.min((int)(Math.random() * 100 + 60),95);
    }
}
