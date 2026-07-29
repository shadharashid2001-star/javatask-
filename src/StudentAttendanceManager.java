import java.util.HashMap;
import java.util.Scanner;

public class StudentAttendanceManager {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, Integer> student = new HashMap<>();

        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Enter number of students
        System.out.println("Enter number of student records:");
        int numstudent = input.nextInt();

        // Check number of students
        if (numstudent <= 0) {

            System.out.println("Invalid number of students.");

        } else {

            // Read student records
            for (int i = 0; i < numstudent; i++) {

                System.out.println("Enter Student ID:");
                int studentId = input.nextInt();

                // Check duplicate ID
                if (student.containsKey(studentId)) {

                    System.out.println("Student ID already exists. Record not added.");

                } else {

                    System.out.println("Enter number of attended days:");
                    int attendedDays = input.nextInt();

                    // Store in HashMap
                    student.put(studentId, attendedDays);
                }
            }
        }
        int choice;

        do {

            System.out.println("\n========== Student Attendance Manager ==========");
            System.out.println("1. Add Student Record");
            System.out.println("2. Search Student Attendance");
            System.out.println("3. Update Attendance");
            System.out.println("4. Remove Student Record");
            System.out.println("5. Display All Attendance Records");
            System.out.println("6. Display Attendance Statistics");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                // Add Student Record
                case 1:

                    System.out.print("Enter Student ID: ");
                    int newId = input.nextInt();

                    if (student.containsKey(newId)) {

                        System.out.println("Student ID already exists. Record not added.");

                    } else {

                        System.out.print("Enter attendance days: ");
                        int attendance = input.nextInt();

                        student.put(newId, attendance);

                        System.out.println("Student record added successfully.");
                    }

                    break;

                // Search Student Attendance
                case 2:

                    System.out.print("Enter Student ID: ");
                    int searchId = input.nextInt();

                    if (student.containsKey(searchId)) {

                        System.out.println("Attendance Days: " + student.get(searchId));

                    } else {

                        System.out.println("Student not found.");
                    }

                    break;

                // Update Attendance
                case 3:

                    System.out.print("Enter Student ID: ");
                    int updateId = input.nextInt();

                    if (student.containsKey(updateId)) {

                        System.out.print("Enter new attendance days: ");
                        int newAttendance = input.nextInt();

                        student.replace(updateId, newAttendance);

                        System.out.println("Attendance updated successfully.");

                    } else {

                        System.out.println("Student not found.");
                    }

                    break;

                // Remove Student Record
                case 4:

                    System.out.print("Enter Student ID: ");
                    int removeId = input.nextInt();

                    if (student.containsKey(removeId)) {

                        student.remove(removeId);

                        System.out.println("Student record removed successfully.");

                    } else {

                        System.out.println("Student not found.");
                    }

                    break;

                // Display All Attendance Records
                case 5:

                    System.out.println("\n========== Attendance Records ==========");

                    for (Integer id : student.keySet()) {

                        System.out.println("Student ID      : " + id);
                        System.out.println("Attendance Days : " + student.get(id));
                        System.out.println("--------------------------------");
                    }

                    break;

                // Display Attendance Statistics
                case 6:

                    if (student.size() == 0) {

                        System.out.println("No student records available.");

                    } else {

                        int totalAttendance = 0;
                        int highestAttendance = Integer.MIN_VALUE;
                        int lowestAttendance = Integer.MAX_VALUE;

                        int highestStudent = 0;
                        int lowestStudent = 0;

                        // Using entrySet()
                        for (var entry : student.entrySet()) {

                            int studentId = entry.getKey();
                            int attendance = entry.getValue();

                            totalAttendance += attendance;

                            if (attendance > highestAttendance) {
                                highestAttendance = attendance;
                                highestStudent = studentId;
                            }

                            if (attendance < lowestAttendance) {
                                lowestAttendance = attendance;
                                lowestStudent = studentId;
                            }
                        }

                        double averageAttendance =
                                (double) totalAttendance / student.size();

                        System.out.println("\n========== Attendance Statistics ==========");
                        System.out.println("Total Students        : " + student.size());
                        System.out.println("Total Attendance Days : " + totalAttendance);
                        System.out.println("Average Attendance    : " + averageAttendance);
                        System.out.println("Highest Attendance    : " + highestAttendance +
                                " (Student ID: " + highestStudent + ")");
                        System.out.println("Lowest Attendance     : " + lowestAttendance +
                                " (Student ID: " + lowestStudent + ")");
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


        input.close();
    }
}