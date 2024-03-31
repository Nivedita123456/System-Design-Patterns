package designpatterns.structural.bridge;

public abstract class IView {
    IWidget widget;
    public IView(IWidget widget){
        this.widget = widget;
    }
    public abstract void displayOnScreen();
}
