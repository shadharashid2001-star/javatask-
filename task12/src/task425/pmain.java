package task425;

import java.util.Scanner;

public class pmain {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
      IO.println("Enter amount :");
      Double amount = sc.nextDouble();

      Payment p = new Payment();
      p.setAmount(amount);

    }
}
