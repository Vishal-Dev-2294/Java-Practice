public class Parameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(2,3));
    }

    public static int sumTwoNumbers(int num1 , int num2) {
        System.out.println("First Number : " + num1);
        System.out.println("Second Number : " + num2);
        int sum = num1 + num2;
        return sum;
    }
}
