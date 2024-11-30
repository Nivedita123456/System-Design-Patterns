package designpatterns.behavioural.command;

public class Reciever {
    public void typing(){
        System.out.println("Typing Command Triggered on Receiver");
    }

    public void undo(){
        System.out.println("Undo Command Triggered on Receiver");
    }
}
