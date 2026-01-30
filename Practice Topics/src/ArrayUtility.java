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

    public static int[][] input2DArray () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Row : ");
        int rows = input.nextInt();
        System.out.print("Enter the size of the Columm : ");
        int columns = input.nextInt();
        int[][] myArray = new int[rows][columns];
        int i = 0;
        while(i < rows){
            int j = 0;
            while (j < columns){
                System.out.print("Please enter element row: " + (i+1)
                        + " column: " + (j+1) + " :");
                myArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return myArray;
    }


    public static void displayArray(int[] myArray){
        int i = 0;
        while(i < myArray.length){
            System.out.print(myArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
