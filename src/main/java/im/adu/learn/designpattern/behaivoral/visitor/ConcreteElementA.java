package im.adu.learn.designpattern.behaivoral.visitor;

public class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA(){
        // do something
    }
}
