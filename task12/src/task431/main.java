package task431;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {


    static List<Payment> paymentList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static  void main(String[] args) {


        cashDemo();


    }


    public static void cashDemo(){

        Boolean exit = false;
        while (!exit){
            IO.readln("""
                    1-Cash PAYMENT
                    2-Card PAYMENT
                    3-PayPal PAYMENT
                    4- Print all payments
                    5-Exit
                    
                    
                    """);

            Integer option = input.nextInt();


            if(option.equals(1)){
                paymentList.add(addCashPayment());
            }else if(option.equals(2)){
                paymentList.add(addCardPayment());
            }else if(option.equals(3)){
                paymentList.add(addPayPalPayment());
            }else if(option.equals(4)){
                for(Payment p : paymentList){
                    p.process();
                }
            }else if(option.equals(5)) {
                exit = true;
                IO.println("Goodbye!!");
            }



        }



    }


    public static CashPayment addCashPayment(){
        CashPayment cashPayment = new CashPayment();
        cashPayment.accept(5);
        cashPayment.process();

        return cashPayment;
    }

    public static CardPaymen addCardPayment(){
        CardPaymen cardPayment = new CardPaymen();
        cardPayment.process();

        return cardPayment;
    }
    public static PayPalPayment addPayPalPayment(){
        PayPalPayment payPalPayment = new PayPalPayment();
        payPalPayment.process();

        return payPalPayment;
    }


}