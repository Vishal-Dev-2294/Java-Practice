import java.util.Scanner;

class multiplicationTableWithForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number to create Table for you : ");
        int number = input.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println((number + " * " + i) + " = " + number * i);
        }
    }
}
