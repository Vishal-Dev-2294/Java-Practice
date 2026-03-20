package in.vishal.lambda;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda test = new TestingLambda();
        int sum = test.sum(2,4);
        test.printString("Tu abhi learn kar raha hai lambda ");

//        toPrint -> System.out.println(toPrint);
//        (a,b) -> a + b; single line of code
//        (a,b) -> {
//        int sum = a+b; System.out.println(sum);
//        } Multiple line of code
    }

    public void printString(String toPrint) {
        System.out.println(toPrint);
    }

    private int sum(int a, int b) {
        int sum = a+b;
        return sum;
    }
}
