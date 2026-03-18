package in.KgCoding.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>(); // map hamare HashMap wala element use kar raha hai
        map.put("Vishal" , 21);
        map.put("Roshan" , 26);
        map.put("papa" , 45);
        System.out.println(map.size());
        System.out.println(map.get("Vishal"));
        System.out.println(map.containsKey("Vishal"));
        System.out.println(map.remove("papa"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s %s \n" , key, map.get(key));
        }
    }
}
