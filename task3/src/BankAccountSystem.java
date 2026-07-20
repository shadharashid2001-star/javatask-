import java.util.ArrayList;
import java.util.Scanner;



public class BankAccountSystem {

    public static void main(String[] args) {

        // Attributes
        ArrayList<Integer> accountNumbers = new ArrayList<>();
        ArrayList<String> customerNames = new ArrayList<>();
        ArrayList<Double> balances = new ArrayList<>();

        // Add accounts
        accountNumbers.add(1001);
        customerNames.add("Shadha");
        balances.add(5000.0);


        accountNumbers.add(1002);
        customerNames.add("Sara");
        balances.add(6000.0);


        accountNumbers.add(1003);
        customerNames.add("Ali");
        balances.add(7000.0);


        Scanner input = new Scanner(System.in);


        int choice;


        // Menu loop
        do {


            System.out.println("\n----- Bank Menu -----");

            System.out.println("1: Display all accounts");
            System.out.println("2: Deposit money");
            System.out.println("3: Withdraw money");
            System.out.println("4: Check balance");
            System.out.println("5: Display statistics");
            System.out.println("6: Exit");


            System.out.print("Enter choice: ");
            choice = input.nextInt();


            switch (choice) {


                case 1:

                    displayAccounts(
                            accountNumbers,
                            customerNames,
                            balances
                    );

                    break;


                case 2:

                    System.out.println("Deposit money");

                    break;


                case 3:

                    System.out.println("Withdraw money");

                    break;


                case 4:

                    System.out.println("Check balance");

                    break;


                case 5:

                    calculateStatistics(balances);

                    break;


                case 6:

                    System.out.println("Exit");

                    break;


                default:

                    System.out.println("Invalid choice");

            }


        } while (choice != 6);


    }


    // Display all accounts
    public static void displayAccounts(
            ArrayList<Integer> accountNumbers,
            ArrayList<String> customerNames,
            ArrayList<Double> balances) {


        for (int i = 0; i < accountNumbers.size(); i++) {


            System.out.println("Account Number: "
                    + accountNumbers.get(i));


            System.out.println("Customer Name: "
                    + customerNames.get(i));


            System.out.println("Balance: "
                    + balances.get(i));


            System.out.println("----------------");

        }

    }


    // Calculate statistics
    public static void calculateStatistics(
            ArrayList<Double> balances) {


        double total = 0;

        double highest = balances.get(0);

        double lowest = balances.get(0);


        for (int i = 0; i < balances.size(); i++) {


            total += balances.get(i);


            if (balances.get(i) > highest) {

                highest = balances.get(i);

            }


            if (balances.get(i) < lowest) {

                lowest = balances.get(i);

            }

        }


        System.out.println("Total Money: " + total);

        System.out.println("Highest Balance: " + highest);

        System.out.println("Lowest Balance: " + lowest);


    }

}


