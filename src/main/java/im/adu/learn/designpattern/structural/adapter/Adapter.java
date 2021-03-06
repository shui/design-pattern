package im.adu.learn.designpattern.structural.adapter;

public class Adapter
        extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
