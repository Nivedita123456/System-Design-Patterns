package designpatterns.behavioural.strategy.IStrategy;

import java.util.ArrayList;

public class MergeSortStrategy implements IStrategy{

    @Override
    public void sort(ArrayList<Integer> arrayList) {
        System.out.println("MergeSort Strategy Sorting");
    }
}