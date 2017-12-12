package im.adu.learn.designpattern.behaivoral.mediator;

public class ConcreteMediator
        extends Mediator {

    private ConcreteCollegueA concreteCollegueA;
    private ConcreteCollegueB concreteCollegueB;

    public void setConcreteCollegueA(ConcreteCollegueA concreteCollegueA) {
        this.concreteCollegueA = concreteCollegueA;
    }

    public void setConcreteCollegueB(ConcreteCollegueB concreteCollegueB) {
        this.concreteCollegueB = concreteCollegueB;
    }

    @Override
    public void send(String message, Collegue collegue) {
        if (collegue == concreteCollegueA) {
            concreteCollegueB.notifyB(message);
        } else if (collegue == concreteCollegueB) {
            concreteCollegueA.notifyA(message);
        }
    }
}
