import java.util.*;

public class StudentRegistrationManager {

    public static void main(String[] args) {

        //create queue
        Queue<String> waitingRegistration = new LinkedList<>();
        Deque<String> completedRegistration = new ArrayDeque<>();

        // enter the number of customer using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Number of students waiting for registration");
        Integer numwating = input.nextInt();
        input.nextLine();

        if (numwating <= 0) {
            System.out.println("Invalid number of students");
        } else {
            for (int i = 0; i < numwating; i++) {
                System.out.println("Enter student name");
                String name = input.nextLine();
                waitingRegistration.offer(name);
            }
        }

        int choice;

        do {
            System.out.println("\n1. Add Student to Queue");
            System.out.println("2. Process Student Registration");
            System.out.println("3. View Next Student");
            System.out.println("4. Undo Last Registration");
            System.out.println("5. Search Student");
            System.out.println("6. Display Waiting Students");
            System.out.println("7. Display Registered Students");
            System.out.println("8. Display Statistics");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter new student name:");
                    String name2 = input.nextLine();
                    waitingRegistration.offer(name2);
                    System.out.println("Student added to registration queue successfully.");
                    break;

                case 2:
                    if (waitingRegistration.isEmpty()) {
                        System.out.println("No students waiting for registration.");
                    } else {
                        String removed = waitingRegistration.remove();
                        completedRegistration.push(removed);
                        System.out.println("Student registered: " + removed);
                    }
                    break;

                case 3:
                    if (waitingRegistration.isEmpty()) {
                        System.out.println("No students in the queue.");
                    } else {
                        System.out.println("Next student: " + waitingRegistration.element());
                    }
                    break;

                case 4:
                    if (completedRegistration.isEmpty()) {
                        System.out.println("No registrations to undo.");
                    } else {
                        String remove = completedRegistration.pop();
                        waitingRegistration.offer(remove);
                        System.out.println("Registration undone for: " + remove);
                    }
                    break;

                case 5:
                    System.out.println("Enter student name:");
                    String snamee = input.nextLine();

                    if (waitingRegistration.contains(snamee)) {
                        System.out.println("Waiting for registration.");
                    } else if (completedRegistration.contains(snamee)) {
                        System.out.println("Already registered.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    if (waitingRegistration.isEmpty()) {
                        System.out.println("No waiting students.");
                    } else {
                        System.out.println("Waiting Students:");
                        for (String sn : waitingRegistration) {
                            System.out.println(sn);
                        }
                    }
                    break;

                case 7:
                    if (completedRegistration.isEmpty()) {
                        System.out.println("No registered students.");
                    } else {
                        System.out.println("Registered Students:");
                        for (String co : completedRegistration) {
                            System.out.println(co);
                        }
                    }
                    break;

                case 8:
                    System.out.println("Total waiting students: " + waitingRegistration.size());
                    System.out.println("Total registered students: " + completedRegistration.size());

                    if (waitingRegistration.isEmpty()) {
                        System.out.println("Next student waiting: None");
                    } else {
                        System.out.println("Next student waiting: " + waitingRegistration.element());
                    }

                    if (completedRegistration.isEmpty()) {
                        System.out.println("Last registered student: None");
                    } else {
                        System.out.println("Last registered student: " + completedRegistration.peek());
                    }

                    System.out.println("Queue is empty: " + waitingRegistration.isEmpty());
                    System.out.println("Stack is empty: " + completedRegistration.isEmpty());
                    break;

                case 9:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);

        input.close();
    }
}