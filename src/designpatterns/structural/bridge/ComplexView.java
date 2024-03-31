package designpatterns.structural.bridge;

public class ComplexView extends IView{
    public ComplexView(IWidget widget) {
        super(widget);
    }
    @Override
    public void displayOnScreen() {
        System.out.println("Displaying Complex View "+ widget.getType());
    }
}
