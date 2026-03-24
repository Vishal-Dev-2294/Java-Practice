package in.Vishal.challenge112;

import java.util.Optional;
import java.util.concurrent.RecursiveTask;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println(toOptional(null));
        System.out.println(toOptional(""));
        System.out.println(toOptional("Baklol dohi number no 1 "));
    }

    public static Optional<String> toOptional(String str){
        if (str == null || str.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}