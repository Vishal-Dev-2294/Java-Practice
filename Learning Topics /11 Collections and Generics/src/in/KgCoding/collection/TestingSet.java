package in.KgCoding.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Vishal"));
        System.out.println(names.add("Prasant"));
        System.out.println(names.add("Roshan"));
        System.out.println(names.add("Vishal"));

        System.out.println(names.size());
        System.out.println(names.contains("Roshan"));
        System.out.println(names.remove("Prasant"));
        System.out.println(names.size());
        Utility.print(names);

    }
}
