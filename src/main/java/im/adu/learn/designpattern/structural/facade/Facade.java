package im.adu.learn.designpattern.structural.facade;

public class Facade {

    private SubA subA;
    private SubB subB;

    public Facade(SubA subA, SubB subB) {
        this.subA = subA;
        this.subB = subB;
    }

    public void methodOne() {
        subA.methodA();
        subB.methodB();
    }
}
