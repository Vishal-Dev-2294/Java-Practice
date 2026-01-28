import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int reverseNumber = reverseDigit(number);
        System.out.print("Your Reverse Number is : " + reverseNumber);
    }

    public static int reverseDigit(int number) {
         int reverseDigit = 0;
         int reverse = 0;
         while (number > 0){
           reverseDigit = number % 10;
           reverse = (reverse * 10) + reverseDigit;
           number = number / 10;
         }
        return reverse;
    }
}
