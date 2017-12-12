package im.adu.learn.designpattern.behaivoral.mediator;

public class ConcreteCollegueB
        extends Collegue {

    public ConcreteCollegueB(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notifyB(String message) {
        System.out.println("ConcreteCollegueB get a message: " + message);
    }
}
