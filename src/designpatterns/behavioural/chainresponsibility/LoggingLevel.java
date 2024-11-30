package designpatterns.behavioural.chainresponsibility;

public abstract class LoggingLevel {
    LoggingLevel nextLoggingLevel;
    public LoggingLevel(LoggingLevel nextLoggingLevel){
        this.nextLoggingLevel = nextLoggingLevel;
    }
    public abstract void logging(String level, String message);
     protected void baseLogging(String level, String message){
        if(nextLoggingLevel!= null){
            nextLoggingLevel.logging(level, message);
        }
    }
}
