package FunctionalProgramming.util;

import FunctionalProgramming.entities.Product;
import java.util.function.Predicate;

//Implemented as part of Solution #1
public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
