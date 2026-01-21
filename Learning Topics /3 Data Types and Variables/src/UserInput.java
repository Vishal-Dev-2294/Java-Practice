import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = userInput.nextLine();
        System.out.println("Good Morning " + name);
        System.out.print(name + " , Also tell me your age: ");
        int age = userInput.nextByte();
        System.out.println(name + " Your Age is " + age);
    }
}
