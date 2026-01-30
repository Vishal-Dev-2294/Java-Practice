import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to sum and average ");
        System.out.print("Enter the size of the element : ");
        int arraySize = input.nextInt();
        int[] nums = new int[arraySize];
        int i = 0;
        while(i < arraySize){
            System.out.print("Please enter element no " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
    }
}
