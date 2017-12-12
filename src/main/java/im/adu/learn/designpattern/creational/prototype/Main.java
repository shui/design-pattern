package im.adu.learn.designpattern.creational.prototype;

public class Main {

    public static void main(String[] args) {
        ConcretePrototypeA p1 = new ConcretePrototypeA("p1");
        ConcretePrototypeA p2 = (ConcretePrototypeA) p1.copy();
        System.out.println("copied field: " + p2.getField());
    }
}
