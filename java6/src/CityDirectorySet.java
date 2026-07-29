import java.util.Scanner;
import java.util.TreeSet;

public class CityDirectorySet {

    public static void main (String[] args){

        TreeSet<String>  citynames = new TreeSet<>();

        // Prompt the user to enter the number of c using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter city num. :");
        Integer cityn = input.nextInt();

        for(int i = 0; i<= cityn -1 ; i++) {
            if (cityn <= 0) {
                System.out.println("Invalid number of cities");
            } else {
                System.out.println("Enter city name :");
                String cn = input.next();
                if (citynames.contains(cn)) {
                    System.out.println("City already exists. Duplicate entries are not allowed.");
                } else {
                    citynames.add(cn);
                }
            }
        }
        //searching with containes
        input.nextLine();
        System.out.println("Enter a city name to search");
        String Search = input.nextLine();
        if (citynames.contains(Search)){
            System.out.println("City found in the directory");
        }else {
            System.out.println("City not found in the directory");
        }
        //Use an if-else if-else statement to classify the inventory:
        if (citynames.size() > 10){
            System.out.println(" Large Directory  ");
        } else if (citynames.size() > 5) {
            System.out.println("  Medium Directory   ");
        }else {
            System.out.println(" Small Directory   ");
        }
        //Display output
        System.out.println(" Total cities"+cityn);
        System.out.println("Total unique cities   "+citynames.size());
        System.out.println(" All cities in alphabetical order  "+citynames);
        System.out.println("Search result  "+Search);
    }
}
