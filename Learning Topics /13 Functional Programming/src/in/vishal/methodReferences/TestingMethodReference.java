package in.vishal.methodReferences;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodReference {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7);

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println); // :: isiko ko ham bolte hai ham method reference

        int newSum2 = numbers.stream()
                .reduce(0, (a,b) -> a+b);
        System.out.printf("Sum using reduce + lambda is %d\n" , newSum2);

    }
}
