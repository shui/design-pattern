package im.adu.learn.designpattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> parts = new ArrayList<>(2);

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("Create product");
        parts.forEach(System.out::println);
    }
}
