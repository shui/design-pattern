package im.adu.learn.designpattern.creational.factory.FactoryMethod;

import im.adu.learn.designpattern.creational.factory.AbstractBread;

interface IFactory {

    AbstractBread getBackerMaker();
}
