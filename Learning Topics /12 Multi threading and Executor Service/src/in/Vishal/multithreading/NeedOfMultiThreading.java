package in.Vishal.multithreading;

public class NeedOfMultiThreading {
    public static void main(String[] args) { // mian thread hai ye

        long startTime = System.currentTimeMillis();

        //First Task
        for (int i = 1; i <= 500; i++) {
            System.out.printf("%d* " , i);
        }

        System.out.println("\n * completed");

        //Second Task
        for (int i = 1; i <= 500; i++) {
            System.out.printf("%d$ " , i);
        }

        System.out.println("\n $ completed");

        //Third Task
        for (int i = 1; i <= 500; i++) {
            System.out.printf("%d* " , i);
        }

        System.out.println("\n # completed");

        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken : %d " , (endTime - startTime) );
    }
}
