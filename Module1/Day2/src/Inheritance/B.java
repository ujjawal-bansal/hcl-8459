package Inheritance;

public class B extends A{

    public void b1(){
        System.out.println("b1");
    }

    public void a2(){
       super.a2();
       System.out.println("b2");
    }

    public static void main(String[] args) {
        A a = new A();
//        a.a1();

        B b = new B();
        b.a2();

        System.out.println(instanceCounter);
    }
}
