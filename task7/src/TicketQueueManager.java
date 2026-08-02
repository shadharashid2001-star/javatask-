import java.util.LinkedList;
import java.util.Scanner;

public class TicketQueueManager {
    public static void main(String[] args) {
        //create queue
        LinkedList<String> customern = new LinkedList<>();

        // enter the number of customer using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of customer");
        Integer customernum = input.nextInt();
        input.nextLine();

        // if condition+loop
        if (customernum <= 0) {
            System.out.println("Invalid number of values.");
        } else {
            for (int i = 0; i < customernum; i++) {
                System.out.println("Enter name of customer");
                String customername = input.nextLine();
                customern.offer(customername);
            }
        }
        int choice;

        do {
            System.out.println("\n1.Add Customer");
            System.out.println("2.Serve Customer");
            System.out.println("3.View Next Customer");
            System.out.println("4.Search Customer");
            System.out.println("5.Display All Customers");
            System.out.println("6.Display Queue Statistics");
            System.out.println("7.Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter new name:");
                    String name2 = input.nextLine();
                    customern.offer(name2);
                    System.out.println("Customer added successfully.");
                    break;

                case 2:
                    if (customern.isEmpty()) {
                        System.out.println("No customers in the queue.");
                    } else {
                        String removed = customern.remove();
                        System.out.println("The customer removed: " + removed);
                    }
                    break;

                case 3:
                    String nextCustomer = customern.peek();

                    if (nextCustomer == null) {
                        System.out.println("No customers in the queue.");
                    } else {
                        System.out.println("First customer: " + nextCustomer);
                    }
                    break;

                case 4:
                    System.out.println("Enter customer name:");
                    String searchCustomer = input.nextLine();

                    if (customern.contains(searchCustomer)) {
                        System.out.println("Customer found in the queue.");
                    } else {
                        System.out.println("Customer not found in the queue.");
                    }
                    break;

                case 5:
                    if (customern.isEmpty()) {
                        System.out.println("No customers in the queue.");
                    } else {
                        System.out.println("All customers:");
                        for (String value : customern) {
                            System.out.println(value);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Total number of customers: " + customern.size());

                    if (customern.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("First customer in the queue: " + customern.peek());
                        System.out.println("Last customer in the queue: " + customern.getLast());
                        System.out.println("Queue is not empty.");
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
