package task434;

import java.util.Scanner;

public class Main {
//If we take input without checking:
//
//User can enter a negative amount.
//User can enter wrong text.
//User can enter a very big number and break the program.

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("Enter payment id: ");
        int id = input.nextInt();

        Payment payment = new Payment(id);

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();
        payment.setAmount(amount);

        System.out.print("Enter type: ");
        String type = input.next();
        payment.setType(type);

        System.out.println("Payment created: id=" + payment.getId() +
                ", amount=" + payment.getAmount() +
                ", type=" + payment.getType());
    }
}
