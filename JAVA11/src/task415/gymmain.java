package task415;

import task414.Car;
import task414.Rentable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gymmain {

    static List<Payable> gyml = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static void main(String[] args){
        menuDeom();
        firstMember();
    }
    public static MonthlyMember monthlymemberadd(){
        MonthlyMember monthlymember = new MonthlyMember();

        monthlymember.setName(IO.readln("Enter name:"));

        IO.println("Enter age:");
        monthlymember.setAge(input.nextInt());
        input.nextLine();

        IO.println("Enter monthly fee:");
        monthlymember.setMonthlyfee(input.nextInt());
        input.nextLine();

        IO.println("Enter membership ID:");
        monthlymember.setMembershipid(input.nextInt());
        input.nextLine();

        return monthlymember;
    }
    public static DayPassVisitor DayPassVisitoradd(){
        DayPassVisitor day = new DayPassVisitor();
        day.setName(IO.readln("Enter name :"));
        IO.readln("Enter age :");
        day.setAge(input.nextInt());
        input.nextLine();
        IO.readln("Enter monthlyfee:");
        day.setMonthlyfee(input.nextInt());
        input.nextLine();
        IO.readln("Enter  numvisits:");
        day.setNumvisits(input.nextInt());
        input.nextLine();
        IO.readln("Enter  membershipid");
        day.setMembershipid(input.nextInt());
        input.nextLine();
        return day ;
    }
    public static void firstMember() {

        MonthlyMember member = new MonthlyMember();

        member.setName("Shadha");
        member.setAge(25);
        member.setMonthlyfee(100);
        member.setMembershipid(1);

        gyml.add(member);

        member.printAllInfo();
    }
    public static void  menuDeom(){
        boolean exit = false;
        while (!exit){
            IO.println("""
                    GYM MENU:
                    1-Add a monthly member
                    2-Add a day-pass visitor
                    3-Print all members
                    4-Show total monthly income
                    5-Search a member by name
                    6-Exit
                    
                    """);
            Integer choose = input.nextInt();
            IO.println("Enter chooes :");

            if (choose.equals(1)) {
                gyml.add(monthlymemberadd());
            } else if (choose.equals(2)) {
                gyml.add(DayPassVisitoradd());

            } else if (choose.equals(3)) {
                for (Payable d : gyml) {
                    IO.println("DATA");
                    d.printAllInfo();
                }
            } else if (choose.equals(4)) {
                Double total = 0.0;
                for (Payable d :gyml) {
                    total+= d.monthlyTotal();
                }
                IO.println("TOTAL " + total);


            } else if (choose.equals(5)) {

                IO.println("Enter name to search:");
                String search = input.nextLine();

                boolean found = false;

                for (Payable member : gyml) {

                    if (member.getName().equals(search)) {

                        member.printAllInfo();
                        found = true;
                    }
                }

                if (!found) {
                    IO.println("NAME NOT FOUND");
                }
            }else if (choose.equals(6)) {
                exit = true;
                IO.println("Goodbye");
            }
        }


    }


}
