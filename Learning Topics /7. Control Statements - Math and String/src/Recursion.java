import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        long fac = factorial(num);
        System.out.println("Your factorail is : " + fac);
    }

    public static long factorial(int num) {
        System.out.println("Function call for : " + num);
        if (num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static long factorialItreative(int num){
        long factorial = 1;
        for (int i=1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }
}
