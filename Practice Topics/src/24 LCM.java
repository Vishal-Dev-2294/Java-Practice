import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int first = input.nextInt();
        System.out.print("Enter Your Number : ");
        int second = input.nextInt();
        int lcm = lcm(first , second);
        System.out.println("Your lcm is : " + lcm);
    }

    public static int lcm(int first , int second) {
        int i = 1;
        while (i <= second){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}
