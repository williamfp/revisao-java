package FunctionalProgramming;

import FunctionalProgramming.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {
    static void printList(List<?> list){
        for(Object o : list){
            System.out.println(o);
        }
        System.out.println("--------------");
    }

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        printList(list);

        //Solution #1 (Predicate class implementation)
        //list.removeIf(new ProductPredicate());

        //Solution #2 (Method reference static)
        //list.removeIf(Product::staticProductPredicate);

        //Solution #3 (Method reference non static)
        //list.removeIf(Product::nonStaticProductPredicate);

        //Solution #4 (Lambda expression declared)
        //double min = 100.0;
        //Predicate<Product> pred = p -> p.getPrice() >= min;
        //list.removeIf(pred);

        //Solution #5 (Inline lambda expression)
        //double min = 100.0;
        //list.removeIf(p -> p.getPrice() >= min);

        printList(list);
    }
}
