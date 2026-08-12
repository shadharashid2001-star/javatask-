package task427task428task429;


import java.util.ArrayList;
import java.util.List;

public class mainclass {
    static void main(String[] args){
       CashPayment cashp = new CashPayment();
        cashp.process();
        cashp.accept("50");
        cashp.accept("12345l");
        CardPayment cardp = new CardPayment();
        cardp.process();

        PayPalPayment palP = new  PayPalPayment();
        palP.process();

        List<Payment> payment = new ArrayList<>();
        payment.add(cardp);
        payment.add(cashp);
        payment.add(palP);
        for (Payment p : payment){
            p.process();
        }
    }




}