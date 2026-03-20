package in.Vishal.challenge109;

import java.util.List;

public class OddNumbersUsingList {
    public static void main(String[] args) {
        List<Integer> odd = List.of(1,2,3,4,5,6,7,8,9,10,11,12);

        odd.stream()
                .filter(num -> num % 2 != 0)
                .forEach(num -> System.out.println(num));
    }
}
