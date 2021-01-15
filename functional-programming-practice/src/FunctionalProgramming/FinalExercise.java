package FunctionalProgramming;

/*
Given a .csv file containing employees (name, email and salary).
read their data. Then, show in alphabetical order the email of
employees whose salary are superior to a certain value provided
by the user. Also show the sum of the salaries of employees whose
names starts with the letter 'M'
*/

import FunctionalProgramming.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FinalExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String path = "./resources/finalExerciseEmployees.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> employees = br.lines() //Gets a stream with all lines
                    .map(line -> line.split(",")) //Splits each line by comma
                    .map(employee -> new Employee(employee[0], employee[1], Double.parseDouble(employee[2]))) //Each String[] turns into a new instance of Employee
                    .collect(Collectors.toList()); //Return as a list

            employees.forEach(System.out::println);

            Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter salary: ");
            double salary = sc.nextDouble();

            System.out.println("\nEmail of people whose salary is more than " + salary + " (sorted alphabetically):");

            List<String> emails = employees.stream() //Gets a stream with all the employees
                    .filter(e -> e.getSalary() > salary) //Filters those whose salary is greater than variable "salary"
                    .map(e -> e.getEmail()) //Maps their email addresses
                    .sorted(Comparator.comparing(String::toUpperCase)) //Sorts with an inline comparator
                    .collect(Collectors.toList()); //Returns as a list

            emails.forEach(System.out::println);

            double sum = employees.stream() //Gets a stream with all the employees
                    .filter(e -> e.getName().startsWith("M")) //Filters those whose name starts with the letter "M"
                    .map(eSalary -> eSalary.getSalary()) //Maps their salaries
                    .reduce(0.0, (x,y) -> x+y); //Sums all the salaries in the map

            System.out.println("\nSum of salary of people whose name starts with 'M': " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
