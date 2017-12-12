package im.adu.learn.designpattern.structural.bridge;

public class Main {

    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplemetorA());
        abstraction.doOperation();
    }
}
