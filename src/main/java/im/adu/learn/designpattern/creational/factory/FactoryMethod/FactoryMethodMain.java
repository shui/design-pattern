package im.adu.learn.designpattern.creational.factory.FactoryMethod;

import im.adu.learn.designpattern.creational.factory.AbstractBread;

public class FactoryMethodMain {

    public static void main(String[] args) {
        AbstractBread bread;
        System.out.println("Need black bread");
        IFactory factory = new BlackBreadFactory();
        bread = factory.getBackerMaker();
        bread.getBread();
        System.out.println("Need French bread");
        factory = new FrenchBreadFactory();
        bread = factory.getBackerMaker();
        bread.getBread();
    }
}