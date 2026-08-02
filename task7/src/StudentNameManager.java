import java.util.Scanner;

public class StudentNameManager {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of student:");
        int numstudnet = input.nextInt();
        input.nextLine();

        if (numstudnet <= 0) {
            System.out.println("Invalid number of students.");

        } else {

            // Create String array to store student names
            String[] studentname = new String[100];

            // Enter student names
            for (int i = 0; i < numstudnet; i++) {
                System.out.println("Enter name of student " + (i + 1));
                studentname[i] = input.nextLine();
            }

            int choice;

            do {

                System.out.println("\nStudent Name Management:");
                System.out.println("1. Add Student Name");
                System.out.println("2. Search Student Name");
                System.out.println("3. Update Student Name");
                System.out.println("4. Display All Student Names");
                System.out.println("5. Analyze Names");
                System.out.println("6. Compare 2 Names");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");

                choice = input.nextInt();
                input.nextLine();

                switch (choice) {

                    case 1:
                        System.out.println("Enter new student name:");
                        String newname = input.nextLine();

                        boolean exists = false;

                        for (int i = 0; i < numstudnet; i++) {
                            if (studentname[i].equals(newname)) {
                                exists = true;
                                break;
                            }
                        }

                        if (exists) {
                            System.out.println("Student name already exists.");
                        } else {
                            studentname[numstudnet] = newname;
                            numstudnet++;
                            System.out.println("Student added successfully.");
                        }

                        break;


                    case 2:
                        System.out.print("Enter student name to search: ");
                        String searchname = input.nextLine();

                        boolean found = false;

                        for (int i = 0; i < numstudnet; i++) {
                            if (studentname[i].equals(searchname)) {
                                found = true;
                                break;
                            }
                        }

                        if (found) {
                            System.out.println("Student found.");
                        } else {
                            System.out.println("Student not found.");
                        }

                        break;


                    case 3:
                        System.out.print("Enter existing student name: ");
                        String oldname = input.nextLine();

                        System.out.print("Enter new student name: ");
                        String newName = input.nextLine();

                        boolean updated = false;

                        for (int i = 0; i < numstudnet; i++) {
                            if (studentname[i].equals(oldname)) {
                                studentname[i] = newName;
                                updated = true;
                                break;
                            }
                        }

                        if (updated) {
                            System.out.println("Student name updated successfully.");
                        } else {
                            System.out.println("Student not found.");
                        }

                        break;


                    case 4:
                        System.out.println("Student Names:");

                        for (int i = 0; i < numstudnet; i++) {
                            System.out.println((i + 1) + ". " + studentname[i]);
                        }

                        break;


                    case 5:
                        System.out.println("----- Name Analysis -----");

                        String longestName = studentname[0];
                        String shortestName = studentname[0];

                        int totalCharacters = 0;
                        int startsWithA = 0;
                        int endsWithA = 0;

                        for (int i = 0; i < numstudnet; i++) {

                            totalCharacters += studentname[i].length();

                            if (studentname[i].length() > longestName.length()) {
                                longestName = studentname[i];
                            }

                            if (studentname[i].length() < shortestName.length()) {
                                shortestName = studentname[i];
                            }

                            if (studentname[i].startsWith("A")) {
                                startsWithA++;
                            }

                            if (studentname[i].endsWith("a")) {
                                endsWithA++;
                            }
                        }

                        double averageLength = (double) totalCharacters / numstudnet;

                        System.out.println("Total number of students: " + numstudnet);
                        System.out.println("Longest student name: " + longestName);
                        System.out.println("Shortest student name: " + shortestName);
                        System.out.println("Total characters in all names: " + totalCharacters);
                        System.out.println("Average name length: " + averageLength);
                        System.out.println("Number of names starting with A: " + startsWithA);
                        System.out.println("Number of names ending with a: " + endsWithA);

                        break;


                    case 6:
                        System.out.print("Enter first student name: ");
                        String name1 = input.nextLine();

                        System.out.print("Enter second student name: ");
                        String name2 = input.nextLine();

                        System.out.println("\nComparison Results:");

                        System.out.println("equals(): " + name1.equals(name2));
                        System.out.println("equalsIgnoreCase(): " + name1.equalsIgnoreCase(name2));
                        System.out.println("compareTo(): " + name1.compareTo(name2));

                        System.out.println("First name uppercase: " + name1.toUpperCase());
                        System.out.println("Second name lowercase: " + name2.toLowerCase());

                        // Check if the first name is not empty before using charAt()
                        if (!name1.isEmpty()) {
                            System.out.println("First character of first name: " + name1.charAt(0));
                        } else {
                            System.out.println("First name is empty.");
                        }

                        // Check if the first name has at least 3 characters before using substring()
                        if (name1.length() >= 3) {
                            System.out.println("First 3 characters: " + name1.substring(0, 3));
                        } else if (!name1.isEmpty()) {
                            System.out.println("Name has less than 3 characters.");
                        } else {
                            System.out.println("Cannot get characters from an empty name.");
                        }

                        break;


                    case 7:
                        System.out.println("Exiting program...");
                        break;


                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 7);
        }

        input.close();
    }
}