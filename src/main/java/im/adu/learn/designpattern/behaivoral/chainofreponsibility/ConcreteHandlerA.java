package im.adu.learn.designpattern.behaivoral.chainofreponsibility;

public class ConcreteHandlerA
        extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request == 1) {
            System.out.println(this.getClass().getCanonicalName() + "处理了请求: " + request);
        } else {
            System.out.println(this.getClass().getCanonicalName() + "无法满足请求，转入下一个处理者");
            this.successor.handleRequest(request);
        }
    }
}
