
package startFromWSDL.ScoreService;

import startFromWSDL.types.ѧ���б�����;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-05T12:26:44.034+08:00
 * Generated source version: 3.3.6
 *
 */

public class UpdateScoreInterface_UpdateScoreServicePort_Server{

    public UpdateScoreInterface_UpdateScoreServicePort_Server(ѧ���б����� studentList) {
        System.out.println("Starting " + getClass().getName());
        Object implementor = new UpdateScoreServicePortImpl(studentList);
        String address = "http://localhost:8080/score/update";
        Endpoint.publish(address, implementor);
    }

}