class isSortedArray {
    public static void main(String[] args) {
        System.out.println("Wellcome to the sorted array ");
        int[] myArray = ArrayUtility.inputArray();
        boolean isDecreasing = isDecreasing(myArray);
        boolean isIncreasing = isIncreasing(myArray);
        if(isIncreasing || isDecreasing){
            System.out.println("Your array is sorted ");
        } else {
            System.out.println("Your array is not sorted ");
        }
    }

    public static boolean isDecreasing (int[] myArray) {
        int i = 1;
        while(i < myArray.length){
            if (myArray[i] > myArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isIncreasing (int[] myArray) {
        int i = 1;
        while(i < myArray.length){
            if (myArray[i] < myArray[i-1]){
               return false;
            }
            i++;
        }
        return true;
    }
}
