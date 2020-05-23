package generators;

import elements.Student;
import elements.StudentList;
import utils.Converter;

public class XML2 {
    private static String XML1 = "xml/1.xml";

    public static void generateXML2() {
        StudentList studentList = new StudentList();
        // get first student from 1.xml
        Student student = readXML1();
        studentList.getStudentList().add(student);
    }

    public static Student readXML1() {
        Student student = Converter.toObject(Student.class, XML1);
        return student;
    }
}
