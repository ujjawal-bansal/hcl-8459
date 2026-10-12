@java.lang.FunctionalInterface
interface Calculator {
    double calculate(double first, double second);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> a / b;

        System.out.println(add.calculate(3, 5));
        System.out.println(subtract.calculate(5, 3));
        System.out.println(multiply.calculate(5, 3));
        System.out.println(divide.calculate(4, 2));
    }
}
