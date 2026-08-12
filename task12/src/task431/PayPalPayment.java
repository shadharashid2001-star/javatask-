package task431;

public class PayPalPayment extends  Payment{
    @Override
    public void process(){
        IO.println("Processing From PayPalPayment");
    }
}
