public class ifElse {
    public static void main(String[] args) {
        boolean isMan = true;
        if (isMan) {
            System.out.println("hey, Vishal");
        } else {
            System.out.println("hey , dohi no 1");
        }

        boolean isAdult = false;
        boolean isChild = true;

        if (isAdult) {
            System.out.println("hey Adult");
        } else if (isChild) {
            System.out.println("hey Child");
        } else {
            System.out.println("hey bhudde");
        }
    }
}