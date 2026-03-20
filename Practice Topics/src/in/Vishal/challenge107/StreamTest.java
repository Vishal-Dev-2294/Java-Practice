package in.Vishal.challenge107;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> str = List.of("Vishal" , "Roshan", "dohi" , "papa");

        str.stream()
                .forEach(name -> System.out.println(name));
    }
}
