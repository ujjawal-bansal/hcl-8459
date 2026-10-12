import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefinedFunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven= n-> n%2==0;
        System.out.println(isEven.test(10));

        Function<Integer, Integer> square= n-> n*n;
        System.out.println(square.apply(5));

        Supplier<Integer> msg= ()-> (int) (Math.random()*100);
        System.out.println(msg.get());

        Consumer<String> print= s-> System.out.println(s);
        print.accept("learning functional interfaces");
    }
}
