import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your operator : ");
        String operation = input.next();
        System.out.print("Enter your second number : ");
        int num2 = input.nextInt();
        int result = switch (operation){
            case "+" -> num1 + num2;
            case "-" -> num1 + num2;
            case "*" -> num1 + num2;
            case "/" -> num1 + num2;
            default -> -1;
        };
        System.out.println("Your operation of answer is : " + result);
    }
}
