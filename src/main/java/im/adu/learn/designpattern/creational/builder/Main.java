package im.adu.learn.designpattern.creational.builder;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builderA = new ConcreteBuilderA();

        // 指挥者指挥建造者建造A，多态的应用
        director.construct(builderA);
        Product productA = builderA.getResult();
        productA.show();
    }
}
