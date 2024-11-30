package designpatterns.behavioural.observer;

public class Observer {
    String mail;
    int itemId;

    public Observer(String mail, int itemId) {
        this.mail = mail;
        this.itemId = itemId;
    }

    void notifyObserver(){
        System.out.println(itemId+ "Update Stock"+ mail);

    }
}
