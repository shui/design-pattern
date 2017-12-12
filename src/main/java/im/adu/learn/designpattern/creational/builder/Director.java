package im.adu.learn.designpattern.creational.builder;

public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
