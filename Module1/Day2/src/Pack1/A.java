package Pack1;

public class A {
    public A(){
        System.out.println("This is Constructor of A with no param");
    }

    int a;
    int b;

    public A(int a){
        this.a = a;
        System.out.println("This is Constructor of A with 1 param");
    }

    public A(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("This is Constructor of A with 2 param");
    }
}
