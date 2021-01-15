package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        //Creating stream from an existing list
        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));

        //Creating stream with Stream.of method
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        //Iteration stream (infinite)
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        //Printing part of infinite stream with limit() method
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //Fibonacci sequence
        Stream<Long> st4 = Stream
                .iterate(new Long[]{0L, 1L}, p -> new Long[]{ p[1], p[0] + p[1] })
                .map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

        /*
         * PIPELINES
         */

        //Creating stream from an existing list and applying a function to multiply its values by 10
        Stream<Integer> st5 = list.stream().map(x -> x * 10);

        //Sum of all values from list
        int sum = list.stream().reduce(0, (x,y) -> x + y);
        System.out.println("Sum = "+ sum);

        //3-step pipeline (two operations + list conversion)
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0) //even numbers only
                .map(x -> x * 10) // multiply by 10
                .collect(Collectors.toList()); //parse as a list
        System.out.println(newList);
    }

}
