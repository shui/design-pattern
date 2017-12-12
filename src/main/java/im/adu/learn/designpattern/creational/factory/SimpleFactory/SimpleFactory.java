package im.adu.learn.designpattern.creational.factory.SimpleFactory;

import im.adu.learn.designpattern.creational.factory.AbstractBread;
import im.adu.learn.designpattern.creational.factory.BlackBread;
import im.adu.learn.designpattern.creational.factory.FrenchBread;

/**
 * Created on 2017/9/4@21
 * By: shui
 * Blog: adu.im
 * Email: im.adushui@gmail.com
 */
public class SimpleFactory {

    public static AbstractBread getBacker(String bread) {
        AbstractBread baker = null;
        switch (bread) {
            case "Black bread":
                baker = new BlackBread();
                break;
            case "French bread":
                baker = new FrenchBread();
                break;
            default:
                throw new RuntimeException("Not support: " + bread);
        }
        return baker;
    }

    public static void main(String[] args) {
        AbstractBread bread;
        System.out.println("Need black bread");
        bread = SimpleFactory.getBacker("Black bread");
        bread.getBread();
        System.out.println("Need French bread");
        bread = SimpleFactory.getBacker("French bread");
        bread.getBread();
    }
}