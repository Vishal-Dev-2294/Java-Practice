import java.util.Scanner;

class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string to be checked : ");
        String str = input.next();
        System.out.println("Your String is " +
                ((isPalindrome(str) ? "palindrome"
                                    : "not palindrome" )));
    }

    public static boolean isPalindrome(String str){
        if (str.length() <= 1){
            return true;
        }
        int lastPosition = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPosition)){
            return false;
        }
        String newStr = str.substring(1 , lastPosition);
        return isPalindrome(newStr);
    }
}
