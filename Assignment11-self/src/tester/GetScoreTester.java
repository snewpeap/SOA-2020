package tester;

import client.score.GetScoreInterface;
import client.InvalidDataFault;
import entity.�γ̳ɼ��б�����;

import javax.xml.ws.soap.SOAPFaultException;

import static tester.FaultUtil.handleInvalidDataFault;
import static tester.FaultUtil.handleSOAPFault;

public class GetScoreTester {
    public void runTests(GetScoreInterface getScoreInterface) {
        final String separator = "====================";
        System.out.println("���Բ�ѯ���ڵ�ѧ�ŵķ���" + separator);
        runTestCase(getScoreInterface, "171250001");
        System.out.println("���Բ�ѯ�����ڵ�ѧ�ŵķ���" + separator);
        runTestCase(getScoreInterface, "181250001");
        System.out.println("���Բ�ѯ���ȴ���9��ѧ��" + separator);
        runTestCase(getScoreInterface, "1712500001");
    }

    private void runTestCase(GetScoreInterface getScoreInterface, String studentNumber) {
        try {

            �γ̳ɼ��б����� getScore = getScoreInterface.opGetScore(studentNumber);
            getScore.get�γ̳ɼ�().forEach(course -> {
                System.out.format("�γ̱�ţ�%s���ɼ����ʣ�%s\n", course.get�γ̱��(), course.get�ɼ�����().value());
                course.get�ɼ�().forEach(score -> System.out.format("\tѧ�ţ�%s���ɼ���%s\n", score.getѧ��(), score.get�÷�()));
            });
        } catch (SOAPFaultException soapFaultException) {
            handleSOAPFault(soapFaultException);
        } catch (InvalidDataFault invalidDataFault) {
            handleInvalidDataFault(invalidDataFault);
        }
    }
}
