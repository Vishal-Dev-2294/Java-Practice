import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter Your Second Number : ");
        int num2 = input.nextInt();
        System.out.print("Enter Your Third Number : ");
        int num3 = input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1 + "This Number is big");
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2 + "This Number is big");
        } else if (num3>num1 && num3>num2) {
            System.out.println(num3 + "This Number is big");
        }
    }
}
