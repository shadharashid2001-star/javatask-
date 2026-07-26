import java.util.ArrayList;
import java.util.Scanner;

public class AdvancedCustomeOrderManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> orderIds = new ArrayList<>();
        ArrayList<String> customerNames = new ArrayList<>();
        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<String> orderStatus = new ArrayList<>();

        // -------------------- 15 Orders --------------------
        orderIds.add(1001);
        customerNames.add("Ali");
        productNames.add("Laptop");
        quantities.add(2);
        prices.add(750.0);
        orderStatus.add("Pending");

        orderIds.add(1002);
        customerNames.add("Sara");
        productNames.add("Smartphone");
        quantities.add(1);
        prices.add(500.0);
        orderStatus.add("Completed");

        orderIds.add(1003);
        customerNames.add("Omar");
        productNames.add("Tablet");
        quantities.add(3);
        prices.add(300.0);
        orderStatus.add("Completed");

        orderIds.add(1004);
        customerNames.add("Fatima");
        productNames.add("Headphones");
        quantities.add(2);
        prices.add(120.0);
        orderStatus.add("Pending");

        orderIds.add(1005);
        customerNames.add("Hassan");
        productNames.add("Smartwatch");
        quantities.add(1);
        prices.add(200.0);
        orderStatus.add("Cancelled");

        orderIds.add(1006);
        customerNames.add("Layla");
        productNames.add("Camera");
        quantities.add(1);
        prices.add(450.0);
        orderStatus.add("Completed");

        orderIds.add(1007);
        customerNames.add("Yusuf");
        productNames.add("Printer");
        quantities.add(2);
        prices.add(150.0);
        orderStatus.add("Completed");

        orderIds.add(1008);
        customerNames.add("Aisha");
        productNames.add("Monitor");
        quantities.add(1);
        prices.add(250.0);
        orderStatus.add("Pending");

        orderIds.add(1009);
        customerNames.add("Khalid");
        productNames.add("Keyboard");
        quantities.add(4);
        prices.add(40.0);
        orderStatus.add("Completed");

        orderIds.add(1010);
        customerNames.add("Mona");
        productNames.add("Mouse");
        quantities.add(2);
        prices.add(25.0);
        orderStatus.add("Completed");

        orderIds.add(1011);
        customerNames.add("Salim");
        productNames.add("Router");
        quantities.add(1);
        prices.add(100.0);
        orderStatus.add("Pending");

        orderIds.add(1012);
        customerNames.add("Noor");
        productNames.add("External Hard Drive");
        quantities.add(2);
        prices.add(80.0);
        orderStatus.add("Completed");

        orderIds.add(1013);
        customerNames.add("Zain");
        productNames.add("Gaming Console");
        quantities.add(1);
        prices.add(400.0);
        orderStatus.add("Cancelled");

        orderIds.add(1014);
        customerNames.add("Huda");
        productNames.add("Television");
        quantities.add(1);
        prices.add(600.0);
        orderStatus.add("Pending");

        orderIds.add(1015);
        customerNames.add("Bilal");
        productNames.add("Speaker");
        quantities.add(3);
        prices.add(90.0);
        orderStatus.add("Completed");

        // ---------------- Display Orders ----------------
        System.out.println("===== Orders =====");

        for (int i = 0; i < orderIds.size(); i++) {

            double total = quantities.get(i) * prices.get(i);

            System.out.println("Order Index: " + i);
            System.out.println("Order ID: " + orderIds.get(i));
            System.out.println("Customer: " + customerNames.get(i));
            System.out.println("Product: " + productNames.get(i));
            System.out.println("Quantity: " + quantities.get(i));
            System.out.println("Price: " + prices.get(i));
            System.out.println("Total Price: " + total);
            System.out.println("Status: " + orderStatus.get(i));
            System.out.println("----------------------------");
        }

        // ---------------- Add Order ----------------
        System.out.println("\nAdd New Order");

        System.out.print("Customer Name: ");
        String name = input.nextLine();

        System.out.print("Product Name: ");
        String product = input.nextLine();

        System.out.print("Quantity: ");
        int quantity = input.nextInt();

        while (quantity <= 0) {
            System.out.print("Invalid Quantity. Enter again: ");
            quantity = input.nextInt();
        }

        System.out.print("Price: ");
        double price = input.nextDouble();

        while (price < 0) {
            System.out.print("Invalid Price. Enter again: ");
            price = input.nextDouble();
        }

        input.nextLine();

        System.out.print("Status (Pending/Completed/Cancelled): ");
        String status = input.nextLine();

        while (!(status.equalsIgnoreCase("Pending")
                || status.equalsIgnoreCase("Completed")
                || status.equalsIgnoreCase("Cancelled"))) {

            System.out.print("Invalid Status. Enter again: ");
            status = input.nextLine();
        }

        int newId = orderIds.get(orderIds.size() - 1) + 1;

        orderIds.add(newId);
        customerNames.add(name);
        productNames.add(product);
        quantities.add(quantity);
        prices.add(price);
        orderStatus.add(status);

        System.out.println("Order Added Successfully.");
        System.out.println("Total Orders = " + orderIds.size());

        // ---------------- Statistics ----------------
        double totalSales = 0;
        double highest = quantities.get(0) * prices.get(0);
        double lowest = quantities.get(0) * prices.get(0);

        for (int i = 0; i < orderIds.size(); i++) {

            double total = quantities.get(i) * prices.get(i);

            totalSales += total;

            if (total > highest)
                highest = total;

            if (total < lowest)
                lowest = total;
        }

        double average = totalSales / (double) orderIds.size();

        System.out.println("\n===== Statistics =====");
        System.out.println("Total Orders: " + orderIds.size());
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Order: " + average);
        System.out.println("Highest Order: " + highest);
        System.out.println("Lowest Order: " + lowest);

        // ---------------- Status Analysis ----------------
        int pending = 0;
        int completed = 0;
        int cancelled = 0;

        for (String s : orderStatus) {

            if (s.equalsIgnoreCase("Pending"))
                pending++;
            else if (s.equalsIgnoreCase("Completed"))
                completed++;
            else if (s.equalsIgnoreCase("Cancelled"))
                cancelled++;
        }

        System.out.println("\nPending: " + pending);
        System.out.println("Completed: " + completed);
        System.out.println("Cancelled: " + cancelled);

        // ---------------- Search ----------------
        System.out.print("\nEnter Order ID to Search: ");
        int id = input.nextInt();

        boolean found = false;

        for (int i = 0; i < orderIds.size(); i++) {

            if (orderIds.get(i) == id) {

                double total = quantities.get(i) * prices.get(i);

                System.out.println("Customer: " + customerNames.get(i));
                System.out.println("Product: " + productNames.get(i));
                System.out.println("Total: " + total);
                System.out.println("Status: " + orderStatus.get(i));

                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Order Not Found.");

        // ---------------- Update ----------------
        System.out.print("\nEnter Order Index to Update: ");
        int index = input.nextInt();

        if (index >= 0 && index < orderIds.size()) {

            input.nextLine();

            System.out.print("New Customer: ");
            customerNames.set(index, input.nextLine());

            System.out.print("New Product: ");
            productNames.set(index, input.nextLine());

            System.out.print("New Quantity: ");
            quantities.set(index, input.nextInt());

            System.out.print("New Price: ");
            prices.set(index, input.nextDouble());

            input.nextLine();

            System.out.print("New Status: ");
            orderStatus.set(index, input.nextLine());

            System.out.println("Updated Successfully.");
        } else {
            System.out.println("Invalid Index.");
        }

        // ---------------- Discount ----------------
        System.out.print("\nEnter Order Index for Discount: ");
        int d = input.nextInt();

        if (d >= 0 && d < orderIds.size()) {

            double total = quantities.get(d) * prices.get(d);
            double discount = 0;

            if (total >= 5000)
                discount = total * 0.15;
            else if (total >= 2000)
                discount = total * 0.10;
            else if (total >= 1000)
                discount = total * 0.05;

            double finalPrice = total - discount;

            System.out.println("Original Price: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
        }

        // ---------------- Remove ---------------
        System.out.print("\nEnter Order Index to Remove: ");
        int remove = input.nextInt();

        if (remove >= 0 && remove < orderIds.size()) {

            orderIds.remove(remove);
            customerNames.remove(remove);
            productNames.remove(remove);
            quantities.remove(remove);
            prices.remove(remove);
            orderStatus.remove(remove);

            System.out.println("Order Removed Successfully.");
            System.out.println("Remaining Orders: " + orderIds.size());
        } else {
            System.out.println("Invalid Index.");
        }

        input.close();
    }
}