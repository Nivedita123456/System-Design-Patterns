package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class NonLeafNode implements INode{
    int cost;
    List<INode> listNodes;

    public NonLeafNode(int cost,ArrayList<INode> listNodes){
        this.cost = cost;
        this.listNodes = listNodes;
    }
    @Override
    public int getVal() {
        int value = cost;
        for(INode node : listNodes){
            value+=node.getVal();
        }
        return value;
    }
}
