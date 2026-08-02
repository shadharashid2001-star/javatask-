import java.util.LinkedList;
import java.util.Scanner;

public class PrintQueueManager {
    public static void main(String[] args) {

        //create queue
        LinkedList<String> jobname = new LinkedList<>();

        // enter the number of customer using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of print jobs");
        Integer jobnum = input.nextInt();
        input.nextLine();

        // if condition+loop
        if (jobnum <= 0) {
            System.out.println("Invalid number of print jobs.");
        } else {
            for (int i = 0; i < jobnum; i++) {
                System.out.println("Enter print job name");
                String jobna = input.nextLine();
                jobname.offer(jobna);
            }
        }
        int choice;

        do {
            System.out.println("\n1.Add Print Job  ");
            System.out.println("2.Process Next Print Job");
            System.out.println("3.View Next Print Job ");
            System.out.println("4.Search Print Job");
            System.out.println("5.Remove Print Job  ");
            System.out.println("6.Display All Print Jobs ");
            System.out.println("7.Display Queue Statistics ");
            System.out.println("8.Exit ");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter new print job name :");
                    String jobn2 = input.nextLine();
                    jobname.offer(jobn2);
                    System.out.println("Print job added successfully.");
                    break;

                case 2:
                    if (jobname.isEmpty()) {
                        System.out.println("No print jobs in the queue.");
                    } else {
                        String removed = jobname.poll();
                        System.out.println("The job removed: " + removed);
                    }
                    break;
                case 3:
                    if (jobname.isEmpty()) {
                        System.out.println("No print jobs in the queue.");
                    } else {
                        System.out.println("next print job : " + jobname.peek());
                    }
                    break;
                case 4:
                    System.out.println("print job name:");
                    String searchjob = input.nextLine();

                    if (jobname.contains(searchjob)) {
                        System.out.println("job found in the queue.");
                    } else {
                        System.out.println("job not found in the queue.");
                    }
                    break;
                case 5:
                    System.out.println("print job name:");
                    String namejob = input.nextLine();
                    if (jobname.contains(namejob)) {
                        System.out.println("Print job  found. ");
                        jobname.remove(namejob);
                    } else {
                        System.out.println("Print job not  found. ");
                    }
                    break;
                case 6:
                    System.out.println("Total number of print jobs: " + jobname.size());

                    if (jobname.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Next print job  in the queue: " + jobname.peek());
                        System.out.println("Queue is not empty.");
                    }
                    break;

            case 7:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice.");
        }

    } while (choice != 7);

        input.close();
}
}
