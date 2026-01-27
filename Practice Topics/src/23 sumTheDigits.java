import java.util.Scanner;

class sumTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("Your sum of number is : " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
