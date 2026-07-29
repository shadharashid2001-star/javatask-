import java.util.HashMap;
import java.util.Scanner;

public class EmployeeSalaryManager {

    public static void main(String[] args){
        //creat hash map

        HashMap<Integer,Double> employee = new HashMap<>();
        // enter number of employee
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num of employee");
        Integer numemployee = input.nextInt();

        //create condition and loops
        if (numemployee<=0){
            System.out.println("Invalid number of employees.");
        }else {
        for (int i = 0;i<numemployee; i++ ) {
            System.out.println("Enter Employee ID:");
            int employeeId = input.nextInt();
            if (employee.containsKey(employeeId)){
                System.out.println("Employee ID already exists. Record not added.");

            }else {System.out.println("Enter Employee Salary:");
                double salary = input.nextDouble();
                employee.put(employeeId, salary);
            }

            }
        }
        int choice;

        do {

            System.out.println("\n===== Employee Salary Manager =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Remove Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Display Salary Statistics");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                // Add Employee
                case 1:

                    System.out.print("Enter Employee ID: ");
                    int newId = input.nextInt();

                    if (employee.containsKey(newId)) {

                        System.out.println("Employee ID already exists. Record not added.");

                    } else {

                        System.out.print("Enter Salary: ");
                        double newSalary = input.nextDouble();

                        employee.put(newId, newSalary);

                        System.out.println("Employee added successfully.");
                    }

                    break;


                // Search Employee
                case 2:

                    System.out.print("Enter Employee ID: ");
                    int searchId = input.nextInt();

                    if (employee.containsKey(searchId)) {

                        System.out.println("Salary: " + employee.get(searchId));

                    } else {

                        System.out.println("Employee not found.");

                    }

                    break;


                // Update Salary
                case 3:

                    System.out.print("Enter Employee ID: ");
                    int updateId = input.nextInt();

                    if (employee.containsKey(updateId)) {

                        System.out.print("Enter New Salary: ");
                        double salary = input.nextDouble();

                        employee.replace(updateId, salary);

                        System.out.println("Salary updated successfully.");

                    } else {

                        System.out.println("Employee not found.");

                    }

                    break;


                // Remove Employee
                case 4:

                    System.out.print("Enter Employee ID: ");
                    int removeId = input.nextInt();

                    if (employee.containsKey(removeId)) {

                        employee.remove(removeId);

                        System.out.println("Employee removed successfully.");

                    } else {

                        System.out.println("Employee not found.");

                    }

                    break;


                // Display All Employees
                case 5:

                    System.out.println("\nEmployee List");

                    for (Integer id : employee.keySet()) {

                        System.out.println("Employee ID: " + id);
                        System.out.println("Salary: " + employee.get(id));
                        System.out.println("----------------------");

                    }

                    break;


                // Display Salary Statistics
                case 6:

                    if (employee.size() == 0) {

                        System.out.println("No employees available.");

                    } else {

                        double highestSalary = Double.MIN_VALUE;
                        double lowestSalary = Double.MAX_VALUE;
                        double totalPayroll = 0;

                        for (double salary : employee.values()) {

                            totalPayroll += salary;

                            if (salary > highestSalary) {
                                highestSalary = salary;
                            }

                            if (salary < lowestSalary) {
                                lowestSalary = salary;
                            }
                        }

                        double averageSalary = totalPayroll / employee.size();

                        System.out.println("Highest Salary: " + highestSalary);
                        System.out.println("Lowest Salary: " + lowestSalary);
                        System.out.println("Average Salary: " + averageSalary);
                        System.out.println("Total Payroll: " + totalPayroll);
                    }

                    break;


                // Exit
                case 7:

                    System.out.println("Program ended.");
                    break;


                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);



        input.close();




    }
}
