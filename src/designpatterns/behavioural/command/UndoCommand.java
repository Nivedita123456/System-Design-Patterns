package designpatterns.behavioural.command;

public class UndoCommand implements Command{
    private Reciever reciever;
    public UndoCommand(Reciever reciever){
        this.reciever = reciever;
    }
    @Override
    public void execute(){
        reciever.undo();
    }

}