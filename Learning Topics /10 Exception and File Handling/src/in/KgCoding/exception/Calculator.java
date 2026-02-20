package in.KgCoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        try{
            int result = first / second;
            System.out.printf("result is %d" , result);
        } catch (ArithmeticException e) {
            System.out.printf("%s , enter valid values " , e.getMessage());
        }
    }
}