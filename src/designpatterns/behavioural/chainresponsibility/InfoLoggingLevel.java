package designpatterns.behavioural.chainresponsibility;

public class InfoLoggingLevel extends LoggingLevel{
    String loggingVal = "INFO";

    public InfoLoggingLevel(LoggingLevel nextLoggingLevel) {
        super(nextLoggingLevel);
    }

    @Override
    public void logging(String level, String message) {
        if(level == loggingVal){
            System.out.println(loggingVal + " " + message);
        }
        super.baseLogging(level, message);
    }
}
