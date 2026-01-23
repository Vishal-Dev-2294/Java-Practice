import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
      greetUser();
        int num1 = readingNumber();
        int num2 = readingNumber();
        int sum = num1 + num2;
        System.out.println("Your Sum is : " + sum);
    }

    public static int readingNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        return number;
    }

    public static void greetUser() {
        System.out.println("WellCome to the Calculator \n");
    }
}
