package task432;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();

        payments.add(new CashPayment());
        payments.add(new CardPayment());
        payments.add(new PayPalPayment());

        for (Payment p : payments) {


            PaymentInterface pinter = (PaymentInterface) p;
            System.out.println("Method added: " + pinter.addPaymentMethod() + "\n");
            System.out.println("Retries allowed: " + pinter.paymentRetry());
            pinter.addDiscount();


            p.process();
        }
    }}