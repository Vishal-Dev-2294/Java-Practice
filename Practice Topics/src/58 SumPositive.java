class SumPositive {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        int sum = 0;
        for (int arr: array){
            if (arr < 0){
                continue;
            } else {
                sum += arr;
            }
        }
        System.out.println("Your sum of array is : " + sum);
    }
}
