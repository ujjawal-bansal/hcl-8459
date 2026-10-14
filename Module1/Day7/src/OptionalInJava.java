
import java.util.Optional;

public class OptionalInJava {

    // Search student name using ID
    static Optional<String> findStudentName(int id) {

        if (id == 1) {
            return Optional.of("Rahul");
        } else if (id == 2) {
            return Optional.of("Priya");
        }

        return Optional.empty();
    }

    public static void main(String[] args) {

        // 1. Optional.of()
        // Value null nahi honi chahiye
        Optional<String> language = Optional.of("Java");

        System.out.println("Language: " + language);


        // 2. Optional.empty()
        // Empty Optional create karta hai
        Optional<String> emptyValue = Optional.empty();

        System.out.println("Empty value: " + emptyValue);


        // 3. Optional.ofNullable()
        // Null value ko safely handle karta hai
        String city = null;

        Optional<String> cityName = Optional.ofNullable(city);

        System.out.println("City: " + cityName);


        // 4. orElse()
        // Value absent ho toh default value deta hai
        System.out.println(
                "City name: " + cityName.orElse("Unknown")
        );


        // 5. isPresent()
        // Check karta hai ki value present hai ya nahi
        System.out.println(
                "Is language present? " + language.isPresent()
        );

        System.out.println(
                "Is city present? " + cityName.isPresent()
        );


        // 6. ifPresent()
        // Value present ho toh action execute hota hai
        language.ifPresent(value ->
                System.out.println("Learning: " + value)
        );


        // 7. Searching students using Optional
        System.out.println(
                "Student 1: " +
                        findStudentName(1).orElse("Not Found")
        );

        System.out.println(
                "Student 2: " +
                        findStudentName(2).orElse("Not Found")
        );

        System.out.println(
                "Student 3: " +
                        findStudentName(3).orElse("Not Found")
        );


        // 8. orElseThrow()
        // Value absent ho toh exception throw hota hai
        String studentName = findStudentName(1).orElseThrow();

        System.out.println("Found student: " + studentName);
    }
}
