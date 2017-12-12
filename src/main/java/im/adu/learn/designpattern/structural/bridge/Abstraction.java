package im.adu.learn.designpattern.structural.bridge;

public class Abstraction {

    private Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void doOperation() {
        implementor.doOperation();
    }
}
