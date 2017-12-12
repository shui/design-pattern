package im.adu.learn.designpattern.behaivoral.state;

public class ConcreteStateB
        extends State {

    public ConcreteStateB() {
        stateName = "ConcreteState B";
    }

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
