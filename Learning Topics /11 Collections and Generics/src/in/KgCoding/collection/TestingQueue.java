package in.KgCoding.collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.peek());
        System.out.println(queue.element());

        Utility.print(queue);
    }
}
