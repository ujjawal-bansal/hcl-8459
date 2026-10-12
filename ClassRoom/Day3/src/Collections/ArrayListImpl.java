package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListImpl {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list);

        List<Integer> add = List.of(2,3,4,5);
        list.addAll(add);
        System.out.println(list);

        System.out.println(list.size());

        list.addFirst(6);
        System.out.println(list);

        list.addLast(7);
        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            int num = it.next();
            System.out.println(num);
            if (num == 3){
                it.remove();
            }
        }

        System.out.println(list.contains(7));

        list.clear();
    }
}
