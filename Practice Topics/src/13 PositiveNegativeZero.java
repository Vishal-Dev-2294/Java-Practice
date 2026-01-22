import java.util.Scanner;

class  PositiveNegativeZero  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int number = input.nextInt();
        if(number == 0){
            System.out.println("Your Number is zero ");
        } else if(number >= 1){
            System.out.println("Your Number is positive");
        } else if (number < 0) {
            System.out.println("Your Number is Negative");
        } else {
            System.out.println("you enter nothing");
        }
    }
}
