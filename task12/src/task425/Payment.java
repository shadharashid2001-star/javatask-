package task425;

import java.util.Scanner;

public class Payment {
    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        if (amount > 0) {
            IO.println("AMOUNT MUST BE NOT GREATER 0 ");
        } else {
            this.amount = amount;
        }
    }}
