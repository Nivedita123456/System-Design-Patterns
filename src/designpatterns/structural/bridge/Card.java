package designpatterns.structural.bridge;

public class Card implements IWidget{
    @Override
    public String getType() {
        return "Card";
    }
}
