package tester;

import client.score.GetScoreInterface;
import client.InvalidDataFault;
import entity.课程成绩列表类型;

import javax.xml.ws.soap.SOAPFaultException;

import static tester.FaultUtil.handleInvalidDataFault;
import static tester.FaultUtil.handleSOAPFault;

public class GetScoreTester {
    public void runTests(GetScoreInterface getScoreInterface) {
        final String separator = "====================";
        System.out.println("测试查询存在的学号的分数" + separator);
        runTestCase(getScoreInterface, "171250001");
        System.out.println("测试查询不存在的学号的分数" + separator);
        runTestCase(getScoreInterface, "181250001");
        System.out.println("测试查询长度大于9的学号" + separator);
        runTestCase(getScoreInterface, "1712500001");
    }

    private void runTestCase(GetScoreInterface getScoreInterface, String studentNumber) {
        try {

            课程成绩列表类型 getScore = getScoreInterface.opGetScore(studentNumber);
            getScore.get课程成绩().forEach(course -> {
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
