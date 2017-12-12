package im.adu.learn.designpattern.structural.composite;

public class Main {

    public static void main(String[] args) {
        Composite root = new Composite("Root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite compositeX = new Composite("Node X");
        compositeX.add(new Leaf("Leaf XA"));
        compositeX.add(new Leaf("Leaf XB"));

        Composite compositeY = new Composite("Node Y");
        compositeX.add(new Leaf("Leaf YA"));
        compositeX.add(new Leaf("Leaf YB"));

        compositeX.add(compositeY);
        root.add(compositeX);

        root.show(1);
    }
}
