package in.Vishal.challenge101;

public class PrintThread extends Thread {
    private final int number;
    @Override
    public void run() {
        System.out.printf("%s Thread Starting-%d\n",
                Thread.currentThread().getName(),
                number);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread Ended-%d\n",
                Thread.currentThread().getName(),
                number);
    }
    public PrintThread(int number){
        this.number = number;
    }
}
