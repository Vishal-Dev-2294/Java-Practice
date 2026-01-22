import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = Input.nextLine();
        System.out.print("Enter your Age : ");
        int age = Input.nextInt();
        if(age >= 18){
            System.out.println(name + " You are eligible for license");
        } else {
            System.out.println(name + " You are not eligible for license");
        }
    }
}
