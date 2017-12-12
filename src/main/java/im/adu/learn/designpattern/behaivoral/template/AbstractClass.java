package im.adu.learn.designpattern.behaivoral.template;

public abstract class AbstractClass {

    public abstract void primitiveOperationA();

    public abstract void primitiveOperationB();

    public void templeteMethod() {
        primitiveOperationA();
        primitiveOperationB();
    }
}
