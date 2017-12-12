package im.adu.learn.designpattern.creational.factory.FactoryMethod;

import im.adu.learn.designpattern.creational.factory.AbstractBread;
import im.adu.learn.designpattern.creational.factory.FrenchBread;

public class FrenchBreadFactory implements IFactory {

    @Override
    public AbstractBread getBackerMaker() {
        return new FrenchBread();
    }
}
