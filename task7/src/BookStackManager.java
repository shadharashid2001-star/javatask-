import java.util.Scanner;
import java.util.Stack;

public class BookStackManager {
    public static void main(String[] args) {

        //Create a Stack
        Stack<String> Booktitle = new Stack<>();

        // enter the number of books using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of book ");
        Integer bookn = input.nextInt();
        input.nextLine();

        // if condition
        if (bookn <= 0) {
            System.out.println("Invalid number of books.");
        } else {
            for (int i = 0; i < bookn; i++) {
                System.out.println("Enter book title");
                String bookti = input.nextLine();
                Booktitle.push(bookti);
            }
        }

        int choice;

        do {

            System.out.println("\n1.Add Book");
            System.out.println("2.Remove Top Book");
            System.out.println("3.View Top Book");
            System.out.println("4.Search Book");
            System.out.println("5.Display All Books");
            System.out.println("6.Display Stack Statistics");
            System.out.println("7.Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            //Use a switch-case statement to process the user's menu selection.
            switch (choice) {

                case 1:
                    System.out.println("Enter new book title:");
                    String bookt2 = input.nextLine();
                    Booktitle.push(bookt2);
                    System.out.println("Book added successfully");
                    break;

                case 2:
                    if (Booktitle.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        String d = Booktitle.pop();
                        System.out.println("The book removed: " + d);
                    }
                    break;

                case 3:
                    if (Booktitle.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("Top book: " + Booktitle.peek());
                    }
                    break;

                case 4:
                    System.out.println("Enter book title:");
                    String bookt3 = input.nextLine();
                    int b = Booktitle.search(bookt3);

                    if (b != -1) {
                        System.out.println("Book found at position from top: " + b);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.println("All books currently stored in the stack: " + Booktitle);
                    break;

                case 6:
                    int totalb = Booktitle.size();
                    System.out.println("Total books: " + totalb);

                    if (Booktitle.isEmpty()) {
                        System.out.println("Stack empty");
                    } else {
                        System.out.println("Top book: " + Booktitle.peek());
                        System.out.println("Stack not empty");
                    }
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        input.close();
    }
}