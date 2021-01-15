package FunctionalProgramming;

import FunctionalProgramming.entities.Product;
import FunctionalProgramming.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(System.out::println);
        System.out.println("-----------");

        //Solution #1 (Consumer class implementation)
        //list.forEach(new PriceUpdate());

        //Solution #2 (Method reference static)
        //list.forEach(Product::staticPriceUpdate);

        //Solution #3 (Method reference non static)
        //list.forEach(Product::nonStaticPriceUpdate);

        //Solution #4 (Lambda expression declared)
        //double factor = 1.1;
        //Consumer<Product> cons = p -> {
        //    p.setPrice(p.getPrice() * factor);
        //};
        //list.forEach(cons);

        //Solution #5 (Inline lambda expression)
        //double factor = 1.1;
        //list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(System.out::println);
        System.out.println("-----------");
    }
}
