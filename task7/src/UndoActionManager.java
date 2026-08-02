import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class UndoActionManager {
    public static void main(String[] args) {
        //Create a Stack
        Deque<String> useractions  = new ArrayDeque<>();

        // enter the number of action using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of actions ");
        Integer actionn = input.nextInt();
        input.nextLine();
        // if condition
        if (actionn <= 0) {
            System.out.println("Invalid number of books.");
        } else {
            for (int i = 0; i < actionn; i++) {
                System.out.println("Enter action");
                String action = input.nextLine();
                useractions.push(action);
            }
        }

            int choice;

            do {

                System.out.println("1.Add Action  ");
                System.out.println("2.Undo Last Action  ");
                System.out.println("3.View Last Action  ");
                System.out.println("4.Search Action  ");
                System.out.println("5.Display All Actions  ");
                System.out.println("6.Display Action Statistics");
                System.out.println("7.Clear All Actions ");
                System.out.println("8.Exit");
                System.out.print("Enter your choice: ");

                choice = input.nextInt();
                input.nextLine();
                //Use a switch-case statement to process the user's menu selection.
                switch (choice) {

                    case 1:
                        System.out.println("Enter new action title:");
                        String action2 = input.nextLine();
                        useractions.push(action2);
                        System.out.println("Action added successfully");
                        break;

                    case 2:
                        if (useractions.isEmpty()) {
                            System.out.println("No actions to undo");
                        } else {
                            String d = useractions.pop();
                            System.out.println("The action removed: " + d);
                        }
                        break;

                    case 3:
                        if (useractions.isEmpty()) {
                            System.out.println("No action available.");
                        } else {
                            System.out.println("last action: " + useractions.peek());
                        }
                        break;
                    case 4:
                        System.out.println("enter action");
                        String searchAction = input.next();
                        int pos = search(useractions, searchAction);
                        if (pos != -1) {
                            System.out.println("action postion : " + pos);
                        } else {
                            System.out.println("Action not found");
                        }
                        break;
                    case 5 :
                        System.out.println("All books currently stored in the stack: " + useractions);
                        break;
                    case 6:
                        int totala = useractions.size();
                        System.out.println("Total action: " + totala);

                        if (useractions.isEmpty()) {
                            System.out.println("Stack empty");
                        } else {
                            System.out.println("Top book: " + useractions.peek());
                            System.out.println("Stack not empty");
                        }
                        break;
                    case 7:
                        if (useractions.isEmpty()) {
                            System.out.println("No actions to clear.");
                        } else {
                            useractions.clear();
                            System.out.println("All actions have been cleared.");
                        }
                        break;
                    case 8:
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 8);


        }
            // method to search
            public static int search(Deque<String> useractions, String action){
                int pos = 1;
                for(String a : useractions){
                    if (a.equals(action)) {

                        return pos;
                    }
                    pos++;
                }
                return -1;
            }
}
