package task414;

public class Motorbike implements Rentable{

    private String platenumber;
    private Integer dailyrate;
    private  Integer rentaldays;
    private Integer seats;

    public String getPlatenumber() {
        return platenumber;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        if (dailyrate >2 && dailyrate <7){
            this.seats = seats;
        }else {
            IO.println("Invalid number of seats.");}
    }

    public void setPlatenumber(String platenumber)
    {if (!platenumber.isEmpty()){
        this.platenumber = platenumber;
    }else {
        IO.println("Name is required ");
    }}
    public Integer getDailyrate() {
        return dailyrate;
    }

    public void setDailyrate(Integer dailyrate) {
        if (dailyrate >0 && dailyrate <200){
            this.dailyrate = dailyrate;
        }else {
            IO.println("Invalid dailyrate .");}
    }


    @Override
    public void printAllInfo() {
IO.println("Motorbike{" +
        "platenumber='" + platenumber + '\'' +
        ", dailyrate=" + dailyrate +
        ", rentaldays=" + rentaldays +
        ", seats=" + seats +
        '}');
    }

    @Override
    public double costFor(int days) {
        return 0;
    }

    @Override
    public int days() {
        return 0;
    }

    public int getRentaldays() {
        if (rentaldays != null) {
            return rentaldays;
        } else {
            return 0;
        }
    }

    public void setRentaldays (Integer rentaldays){
        if (rentaldays > 1 && rentaldays < 30) {
            this.rentaldays = rentaldays;
        } else {
            IO.println("Invalid rentaldays .");
        }
    }
}
