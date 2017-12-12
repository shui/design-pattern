package im.adu.learn.designpattern.structural.flyweight;

public class UnsharedConcreteFlyweight
        extends Flyweight {

    @Override
    public void operation(int i) {
        System.out.println("Unshared concrete flyweight: " + i);
    }
}
