import java.util.Scanner;

 class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int firstNum = Input.nextInt();
        System.out.print("Enter your second number: ");
        int secondNum = Input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("your sum is: " + sum);
    }
}
