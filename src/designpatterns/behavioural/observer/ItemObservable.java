package designpatterns.behavioural.observer;


import java.util.List;

public class ItemObservable implements IObservable {
    List<Observer> observerList;
    public ItemObservable(List<Observer> observerList){
        this.observerList = observerList;
    }
    private void notifyObservers(int itemId){
        for(Observer observer: observerList){
            if(observer.itemId == itemId){
                observer.notifyObserver();
            }

        }
    }
    public void reStock(List<Item> items){

        List<Item> databaseList = Database.getInstance().getItems();
        for(Item item : items){
            databaseList.get(item.getItemId()).addQuantity(item.qty);
            notifyObservers(item.getItemId());
        }
    }
}
