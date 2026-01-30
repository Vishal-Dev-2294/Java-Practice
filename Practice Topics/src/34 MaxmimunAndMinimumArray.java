class MaxmimunAndMinimumArray {
    public static void main(String[] args) {
        System.out.println("Wellcome the maximum and minimum of the array  ");
        int[] myArray = ArrayUtility.inputArray();
        int maximumNoArray = maximumNoArray(myArray);
        System.out.println("Maximum Number in array is : " + maximumNoArray);
        int minimumNoArray = minimumNoArray(myArray);
        System.out.println("Minimum Number in array is : " + minimumNoArray);
    }

    public static int maximumNoArray (int[] myArray) {
        int i = 0;
        int maximum = Integer.MIN_VALUE;
        while(i < myArray.length){
            if(myArray[i] > maximum){
                maximum = myArray[i];
            }
            i++;
        }
        return maximum;
    }

    public static int minimumNoArray (int[] myArray) {
        int minimum = Integer.MAX_VALUE;
        int i = 0;
        while(i < myArray.length){
            if(minimum >  myArray[i]){
                minimum = myArray[i];
            }
            i++;
        }
        return minimum;
    }
}
