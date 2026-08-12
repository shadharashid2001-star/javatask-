package task431;

public class CardPaymen extends Payment{

    @Override
    public void process(){
        IO.println("Processing From CardPayment");
    }
}
