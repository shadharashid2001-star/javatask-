import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDirectoryMap {

    public static void main (String[] args){
        HashMap<String,Integer>  employeeid = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter empolyee num. :");
        Integer empolyeen = input.nextInt();

        for(int i = 0; i<= empolyeen -1 ; i++) {
            if (empolyeen <= 0) {
                System.out.println("Invalid number of employees");
            } else {
                System.out.println("Enter employees name :");
                String en = input.next();
             if (employeeid.containsKey(en)) {
                    System.out.println("Employee ID already exists. Please enter a unique ID.");
                } else {
                 employeeid.put(en,empolyeen);
             }
            }
        }
        //searching with containes
        input.nextLine();
        System.out.println("Enter employee  to search");
        String Search = input.nextLine();
        if (employeeid.containsKey(Search)){
            System.out.println("Employee Found: "+employeeid.get(Search));
        }else {
            System.out.println("Employee ID not found."+employeeid.get(Search));
        }
        //Use an if-else if-else statement to classify the company:
        if (employeeid.size() > 10){
            System.out.println(" Large Company");
        } else if (employeeid.size() > 5) {
            System.out.println("   Medium Company    ");
        }else {
            System.out.println("  Small Company     ");
        }
        //Display output
        System.out.println(" Total employee "+empolyeen);
        System.out.println("Total unique employees   "+employeeid.size());
        System.out.println(" All employee IDs and names    "+employeeid);
        System.out.println("Search result  "+Search);
        input.close();
    }
}

