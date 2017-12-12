package im.adu.learn.designpattern.behaivoral.iterator;

public class ConcreteIterator
        extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return this.aggregate.getItem(0);
    }

    @Override
    public Object next() {
        Object o = null;
        current++;
        if (current < this.aggregate.getSize()) {
            o = this.aggregate.getItem(current);
        }
        return o;
    }

    @Override
    public boolean isDone() {
        return current >= this.aggregate.getSize();
    }

    @Override
    public Object currentItem() {
        return this.aggregate.getItem(current);
    }
}
