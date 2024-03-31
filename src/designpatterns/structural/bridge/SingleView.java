package designpatterns.structural.bridge;

public class SingleView extends IView{
    public SingleView(IWidget widget) {
        super(widget);
    }

    @Override
    public void displayOnScreen() {
        System.out.println("Displaying Single View " + widget.getType());
    }
}
