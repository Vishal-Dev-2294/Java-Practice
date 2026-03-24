package in.Vishal.challenge114;

import java.util.List;
import java.util.stream.Collectors;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employee = List.of(
                new Employee("Vishal" , 100000),
                new Employee("Shail" , 50000),
                new Employee("Abhinav" , 80000),
                new Employee("Biku" , 120000),
                new Employee("Papa" , 50000)
        );

        employee.stream()
                .sorted((emp1 , emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
        }
}
