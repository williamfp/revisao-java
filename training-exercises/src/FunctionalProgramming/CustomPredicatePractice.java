package FunctionalProgramming;

import FunctionalProgramming.Services.ProductService;
import FunctionalProgramming.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class CustomPredicatePractice {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        ProductService ps = new ProductService();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(System.out::println);
        System.out.println("-----------");

        double sum = ps.filteredSum(list, (p -> p.getName().charAt(0) == 'T'));

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
