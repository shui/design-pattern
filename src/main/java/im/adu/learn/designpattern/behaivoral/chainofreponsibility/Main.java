package im.adu.learn.designpattern.behaivoral.chainofreponsibility;

public class Main {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setSuccessor(handlerB);
        handlerA.handleRequest(1);
        handlerA.handleRequest(2);
    }
}
