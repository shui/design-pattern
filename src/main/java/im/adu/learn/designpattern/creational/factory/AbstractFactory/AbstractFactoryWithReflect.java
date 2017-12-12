package im.adu.learn.designpattern.creational.factory.AbstractFactory;

import im.adu.learn.designpattern.creational.factory.SimpleFactory.AbstractPizza;

import java.lang.reflect.InvocationTargetException;

public class AbstractFactoryWithReflect {

    public static void main(String[] args) {
        IFactory factory;
        AbstractPizza pizzaMaker;
        System.out.println("Need black pizza");
        try {
            Class clazz = Class.forName("im.adu.learn.designpattern.creational.factory.AbstractFactory.BlackBreadFactory");
            try {
                factory = (IFactory) clazz.getDeclaredConstructor().newInstance();
                pizzaMaker = factory.getPizzaMaker();
                pizzaMaker.getPizza();
            } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                System.out.println("Can't get instance");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Can't get bread factory");
        }
    }
}
