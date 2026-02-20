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
            int[] a = new int[5];
            System.out.printf("result is %d" , a[6]);
            a[6] = first / second;
            System.out.printf("result is %d" , a[6]);
        } catch (ArithmeticException e) {
            System.out.printf("%s , enter valid values " , e.getMessage());
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf(e.getMessage());
        } catch (Throwable th){
            System.out.println("bhai kuch to galat kiya hai ");
        }
    }
}