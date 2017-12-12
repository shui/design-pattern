package im.adu.learn.designpattern.behaivoral.observer;

public class ConcreteObserver
        extends Observer {

    private String observername;
    private String state;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(String observername, ConcreteSubject concreteSubject) {
        this.observername = observername;
        this.concreteSubject = concreteSubject;
    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void updated() {
        state = concreteSubject.getState();
        System.out.println(observername + " observer state is : " + state);
    }
}
