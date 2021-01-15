package FunctionalProgramming.Services;

import FunctionalProgramming.entities.Product;

import java.util.List;
import java.util.function.Predicate;

//Implemented as part of solution to use a custom-based function that receives a lambda function as a parameter
public class ProductService {

    public double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;

        for(Product p : list){
            if(criteria.test(p)){
                sum += p.getPrice();
            }
        }

        return sum;
    }
}
