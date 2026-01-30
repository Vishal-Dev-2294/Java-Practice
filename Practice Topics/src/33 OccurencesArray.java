import java.util.Scanner;

 class OccurencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to the array of occrences : ");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Enter element to see how many time the number is occur : ");
        int myNumber = input.nextInt();
        int occurences = occurencesArray(numArray , myNumber);
        System.out.println("Your Number is repeated " + occurences + " times in the array");
    }

    public static int occurencesArray(int[] myArray , int myNumber){
        int i = 0;
        int sum = 0;
        while (i < myArray.length){
            if (myArray[i] == myNumber){
                sum++;
            }
            i++;
        }
        return sum;
    }
}
