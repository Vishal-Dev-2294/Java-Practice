package in.Vishal.Executor;

public class PrintTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d %c " , i , targetChar);
        }

        System.out.printf("\n %s %c completed",Thread.currentThread(),targetChar);
    }

    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
