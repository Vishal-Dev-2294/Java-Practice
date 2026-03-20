package in.Vishal.future;

import javax.naming.Name;
import java.util.concurrent.*;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        fetchName task1 = new fetchName("Vishal");
        fetchName task2 = new fetchName("Roshan");
        fetchName task3 = new fetchName("Haggu Singh");
        fetchName task4 = new fetchName("khota papa");

        // future apne promise ke jaisa kaam kar raha hai
        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.printf("\nFull Name is %s", name1.get());
        System.out.printf("\nFull Name is %s", name2.get());
        System.out.printf("\nFull Name is %s", name3.get());
        System.out.printf("\nFull Name is %s", name4.get());

        service.shutdown();
    }
}
