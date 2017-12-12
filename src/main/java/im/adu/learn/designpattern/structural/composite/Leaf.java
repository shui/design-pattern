package im.adu.learn.designpattern.structural.composite;

public class Leaf
        extends Component {

    public Leaf(String componentName) {
        super(componentName);
    }

    @Override
    public void add(Component component) {
        System.out.println("Leaf node can't add child");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Leaf node can't be removed");
    }

    @Override
    public void show(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("+");
        }
        System.out.println(componentName);
    }
}
