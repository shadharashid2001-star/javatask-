package task431;

public class CashPayment extends Payment{
    public void accept(String cashAmount) {
        System.out.println("Accepting cash amount: " + cashAmount);
    }
    public void accept(long  chequeNumber) {
        IO.println("cash amount: " + chequeNumber);
    }
    public void accept(int  payOrder) {
        IO.println("pay Order : " + payOrder);
    }









    @Override
    public void process(){
        IO.println("Processing From CashPayment");
    }
}
