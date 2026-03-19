package in.Vishal.multithreading.runnable;

public class PrintTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 500; i++) {
            System.out.printf("%d %c " , i , targetChar);
        }

        System.out.printf("\n %s %c completed",Thread.currentThread(),targetChar);
    }

    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
