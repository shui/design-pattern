package im.adu.learn.designpattern.structural.flyweight;

public class ConcreteFlyweight
        extends Flyweight {

    @Override
    public void operation(int i) {
        System.out.println("Concrete flyweight: " + i);
    }
}
