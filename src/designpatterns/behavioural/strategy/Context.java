package designpatterns.behavioural.strategy;

import designpatterns.behavioural.strategy.IStrategy.IStrategy;

import java.util.ArrayList;

public class Context {
    IStrategy strategy;
    ArrayList<Integer> arrayList;
    public Context(IStrategy strategy, ArrayList<Integer> arrayList){
        this.strategy = strategy;
        this.arrayList = arrayList;
    }
    public void sort(){
        this.strategy.sort(arrayList);
    }
}
