package im.adu.learn.designpattern;

import im.adu.learn.designpattern.creational.factory.SimpleFactory.AbstractPizza;

public class BlackPizza
        extends AbstractPizza {

    @Override
    public void getPizza() {
        System.out.println("Black Pizza");
    }
}
