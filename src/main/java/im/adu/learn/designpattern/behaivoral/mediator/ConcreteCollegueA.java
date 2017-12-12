package im.adu.learn.designpattern.behaivoral.mediator;

public class ConcreteCollegueA
        extends Collegue {

    public ConcreteCollegueA(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notifyA(String message) {
        System.out.println("ConcreteCollegueA get a message: " + message);
    }
}
