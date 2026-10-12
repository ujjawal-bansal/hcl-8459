package Inheritance;

public class A {
    static int instanceCounter;

    public A(){
        instanceCounter++;
    }

    public void a1(){
        System.out.println("a1");
    }

    public void a2(){
        System.out.println("a2");
    }

    public static void a3(){
        System.out.println("a3");
    }

    //when we override static methods on compile time it is called compile time binding or method hiding
}
