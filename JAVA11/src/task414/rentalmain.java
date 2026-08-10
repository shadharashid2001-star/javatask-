package task414;

import tash412.SELLABLE;
import task413.ATTENDABLE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rentalmain {

    static List<Rentable> rcar = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static void main(String[] args){
menuDeom();
    }

    public static Car caradd(){
        Car car = new Car();
        car.setPlatenumber(IO.readln("Enter Plate number: "));
        IO.readln("Enter Dailyrate : ");
        car.setDailyrate(input.nextInt());
        input.nextLine();
        IO.readln("Enter Rentaldays: ");
        car.setRentaldays(input.nextInt());
        input.nextLine();
        IO.readln("Enter number of  seats: ");
        car.setSeats(input.nextInt());
        input.nextLine();
        return car;
    }

    public static Motorbike motorbikeadd(){
        Motorbike  motorbike= new Motorbike();
        motorbike.setPlatenumber(IO.readln("Enter Plate number: "));
        IO.readln("Enter Dailyrate:  ");
        motorbike.setDailyrate(input.nextInt());
        input.nextLine();
        IO.readln("Enter Rentaldays: ");
        motorbike.setRentaldays(input.nextInt());
        input.nextLine();
        IO.readln("Enter number of  seats");
        motorbike.setSeats(input.nextInt());
        input.nextLine();
        return motorbike;
    }

    public static void menuDeom() {
        boolean exit = false;
        while (!exit) {
            IO.println("""
                    --- CLINIC MENU --
                    1. Add a car  
                     2.Add a motorbike
                     3. Print everything on hire
                     4. Show total income 
                      5. Exit
                    
                    """);
            Integer choose = input.nextInt();
            IO.println("ENTER CHOOSE");

            if (choose.equals(1)) {
                rcar.add(caradd());
            } else if (choose.equals(2)) {
                rcar.add(motorbikeadd());

            } else if (choose.equals(3)) {
                for (Rentable d : rcar) {
                    IO.println("DATA");
                    d.printAllInfo();
                }
            } else if (choose.equals(4)) {
                Double total = 0.0;
                for (Rentable d : rcar) {
                    total += d.costFor(d.getRentaldays());

                }
                IO.println("TOTAL " + total);


            } else if (choose.equals(5)) {
                exit = true;
                IO.println("Goodbye");
            }
        }
    }}