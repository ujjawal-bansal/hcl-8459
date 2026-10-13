import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;

public class ExceptionHandling {

    // Custom Exception
    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    // throws and throw
    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be greater than zero"
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance"
            );
        }

        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + (balance - amount));
    }

    // Exception propagation
    static void method1() {
        method2();
    }

    static void method2() {
        method3();
    }

    static void method3() {
        int result = 10 / 0;
    }

    public static void main(String[] args) {

        // 1. Try-with-resources
        System.out.println("=== Try-with-resources ===");

        try (BufferedReader br =
                     new BufferedReader(
                             new StringReader("Hello Java")
                     )) {

            System.out.println(br.readLine());

        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());

        } finally {
            System.out.println("Resource handling completed");
        }

        // 2. Multiple catch blocks and finally
        System.out.println("\n=== Multiple Catch ===");

        try {
            int[] arr = {10, 20, 30};
            int result = 10 / 0;

            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");

        } catch (Exception e) {
            System.out.println("General Exception");

        } finally {
            System.out.println("Finally block executed");
        }

        // 3. Custom exception, throw and throws
        System.out.println("\n=== Custom Exception ===");

        try {
            withdraw(1000, 1500);

        } catch (InsufficientBalanceException e) {
            System.out.println("Bank Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input: " + e.getMessage());
        }

        // 4. Nested try-catch
        System.out.println("\n=== Nested Try ===");

        try {
            System.out.println("Outer try started");

            try {
                int result = 10 / 0;

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero");
            }

            int[] arr = {1, 2};
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Invalid array index");
        }

        // 5. Exception propagation
        System.out.println("\n=== Exception Propagation ===");

        try {
            method1();

        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main");
        }

        // 6. Multi-catch
        System.out.println("\n=== Multi-catch ===");

        try {
            int number = Integer.parseInt("abc");
            System.out.println(100 / number);

        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Invalid numeric operation");
        }

        System.out.println("\nProgram ended");
    }
}