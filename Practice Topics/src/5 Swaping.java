import java.util.Scanner;

class Swaping {
     public static void main(String[] args) {
         Scanner Input = new Scanner(System.in);
         System.out.print("Enter Your First Number: ");
         int num1 = Input.nextInt();
         System.out.print("Enter Your Second Number: ");
         int num2 = Input.nextInt();
         int num3;
         num3 = num1;
         num1 = num2;
         num2 = num3;
         System.out.println("After Swaping the Number is" + "\n" + "Num1 = " + num1 + "\t" + "Num2 = " + num2 );

         int a = 2;
         int b = 3;
         int c;
         c = a;
         a = b;
         b = c;
         System.out.println("a = " + a + "\t" + "b = " + b);
     }
}
