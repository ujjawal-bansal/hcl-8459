import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1, "Rohan", 50000),
                new Employee(2, "Sohan", 13000),
                new Employee(3, "Harry", 30000),
                new Employee(4, "Rahul", 18000),
                new Employee(5, "Sumit", 23000)
        ));

        employees.sort(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Salary ascending: " + employees);

        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println("Salary descending: " + employees);
    }
}
