import java.util.Scanner;

class SumOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int userNum = input.nextInt();
        sumOddNumber(userNum);
    }
    public static void sumOddNumber (int number) {
        int i = 1;
        int sum = 0;
        while (i <= number) {
            if(i%2 != 0) {
                sum += i;
            }
            i = i + 1;
        }
        System.out.println("Sum of all Odd Number Till " + number + " is : " + sum);
    }
}
