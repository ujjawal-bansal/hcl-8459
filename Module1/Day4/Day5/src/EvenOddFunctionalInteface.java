interface OddOrEven{
    boolean OddOrEven(int n);

}

public class EvenOddFunctionalInteface {
    public static void main(String[] args) {
        OddOrEven n1= n-> n%2==0;
        System.out.println(n1.OddOrEven(5));

        OddOrEven n2= n-> n%2!=0;
        System.out.println(n2.OddOrEven(4));
    }
}
