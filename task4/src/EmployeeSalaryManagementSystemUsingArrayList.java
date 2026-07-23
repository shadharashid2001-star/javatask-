import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSalaryManagementSystemUsingArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> employeeNames = new ArrayList<>();
        ArrayList<Integer> employeeIds = new ArrayList<>();
        ArrayList<Double> employeeSalaries = new ArrayList<>();

        employeeNames.add("Shadha");
        employeeIds.add(40);
        employeeSalaries.add(5000.0);

        employeeNames.add("Sara");
        employeeIds.add(41);
        employeeSalaries.add(7000.0);

        employeeNames.add("Ali");
        employeeIds.add(42);
        employeeSalaries.add(6500.0);

        employeeNames.add("Ahmed");
        employeeIds.add(43);
        employeeSalaries.add(8000.0);

        employeeNames.add("Mona");
        employeeIds.add(44);
        employeeSalaries.add(5500.0);

        employeeNames.add("Omar");
        employeeIds.add(45);
        employeeSalaries.add(7200.0);

        employeeNames.add("Noura");
        employeeIds.add(46);
        employeeSalaries.add(9000.0);

        employeeNames.add("Khalid");
        employeeIds.add(47);
        employeeSalaries.add(6000.0);

        employeeNames.add("Fatma");
        employeeIds.add(48);
        employeeSalaries.add(7500.0);

        employeeNames.add("Salim");
        employeeIds.add(49);
        employeeSalaries.add(6800.0);

        for (int i = 0; i < employeeNames.size(); i++) {
            System.out.println("Employee " + i);
            System.out.println("ID: " + employeeIds.get(i));
            System.out.println("Name: " + employeeNames.get(i));
            System.out.println("Salary: " + employeeSalaries.get(i));
            System.out.println();
        }

        int totalEmployees = employeeNames.size();
        double totalSalary = 0;
        double highestSalary = employeeSalaries.get(0);
        double lowestSalary = employeeSalaries.get(0);

        for (int i = 0; i < employeeSalaries.size(); i++) {

            totalSalary += employeeSalaries.get(i);

            if (employeeSalaries.get(i) > highestSalary) {
                highestSalary = employeeSalaries.get(i);
            }

            if (employeeSalaries.get(i) < lowestSalary) {
                lowestSalary = employeeSalaries.get(i);
            }
        }

        double averageSalary = totalSalary / totalEmployees;

        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Highest Salary: " + highestSalary);
        System.out.println("Lowest Salary: " + lowestSalary);

        System.out.print("Enter Employee ID: ");
        int searchId = input.nextInt();

        if (employeeIds.contains(searchId)) {

            int index = employeeIds.indexOf(searchId);

            System.out.println("Employee found.");
            System.out.println("Name: " + employeeNames.get(index));
            System.out.println("Salary: " + employeeSalaries.get(index));
            System.out.println("Position: " + index);

        } else {

            System.out.println("Employee not found.");
        }

        System.out.print("Enter Employee Index: ");
        int updateIndex = input.nextInt();

        if (updateIndex >= 0 && updateIndex < employeeSalaries.size()) {

            System.out.print("Enter New Salary: ");
            double newSalary = input.nextDouble();

            employeeSalaries.set(updateIndex, newSalary);

            System.out.println("Salary updated successfully.");

        } else {

            System.out.println("Invalid Employee Index.");
        }

        System.out.print("Enter Employee Index to remove: ");
        int removeIndex = input.nextInt();

        if (removeIndex >= 0 && removeIndex < employeeNames.size()) {

            employeeNames.remove(removeIndex);
            employeeIds.remove(removeIndex);
            employeeSalaries.remove(removeIndex);

            System.out.println("Employee removed successfully.");

        } else {

            System.out.println("Invalid Employee Index.");
        }

        System.out.println("Updated Employee List:");

        for (int i = 0; i < employeeNames.size(); i++) {

            System.out.println("Employee " + i);
            System.out.println("ID: " + employeeIds.get(i));
            System.out.println("Name: " + employeeNames.get(i));
            System.out.println("Salary: " + employeeSalaries.get(i));
            System.out.println();
        }

        for (int i = 0; i < employeeSalaries.size() - 1; i++) {

            for (int j = i + 1; j < employeeSalaries.size(); j++) {

                if (employeeSalaries.get(i) > employeeSalaries.get(j)) {

                    double salary = employeeSalaries.get(i);
                    employeeSalaries.set(i, employeeSalaries.get(j));
                    employeeSalaries.set(j, salary);

                    String name = employeeNames.get(i);
                    employeeNames.set(i, employeeNames.get(j));
                    employeeNames.set(j, name);

                    int id = employeeIds.get(i);
                    employeeIds.set(i, employeeIds.get(j));
                    employeeIds.set(j, id);
                }
            }
        }

        System.out.println("Salary Ranking (Lowest to Highest):");

        for (int i = 0; i < employeeNames.size(); i++) {
            System.out.println((i + 1) + ". " + employeeNames.get(i) + " - " + employeeSalaries.get(i));
        }

        for (int i = 0; i < employeeSalaries.size() - 1; i++) {

            for (int j = i + 1; j < employeeSalaries.size(); j++) {

                if (employeeSalaries.get(i) < employeeSalaries.get(j)) {

                    double salary = employeeSalaries.get(i);
                    employeeSalaries.set(i, employeeSalaries.get(j));
                    employeeSalaries.set(j, salary);

                    String name = employeeNames.get(i);
                    employeeNames.set(i, employeeNames.get(j));
                    employeeNames.set(j, name);

                    int id = employeeIds.get(i);
                    employeeIds.set(i, employeeIds.get(j));
                    employeeIds.set(j, id);
                }
            }
        }

        System.out.println("Salary Ranking (Highest to Lowest):");

        for (int i = 0; i < employeeNames.size(); i++) {
            System.out.println((i + 1) + ". " + employeeNames.get(i) + " - " + employeeSalaries.get(i));
        }

        System.out.println("Employee Bonus Report:");

        for (int i = 0; i < employeeNames.size(); i++) {

            double salary = employeeSalaries.get(i);
            double bonus;

            if (salary >= 1000) {
                bonus = salary * 0.10;
            } else if (salary >= 500) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double finalSalary = salary + bonus;

            System.out.println("Name: " + employeeNames.get(i));
            System.out.println("Salary: " + salary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Final Salary: " + finalSalary);
            System.out.println();
        }

        input.close();
    }
}