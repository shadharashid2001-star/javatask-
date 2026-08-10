package tash412;

public class Product implements SELLABLE {
    private String  name;
    private Double price;
    private Integer quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printAllInfo() {
        IO.println("Product: " + name+
                " by " + price +
                " (" + quantity+ " quantity) ");
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String getCategory() {
        return "";
    }

    public void setPrice(Double price) {
        if (price> 0 && price < 10000){
        this.price = price;
    }else {
            IO.println("Price out of range ");
        }
}

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        if (quantity> 1 && quantity < 100){
        this.quantity = quantity;
    }else {
            IO.println("Quantity must be 1 to 100");
        }
    }
}

