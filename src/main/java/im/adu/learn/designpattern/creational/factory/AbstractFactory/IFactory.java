package im.adu.learn.designpattern.creational.factory.AbstractFactory;

import im.adu.learn.designpattern.creational.factory.AbstractBread;
import im.adu.learn.designpattern.creational.factory.SimpleFactory.AbstractPizza;

public interface IFactory {

    AbstractBread getBreadMaker();

    AbstractPizza getPizzaMaker();
}
