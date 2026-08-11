package task419;
import java.util.Scanner;
public class maincar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter car colour:" );
        sc.nextLine();
        IO.println( "Enter plate:");
        sc.nextLine();
        Car c = new Car();
        c.drive();
        c.brake();
    }
}
