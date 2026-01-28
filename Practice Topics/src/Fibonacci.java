import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        fibonacciSeries(number);
    }

    public static void fibonacciSeries(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");
        int a = 0, b = 1;
        while(a + b <= num){
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
