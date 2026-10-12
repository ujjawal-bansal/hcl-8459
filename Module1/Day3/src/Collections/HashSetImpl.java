package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetImpl {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("A");
        System.out.println(set);

        set.remove("A");
        System.out.println(set);

        set.size();
        System.out.println(set);

        System.out.println(set.contains("B"));

        System.out.println(set.hashCode());

        set.clear();
        System.out.println(set);
    }
}
