package im.adu.learn.designpattern.structural.proxy;

public class Proxy {

    private Subject realSubject;

    public Proxy(Subject subject) {
        this.realSubject = subject;
    }

    public void preRequest() {
        System.out.println("pre request");
    }

    public void request() {
        realSubject.request();
    }

    public void afterRequest() {
        System.out.println("after request");
    }
}
