package FunctionalProgramming;

import FunctionalProgramming.entities.Product;
import FunctionalProgramming.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionPractice {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        List<String> names = null;

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(System.out::println);
        System.out.println("-----------");

        //Solution #1 (Function class implementation)
        //names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //Solution #2 (Method reference static)
        //names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //Solution #3 (Method reference non static)
        //names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        //Solution #4 (Lambda expression declared)
        //Function<Product, String> func = p -> p.getName().toUpperCase();
        //names = list.stream().map(func).collect(Collectors.toList());

        //Solution #5 (Inline lambda expression)
        //names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
        System.out.println("-----------");
    }
}
