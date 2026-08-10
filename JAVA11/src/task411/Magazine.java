package task411;

import task411.LibraryItem;

public class Magazine implements LibraryItem {

    private String name;
    private Integer issueNumber;
    private Integer month;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(Integer issueNumber) {
        if (issueNumber > 1 && issueNumber < 500) {
            this.issueNumber = issueNumber;
        } else {
            IO.println("Invalid issue number");
        }
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            IO.println("Invalid month");
        }
    }

    @Override
    public void printAllInfo() {
        IO.println("Magazine{" +
                "name='" + name + '\'' +
                ", issueNumber=" + issueNumber +
                ", month=" + month +
                '}');
    }

    @Override
    public String getLabel() {
        return "Magazine";
    }

    @Override
    public String getShelfCode() {
        return "MAG-" + issueNumber;
    }
}