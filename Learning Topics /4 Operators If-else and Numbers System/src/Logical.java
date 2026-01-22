import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wellcome to the discount calculator \n");
        System.out.print("Enter Your Age : ");
        int age = input.nextInt();
        System.out.println("you are a female? (true/false) : ");
        boolean isFemale = input.nextBoolean();
        if(age < 5){
            System.out.println("You have a 75% discount");
        } else if (isFemale) {
            System.out.println("You got a 50% discount");
        } else if (age > 60 && !isFemale) {
            System.out.println("You got a 25% discount");
        } else {
            System.out.println("You dont have a discount");
        }
    }
}
