package im.adu.learn.designpattern.structural.decorator;

public class Main {

    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA();
        // 对需要被装饰的对象进行包装
        decoratorA.setComponent(component);
        System.out.println("After decorate A:");
        decoratorA.operation();
    }

}
