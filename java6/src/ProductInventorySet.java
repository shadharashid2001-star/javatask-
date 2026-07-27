import java.util.HashSet;
import java.util.Scanner;

public class ProductInventorySet {
   public static void main(String[] args){

// Create a HashSet to store product
        HashSet<String> productnames = new HashSet<>();
        // Prompt the user to enter the number of products using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product num. :");
        Integer productn = input.nextInt();

        for( int i = 0; i<=productn-1 ; ++i) {
            if (productn <= 0) {
                System.out.println("Invalid number of products.");
            } else {
                System.out.println("Enter products name :");
                String pn = input.next();
                if (productnames.contains(pn)) {
                    System.out.println("Product already exists. Duplicate entries are not allowed");
                } else {
                    productnames.add(pn);
                }
            }
        }
            //After all products have been entered, prompt the user to enter a product name to
            //search for.
            input.nextLine();
            System.out.println("Enter a product name to search");
            String Search = input.nextLine();
            if (productnames.contains(Search)){
                System.out.println("Product found in inventory.");
            }else {
                System.out.println("Product not found in inventory.");
            }
            //Use an if-else if-else statement to classify the inventory:
     if (productnames.size() > 10){
         System.out.println("Large Inventory  ");
} else if (productnames.size() > 5) {
         System.out.println(" Medium Inventory  ");
     }else {
         System.out.println(" Small Inventory  ");
     }
            //Display output
            System.out.println("Total products"+productn);
            System.out.println("Total unique products  "+productnames.size());
            System.out.println("All products in the inventory"+productnames);
            System.out.println("Search result  "+Search);


        }}

