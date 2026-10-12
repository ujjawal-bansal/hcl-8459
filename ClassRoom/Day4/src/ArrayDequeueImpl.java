import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeueImpl {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

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

        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= 5; i++) {
            q.offer(i);
        }

        System.out.println(q);

        q.poll();

        System.out.println(q);

            System.out.println(q.peek());

        System.out.println(q.isEmpty());

        System.out.println(q.contains(4));

        queue.remove(4);
        System.out.println(q);

    }
}
