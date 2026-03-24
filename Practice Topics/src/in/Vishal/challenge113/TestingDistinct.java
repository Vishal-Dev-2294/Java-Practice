package in.Vishal.challenge113;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,4,4,5,5,6,7,8,9,10);

        List<Integer> distinctItmes = list.stream()
                .distinct()
                .toList();
        System.out.println(distinctItmes);
    }
}
