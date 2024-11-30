package designpatterns.behavioural.chainresponsibility;

public class DebugLoggingLevel extends LoggingLevel{
    String loggingVal = "DEBUG";

    public DebugLoggingLevel(LoggingLevel nextLoggingLevel) {
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
