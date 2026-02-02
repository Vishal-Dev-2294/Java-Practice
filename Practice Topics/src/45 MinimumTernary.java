import java.util.Scanner;

class MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter a second number : ");
        int num2 = input.nextInt();
        int minimumNumber = num1 < num2 ? num1 : num2;
        System.out.println("Your minimum number is : " + minimumNumber);
    }
}
