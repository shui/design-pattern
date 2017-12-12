package im.adu.learn.designpattern.behaivoral.state;

public abstract class State {

    public String stateName;

    public abstract void handle(Context context);
}
