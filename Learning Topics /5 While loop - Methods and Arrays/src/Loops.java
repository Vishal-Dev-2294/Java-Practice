import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int num = 1; // initialization
        while (num <= 10) { // condition
            System.out.println(num); // actual work
            num = num + 1; // updating the condition
        }

        int count = 500;
        while (count >= 200) {
            System.out.println(count);
            count -= 1;
        }

        Scanner input = new Scanner(System.in);
        int nums = 1;
        while(nums <= 5){
            System.out.print("Enter Number : ");
            int number = input.nextInt();
            System.out.println(number);
            nums = nums + 1;
        }
    }
}
