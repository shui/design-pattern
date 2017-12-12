package im.adu.learn.designpattern.behaivoral.observer;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(new ConcreteObserver("1号机", concreteSubject));
        concreteSubject.attach(new ConcreteObserver("2号机", concreteSubject));
        concreteSubject.attach(new ConcreteObserver("3号机", concreteSubject));
        concreteSubject.setState("flying");
        concreteSubject.notifyObservers();
    }
}
