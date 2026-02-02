import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your Second number : ");
        int num2 = input.nextInt();
        int greaterNumber = num1 > num2  ? num1 : num2;
        System.out.println("Your Greater Number is " +  greaterNumber);
    }
}
