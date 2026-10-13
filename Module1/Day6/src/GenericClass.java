class Generics<T>{
    T data;

    Generics (T data){
        this.data = data;
    }

    T getData(){
        T a1= data;
        return a1;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Generics<Integer> obj1= new Generics<>(100);
        Generics<String> obj2= new Generics<>("java");

        System.out.println(obj1.getData());
        System.out.println(obj2.getData());
    }
}
