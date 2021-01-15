package FunctionalProgramming.util;

import FunctionalProgramming.entities.Product;

import java.util.function.Consumer;

//Implemented as part of Solution #1
public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
