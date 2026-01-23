import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int i = number;
        int multi = 1;
        while (i >= 1) {
            multi = multi * i;
            i = i - 1;
        }
        System.out.println(multi);
    }
}