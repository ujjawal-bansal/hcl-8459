package Exercise;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeAnalytics {

    // Record automatically provides constructor, getters (accessors),
    // equals(), hashCode() and toString()
    record Employee(
            int id,
            String name,
            String dept,
            BigDecimal salary,
            LocalDate hireDate,
            Set<String> skills
    ) {}

    // Helper method to create employees easily
    static Employee e(int id, String name, String dept,
                      int salary, String date, String... skills) {

        return new Employee(
                id,
                name,
                dept,
                BigDecimal.valueOf(salary),
                LocalDate.parse(date),
                Set.of(skills)
        );
    }

    public static void main(String[] args) {

        List<Employee> emps = List.of(
                e(1, "Asha", "Engineering", 90000,
                        "2019-03-01", "Java", "SQL"),
                e(2, "Ravi", "Engineering", 120000,
                        "2016-07-15", "Java", "Spring", "AWS"),
                e(3, "Meera", "HR", 60000,
                        "2020-01-10", "Recruiting"),
                e(4, "John", "Sales", 70000,
                        "2018-11-20", "Negotiation", "CRM"),
                e(5, "Priya", "Engineering", 105000,
                        "2021-05-05", "Java", "React"),
                e(6, "Karan", "Sales", 65000,
                        "2022-02-14", "CRM"),
                e(7, "Sara", "HR", 62000,
                        "2017-09-09", "Recruiting", "Payroll"),
                e(8, "Vikram", "Finance", 80000,
                        "2015-04-30", "Excel", "SQL")
        );

        // Q1: Engineering employees sorted by salary (highest first)
        List<String> q1 = emps.stream()
                .filter(emp -> emp.dept().equals("Engineering"))
                .sorted((a, b) -> b.salary().compareTo(a.salary()))
                .map(Employee::name)
                .toList();

        System.out.println("Q1: " + q1);

        // Q2: Names of the top 3 earners overall
        List<String> q2 = emps.stream()
                .sorted((a, b) -> b.salary().compareTo(a.salary()))
                .limit(3)
                .map(Employee::name)
                .toList();

        System.out.println("Q2: " + q2);

        // Q3: Employees hired before 1 January 2018,
        // sorted from oldest hire to newest
        List<String> q3 = emps.stream()
                .filter(emp -> emp.hireDate()
                        .isBefore(LocalDate.of(2018, 1, 1)))
                .sorted((a, b) ->
                        a.hireDate().compareTo(b.hireDate()))
                .map(emp -> emp.name() + " ("
                        + emp.hireDate().getYear() + ")")
                .toList();

        System.out.println("Q3: " + q3);

        // Q4: Join all employee names into one string
        String q4 = emps.stream()
                .map(Employee::name)
                .collect(Collectors.joining(", "));

        System.out.println("Q4: " + q4);
    }
}

/**
 * package Day7.src.Exercise;
 *
 * import java.math.BigDecimal;
 * import java.time.LocalDate;
 * import java.util.Comparator;
 * import java.util.List;
 * import java.util.Set;
 * import java.util.stream.Collectors;
 *
 * public class EmployeeAnalytics {
 *     record Employee(int id, String name, String dept, BigDecimal salary,
 *                     LocalDate hireDate, Set<String> skills){}
 *
 *     static Employee e(int id, String n, String d, int sal, String date, String... skills){
 *         return new Employee(id, n, d, BigDecimal.valueOf(sal),
 *                 LocalDate.parse(date), Set.of(skills));
 *     }
 *
 *     public static void main(String[] args) {
 *         List<Employee> emps = List.of(
 *                 e(1, "Asha",   "Engineering",  90000, "2019-03-01", "Java", "SQL"),
 *                 e(2, "Ravi",   "Engineering", 120000, "2016-07-15", "Java", "Spring", "AWS"),
 *                 e(3, "Meera",  "HR",           60000, "2020-01-10", "Recruiting"),
 *                 e(4, "John",   "Sales",        70000, "2018-11-20", "Negotiation", "CRM"),
 *                 e(5, "Priya",  "Engineering", 105000, "2021-05-05", "Java", "React"),
 *                 e(6, "Karan",  "Sales",        65000, "2022-02-14", "CRM"),
 *                 e(7, "Sara",   "HR",           62000, "2017-09-09", "Recruiting", "Payroll"),
 *                 e(8, "Vikram", "Finance",      80000, "2015-04-30", "Excel", "SQL")
 *         );
 *
 * //        ------------------------Solution of Q1---------------------------------
 * //         emps.stream()
 * //                 .filter(e -> e.dept.equals("Engineering"))
 * //                 .sorted(Comparator.comparing((Employee e) -> e.salary).reversed())
 * //                 .forEach(e -> System.out.println(e.name));
 * //        emps.stream()
 * //                .filter(e -> e.dept.equals("Engineering"))
 * //                .sorted((e1, e2) -> e2.salary.compareTo(e1.salary))
 * //                .forEach(e -> System.out.println(e.name));
 *
 * //        -------------------Solution of Q2------------------------------
 * //        emps.stream()
 * //                .sorted(Comparator.comparing(Employee::salary).reversed())
 * //                .limit(3)
 * //                .forEach(e -> System.out.println(e.name));
 *
 * //      ------------------------Solution of Q3--------------------------------
 * //        emps.stream()
 * //                .filter(e -> e.hireDate.isBefore(LocalDate.of(2018, 1, 1)))
 * //                .sorted(Comparator.comparing(Employee::hireDate))
 * //                .forEach(e -> System.out.println(e.name + " (" + e.hireDate.getYear() + ")"));
 *
 * //      -------------------------Solution Of Q4---------------------------------
 *         String joined = emps.stream()
 *                 .map(Employee::name)
 *                 .collect(Collectors.joining(", "));
 *         System.out.println(joined);
 *
 * //        Solution Of Q5
 *
 *
 *     }
 * }
 */
