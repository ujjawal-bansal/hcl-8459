sealed class Department permits AIML, CSE {
    void display() {
        System.out.println("Department");
    }
}

// Cannot be inherited further
final class AIML extends Department {
}

// Inheritance restriction removed
non-sealed class CSE extends Department {
}

// Allowed because CSE is non-sealed
class CSEStudent extends CSE {
}

public class SealedClass {
    public static void main(String[] args) {
        AIML aiml = new AIML();
        aiml.display();

        CSEStudent student = new CSEStudent();
        student.display();
    }
}