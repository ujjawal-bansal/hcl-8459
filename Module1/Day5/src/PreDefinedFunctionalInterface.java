import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefinedFunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Function<Integer, Integer> square = number -> number * number;
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 100);
        Consumer<String> print = System.out::println;

        System.out.println(isEven.test(10));
        System.out.println(square.apply(5));
        System.out.println(randomNumber.get());
        print.accept("learning functional interfaces");
    }
}
