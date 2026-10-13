
import java.util.ArrayList;

public class StreamsJava {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(15);
        l1.add(20);
        l1.add(25);
        l1.add(30);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Aman");
        l2.add("Rahul");
        l2.add("Ankit");
        l2.add("Rohit");

        l1.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));

        l2.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(s -> System.out.println(s));

        ArrayList<Integer> l3 = l1.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(java.util.stream.Collectors.toCollection(ArrayList::new));
        System.out.println(l1);
        System.out.println(l3);
    }
}