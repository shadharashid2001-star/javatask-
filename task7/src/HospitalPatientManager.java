import java.util.*;
    public class HospitalPatientManager {

        public static void main(String[] args) {

            // create queue
            Queue<String> waitingPatients = new LinkedList<>();
            // create stack
            Deque<String> treatedPatients = new ArrayDeque<>();

            // open Scanner
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number of patients waiting:");
            int patientCount = input.nextInt();
            input.nextLine();

            if (patientCount <= 0) {
                System.out.println("Invalid number of patients");
            } else {
                for (int i = 0; i < patientCount; i++) {
                    System.out.println("Enter patient name:");
                    String patientName = input.nextLine();
                    waitingPatients.offer(patientName);
                }
            }

            // use do-while loop
            int choice;

            do {

                System.out.println("\n1. Add Patient");
                System.out.println("2. Treat Patient");
                System.out.println("3. View Next Patient");
                System.out.println("4. Undo Last Treatment");
                System.out.println("5. Search Patient");
                System.out.println("6. Display Waiting Patients");
                System.out.println("7. Display Treated Patients");
                System.out.println("8. Display Hospital Statistics");
                System.out.println("9. Exit");
                System.out.print("Enter your choice: ");

                choice = input.nextInt();
                input.nextLine();

                switch (choice) {

                    case 1:
                        System.out.println("Enter patient name:");
                        String newPatient = input.nextLine();
                        waitingPatients.offer(newPatient);
                        System.out.println("Patient added successfully.");
                        break;

                    case 2:
                        if (waitingPatients.isEmpty()) {
                            System.out.println("No patients waiting for treatment.");
                        } else {
                            String treatedPatient = waitingPatients.poll();
                            treatedPatients.push(treatedPatient);
                            System.out.println("Patient treated successfully: " + treatedPatient);
                        }
                        break;

                    case 3:
                        if (waitingPatients.isEmpty()) {
                            System.out.println("No patients available.");
                        } else {
                            System.out.println("Next patient: " + waitingPatients.peek());
                        }
                        break;

                    case 4:
                        if (treatedPatients.isEmpty()) {
                            System.out.println("No completed treatments to undo.");
                        } else {
                            String undoPatient = treatedPatients.pop();
                            waitingPatients.offer(undoPatient);
                            System.out.println("Treatment undone for: " + undoPatient);
                        }
                        break;

                    case 5:
                        System.out.println("Enter patient name:");
                        String searchPatient = input.nextLine();

                        if (waitingPatients.contains(searchPatient)) {
                            System.out.println("Patient is waiting for treatment.");
                        } else if (treatedPatients.contains(searchPatient)) {
                            System.out.println("Patient has already been treated.");
                        } else {
                            System.out.println("Patient not found.");
                        }
                        break;

                    case 6:
                        if (waitingPatients.isEmpty()) {
                            System.out.println("No waiting patients.");
                        } else {
                            System.out.println("Waiting Patients:");
                            for (String patient : waitingPatients) {
                                System.out.println(patient);
                            }
                        }
                        break;

                    case 7:
                        if (treatedPatients.isEmpty()) {
                            System.out.println("No treated patients.");
                        } else {
                            System.out.println("Treated Patients:");
                            for (String patient : treatedPatients) {
                                System.out.println(patient);
                            }
                        }
                        break;

                    case 8:
                        System.out.println("Total waiting patients: " + waitingPatients.size());
                        System.out.println("Total treated patients: " + treatedPatients.size());

                        if (waitingPatients.isEmpty()) {
                            System.out.println("Next waiting patient: None");
                        } else {
                            System.out.println("Next waiting patient: " + waitingPatients.peek());
                        }

                        if (treatedPatients.isEmpty()) {
                            System.out.println("Last treated patient: None");
                        } else {
                            System.out.println("Last treated patient: " + treatedPatients.peek());
                        }

                        System.out.println("Queue is empty: " + waitingPatients.isEmpty());
                        System.out.println("Stack is empty: " + treatedPatients.isEmpty());
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


