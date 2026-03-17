import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ListReverse {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(list);
        reverseList(list);
        System.out.println(list);
    }
    public static void reverseList (List<Integer> list) {
        Collections.reverse(list);
    }
}
