package com.abes.library;

import com.abes.library.model.*;
import com.abes.library.repository.LibraryRepository;
import com.abes.library.service.LibraryService;
import com.abes.library.exception.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final LibraryRepository repository = new LibraryRepository();
    private static final LibraryService service = new LibraryService(repository);

    public static void main(String[] args) {
        addSampleData();

        boolean running = true;

        while (running) {
            printMenu();
            String choice = readText("Choice");

            try {
                switch (choice) {
                    case "1":
                        addBook();
                        break;
                    case "2":
                        addMagazine();
                        break;
                    case "3":
                        addDVD();
                        break;
                    case "4":
                        addMember();
                        break;
                    case "5":
                        showItems();
                        break;
                    case "6":
                        borrowItem();
                        break;
                    case "7":
                        returnItem();
                        break;
                    case "8":
                        search();
                        break;
                    case "9":
                        showMembers();
                        break;
                    case "10":
                        exportReport();
                        break;
                    case "11":
                        showSorted();
                        break;
                    case "0":
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (LibraryException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Goodbye");
    }

    private static void printMenu() {
        System.out.println("\nLIBRARY MANAGEMENT SYSTEM");
        System.out.println("1. Add Book");
        System.out.println("2. Add Magazine");
        System.out.println("3. Add DVD");
        System.out.println("4. Register Member");
        System.out.println("5. List Items");
        System.out.println("6. Borrow Item");
        System.out.println("7. Return Item");
        System.out.println("8. Search Items");
        System.out.println("9. List Members");
        System.out.println("10. Export Report");
        System.out.println("11. Sort Items by Year");
        System.out.println("0. Exit");
    }

    private static void addBook() {
        String title = readText("Title");
        int year = readInt("Year");
        String author = readText("Author");
        String isbn = readText("ISBN");

        Book book = new Book(title, year, author, isbn);
        repository.addItem(book);

        System.out.println("Added: " + book);
    }

    private static void addMagazine() {
        String title = readText("Title");
        int year = readInt("Year");
        int issue = readInt("Issue number");

        Magazine magazine = new Magazine(title, year, issue);
        repository.addItem(magazine);

        System.out.println("Added: " + magazine);
    }

    private static void addDVD() {
        String title = readText("Title");
        int year = readInt("Year");
        int duration = readInt("Duration in minutes");

        DVD dvd = new DVD(title, year, duration);
        repository.addItem(dvd);

        System.out.println("Added: " + dvd);
    }

    private static void addMember() {
        String id = readText("Member ID");
        String name = readText("Name");
        String email = readText("Email");

        Member member = new Member(id, name, email);
        repository.addMember(member);

        System.out.println("Member registered");
    }

    private static void showItems() {
        if (repository.getItems().isEmpty()) {
            System.out.println("No items found");
            return;
        }

        for (LibraryItem item : repository.getItems()) {
            System.out.println(item);
        }
    }

    private static void borrowItem() throws LibraryException {
        String memberId = readText("Member ID");
        String itemId = readText("Item ID");

        service.borrow(memberId, itemId);

        System.out.println("Item borrowed successfully. Standard borrowing period: 14 days");
    }

    private static void returnItem() throws LibraryException {
        String memberId = readText("Member ID");
        String itemId = readText("Item ID");
        LocalDate borrowed = readDate("Borrow date (yyyy-mm-dd)");
        LocalDate returned = readDate("Return date (yyyy-mm-dd)");

        double fee = service.returnItem(memberId, itemId, borrowed, returned);

        System.out.printf(Locale.ROOT, "Item returned. Late fee: %.2f%n", fee);
    }

    private static void search() {
        String searchText = readText("Search title, author, or item ID");
        List<LibraryItem> found = repository.search(searchText);

        if (found.isEmpty()) {
            System.out.println("No matching items");
            return;
        }

        for (LibraryItem item : found) {
            System.out.println(item);
        }
    }

    private static void showMembers() {
        if (repository.getMembers().isEmpty()) {
            System.out.println("No members found");
            return;
        }

        for (Member member : repository.getMembers()) {
            System.out.println(member);
        }
    }

    private static void exportReport() throws LibraryException {
        String name = readText("Report file name (press Enter for library-report.txt)");

        if (name.isEmpty()) {
            name = "library-report.txt";
        }

        service.exportReport(name);

        System.out.println("Report exported to " + name);
    }

    private static void showSorted() {
        for (LibraryItem item : service.sortedByYear()) {
            System.out.println(item);
        }
    }

    private static String readText(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine().trim();
    }

    private static int readInt(String message) {
        while (true) {
            try {
                return Integer.parseInt(readText(message));
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static LocalDate readDate(String message) {
        while (true) {
            try {
                return LocalDate.parse(readText(message));
            } catch (RuntimeException e) {
                System.out.println("Please enter the date in yyyy-mm-dd format.");
            }
        }
    }

    private static void addSampleData() {
        repository.addItem(new Book("The Alchemist", 1988, "Paulo Coelho", "9780061122415"));
        repository.addItem(new Magazine("Science Monthly", 2022, 8));
        repository.addItem(new DVD("Java Basics", 2021, 90));

        repository.addMember(new Member("M101", "Aman Sharma", "aman@example.com"));
        repository.addMember(new Member("M102", "Priya Singh", "priya@example.com"));
    }
}
