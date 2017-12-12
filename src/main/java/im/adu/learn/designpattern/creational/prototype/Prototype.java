package im.adu.learn.designpattern.creational.prototype;

public abstract class Prototype
        implements Cloneable {

    private Object field;

    public Prototype() {
    }

    public Prototype(Object field) {
        this.field = field;
    }

    public Object getField() {
        return field;
    }

    public abstract Prototype copy();
}
