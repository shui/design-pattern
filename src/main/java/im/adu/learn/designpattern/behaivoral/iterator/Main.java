package im.adu.learn.designpattern.behaivoral.iterator;

public class Main {

    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        for (int i = 0; i < 10; i++) {
            concreteAggregate.setItems(i, "Object " + i);
        }
        Iterator iterator = new ConcreteIterator(concreteAggregate);
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem() + ": now");
            iterator.next();
        }
    }
}
