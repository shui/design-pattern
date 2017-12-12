package im.adu.learn.designpattern.behaivoral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setInput("ChAR");

        List<AbstractExpression> expressions = new ArrayList<>();
        expressions.add(new TerminalExpression());
        expressions.add(new NonterminalExpression());
        expressions.add(new TerminalExpression());
        for (AbstractExpression e :
                expressions) {
            e.interpret(context);
        }
    }
}
