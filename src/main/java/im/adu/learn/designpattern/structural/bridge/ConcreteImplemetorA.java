package im.adu.learn.designpattern.structural.bridge;

public class ConcreteImplemetorA
        extends Implementor {

    @Override
    public void doOperation() {
        System.out.println("The concrete operation of A");
    }
}
