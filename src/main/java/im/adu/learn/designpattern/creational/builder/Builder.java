package im.adu.learn.designpattern.creational.builder;

public abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
