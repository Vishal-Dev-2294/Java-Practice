import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = {1,23,4,56,7,8,9,6,3,10};
        System.out.println("Wellcome array searching \n");
        System.out.print("Enter the number you want search : ");
        int num = input.nextInt();
        boolean isFound = isFound(myArr , num);
        if(isFound){
            System.out.println("Your Number is found in the array : ");
        } else {
            System.out.println("Your Number is not Found in the array : ");
        }
    }

    public static boolean isFound(int[] arr , int num) {
        int index = 0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
