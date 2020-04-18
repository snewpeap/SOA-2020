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
import java.util.ArrayList;
import java.util.HashMap;



public class Main {
    static HashMap<String,String> commonValues;
    static ArrayList<String> scoreTypes;

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
        FileInputStream is = null;
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


        File courseExcelFile = new File("./data/courseMsg.xlsx");
        FileInputStream is_course = null;
        try {
            is_course = new FileInputStream(courseExcelFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook2003_course = null;
        try {
            workbook2003_course = new XSSFWorkbook(is_course);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet course_sheet = workbook2003_course.getSheetAt(0);

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

            //Add score List
            Element std_courses = doc.createElementNS(njuURl_jw,"个人课程");
            std.appendChild(std_courses);
            for(int j = 1; j < 6; j++){
                XSSFRow course_row = course_sheet.getRow(j);

                Element std_course = doc.createElementNS(njuURl_jw,"课程");
                Element course_info = doc.createElementNS(njuURl_jw,"课程信息");
                Element course_score_list = doc.createElementNS(njuURl_jw,"课程成绩列表");
                std_course.appendChild(course_info);
                std_course.appendChild(course_score_list);

                course_row.getCell(0).setCellType(CellType.STRING);
                course_row.getCell(3).setCellType(CellType.STRING);
                course_row.getCell(4).setCellType(CellType.STRING);
                course_info.appendChild(doc.createElementNS(njuURl_jw,"课程编号"))
                        .appendChild(doc.createTextNode(course_row.getCell(0).getStringCellValue()));
                course_info.appendChild(doc.createElementNS(njuURl_jw,"课程名称"))
                        .appendChild(doc.createTextNode(course_row.getCell(1).getStringCellValue()));
                course_info.appendChild(doc.createElementNS(njuURl_jw,"课程教师"))
                        .appendChild(doc.createElementNS(njuURl_jw,"教师"))
                        .appendChild(doc.createTextNode(course_row.getCell(2).getStringCellValue()));
                Element course_term = doc.createElementNS(njuURl_jw,"学期");
                Element term_year = doc.createElementNS(njuURl_jw,"学年");
                term_year.appendChild(doc.createTextNode(course_row.getCell(3).getStringCellValue()));
                Element term_number = doc.createElementNS(njuURl_jw,"学期数");
                term_number.appendChild(doc.createTextNode(course_row.getCell(4).getStringCellValue()));
                course_term.appendChild(term_year);
                course_term.appendChild(term_number);
                course_info.appendChild(course_term);
                course_info.appendChild(doc.createElementNS(njuURl_jw,"上课校区"))
                        .appendChild(doc.createTextNode(course_row.getCell(5).getStringCellValue()));
                course_info.appendChild(doc.createElementNS(njuURl_jw,"上课地点"))
                        .appendChild(doc.createTextNode(course_row.getCell(6).getStringCellValue()));
                course_info.appendChild(doc.createElementNS(njuURl_jw,"课程类型"))
                        .appendChild(doc.createTextNode(course_row.getCell(7).getStringCellValue()));

                boolean isOverSixty = true;
                for(int k = 0; k < 3; k++){
                    if(i == 6 && j == 1 && k == 0){
                        isOverSixty = false;
                    }

                    Element course_score = doc.createElementNS(njuURl_jw,"成绩");
                    course_score.appendChild(std_number.cloneNode(true));
                    course_score.appendChild(doc.createElementNS(njuURl_jw,"得分"))
                            .appendChild(doc.createTextNode(generateRandomScore(isOverSixty)));
                    Element score_element = doc.createElementNS(njuURl_jw,"课程成绩");
                    score_element.setAttribute("课程编号",course_row.getCell(0).getStringCellValue());
                    score_element.setAttribute("成绩性质",scoreTypes.get(k));
                    score_element.appendChild(course_score);
                    course_score_list.appendChild(score_element);
                }
                std_courses.appendChild(std_course);
            }
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

        scoreTypes = new ArrayList<String>();
        scoreTypes.add("期中成绩");
        scoreTypes.add("期末成绩");
        scoreTypes.add("总评成绩");
    }

    static String generateRandomScore(boolean isOverSixty){
        if(!isOverSixty){
            return String.valueOf((int) (Math.random() * 60));
        }
        return String.valueOf(Math.min((int)(Math.random() * 100 + 60),95));
    }
}
