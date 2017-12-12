package im.adu.learn.designpattern.behaivoral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate
        extends Aggregate {

    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getSize() {
        return items.size();
    }

    public Object getItem(int i) {
        return items.get(i);
    }

    public void setItems(int i, Object obj) {
        items.add(i, obj);
    }
}
