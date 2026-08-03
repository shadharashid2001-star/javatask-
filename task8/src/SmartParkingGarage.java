import java.util.*;

public class SmartParkingGarage {
    public static void main(String[] args) {
        //Part 1 – Vehicle Registration
        // create queue
        Queue<String> waitingvehicles = new LinkedList<>();
        // create stack
        Deque<String> parkedvehicles = new ArrayDeque<>();

        Integer parkingcapacity = 10;
        Integer totalParkedToday = 0;
        Integer totalDepartedToday = 0;
        // open Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  license plate number.:");
        String lnumbers = input.nextLine();
        input.nextLine();
        // check duplicate
        if (waitingvehicles.contains(lnumbers) || parkedvehicles.contains(lnumbers)) {
            System.out.println(" Vehicle already exists.");
            // check  capacity
        } else {
            //add license
            if (parkedvehicles.size() < parkingcapacity) {
                parkedvehicles.push(lnumbers);
                System.out.println("Vehicle registered and parked successfully.");
                //add license
            } else {
                waitingvehicles.offer(lnumbers);
                System.out.println("Parking is full.");
                System.out.println("Vehicle added to waiting queue.");
            }

            //Part 2 – Main Menu
            int choice;

            do {
                System.out.println("\n ========= Smart Parking Garage ========= ");
                System.out.println("\n1.  Add Vehicle to Waiting Queue ");
                System.out.println("2.  Park Next Vehicle");
                System.out.println("3. Remove Parked Vehicle ");
                System.out.println("4.View Next Waiting Vehicle  ");
                System.out.println("5.View Last Parked Vehicle ");
                System.out.println("6. Display Waiting Queue ");
                System.out.println("7. Display Parked Vehicles ");
                System.out.println("8.  Search Vehicle ");
                System.out.println("9.Display Garage Statistics ");
                System.out.println("10. Clear Waiting Queue ");
                System.out.println("11. Clear Parking Garage");
                System.out.println("12. Reset Entire System");
                System.out.println("13. Exit ");
                System.out.print("Enter your choice: ");

                choice = input.nextInt();
                input.nextLine();
//Part 3 – Functional Requirements
                switch (choice) {
                    case 1:
                        System.out.println("enter vehicle number :");
                        String vnum = input.nextLine();
                        if (vnum.isEmpty()) {
                            System.out.println("Vehicle number  empty.");

                        } else if (waitingvehicles.contains(vnum) || parkedvehicles.contains(vnum)) {
                            System.out.println(" Vehicle already exists.");
                        } else {
                            waitingvehicles.offer(vnum);
                            System.out.println("Vehicle added to waiting queue successfully.");
                        }
                        break;
                    case 2:
                        //Check whether the waiting queue is empty.
                        if (waitingvehicles.isEmpty()) {
                            System.out.println("waiting parking empty");
                        }
                        // Check whether the garage is already full.
                        if (parkedvehicles.size() < parkingcapacity) {
                            String rem = waitingvehicles.poll();
                            parkedvehicles.push(rem);
                            totalParkedToday++;
                            System.out.println(" first vehicle removed " + rem);
                            System.out.println("Push it onto the parking stack" + parkedvehicles);
                        } else {
                            System.out.println(" garage is already full");
                        }
                        break;
                    case 3:
                        if (parkedvehicles.isEmpty()) {
                            System.out.println("No parked vehicles to remove.");
                        } else {
                            // Remove the top vehicle
                            String removedVehicle = parkedvehicles.pop();
                            totalDepartedToday++;
                            System.out.println("Removed vehicle: " + removedVehicle);
                            if (!waitingvehicles.isEmpty()) {
                                String nextVehicle = waitingvehicles.poll();
                                parkedvehicles.push(nextVehicle);
                                System.out.println(" park the next waiting vehicle");
                            }
                        }
                        break;
                    case 4:
                        if (waitingvehicles.isEmpty()) {
                            System.out.println("No waiting vehicles.");
                        } else {
                            System.out.println("Next waiting vehicle: " + waitingvehicles.peek());
                        }
                        break;
                    case 5:
                        if (parkedvehicles.isEmpty()) {
                            System.out.println("No parked vehicles.");
                        } else {
                            System.out.println("Last parked vehicle: " + parkedvehicles.peek());
                        }
                        break;
                    case 6:
                        if (waitingvehicles.isEmpty()) {
                            System.out.println("No vehicles are waiting. ");
                        } else {
                            System.out.println("vehicle waiting " + waitingvehicles);
                            System.out.println("Total waiting vehicles  " + waitingvehicles.size());

                        }
                        break;

                    case 7:
                        if (parkedvehicles.isEmpty()) {
                            System.out.println("No parked vehicles.");
                        } else {
                            System.out.println("Parked vehicles: " + parkedvehicles);
                        }

                        System.out.println("Garage Capacity : " + parkingcapacity);
                        System.out.println("Occupied Spaces : " + parkedvehicles.size());
                        System.out.println("Available Spaces : " + (parkingcapacity - parkedvehicles.size()));

                        break;
                    case 8:
                        System.out.println("enter vehicle number to search  ");
                        String searchv = input.nextLine();
                        if (waitingvehicles.contains(searchv)) {
                            System.out.println("Vehicle is waiting in the queue.");
                        } else if (parkedvehicles.contains(searchv)) {
                            System.out.println("Vehicle is parked.");
                        } else {
                            System.out.println("Vehicle not found.");
                        }
                        break;
                    case 9:

                        System.out.println("Garage Statistics");
                        System.out.println("Maximum Capacity : " + parkingcapacity);
                        System.out.println("Current Parked Vehicles : " + parkedvehicles.size());
                        System.out.println("Waiting Vehicles : " + waitingvehicles.size());
                        System.out.println("Available Spaces : " + (parkingcapacity - parkedvehicles.size()));
                        System.out.println("Total Vehicles Parked Today : " + totalParkedToday);
                        System.out.println("Total Vehicles Departed Today : " + totalDepartedToday);
                        System.out.println("Total Vehicles Processed : " + (totalParkedToday + totalDepartedToday));

                        break;
                    case 10:

                        System.out.print("Are you sure you want to clear the waiting queue? (YES/NO): ");
                        String answer = input.nextLine();

                        if (answer.equalsIgnoreCase("YES")) {
                            waitingvehicles.clear();
                            System.out.println("Waiting queue cleared successfully.");
                        } else {
                            System.out.println("Operation cancelled.");
                        }

                        break;
                    case 11:

                        parkedvehicles.clear();
                        System.out.println("Parking garage cleared successfully.");

                        break;
                    case 12:

                        waitingvehicles.clear();
                        parkedvehicles.clear();

                        totalParkedToday = 0;
                        totalDepartedToday = 0;

                        System.out.println("System successfully reset.");

                        break;
                    case 13:

                        System.out.println("Thank you for using Smart Parking Garage.");
                        input.close();
                        System.exit(0);

                        break;

                }
            }while (choice != 13);

            input.close();


        }
    }
}








