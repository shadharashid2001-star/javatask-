import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradesMap {
    public static void main(String[] args) {
        HashMap<Integer, Double> student = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students :");
        Integer studentn = input.nextInt();

        for (int i = 0; i <= studentn - 1; i++) {
            if (studentn <= 0) {
                System.out.println("Invalid number of  students");
            } else {
                System.out.println("Enter students id :");
                Integer id = input.nextInt();
                System.out.println("Enter students grade :");
                Double G = input.nextDouble();
                if (student.containsKey(id)) {
                    System.out.println("Student ID already exists. Record not added.");
                } else {
                    student.put(id, G);
                }

                input.nextLine();
                System.out.println("Enter id to update");
                Integer id2 = input.nextInt();
                if (student.containsKey(id2)) {
                    System.out.println("Enter students  new grade :");
                    Double Gn = input.nextDouble();
                    student.replace(id2, Gn);
                    System.out.println("Grade updated successfully.");
                } else {

                    System.out.println("Student ID not found.");
                }

            }
        }
        // Calculate the average grade of all students in the map
        Double sum = 0.0;
        for (Map.Entry<Integer, Double> entry : student.entrySet()) {
            sum += entry.getValue();
        }
        Double averageg = sum / student.size();
        //Use an if-else if-else statement to classify
        if (averageg > 85) {
            System.out.println(" Excellent Performance");
        } else if (averageg > 60) {
            System.out.println("  Good Performance    ");
        } else {
            System.out.println("   Needs Improvement      ");
        }
        //Display output

        System.out.println("Total student records " + studentn);
        System.out.println(" All student IDs and grades    " + student);
        System.out.println("Average grade " + averageg);
        input.close();
    }
}

