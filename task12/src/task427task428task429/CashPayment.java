package task427task428task429;

public class CashPayment extends Payment {
    public void accept(String cashAmount) {
        IO.println("Cash amount: " + cashAmount);
    }

    public void accept(long chequeNumber) {
        IO.println("Cheque number: " + chequeNumber);
    }

    public void accept(int payOrder) {
        IO.println("Pay order: " + payOrder);
    }
    @Override
    public void process() {
     IO.println("cash payment ");
    }
}


