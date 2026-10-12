package Collections;

import java.util.List;
import java.util.Vector;

public class VectorImpl {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        System.out.println(vec.capacity());
        vec.add(0);
        for (int i = 1; i < 11; i++) {
            vec.add(1);
        }
        System.out.println(vec.size());
        System.out.println(vec.capacity());
    }
}
