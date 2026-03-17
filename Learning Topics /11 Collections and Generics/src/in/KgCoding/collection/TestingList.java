package in.KgCoding.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("vishal");
        strList.add("roshan");
        strList.add(1, "kushwaha");
        strList.remove(2);

        if (strList.contains("vishal")){
            System.out.println("vishal is exist");
        }

//        for (int i = 0; i < strList.size(); i++) {
//            System.out.print(strList.get(i) );
//        }
        for (String str: strList){
            System.out.println(str);
        }


//        System.out.println(strList.get(0));
    }
}
