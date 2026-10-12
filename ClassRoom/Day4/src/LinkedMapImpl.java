import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapImpl {
    public static void main(String[] args) {
        String[] names = new String[]{"Sujit", "Sumit", "Sam", "Lee", "Harry", "Champak", "Ravi"};

        Map<Integer, String> map = new LinkedHashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(i, names[i]);
        }

        map.forEach((id, name) -> System.out.println(id + " : " + name));
    }
}
