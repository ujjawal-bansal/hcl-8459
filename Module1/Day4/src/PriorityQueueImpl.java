import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImpl {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(10);
        pq.add(5);
        pq.add(1);
        pq.add(20);
        pq.add(8);
        pq.add(5);
        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.size());

        System.out.println(pq.contains(8));

        pq.poll();
        System.out.println(pq);

        pq.add(54);
        System.out.println(pq);

        System.out.println("==================Max Heap==================");

        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        max.add(2);
        max.add(10);
        max.add(5);
        max.add(1);
        max.add(20);
        max.add(8);
        max.add(5);
        System.out.println(max);

        System.out.println(max.peek());

        System.out.println(max.size());

        System.out.println(max.contains(8));

        max.poll();
        System.out.println(max);

        max.add(4);
        System.out.println(max);
    }
}
