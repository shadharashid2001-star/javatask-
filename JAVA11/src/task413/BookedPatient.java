package task413;

public class BookedPatient implements ATTENDABLE {

    private String name;
    private Integer age;
    private String slotTime;

    public BookedPatient(String slotTime) {
        this.slotTime = slotTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            IO.println("Name is required");
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            IO.println("Invalid age");
            this.age = 0;
        }
    }

    public String getSlotTime() {
        return slotTime;
    }

    @Override
    public void printAllInfo() {
        IO.println("[Booked] " + name +
                ", age " + age +
                ", slot " + slotTime +
                ", waits " + getWaitMinutes() + " min");
    }

    @Override
    public String getPriority() {
        return "Booked";
    }

    @Override
    public int getWaitMinutes() {
        return 10;
    }
}