import java.util.Scanner;

class DeleteArrayfromJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to array deletion\n");
        int[] myArray = ArrayUtility.inputArray();
        System.out.print("now, enter the number you want delete : ");
        int numToDelete = input.nextInt();
        int[] newArray = delteNumber(myArray , numToDelete);
        System.out.println("Here is your new array");
        ArrayUtility.displayArray(newArray);
    }

    public static int[] delteNumber(int[] myArray , int numToDelete){
       int occ = OccurencesArray.no0fOccurences(myArray , numToDelete);
       if(occ == 0){
          return myArray;
       }
       int newSize = myArray.length - occ;
       int[] newArray = new int[newSize];

       int i = 0 , j = 0;
       while (i < myArray.length){
           if(myArray[i] != numToDelete){
               newArray[j] = myArray[i];
               j++;
           }
        i++;
       }

       return newArray;
    }

}
