interface Calculator{
    double calculate(double a, double b);
}

public class FunctionalInterface{
    public static void main(String[] args) {
        Calculator c1= (a,b) -> a+b;
        System.out.println(c1.calculate(3,5));

        Calculator c2= (a,b)-> a-b;
        System.out.println(c2.calculate(5,3));

        Calculator c3= (a,b)-> a*b;
        System.out.println(c3.calculate(5,3));

        Calculator c4= (a,b)-> a/b;
        System.out.println(c2.calculate(4,2));

    }

}

