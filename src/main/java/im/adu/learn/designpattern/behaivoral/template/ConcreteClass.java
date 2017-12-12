package im.adu.learn.designpattern.behaivoral.template;

public class ConcreteClass
        extends AbstractClass {

    @Override
    public void primitiveOperationA() {
        System.out.println("ConcreteA operationA");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("Concrete operationB");
    }
}
