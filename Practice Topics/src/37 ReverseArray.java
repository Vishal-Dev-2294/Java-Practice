class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Wellcome to array reversal \n");
        int[] myArray = ArrayUtility.inputArray();
        reverse(myArray);
        System.out.println("Your Reverse array is ");
        ArrayUtility.displayArray(myArray);
    }

    public static void reverse(int[] myArray){
        int i = 0;
        while(i < myArray.length / 2){
          int swap = myArray[i];
          myArray[i] = myArray[(myArray.length - 1)  - i];
          myArray[(myArray.length - 1)  - i] = swap;
          i++;
        }
    }
}
