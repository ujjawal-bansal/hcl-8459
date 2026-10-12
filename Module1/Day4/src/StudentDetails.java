import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int roll_no;
    String name;
    int age;
    double marks;

    public Student(int roll_no, String name, int age, double marks){
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "\n" + "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (this.age == o.age)
                    ? (int) (this.marks - o.marks)
                    : this.age - o.age;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Sumit", 18, 67));
        list.add(new Student(2, "Rahul", 19, 75));
        list.add(new Student(3, "Amit", 20, 82));
        list.add(new Student(4, "Priya", 18, 91));
        list.add(new Student(5, "Neha", 19, 73));
        list.add(new Student(6, "Rohit", 21, 88));
        list.add(new Student(7, "Anjali", 20, 79));
        list.add(new Student(8, "Vikas", 18, 65));
        list.add(new Student(9, "Sneha", 19, 95));
        list.add(new Student(10, "Karan", 21, 84));

        System.out.println(list);

//        list.sort(Comparator.comparingDouble(student -> student.age));
        Collections.sort(list);

        System.out.println(list);

//        list.sort(Comparator.comparingDouble(student -> student.marks));

        System.out.println(list);
    }
}