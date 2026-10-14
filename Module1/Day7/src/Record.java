
import java.util.List;

// 1. Record declaration
// Java automatically generates the constructor,
// accessor methods, equals(), hashCode() and toString().
record Student(int id, String name, double marks) {

    // 2. Compact constructor
    // Validation karne ke liye use hota hai.
    Student {
        if (id <= 0) {
            throw new IllegalArgumentException(
                    "ID must be positive"
            );
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Name cannot be empty"
            );
        }

        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                    "Marks must be between 0 and 100"
            );
        }
    }

    // 3. Custom method
    // Record mein normal methods bhi bana sakte hain.
    public boolean hasPassed() {
        return marks >= 40;
    }

    // 4. Static method
    public static String getSchoolName() {
        return "ABC College";
    }
}

public class Record {

    public static void main(String[] args) {

        // 5. Object creation
        // Constructor automatically available hai.
        Student s1 = new Student(101, "Ujjawal", 85.5);
        Student s2 = new Student(102, "Rahul", 35.0);
        Student s3 = new Student(101, "Ujjawal", 85.5);

        // 6. Accessor methods
        // getName() nahi, name() use hota hai.
        System.out.println("ID: " + s1.id());
        System.out.println("Name: " + s1.name());
        System.out.println("Marks: " + s1.marks());

        // 7. Automatically generated toString()
        System.out.println("\nStudent details:");
        System.out.println(s1);

        // 8. Automatically generated equals()
        System.out.println("\nAre s1 and s3 equal? "
                + s1.equals(s3));

        // 9. Automatically generated hashCode()
        System.out.println("Hash code of s1: "
                + s1.hashCode());
        System.out.println("Hash code of s3: "
                + s3.hashCode());

        // 10. Custom instance method
        System.out.println("\nDid s1 pass? "
                + s1.hasPassed());
        System.out.println("Did s2 pass? "
                + s2.hasPassed());

        // 11. Static method
        System.out.println("\nCollege: "
                + Student.getSchoolName());

        // 12. Records with collections
        List<Student> students = List.of(s1, s2);

        System.out.println("\nAll students:");
        for (Student student : students) {
            System.out.println(student.name()
                    + " -> " + student.marks());
        }

        // 13. Validation demonstration
        // Uncomment to test the exception:
        // Student invalid = new Student(0, "", 150);
    }
}

/*

public class StudentRecord {
    record Student(String name, int rollNo, String HCLId, int MobNo){}

    public static void main(String[] args) {
        Student s = new Student("Sumit", 23, "HCLTFP9388", 1234567890);

        System.out.println(s.HCLId);
    }
}
 */
