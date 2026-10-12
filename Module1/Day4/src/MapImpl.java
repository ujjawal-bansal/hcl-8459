import java.util.HashMap;
import java.util.Map;

public class MapImpl {
    public static void main(String[] args) {
        String[] names = new String[]{"Sujit", "Sumit", "Sam", "Lee", "Harry", "Champak", "Ravi"};

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(i, names[i]);
        }
        System.out.println(map);

        System.out.println(map.containsKey(3));
        System.out.println(map.get(3));

        map.forEach((id, name) -> System.out.println(id + " : " + name));
    }
}
