package im.adu.learn.designpattern.behaivoral.interpreter;

public class TerminalExpression
        extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println(context.getInput());
        System.out.println("Terminal Expression");
    }
}
