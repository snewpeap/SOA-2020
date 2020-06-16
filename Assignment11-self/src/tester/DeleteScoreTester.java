package tester;

import client.score.DeleteScoreInterface;
import client.InvalidDataFault;
import entity.�ɼ���������;
import entity.�ɼ�����;
import entity.�γ̳ɼ��б�����;
import entity.�γ̳ɼ�����;

import javax.xml.ws.soap.SOAPFaultException;

import static tester.FaultUtil.handleInvalidDataFault;
import static tester.FaultUtil.handleSOAPFault;

public class DeleteScoreTester {
    public void runTests(DeleteScoreInterface deleteScoreInterface) {
        final String separator = "====================";

        �γ̳ɼ��б����� scoreForm = new �γ̳ɼ��б�����();
        �γ̳ɼ����� courseScore = new �γ̳ɼ�����();
        courseScore.set�ɼ�����(�ɼ���������.���гɼ�);
        courseScore.set�γ̱��("11111111");
        �ɼ����� score = new �ɼ�����();
        score.setѧ��("171250558");
        score.set�÷�(100);
        courseScore.get�ɼ�().add(score);
        scoreForm.get�γ̳ɼ�().add(courseScore);

        System.out.println("��������ɾ���ɼ�" + separator);
        runTestCase(deleteScoreInterface, scoreForm);

        System.out.println("����ɾ�������ڵ����ʵĳɼ�" + separator);
        scoreForm.get�γ̳ɼ�().get(0).set�ɼ�����(�ɼ���������.ƽʱ�ɼ�);
        scoreForm.get�γ̳ɼ�().get(0).get�ɼ�().get(0).set�÷�(77);
        runTestCase(deleteScoreInterface, scoreForm);

        System.out.println("����Ϊδѡ�Ŀγ�ɾ���ɼ�" + separator);
        scoreForm.get�γ̳ɼ�().get(0).set�ɼ�����(�ɼ���������.���гɼ�);
        scoreForm.get�γ̳ɼ�().get(0).set�γ̱��("00000000");
        runTestCase(deleteScoreInterface, scoreForm);

        System.out.println("����Ϊ�����ڵ�ѧ��ɾ���ɼ�" + separator);
        scoreForm.get�γ̳ɼ�().get(0).set�γ̱��("11111111");
        scoreForm.get�γ̳ɼ�().get(0).set�ɼ�����(�ɼ���������.���гɼ�);
        scoreForm.get�γ̳ɼ�().get(0).get�ɼ�().get(0).setѧ��("181250558");
        runTestCase(deleteScoreInterface, scoreForm);

        System.out.println("�������벻�Ϸ��Ŀγ̱��" + separator);
        scoreForm.get�γ̳ɼ�().get(0).get�ɼ�().get(0).setѧ��("171250558");
        scoreForm.get�γ̳ɼ�().get(0).set�γ̱��("777");
        runTestCase(deleteScoreInterface, scoreForm);
    }

    private void runTestCase(DeleteScoreInterface deleteScoreInterface, �γ̳ɼ��б����� scoreForm) {
        try {
            System.out.println("ɾ�����������" + deleteScoreInterface.opDeleteScore(scoreForm));
        } catch (SOAPFaultException soapFaultException) {
            handleSOAPFault(soapFaultException);
        } catch (InvalidDataFault invalidDataFault) {
            handleInvalidDataFault(invalidDataFault);
        }
    }
}
