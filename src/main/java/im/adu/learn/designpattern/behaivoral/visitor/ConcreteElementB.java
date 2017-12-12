package im.adu.learn.designpattern.behaivoral.visitor;

public class ConcreteElementB
        extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB(){
        // do something
    }
}
