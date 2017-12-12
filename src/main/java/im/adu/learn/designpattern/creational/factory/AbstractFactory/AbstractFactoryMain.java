package im.adu.learn.designpattern.creational.factory.AbstractFactory;

import im.adu.learn.designpattern.creational.factory.AbstractBread;
import im.adu.learn.designpattern.creational.factory.SimpleFactory.AbstractPizza;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        IFactory factory;
        System.out.println("Need black bread");
        factory = new BlackBreadFactory();
        AbstractBread breadMaker = factory.getBreadMaker();
        breadMaker.getBread();
        System.out.println("Need black pizza");
        AbstractPizza pizzaMaker = factory.getPizzaMaker();
        pizzaMaker.getPizza();
    }
}
