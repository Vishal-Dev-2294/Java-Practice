import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int num1 = Input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int num2 = Input.nextInt();
        System.out.println(num1+num2); //Addition
        System.out.println(num1-num2); // Substraction
        System.out.println(num1*num2); // Multiplication
        System.out.println(num1/num2); // Divison
        System.out.println(num1%num2); // Modulo
    }
}
