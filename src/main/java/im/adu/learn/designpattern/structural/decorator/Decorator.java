package im.adu.learn.designpattern.structural.decorator;

public class Decorator
        extends Component {

    // 仅供本类调用的Component对象
    protected Component component;

    // 此处应用里氏代换原则，可以传入ConcreteComponent
    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
