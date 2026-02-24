package in.KgCoding.varargs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(Sum(2, 3, new int[] {2,3,4,5,6}));
    }

    public static int Sum(int first , int second , int... a){
        int sum = first + second;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

//    public static int Sum(int[] a){
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }

    public static int sum(int a , int b){
        return a + b;
    }
}
