package in.vishal.filterAndReduce;

import java.util.List;
import java.util.function.Consumer;

public class TestinfFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Mango", "guvava", "pienapple", "apple", "banana");
        System.out.println(fruits.size());
        System.out.println("Printing fruits normally");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Printings fruits using streams");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("Printings fruits using filter");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));
    }
}
