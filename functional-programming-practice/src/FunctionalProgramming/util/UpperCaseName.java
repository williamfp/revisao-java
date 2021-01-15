package FunctionalProgramming.util;

import FunctionalProgramming.entities.Product;

import java.util.function.Function;

//Implemented as part of Solution #1
public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
