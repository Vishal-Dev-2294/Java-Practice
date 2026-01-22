import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int odd = input.nextInt();
        if (odd%2 == 0){
            System.out.println("Your Number is odd");
        } else {
            System.out.print("Your Number is even");
        }
    }
}
