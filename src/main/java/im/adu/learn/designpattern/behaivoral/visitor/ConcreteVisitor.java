package im.adu.learn.designpattern.behaivoral.visitor;

public class ConcreteVisitor
        extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getCanonicalName() + " 被 " + this.getClass()
                                                                                        .getCanonicalName() + "访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getCanonicalName() + " 被 " + this.getClass()
                                                                                        .getCanonicalName() + "访问");
    }
}
