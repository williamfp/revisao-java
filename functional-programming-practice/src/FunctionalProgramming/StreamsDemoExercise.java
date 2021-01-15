package FunctionalProgramming;

/*
Given a set of 1+ products from a .csv file, print the average price
and the names in descending order of products whose prices are lower
than the average price
*/

import FunctionalProgramming.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamsDemoExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String path = "./resources/streamsDemoProducts.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            list.forEach(System.out::println);
            System.out.println("-----------");

            //Average price
            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x+y) / list.size();
            System.out.println("Average price: "+ String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
