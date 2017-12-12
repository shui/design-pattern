package im.adu.learn.designpattern.structural.decorator;

public class ConcreteDecoratorA
        extends Decorator {

    private String addState;

    @Override
    public void operation() {
        super.operation();
        addState = "new stateName";
        System.out.println("This class has a " + addState);
    }
}
