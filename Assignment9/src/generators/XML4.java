package generators;

import elements.CourseScoreList;
import elements.ScoreList;
import utils.Converter;

public class XML4 {
    private static final String FROM_FILE_PATH = "xml/xml3.xml";
    private static final String TO_FILE_PATH = "xml/xml4.xml";
    private static final String XSD_PATH = "schema/ScoreList.xsd";

    public static void create() {
        CourseScoreList result = new CourseScoreList();

        CourseScoreList list = Converter.toObject(CourseScoreList.class, FROM_FILE_PATH);
        for (ScoreList scoreList : list.getScoreList()) {

            boolean exit=false;
            for (ScoreList.Score score : scoreList.getScoreInfo()) {
                if (score.getPoint() < 60) {
                    exit=true;
                }
            }

            if(exit){
                ScoreList sL=new ScoreList();
                for (ScoreList.Score score : scoreList.getScoreInfo()){
                    if(score.getPoint()<60) {
                        sL.setId(scoreList.getId());
                        sL.setScoreAttribute(scoreList.getScoreAttribute());
                        sL.getScoreInfo().add(score);
                    }
                }
                result.getScoreList().add(sL);
            }


        }



        Converter.toXML(CourseScoreList.class, result, TO_FILE_PATH);
        Converter.validate(XSD_PATH, TO_FILE_PATH);
    }
}
