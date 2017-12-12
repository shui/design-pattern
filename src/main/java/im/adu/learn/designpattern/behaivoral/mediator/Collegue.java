package im.adu.learn.designpattern.behaivoral.mediator;

public abstract class Collegue {

    protected Mediator mediator;

    public Collegue(Mediator mediator) {
        this.mediator = mediator;
    }
}
