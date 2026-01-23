import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int tableNumber = input.nextInt();
        multiplicationTable(tableNumber);
    }
    public static void multiplicationTable(int num) {
        int i = 1;
        while(i <= 10) {
            System.out.println(num * i);
            i = i + 1;
        }
    }
}
