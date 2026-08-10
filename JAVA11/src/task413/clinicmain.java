package task413;

import task411.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class clinicmain {
    static List<ATTENDABLE> queue = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        newbooked();
        menuDeom();


    }

    public static BookedPatient addBooked(){
        BookedPatient Booked = new BookedPatient("09:30");
        Booked.setName(IO.readln("Enter name :"));
        IO.println("Enter age:");
        Booked.setAge(input.nextInt());
        input.nextLine();
        IO.println("Added.");
        return Booked;

    }
    public static WalkInVisitor addWalkIn(){
        WalkInVisitor walked = new WalkInVisitor();
        walked.setName(IO.readln("Enter name"));
        IO.println("Enter age:");
        walked.setAge(input.nextInt());
        input.nextLine();
        IO.println("Enter ArrivalOrder:");
        walked.setArrivalOrder(input.nextInt());
        input.nextLine();
        return walked;
    }

    public static BookedPatient newbooked() {

        IO.println("--- Single item created at startup ---");

        BookedPatient booked = new BookedPatient("09:30");

        booked.setName("Sarah Bennett");
        booked.setAge(150);

        queue.add(booked);

        booked.printAllInfo();

        return booked;
    }

public static void menuDeom(){
        boolean  exit = false;
        while (!exit){
            IO.println("""
                    --- CLINIC MENU --
                    1. Add booked  
                     2. Add walk-in   
                     3. Print queue  
                     4. Longest wait  
                      5. Exit
                    
                    """);
            Integer choose = input.nextInt();
            IO.println("ENTER CHOOSE");

            if(choose.equals(1)){
                queue.add(addBooked());
            } else if (choose.equals(2)) {
                queue.add(addWalkIn());

            } else if (choose.equals(3)) {
                for (ATTENDABLE d : queue){
                    IO.println("DATA");
                    d.printAllInfo();
                }
            } else if (choose.equals(4)) {

                if (queue.isEmpty()) {

                    IO.println("Queue empty");

                } else {

                    ATTENDABLE   longest = queue.get(0);

                    for (ATTENDABLE patient : queue) {

                        if (patient.getWaitMinutes()
                                > longest.getWaitMinutes()) {

                            longest = patient;
                        }
                    }

                    IO.println("Longest wait: " +
                            longest.getName() +
                            " (" +
                            longest.getWaitMinutes() +
                            " min)");
                }

            } else if (choose.equals(5)) {

                exit = true;
                IO.println("Goodbye");
            }

        }
}
}
