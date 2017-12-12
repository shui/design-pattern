package im.adu.learn.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite
        extends Component {

    private List<Component> childList = new ArrayList<>();

    public Composite(String componentName) {
        super(componentName);
    }

    @Override
    public void add(Component component) {
        childList.add(component);
    }

    @Override
    public void remove(Component component) {
        childList.remove(component);
    }

    @Override
    public void show(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("+");
        }
        System.out.println(componentName);
        for (int i = 0; i < childList.size(); i++) {
            childList.get(i).show(depth + 1);
        }
    }
}
