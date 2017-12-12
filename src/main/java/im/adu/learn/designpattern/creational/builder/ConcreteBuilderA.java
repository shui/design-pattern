package im.adu.learn.designpattern.creational.builder;

public class ConcreteBuilderA
        extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("Part A");
    }

    @Override
    public void buildPartB() {
        product.add("Part B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
