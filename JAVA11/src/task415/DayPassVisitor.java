package task415;

public class DayPassVisitor implements Payable{
    private String name;
    private  Integer age ;
    private  Integer monthlyfee;
    private  Integer  numvisits;
    private  Integer membershipid;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 2) {
            this.name = name;
        } else {
            IO.println("Name must be at least 2 characters long.");
        }
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if ( age>=14 && age<=90){
            this.age = age;}
        else {
            IO.println("Too young to register");
        }
    }

    public Integer getMonthlyfee() {
        return monthlyfee;
    }

    public void setMonthlyfee(Integer monthlyfee) {
        if (monthlyfee > 0 && monthlyfee <= 500) {
            this.monthlyfee = monthlyfee;
        } else {
            IO.println("Invalid monthly fee");
        }
    }
    public Integer getNumvisits() {
        return numvisits;
    }

    public void setNumvisits(Integer numvisits) {
        if (numvisits>=1 && numvisits<=31){
            this.numvisits = numvisits;
        }else {
            IO.println("Invalid");
        }}

    public Integer getMembershipid() {
        return membershipid;
    }

    public void setMembershipid(Integer membershipid) {

        if (this.membershipid == null && membershipid > 0) {
            this.membershipid = membershipid;
        } else {
            IO.println("Membership ID cannot be changed");
        }
    }

    @Override
    public void printAllInfo() {
        IO.println( "MonthlyMember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", monthlyfee=" + monthlyfee +
                ", numvisits=" + numvisits +
                ", membershipid=" + membershipid +
                '}');
    }
    @Override
    public double monthlyTotal() {
        return monthlyfee* numvisits;
    }
}
