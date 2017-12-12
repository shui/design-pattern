package im.adu.learn.designpattern.creational.factory.AbstractFactory;

import im.adu.learn.designpattern.BlackPizza;
import im.adu.learn.designpattern.creational.factory.AbstractBread;
import im.adu.learn.designpattern.creational.factory.BlackBread;
import im.adu.learn.designpattern.creational.factory.SimpleFactory.AbstractPizza;

public class BlackBreadFactory
        implements IFactory {

    @Override
    public AbstractBread getBreadMaker() {
        return new BlackBread();
    }

    @Override
    public AbstractPizza getPizzaMaker() {
        return new BlackPizza();
    }
}
