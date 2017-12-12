package im.adu.learn.designpattern.behaivoral.state;

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        System.out.println("Now: " + this.state.stateName);
        this.state = state;
        System.out.println("Change to " + this.state.stateName);
        System.out.println("***********************");
    }

    public void request() {
        state.handle(this);
    }
}
