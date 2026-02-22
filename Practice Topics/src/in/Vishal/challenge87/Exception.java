package in.Vishal.challenge87;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = input.nextInt();
        System.out.print("Enter Second number : ");
        int second = input.nextInt();
        try {
            int result = first / second;
            System.out.println("your answer is : " + result);
        } catch (ArithmeticException e){
            System.out.println("you divided by zero please enter a valid number " + e.getMessage());
        } catch (Throwable e){
            throw e;
        }
    }
}
