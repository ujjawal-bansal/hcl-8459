import java.util.*;

public class QueueImpl {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            queue.offer(i);
        }

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());

        System.out.println(queue.contains(4));

        queue.remove(4);
        System.out.println(queue);

    }
}
