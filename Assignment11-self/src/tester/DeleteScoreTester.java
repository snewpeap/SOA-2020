package tester;

import client.score.DeleteScoreInterface;
import client.InvalidDataFault;
import entity.成绩性质类型;
import entity.成绩类型;
import entity.课程成绩列表类型;
import entity.课程成绩类型;

import javax.xml.ws.soap.SOAPFaultException;

import static tester.FaultUtil.handleInvalidDataFault;
import static tester.FaultUtil.handleSOAPFault;

public class DeleteScoreTester {
    public void runTests(DeleteScoreInterface deleteScoreInterface) {
        final String separator = "====================";

        课程成绩列表类型 scoreForm = new 课程成绩列表类型();
        课程成绩类型 courseScore = new 课程成绩类型();
        courseScore.set成绩性质(成绩性质类型.期中成绩);
        courseScore.set课程编号("11111111");
        成绩类型 score = new 成绩类型();
        score.set学号("171250558");
        score.set得分(100);
        courseScore.get成绩().add(score);
        scoreForm.get课程成绩().add(courseScore);

        System.out.println("测试正常删除成绩" + separator);
        runTestCase(deleteScoreInterface, scoreForm);

        System.out.println("测试删除不存在的性质的成绩" + separator);
        scoreForm.get课程成绩().get(0).set成绩性质(成绩性质类型.平时成绩);
        scoreForm.get课程成绩().get(0).get成绩().get(0).set得分(77);
        runTestCase(deleteScoreInterface, scoreForm);

        System.out.println("测试为未选的课程删除成绩" + separator);
        scoreForm.get课程成绩().get(0).set成绩性质(成绩性质类型.期中成绩);
        scoreForm.get课程成绩().get(0).set课程编号("00000000");
        runTestCase(deleteScoreInterface, scoreForm);

        System.out.println("测试为不存在的学生删除成绩" + separator);
        scoreForm.get课程成绩().get(0).set课程编号("11111111");
        scoreForm.get课程成绩().get(0).set成绩性质(成绩性质类型.期中成绩);
        scoreForm.get课程成绩().get(0).get成绩().get(0).set学号("181250558");
        runTestCase(deleteScoreInterface, scoreForm);

        System.out.println("测试输入不合法的课程编号" + separator);
        scoreForm.get课程成绩().get(0).get成绩().get(0).set学号("171250558");
        scoreForm.get课程成绩().get(0).set课程编号("777");
        runTestCase(deleteScoreInterface, scoreForm);
    }

    private void runTestCase(DeleteScoreInterface deleteScoreInterface, 课程成绩列表类型 scoreForm) {
        try {
            System.out.println("删除分数结果：" + deleteScoreInterface.opDeleteScore(scoreForm));
        } catch (SOAPFaultException soapFaultException) {
            handleSOAPFault(soapFaultException);
        } catch (InvalidDataFault invalidDataFault) {
            handleInvalidDataFault(invalidDataFault);
        }
    }
}
