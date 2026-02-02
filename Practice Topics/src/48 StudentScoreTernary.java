import java.util.Scanner;

class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your marks: ");
        int marks = input.nextInt();
        String categorize = marks > 80 ?  "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your Category based on your marks is : " + categorize);
    }
}
