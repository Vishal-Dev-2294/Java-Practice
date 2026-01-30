class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Wellcome to palindrome checker\n");
        int[] myArray = ArrayUtility.inputArray();
        boolean ispalin = isPalindrome(myArray);
        if(ispalin){
            System.out.println("Your array is palindrome ");
        } else {
            System.out.println("Your array is not palindrome ");
        }
    }

    public static boolean isPalindrome(int[] myArray) {
        int i = 0;
        while(i < myArray.length){
            if (myArray[i] != myArray[(myArray.length -1) - i]){
                return false;
            }
            i++;
            return true;
        }
      return true;
    }
}
