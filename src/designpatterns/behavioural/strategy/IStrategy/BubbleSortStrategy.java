package designpatterns.behavioural.strategy.IStrategy;

import java.util.ArrayList;

public class BubbleSortStrategy implements IStrategy{

    @Override
    public void sort(ArrayList<Integer> arrayList) {
        System.out.println("BubbleSort Strategy Sorting");
    }
}
