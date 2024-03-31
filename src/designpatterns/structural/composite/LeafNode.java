package designpatterns.structural.composite;

public class LeafNode implements INode{
    int cost;
    public LeafNode(int cost){
        this.cost = cost;
    }
    @Override
    public int getVal() {
        return cost;
    }
}
