import java.util.Scanner;

class numberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myNumber = 69;
        int number;
        do {
            System.out.print("Enter Your Number : ");
            number = input.nextInt();
            if (number != myNumber){
                System.out.println("You enter a wrong number please try again");
            }
        } while (myNumber != number);
        System.out.println("Congratulation You Enter a correct number : " + myNumber);
    }
}
