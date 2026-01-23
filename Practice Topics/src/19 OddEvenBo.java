import java.util.Scanner;

class OddEvenBo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int number = input.nextInt();
        if ((number & 1) == 0){
            System.out.println("Your Number is Odd : " + number);
        } else {
            System.out.println("Your Number is Even : " + number);
        }
    }
}
