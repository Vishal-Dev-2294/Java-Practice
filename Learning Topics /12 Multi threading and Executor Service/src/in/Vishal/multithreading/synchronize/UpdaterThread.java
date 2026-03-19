package in.Vishal.multithreading.synchronize;

public class UpdaterThread extends Thread{
    private final Counter counter;

    public UpdaterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 500; i++) {
            counter.increment();
        }
    }
}
