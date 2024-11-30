package designpatterns.behavioural.observer;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Database {
    static Database database;
    private Database(){
    }
    public static Database getInstance(){
        if(database == null){
            database = new Database();
        }
        return database;
    }
    public List<Item> getItems(){
        ArrayList<Item> databaseList = new ArrayList<>();
        databaseList.add(new Bag(1, 0, 20));
        databaseList.add(new Register(2, 0, 20));
        return databaseList;
    }
}
