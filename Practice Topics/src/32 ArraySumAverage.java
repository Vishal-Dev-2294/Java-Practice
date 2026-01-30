class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Wellcome to sum and average ");
        int[] numArray = ArrayUtility.inputArray();
        long sum = SumOfArray(numArray);
        System.out.println("Your Sum of Array is : " + sum);
        long average = AverageOfArray(sum , numArray);
        System.out.println("Your Average of Array is : " + average);
    }

    public static long SumOfArray(int[] array) {
        int i = 0;
        int sum = 0;
        while (i < array.length){
            sum += array[i];
            i++;
        }
        return sum;
    }

    public static long AverageOfArray(long sum , int[] numArray) {
       long average = sum / numArray.length;
       return average;
    }
}
