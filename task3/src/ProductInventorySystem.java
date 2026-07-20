import java.util.ArrayList;
import java.util.Scanner;

public class ProductInventorySystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Create lists
        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Double> productPrices = new ArrayList<>();
        ArrayList<Integer> productQuantities = new ArrayList<>();


        // Enter 10 products
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter product name:");
            productNames.add(input.next());

            System.out.println("Enter product price:");
            productPrices.add(input.nextDouble());

            System.out.println("Enter product quantity:");
            productQuantities.add(input.nextInt());
        }


        // Calculate total value
        Double totalValue = calculateTotalValue(
                productPrices,
                productQuantities
        );


        // Count stock
        Integer[] count = countStockStatus(productQuantities);

        Integer available = count[0];
        Integer outOfStock = count[1];


        // Find expensive product
        String expensive = findMostExpensiveProduct(
                productNames,
                productPrices
        );


        // Display report
        displayReport(
                productNames,
                productPrices,
                productQuantities,
                totalValue,
                available,
                outOfStock,
                expensive
        );

    }



    // Calculate total inventory value
    public static Double calculateTotalValue(
            ArrayList<Double> prices,
            ArrayList<Integer> quantities) {


        Double total = 0.0;


        for (int i = 0; i < prices.size(); i++) {

            total += prices.get(i) * quantities.get(i);
        }


        return total;
    }



    // Check stock status
    public static String checkStockStatus(Integer quantity) {


        if (quantity > 10) {

            return "High Stock";

        } else if (quantity >= 1) {

            return "Available";

        } else {

            return "Out of Stock";
        }
    }



    // Count available and out of stock products
    public static Integer[] countStockStatus(
            ArrayList<Integer> quantities) {


        Integer available = 0;
        Integer outOfStock = 0;


        for (Integer quantity : quantities) {


            if (quantity >= 1) {

                available++;

            } else {

                outOfStock++;
            }
        }


        return new Integer[]{available, outOfStock};
    }



    // Find product with highest price
    public static String findMostExpensiveProduct(
            ArrayList<String> names,
            ArrayList<Double> prices) {


        Double highest = prices.get(0);
        String expensive = names.get(0);


        for (int i = 1; i < prices.size(); i++) {


            if (prices.get(i) > highest) {

                highest = prices.get(i);
                expensive = names.get(i);
            }
        }


        return expensive;
    }



    // Display report
    public static void displayReport(
            ArrayList<String> names,
            ArrayList<Double> prices,
            ArrayList<Integer> quantities,
            Double totalValue,
            Integer available,
            Integer outOfStock,
            String expensive) {


        System.out.println("\n----- Inventory Report -----");


        // Display every product
        for (int i = 0; i < names.size(); i++) {


            System.out.println("Product Name: " + names.get(i));
            System.out.println("Price: " + prices.get(i));
            System.out.println("Quantity: " + quantities.get(i));
            System.out.println("Status: "
                    + checkStockStatus(quantities.get(i)));
        }

        System.out.println("Total Value: " + totalValue);
        System.out.println("Available Products: " + available);
        System.out.println("Out Of Stock Products: " + outOfStock);
        System.out.println("Most Expensive Product: " + expensive);
    }
}
