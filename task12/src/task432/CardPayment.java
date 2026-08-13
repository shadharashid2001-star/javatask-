package task432;

public class CardPayment extends Payment implements PaymentInterface{
    @Override
    public Boolean addPaymentMethod() {
        return true;
    }

    @Override
    public Integer paymentRetry() {
        return 6;
    }

    @Override
    public void addDiscount() {
        System.out.println("PayPal discount: 8%");
    }

    @Override
    public void process(){
        IO.println("Processing From PayPalPayment");
    }
}
