import java.util.Scanner;

class PrimeOrNotForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number To Check Prime or Not : ");
        int number = input.nextInt();
        boolean isPrime = isPrimeorNot(number);
        if (isPrime){
            System.out.println("Your Number is Prime: ");
        }else {
            System.out.println("Your Number Not is Prime: ");
        }
    }
    public static boolean isPrimeorNot(int number){
        for (int i = 2; i <= number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
