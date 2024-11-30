package designpatterns.behavioural.chainresponsibility;

public class ErrorLoggingLevel extends LoggingLevel{
    String loggingVal = "ERROR";

    public ErrorLoggingLevel(LoggingLevel nextLoggingLevel) {
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
