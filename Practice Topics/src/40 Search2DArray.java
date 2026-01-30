import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to 2D Search \n");
        int[][] myArray = ArrayUtility.input2DArray();
        System.out.print("Now enter the number you want to search : ");
        int num = input.nextInt();
        boolean isFound = search(myArray , num);
        if (isFound){
            System.out.println("Your Number is found in the array : ");
        } else {
            System.out.println("Your Number is not found in the array : ");
        }
    }

    public static boolean search(int[][] myArray , int num){
        int i = 0;
        while(i < myArray.length){
             int j = 0;
             while (j < myArray[i].length){
                 if (myArray[i][j] == num){
                     return true;
                 }
                 j++;
             }
            i++;
        }
        return false;
    }
}