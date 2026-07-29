import java.util.ArrayList;
import java.util.Scanner;

public class LibraryBookManagementSystemUsingArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> bookTitles = new ArrayList<>();
        ArrayList<String> authors = new ArrayList<>();
        ArrayList<Boolean> availability = new ArrayList<>();

        bookTitles.add("Java Programming");
        authors.add("James");
        availability.add(true);

        bookTitles.add("Python Book");
        authors.add("David");
        availability.add(true);

        bookTitles.add("C++ Book");
        authors.add("Ali");
        availability.add(false);

        bookTitles.add("Database Systems");
        authors.add("John");
        availability.add(true);

        bookTitles.add("Web Development");
        authors.add("Sarah");
        availability.add(true);

        bookTitles.add("Cyber Security Basics");
        authors.add("Ahmed");
        availability.add(false);

        bookTitles.add("Data Structures");
        authors.add("Michael");
        availability.add(true);

        bookTitles.add("Artificial Intelligence");
        authors.add("Noura");
        availability.add(true);

        bookTitles.add("Computer Networks");
        authors.add("Omar");
        availability.add(false);

        bookTitles.add("Operating Systems");
        authors.add("Mona");
        availability.add(true);

        System.out.println("Library Books:");

        for (int i = 0; i < bookTitles.size(); i++) {
            System.out.println("Book " + i);
            System.out.println("Title: " + bookTitles.get(i));
            System.out.println("Author: " + authors.get(i));

            if (availability.get(i)) {
                System.out.println("Available: Yes");
            } else {
                System.out.println("Available: No");
            }

            System.out.println();
        }

        System.out.print("Enter Book Title: ");
        String bookTitle = input.nextLine();

        System.out.print("Enter Author: ");
        String author = input.nextLine();

        System.out.print("Available (true/false): ");
        boolean available = input.nextBoolean();

        bookTitles.add(bookTitle);
        authors.add(author);
        availability.add(available);

        System.out.println("Book added successfully.");

        System.out.print("Enter Book Index: ");
        int index = input.nextInt();
        input.nextLine();

        if (index >= 0 && index < bookTitles.size()) {

            System.out.print("New Title: ");
            bookTitles.set(index, input.nextLine());

            System.out.print("New Author: ");
            authors.set(index, input.nextLine());

            System.out.print("Available (true/false): ");
            availability.set(index, input.nextBoolean());

            System.out.println("Book updated successfully.");

        } else {
            System.out.println("Invalid Book Index.");
        }

        input.nextLine();

        System.out.print("Enter Book Title: ");
        String search = input.nextLine();

        if (bookTitles.contains(search)) {

            int position = bookTitles.indexOf(search);

            System.out.println("Book found.");
            System.out.println("Book Index: " + position);
            System.out.println("Author: " + authors.get(position));

            if (availability.get(position)) {
                System.out.println("Available: Yes");
            } else {
                System.out.println("Available: No");
            }

        } else {
            System.out.println("Book not found.");
        }

        input.close();
    }
}