import java.util.Scanner;

class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check even or odd : ");
        int number = input.nextInt();
        String evenOrOdd = number%2 == 0 ? "Even" : "Odd";
        System.out.println("Your number is : " + evenOrOdd);
    }
}
