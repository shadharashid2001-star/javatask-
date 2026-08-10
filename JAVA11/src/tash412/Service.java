package tash412;

import tash412.SELLABLE;

public class Service implements SELLABLE {
    private String  name;
    private Double price;
    private Integer minutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            IO.println("name cannot be empty");
        } else {
            this.name = name;;
        }
        this.name = name;
    }

    @Override
    public void printAllInfo() {
        IO.println("Service{" +
                "name='" + name + '\'' +
                ", price" +  price+
                ",  minutes=" + minutes +
                '}');
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String getCategory() {
        return "";
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        if (minutes >= 0) {
            this.minutes = minutes;
        } else {
            IO.println("minutes must be above 0");
        }

    }
}
