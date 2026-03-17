import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Set <Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your String : ");
        String userString = input.next();
        for (char ch : userString.toCharArray()){
            unique.add(ch);
        }
        System.out.println("Uniqe Characters in your String :" + unique.size());
    }
}
