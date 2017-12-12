package im.adu.learn.designpattern.structural.adapter;

public class Main {

    public static void main(String[] args) {
        Target target;
        // normal request
        target = new Target();
        target.request();
        // specific request
        target = new Adapter();
        target.request();
    }
}
