package im.adu.learn.designpattern.behaivoral.memento;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("start");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("stop");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
