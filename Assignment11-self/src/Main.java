import client.score.DeleteScoreInterface;
import client.score.GetScoreInterface;
import client.score.ScoreService;
import client.score.UpdateScoreInterface;
import client.handler.AddMessageIdHandler;
import client.handler.PersistMessageHandler;
import tester.DeleteScoreTester;
import tester.GetScoreTester;
import tester.UpdateScoreTester;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    private static final ScoreService scoreService = new ScoreService();

    @WebServiceRef(ScoreService.class)
    private static GetScoreInterface getScoreInterface;

    @WebServiceRef(ScoreService.class)
    private static UpdateScoreInterface updateScoreInterface;

    @WebServiceRef(ScoreService.class)
    private static DeleteScoreInterface deleteScoreInterface;

    public static void main(String[] args) {
        scoreService.setHandlerResolver(new RequestHandlerResolver());

        System.out.println(">>>>>开始测试查询成绩");
        testGetScore();
        System.out.println(">>>>>开始测试变更成绩");
        testUpdateScore();
        System.out.println(">>>>>开始测试删除成绩");
        testDeleteScore();
    }

    public static void testGetScore() {
        GetScoreInterface _getScoreInterface = getScoreInterface;
        if (testInterfaceNull(_getScoreInterface)) {
            _getScoreInterface = scoreService.getGetScoreServicePort();
        }
        Map<String, Object> reqCtxt = ((BindingProvider) _getScoreInterface).getRequestContext();
        reqCtxt.put(PersistMessageHandler.PERSISTENCE_DIR_PROP, "D:\\soa");
        reqCtxt.put(AddMessageIdHandler.MSGID_PROP, "msgGet");
        new GetScoreTester().runTests(_getScoreInterface);
    }

    public static void testUpdateScore() {
        UpdateScoreInterface _updateScoreInterface = updateScoreInterface;
        if (testInterfaceNull(_updateScoreInterface)) {
            _updateScoreInterface = scoreService.getUpdateScoreServicePort();
        }
        Map<String, Object> reqCtxt = ((BindingProvider) _updateScoreInterface).getRequestContext();
        reqCtxt.put(PersistMessageHandler.PERSISTENCE_DIR_PROP, "D:\\soa");
        reqCtxt.put(AddMessageIdHandler.MSGID_PROP, "msgUpdate");
        new UpdateScoreTester().runTests(_updateScoreInterface);
    }

    public static void testDeleteScore() {
        DeleteScoreInterface _deleteScoreInterface = deleteScoreInterface;
        if (testInterfaceNull(_deleteScoreInterface)) {
            _deleteScoreInterface = scoreService.getDeleteScoreServicePort();
        }
        Map<String, Object> reqCtxt = ((BindingProvider) _deleteScoreInterface).getRequestContext();
        reqCtxt.put(PersistMessageHandler.PERSISTENCE_DIR_PROP, "D:\\soa");
        reqCtxt.put(AddMessageIdHandler.MSGID_PROP, "msgDelete");
        new DeleteScoreTester().runTests(_deleteScoreInterface);
    }

    private static boolean testInterfaceNull(Object port) {
        System.out.println(port == null ? "Running in standalone mode." : "Running inside the Application Client Container.");
        System.out.println();
        return port == null;
    }

    private static class RequestHandlerResolver implements HandlerResolver {

        public List<Handler> getHandlerChain(PortInfo arg0) {
            List<Handler> handlerChain = new ArrayList<>();
            handlerChain.add(new AddMessageIdHandler());
            handlerChain.add(new PersistMessageHandler());
            return handlerChain;
        }
    }
}
