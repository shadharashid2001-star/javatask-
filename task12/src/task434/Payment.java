package task434;

import java.util.HashSet;
import java.util.Set;

public class Payment {

    private double amount;
    private String type;
    private final int id;

    private static Set<Integer> usedIds = new HashSet<>();

    public Payment(int id) {
        if (usedIds.contains(id)) {
            throw new IllegalArgumentException("ID already used!");
        }
        this.id = id;
        usedIds.add(id);
    }

    public void setAmount(double amount) {
        if (amount <= 0) {
            IO.println("Invalid amount.");
            return;
        }
        this.amount = amount;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            IO.println("Invalid type.");
            return;
        }
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }
}
