package im.adu.learn.designpattern.structural.proxy;

public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("Real request");
    }
}
