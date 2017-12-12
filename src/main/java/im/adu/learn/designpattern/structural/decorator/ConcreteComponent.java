package im.adu.learn.designpattern.structural.decorator;

public class ConcreteComponent
        extends Component {

    @Override
    public void operation() {
        System.out.println("Basic operation");
    }
}
