import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorImpl {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student(1, "Sumit", 18, 67),
                new Student(2, "Rahul", 19, 75),
                new Student(3, "Amit", 20, 82),
                new Student(4, "Priya", 18, 91),
                new Student(5, "Neha", 19, 73)
        ));

        students.sort(Comparator.comparingInt(student -> student.age));
        System.out.println("Sorted by age (Comparator): " + students);

        students.sort(Comparator.naturalOrder());
        System.out.println("Sorted by marks (Comparable): " + students);
    }
}

class Student implements Comparable<Student> {
    final int rollNumber;
    final String name;
    final int age;
    final double marks;

    Student(int rollNumber, String name, int age, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(marks, other.marks);
    }

    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber + ", name='" + name + '\''
                + ", age=" + age + ", marks=" + marks + '}';
    }
}
