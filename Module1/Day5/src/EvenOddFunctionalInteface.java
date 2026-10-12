@java.lang.FunctionalInterface
interface OddOrEven {
    boolean check(int number);
}

public class EvenOddFunctionalInteface {
    public static void main(String[] args) {
        OddOrEven isEven = number -> number % 2 == 0;
        OddOrEven isOdd = number -> number % 2 != 0;

        System.out.println("5 is odd: " + isOdd.check(5));
        System.out.println("4 is even: " + isEven.check(4));
    }
}
