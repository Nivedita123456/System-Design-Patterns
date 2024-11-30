package designpatterns.behavioural.command;

public class TypeCommand implements Command{
    private Reciever reciever;
    public TypeCommand(Reciever reciever){
        this.reciever = reciever;
    }
    @Override
    public void execute(){
        reciever.typing();
    }

}
