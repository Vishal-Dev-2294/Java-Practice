import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the element : ");
        int arraySize = input.nextInt();
        int[] nums = new int[arraySize];
        int i = 0;
        while(i < arraySize){
            System.out.print("Please enter element no " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
}
