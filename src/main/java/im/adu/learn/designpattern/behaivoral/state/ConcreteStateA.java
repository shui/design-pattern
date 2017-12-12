package im.adu.learn.designpattern.behaivoral.state;

public class ConcreteStateA
        extends State {

    public ConcreteStateA() {
        stateName = "ConcreteState A";
    }

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
