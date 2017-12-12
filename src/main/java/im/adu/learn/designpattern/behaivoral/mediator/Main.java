package im.adu.learn.designpattern.behaivoral.mediator;

public class Main {

    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteCollegueA concreteCollegueA = new ConcreteCollegueA(concreteMediator);
        ConcreteCollegueB concreteCollegueB = new ConcreteCollegueB(concreteMediator);
        concreteMediator.setConcreteCollegueA(concreteCollegueA);
        concreteMediator.setConcreteCollegueB(concreteCollegueB);

        concreteCollegueA.send("I'm A");
        concreteCollegueB.send("I'm B");
    }
}
