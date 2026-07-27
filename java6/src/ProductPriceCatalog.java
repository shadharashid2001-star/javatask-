import java.util.HashMap;
import java.util.Scanner;

public class ProductPriceCatalog {
    public static void main (String[] args){

        HashMap<String, Double>  productnames = new HashMap<>();

        // Prompt the user to enter the number of products using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product num. :");
        Integer productn = input.nextInt();
        input.nextLine();

        for (int i = 0; i <= productn - 1; i++) {
            if (productn <= 0) {
                System.out.println("Invalid number of products.");
            } else {
                System.out.println("Enter product name :");
                String PN = input.next();

                System.out.println("Enter price :");
                Double P = input.nextDouble();
                if (productnames.containsKey(PN)) {
                    System.out.println("Product already exists. Record not added.");
                } else {
                    productnames.put(PN, P);
                }
            }
        }

        System.out.println("Enter a product name");
        String Search = input.nextLine();
        if(productnames.containsKey(Search)){
            System.out.println("currunt price :"+productnames.get(Search));
             String s = input.nextLine();
            System.out.println("do want to update price:(y/n)");
            if (s.equalsIgnoreCase("y")){
                System.out.println("enter new price:");
                Double p2 = input.nextDouble();
                productnames.replace(s,p2);
                System.out.println("Price updated successfully.");
            }else {
                System.out.println("wrong update");
            }
        }else {
            System.out.println("no price update");
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

