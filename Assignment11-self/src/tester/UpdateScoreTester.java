package tester;

import client.InvalidDataFault;
import client.score.UpdateScoreInterface;
import entity.成绩性质类型;
import entity.成绩类型;
import entity.课程成绩列表类型;
import entity.课程成绩类型;

import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPFaultException;

import static tester.FaultUtil.handleInvalidDataFault;
import static tester.FaultUtil.handleSOAPFault;

public class UpdateScoreTester {
    public void runTests(UpdateScoreInterface updateScoreInterface) {
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

        System.out.println("测试正常更新成绩" + separator);
        runTestCase(updateScoreInterface, scoreForm);

        System.out.println("测试正常添加成绩" + separator);
        scoreForm.get课程成绩().get(0).set成绩性质(成绩性质类型.作业成绩);
        scoreForm.get课程成绩().get(0).get成绩().get(0).set得分(77);
        runTestCase(updateScoreInterface, scoreForm);

        System.out.println("测试添加不合法的成绩" + separator);
        scoreForm.get课程成绩().get(0).get成绩().get(0).set得分(777);
        runTestCase(updateScoreInterface, scoreForm);

        System.out.println("测试为未选的课程变更成绩" + separator);
        scoreForm.get课程成绩().get(0).get成绩().get(0).set得分(50);
        scoreForm.get课程成绩().get(0).set课程编号("00000000");
        runTestCase(updateScoreInterface, scoreForm);

        System.out.println("测试为不存在的学生变更成绩" + separator);
        scoreForm.get课程成绩().get(0).set课程编号("11111111");
        scoreForm.get课程成绩().get(0).set成绩性质(成绩性质类型.期中成绩);
        scoreForm.get课程成绩().get(0).get成绩().get(0).set学号("181250558");
        runTestCase(updateScoreInterface, scoreForm);

        System.out.println("测试输入不合法的课程编号" + separator);
        scoreForm.get课程成绩().get(0).get成绩().get(0).set学号("171250558");
        scoreForm.get课程成绩().get(0).set课程编号("777");
        runTestCase(updateScoreInterface, scoreForm);
    }

    private void runTestCase(UpdateScoreInterface updateScoreInterface, 课程成绩列表类型 scoreForm) {
        try {
            Holder<课程成绩列表类型> scoreHolder = new Holder<>(scoreForm);
            updateScoreInterface.opUpdateScore(scoreHolder);
            scoreHolder.value.get课程成绩().forEach(course -> {
                System.out.format("课程编号：%s，成绩性质：%s\n", course.get课程编号(), course.get成绩性质().value());
                course.get成绩().forEach(score -> System.out.format("\t学号：%s，成绩：%s\n", score.get学号(), score.get得分()));
            });
        } catch (SOAPFaultException soapFaultException) {
            handleSOAPFault(soapFaultException);
        } catch (InvalidDataFault invalidDataFault) {
            handleInvalidDataFault(invalidDataFault);
        }
    }
}
