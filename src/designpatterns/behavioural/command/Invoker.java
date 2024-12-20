package designpatterns.behavioural.command;

public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command = command;
    }
    public void invoke(){
        command.execute();
    }

}
