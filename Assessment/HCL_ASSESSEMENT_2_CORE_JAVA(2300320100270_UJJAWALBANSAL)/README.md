# Library Management System

A beginner-friendly Core Java console application for managing a small library.

The program shows a menu in the terminal and lets the user:
- Add books, magazines, and DVDs
- Register library members
- Borrow and return items
- Calculate late fees
- Search items
- Sort items by year
- Export a simple text report

## Requirements
- JDK 8 or newer
- No external libraries

## Compile
Run this command from the project folder:

```bash
javac -d out src/com/abes/library/Main.java src/com/abes/library/model/*.java src/com/abes/library/exception/*.java src/com/abes/library/repository/*.java src/com/abes/library/service/*.java src/com/abes/library/util/*.java
```

## Run
```bash
java -cp out com.abes.library.Main
```

## Sample Data
The program starts with a few sample records so it is easy to test.

Sample members:
- `M101` - Aman Sharma
- `M102` - Priya Singh

Sample item IDs:
- `1001` - The Alchemist
- `1002` - Science Monthly
- `1003` - Java Basics

## Quick Test Cases
1. Add an item and search for it by ID.
2. Borrow item `1001` using member `M101`.
3. Try borrowing item `1001` again using member `M102`.
4. Return item `1001` and check the late fee.
5. Borrow more than three items for one member.
6. Export a report and check `library-report.txt`.

## Project Structure
- `model` contains classes like `Book`, `Magazine`, `DVD`, and `Member`.
- `repository` stores all items and members in memory.
- `service` contains the main library rules.
- `exception` contains custom exception classes.
- `Main.java` contains the menu and user input code.
