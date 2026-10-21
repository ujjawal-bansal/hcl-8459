package com.example.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingleObject first = SingleObject.getInstance();
        SingleObject second = SingleObject.getInstance();

        System.out.println(first == second);
    }
}
