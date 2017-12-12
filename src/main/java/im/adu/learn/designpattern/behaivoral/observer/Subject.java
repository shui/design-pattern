package im.adu.learn.designpattern.behaivoral.observer;

import java.util.ArrayList;

public abstract class Subject {

    private ArrayList<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void delete(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o :
                observers) {
            o.updated();
        }
    }
}
