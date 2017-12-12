package im.adu.learn.designpattern.behaivoral.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextOperation() {
        this.strategy.algrithom();
    }
}
