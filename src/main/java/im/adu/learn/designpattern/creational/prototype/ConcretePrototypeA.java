package im.adu.learn.designpattern.creational.prototype;

public class ConcretePrototypeA
        extends Prototype {

    public ConcretePrototypeA(Object field) {
        super(field);
    }

    @Override
    public Prototype copy() {
        try {
            return (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't copy");
        }
    }
}
