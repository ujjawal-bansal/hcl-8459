public class Employee {
    private final int employeeId;
    private final String name;
    private final double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", name='" + name + '\''
                + ", salary=" + salary + '}';
    }
}
