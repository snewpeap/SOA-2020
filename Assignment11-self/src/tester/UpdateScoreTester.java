package tester;

import client.InvalidDataFault;
import client.score.UpdateScoreInterface;
import entity.�ɼ���������;
import entity.�ɼ�����;
import entity.�γ̳ɼ��б�����;
import entity.�γ̳ɼ�����;

import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPFaultException;

import static tester.FaultUtil.handleInvalidDataFault;
import static tester.FaultUtil.handleSOAPFault;

public class UpdateScoreTester {
    public void runTests(UpdateScoreInterface updateScoreInterface) {
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

        System.out.println("�����������³ɼ�" + separator);
        runTestCase(updateScoreInterface, scoreForm);

        System.out.println("����������ӳɼ�" + separator);
        scoreForm.get�γ̳ɼ�().get(0).set�ɼ�����(�ɼ���������.��ҵ�ɼ�);
        scoreForm.get�γ̳ɼ�().get(0).get�ɼ�().get(0).set�÷�(77);
        runTestCase(updateScoreInterface, scoreForm);

        System.out.println("������Ӳ��Ϸ��ĳɼ�" + separator);
        scoreForm.get�γ̳ɼ�().get(0).get�ɼ�().get(0).set�÷�(777);
        runTestCase(updateScoreInterface, scoreForm);

        System.out.println("����Ϊδѡ�Ŀγ̱���ɼ�" + separator);
        scoreForm.get�γ̳ɼ�().get(0).get�ɼ�().get(0).set�÷�(50);
        scoreForm.get�γ̳ɼ�().get(0).set�γ̱��("00000000");
        runTestCase(updateScoreInterface, scoreForm);

        System.out.println("����Ϊ�����ڵ�ѧ������ɼ�" + separator);
        scoreForm.get�γ̳ɼ�().get(0).set�γ̱��("11111111");
        scoreForm.get�γ̳ɼ�().get(0).set�ɼ�����(�ɼ���������.���гɼ�);
        scoreForm.get�γ̳ɼ�().get(0).get�ɼ�().get(0).setѧ��("181250558");
        runTestCase(updateScoreInterface, scoreForm);

        System.out.println("�������벻�Ϸ��Ŀγ̱��" + separator);
        scoreForm.get�γ̳ɼ�().get(0).get�ɼ�().get(0).setѧ��("171250558");
        scoreForm.get�γ̳ɼ�().get(0).set�γ̱��("777");
        runTestCase(updateScoreInterface, scoreForm);
    }

    private void runTestCase(UpdateScoreInterface updateScoreInterface, �γ̳ɼ��б����� scoreForm) {
        try {
            Holder<�γ̳ɼ��б�����> scoreHolder = new Holder<>(scoreForm);
            updateScoreInterface.opUpdateScore(scoreHolder);
            scoreHolder.value.get�γ̳ɼ�().forEach(course -> {
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
