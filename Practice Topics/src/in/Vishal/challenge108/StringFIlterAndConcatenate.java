package in.Vishal.challenge108;

import java.util.List;

public class StringFIlterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = List.of("Vishallllllll" , "Rohasan" , "dohiiiiiiiiii",  "papapapapappap");

        String results = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("" , (a,b) -> a + " " + b);
        System.out.println(results);
    }
}
