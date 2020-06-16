package startFromWSDL.ScoreService;

import com.sun.xml.ws.developer.SchemaValidation;
import startFromWSDL.ServiceBasis;
import startFromWSDL.types.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-05T12:26:43.965+08:00
 * Generated source version: 3.3.6
 */

@javax.jws.WebService(
        serviceName = "ScoreService",
        portName = "DeleteScoreServicePort",
        targetNamespace = "http://jw.nju.edu.cn/wsdl",
        wsdlLocation = "xml/startFromWSDL/ScoreService.wsdl",
        endpointInterface = "startFromWSDL.ScoreService.DeleteScoreInterface")
@SchemaValidation
public class DeleteScoreServicePortImpl extends ServiceBasis implements DeleteScoreInterface {

    private static final Logger LOG = Logger.getLogger(DeleteScoreServicePortImpl.class.getName());

    public DeleteScoreServicePortImpl() {
        super(null);
    }

    public DeleteScoreServicePortImpl(ѧ���б����� studentList) {
        super(studentList);
    }

    /* (non-Javadoc)
     * @see startFromWSDL.ScoreService.DeleteScoreInterface#opDeleteScore(startFromWSDL.types.�γ̳ɼ��б����� parameters)*
     */
    public java.lang.String opDeleteScore(�γ̳ɼ��б����� parameters) throws InvalidDataFault {
        LOG.info("Executing operation opDeleteScore");
        for (�γ̳ɼ����� scoreType : parameters.get�γ̳ɼ�()) {
            String paramCourseId = scoreType.get�γ̱��();
            �ɼ��������� paramGradeType = scoreType.get�ɼ�����();
            for (�ɼ����� grade : scoreType.get�ɼ�()) {
                String studentId = grade.getѧ��();

                //����ѧ���б�
                List<ѧ����Ϣ����> allStudents = studentList.getѧ��();
                for (int i2 = 0; i2 < allStudents.size(); i2++) {
                    ѧ����Ϣ���� studentInfo = allStudents.get(i2);
                    if (studentInfo.getѧ��().equals(studentId)) {
                        List<���˿γ���Ϣ> allCourses = studentInfo.get���˿γ�().get�γ�();
                        for (int i1 = 0; i1 < allCourses.size(); i1++) {
                            ���˿γ���Ϣ personalGradeType = allCourses.get(i1);
                            if (personalGradeType.get�γ���Ϣ().get�γ̱��().equals(paramCourseId)) {
                                List<�γ̳ɼ�����> allGrades = personalGradeType.get�γ̳ɼ��б�().get�γ̳ɼ�();
                                int index = -1;
                                for (int i = 0; i < allGrades.size(); i++) {
                                    �γ̳ɼ����� courseGradeType = allGrades.get(i);
                                    if (courseGradeType.get�ɼ�����() == paramGradeType) {
                                        index = i;
                                        break;
                                    }
                                }
                                if (index == -1) {
                                    return String.format("ѧ��Ϊ%s��ѧ��û�пγ�%s��%s", studentId, paramCourseId, paramGradeType);
                                } else {
                                    allGrades.remove(index);
                                }
                                break;
                            }
                            if (allCourses.size() - 1 == i1) {
                                throw new InvalidDataFault(String.format("ѧ��Ϊ%s��ѧ��û��ѡ�޿γ�%s", studentId, paramCourseId));
                            }
                        }
                        break;
                    }
                    if (allStudents.size() - 1 == i2) {
                        throw new InvalidDataFault("û��ѧ��ѧ��Ϊ" + studentId);
                    }
                }
            }
        }
        return "success";
    }

}